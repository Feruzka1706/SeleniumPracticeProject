package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderFunctionalityTests extends TestBase {

    /**
     *  1. `testCheckAllButton`
     *     1. login with correct credentials
     *     2. use the method you created earlier to check all checkbox
     *     3. assert it actuall checked all the checkbox (you did this logic in method above so assertTrue this method call)
     *
     */
    @Test
    public void testCheckAllButton(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        assertTrue( WebOrderUtility.checkAll() );
    }

    /**
     * 2. `testUncheckAllButton`
     *      1. use the method you created earlier to uncheck all checkbox
     *      2. assert it actuall unchecked all the checkbox (you did this logic in method above so assertTrue this method call)
     *      3. `testAllProductName`
     */

    @Test
    public void testUncheckAllButton(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        assertTrue( WebOrderUtility.uncheckAll());
    }


    /**
     * 3. `testAllProductName`
     *      *    1. login with correct credentials
     *      *    2. go to view all product page
     *      *    3. `verify` List of all product header `present`
     *      *    4. get all product name from first column
     *      *    5. `verify` they are : `MyMoney`, `FamilyAlbum` , `ScreenSaver`
     *      *
     */
    @Test
    public void testAllProductName(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        BrowserUtil.waitFor(2);
        WebOrderUtility.selectSideBarTab("View all products");
        //WebOrderUtility.getAllProducts();
        List<String> allProducts = WebOrderUtility.getAllProducts();
        List<String> expectedList = new ArrayList<>();
        expectedList.addAll(Arrays.asList("MyMoney", "FamilyAlbum" , "ScreenSaver"));

        assertEquals(expectedList,allProducts);

    }


    /**
     * 4. `testProductInformation_Price`
     *        1. login with correct credentials
     *        2. go to `Order` page
     *        3. Select `MyMoney` from the dropdown
     *        4. `Verify` the `Price per unit:` inputbox value has changed to `100`
     *        5. Select `FamilyAlbum` from the dropdown
     *        6. `Verify` the `Price per unit:` inputbox value has changed to `20`
     *        7. Select `ScreenSaver` from the dropdown
     *        8.  `Verify` the `Price per unit:` inputbox value has changed to `80`
     *        9.  use the method you created `getPriceFromForm`
     */

    @Test
    public void testProductInformation_Price(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        List<String> productNames=new ArrayList<>();
        productNames.addAll(Arrays.asList("MyMoney","FamilyAlbum","ScreenSaver"));
        List<Integer> unitPrices=new ArrayList<>(Arrays.asList(100,80,20));

         for(Integer i=0; i<productNames.size(); i++){
             assertEquals(unitPrices.get(i),WebOrderUtility.getUnitPriceFromForm(productNames.get(i)));
         }



    }

    /**
     * 5. `testProductInformation_Discount`
     *        1. login with correct credentials
     *       2. go to `Order` page
     *       3. Select `MyMoney` from the dropdown
     *       4. Enter `10` in `quantity` inputbox
     *       5. Click `calculate`
     *       6. `Verify` the `Discount` inputbox value has changed to expected discount
     *       7. Select `FamilyAlbum` from the dropdown
     *       8. `Verify` the `Discount` inputbox value has changed to expected discount
     *       9. Select `ScreenSaver` from the dropdown
     *       10. `Verify` the `Discount` inputbox value has changed to expected discount
     *
     */
    @Test
    public void testProductInformation_Discount(){

        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        WebOrderUtility.selectSideBarTab("Order");
        List<String> productNames=new ArrayList<>();
        productNames.addAll(Arrays.asList("MyMoney","FamilyAlbum","ScreenSaver"));
        List<Integer> discounts=new ArrayList<>(Arrays.asList(8,15,10));

        for(Integer i=0; i<productNames.size(); i++){
            assertEquals(WebOrderUtility.getExpectedDiscount(productNames.get(i),10),discounts.get(i));
        }


    }


    /**
     * 6. `testProductInformation_CalculationLessThan10`
     *      *    1. login with correct credentials
     *      *    2. go to `Order` page
     *      *    3. Select `MyMoney` from the dropdown
     *      *    4. Enter `9` in `quantity` inputbox
     *      *    5. Click `calculate`
     *      *    6. Get the actual result from `Total` inputbox
     *      *    7. `Verify` the `Total` match the expected result `9*100`
     *      *    8. Select `FamilyAlbum` from the dropdown
     *      *    9. `Verify` the `Total` match the expected result `9*80`
     *      *    10. Select `ScreenSaver` from the dropdown
     *      *    11. `Verify` the `Total` match the expected result `9*20`
      */
    @Test
    public void testProductInformation_CalculationLessThan10(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        WebOrderUtility.selectSideBarTab("Order");

        List<String> productNames=new ArrayList<>();
        productNames.addAll(Arrays.asList("MyMoney","FamilyAlbum","ScreenSaver"));
        List<Integer> unitPrices=new ArrayList<>(Arrays.asList(100,80,20));

        for(Integer i=0; i<productNames.size(); i++){
            assertEquals(WebOrderUtility.calculateTotal(productNames.get(i),9),9* unitPrices.get(i));
        }

    }


    /**
     * 7. `testProductInformation_Calculation10orGreater`
     *      *    1. login with correct credentials
     *      *    2. go to `Order` page
     *      *    3. Select `MyMoney` from the dropdown
     *      *    4. Enter `10` in `quantity` inputbox
     *      *    5. Click `calculate`
     *      *    6. Get the actual result from `Total` inputbox
     *      *    7. `Verify` the `Total` match the expected result `(1-0.08) * 10*100`
     *      *    8. Select `FamilyAlbum` from the dropdown
     *      *    9. `Verify` the `Total` match the expected result `(1-0.15) * 10*80`
     *      *    10. Select `ScreenSaver` from the dropdown
     *      *    11. `Verify` the `Total` match the expected result `(1-0.1) * 10*20`
     *      *
     */
    @Test
    public void testProductInformation_Calculation10orGreater(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();
        WebOrderUtility.selectSideBarTab("Order");

        List<String> productNames=new ArrayList<>();
        productNames.addAll(Arrays.asList("MyMoney","FamilyAlbum","ScreenSaver"));
        List<Integer> unitPrices=new ArrayList<>(Arrays.asList(100,80,20));

        for(Integer i=0; i<productNames.size(); i++){
           assertEquals( (10 * unitPrices.get(i) * (100-(WebOrderUtility.getExpectedDiscount(productNames.get(i),
                   10)))/100), WebOrderUtility.calculateTotal(productNames.get(i),10) );
        }

        /*
          assertEquals((10 * 100 * (100 - (getExpectedDiscount("MyMoney", 10)))/100), calculateTotal("MyMoney", 10));
        assertEquals((10 * 80 * (100 - (getExpectedDiscount("FamilyAlbum", 10)))/100), calculateTotal("FamilyAlbum", 10));
        assertEquals((10 * 20 * (100 - (getExpectedDiscount("ScreenSaver", 10)))/100), calculateTotal("ScreenSaver", 10));
         */

    }

    /**
     * 8. `testOrderFlow`
     *      *    1. login with correct credentials
     *      *    2. go to `Order` page
     *      *    3. Select `MyMoney` from the dropdown
     *      *    4. Enter `10` in `quantity` inputbox
     *      *    5. Click `calculate`
     *      *    6. Enter all address information
     *      *    7. Enter all payment information
     *      *    8. Click process to submit
     *      *    9. `verify` sucess message has displayed
     *      */

    @Test
    public void testOrderFlow(){
         WebOrderUtility.openWebOrderApp();
         WebOrderUtility.login();
         WebOrderUtility.selectSideBarTab("Order");
         WebOrderUtility.getExpectedDiscount("MyMoney",12);
         WebOrderUtility.enterAddressInfo();
         WebOrderUtility.enterPaymentInfo();
         WebOrderUtility.submitAndVerify();
    }

}
