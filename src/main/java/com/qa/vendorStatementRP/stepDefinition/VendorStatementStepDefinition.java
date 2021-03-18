package com.qa.vendorStatementRP.stepDefinition;

import java.util.Map;

import com.aventstack.extentreports.ExtentTest;
import com.qa.vendorStatementRP.pages.AuthenticationPage;
import com.qa.vendorStatementRP.pages.HomePage;
import com.qa.vendorStatementRP.pages.LoginPage;
import com.qa.vendorStatementRP.pages.VendorStatementPage;
import com.qa.vendorStatementRP.util.ExcelDataToDataTable;
import com.qa.vendorStatementRP.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class VendorStatementStepDefinition extends TestBase{
	
	LoginPage loginPage;
	AuthenticationPage authPage;
	HomePage homePage;
	VendorStatementPage vsPage;
	
	@After
	public void closeBrowser() {
		driver.close();
	}

	@Then("^Verify all the field validations$")
	public void verify_all_the_field_validationss() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Statement date field validations");
			loginfo = test.createNode("Login Test");
			TestBase.init();
			loginPage = new LoginPage();
			authPage = loginPage.login();
			homePage = authPage.Authentication();
			homePage.changeRole(prop.getProperty("companyName"), prop.getProperty("role"), prop.getProperty("roleType"), prop.getProperty("selectedRole"));
			Thread.sleep(1000);
			loginfo.pass("Login Successful in Netsuite");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Login Test");
		}
		ExtentTest loginfo2 = null;
		try {
			loginfo2 = test.createNode("Verify Statement date field validations");
			vsPage = homePage.clickOnVendorStatmentLink();
			vsPage.verifyStatementDateFieldValidations(loginfo2);
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo2, e, "Verify Statement date field validations");
		}
		ExtentTest loginfo3 = null;
		try {
			test = extent.createTest("Verification of Start date field validations");
			loginfo3 = test.createNode("Verify Start date field validations");
			vsPage.verifyStartDateFieldValidations(loginfo3);
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo3, e, "Verify Start date field validations");
		}
	}
	
	@Then("^Verify Start date exceed Statement Date error$")
	public void verify_Start_date_exceed_Statement_Date_error() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Start date exceeds Statement date error");
			loginfo = test.createNode("Verify the alert");
			vsPage.verifyAlertForInvalidDateRange(loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verify Start date exceeds Statement date error");
		}
	}
	
	@Then("^Verify the alert while printing vendor statement without selecting the vendor$")
	public void verify_no_vendor_seleted_alert() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of alert message while printing vendor statement without selecting the vendor");
			loginfo = test.createNode("Verify the alert");
			homePage.clickOnVendorStatmentLink();
			vsPage.verifyAlertForNoVendorSelectedError(loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of alert message while printing vendor statement without selecting the vendor");
		}
	}
	
	@Then("^Verify the vendors in the vendor sublist based on vendor category using excel data at \"([^\"]*)\"$")
	public void verify_the_vendors_in_the_vendor_sublist_based_on_vendor_category_using_excel_data_at(@Transform(ExcelDataToDataTable.class) DataTable vendorStatementData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Vendors in the Vendor sublist based on Vendor category selected");
			loginfo = test.createNode("Login Test");
			TestBase.init();
			loginPage = new LoginPage();
			authPage = loginPage.login();
			homePage = authPage.Authentication();
			homePage.changeRole(prop.getProperty("companyName"), prop.getProperty("role"), prop.getProperty("roleType"), prop.getProperty("selectedRole"));
			Thread.sleep(1000);
			loginfo.pass("Login Successful in Netsuite");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Login Test");
		}
		ExtentTest loginfo2 = null;
		try {
			for(Map<String,String> data: vendorStatementData.asMaps(String.class, String.class)) {
				String vendorCategory = data.get("Vendor Category");
				String emailTemplate = data.get("Email Template");
				loginfo2 = test.createNode("Verify Vendors in the Vendor sublist when Vendor category = '"+vendorCategory+"' is selected");
				vsPage = homePage.clickOnVendorStatmentLink();
				vsPage.verifyVendorListAfterFilter(vendorCategory, emailTemplate, loginfo2);
			}
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo2, e, "Verification of Vendors in the Vendor sublist based on Vendor category selected");
		}
	}
	
	@Then("^Verify the vendors in the vendor sublist when Include zero balance checkbox is checked$")
	public void verify_vendors_list_when_include_zero_balance_checkbox_is_checked() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Vendor list when Include zero balance checkbox is checked");
			loginfo = test.createNode("Verify the Vendor list");
			homePage.clickOnVendorStatmentLink();
			vsPage.verifyVendorListWhenIncludeZeroBalanceIsChecked(loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Vendor list when Include zero balance checkbox is checked");
		}
	}
	
	@Then("^Verify Mark All functionality with Email functionality using excel data at \"([^\"]*)\"$")
	public void verify_Mark_All_functionality_with_Print_Email_functionality(@Transform(ExcelDataToDataTable.class) DataTable vendorStatementData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Mark All with Email functionality");
			for(Map<String,String> data: vendorStatementData.asMaps(String.class, String.class)) {
				String vendorCategory = data.get("Vendor Category");
				String recipientEmails = data.get("Receipient Emails");
				loginfo = test.createNode("Verify Mark all with Email functionality for the Category: '"+vendorCategory+"' selected");
				homePage.clickOnVendorStatmentLink();
				vsPage.markAllWithEmail(vendorCategory, recipientEmails, loginfo);
			}
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Mark All with Email functionality");
		}
	}

	@Then("^Verify Unmark All functionality with Print & Email functionality$")
	public void verify_Unmark_All_functionality_with_Print_Email_functionality() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Unmark All with Print & Email functionalities");
			loginfo = test.createNode("Verify Unmark all with Print functionality");
			vsPage.unmarkAllWithPrint(loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verify Unmark all with Print functionality");
		}
		ExtentTest loginfo2 = null;
		try {
			loginfo2 = test.createNode("Verify Unmark all with Email functionality");
			vsPage.unmarkAllWithEmail(loginfo2);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo2, e, "Verify Unmark all with Email functionality");
		}
	}
	
//	@Then("^Select the vendors and print statement using excel data at \"([^\"]*)\"$")
//	public void select_the_vendors_and_print_statement_using_excel_data_at(@Transform(ExcelDataToDataTable.class) DataTable vendorStatementData) throws InterruptedException {
//		ExtentTest loginfo = null;
//		try {
//			loginfo = test.createNode("Verification of Print functionality for the vendor(s) selected");
//			for(Map<String,String> data: vendorStatementData.asMaps(String.class, String.class)) {
//				int count = 0;
//				String vendorCategory = data.get("Category");
//				String currency = data.get("Currency");
//				String vendors = data.get("Vendor");
//				count = vsPage.selectVendors(vendorCategory, vendors, currency);
//				vsPage.verifyStatementsInQueue(count, loginfo);
//				vsPage.printVendorStatement(vendors, loginfo);
//				homePage.clickOnVendorStatmentLink();
//			}
//		}catch (AssertionError | Exception e) {
//			testStepHandle("FAIL", driver, loginfo, e, scenario.getName());
//		}
//	}
	
	@Then("^Verification of No Email template error$")
	public void verification_of_No_Email_template_error() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of No Email template error");
			loginfo = test.createNode("Login Test");
			TestBase.init();
			loginPage = new LoginPage();
			authPage = loginPage.login();
			homePage = authPage.Authentication();
			homePage.changeRole(prop.getProperty("companyName"), prop.getProperty("role"), prop.getProperty("roleType"), prop.getProperty("selectedRole"));
			Thread.sleep(1000);
			loginfo.pass("Login Successful in Netsuite");
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Login Test");
		}
		ExtentTest loginfo2 = null;
		try {
			loginfo2 = test.createNode("Verify the alert");
			vsPage = homePage.clickOnVendorStatmentLink();
			vsPage.verifyNoEmailTemplateError(loginfo2);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo2, e, "Verification of No Email template error");
		}
	}
	
	@Then("^Verification of No Email Receipients error$")
	public void verification_of_No_Email_Receipients_error() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of No Email Receipients error");
			loginfo = test.createNode("Verify the alert");
			homePage.clickOnVendorStatmentLink();
			vsPage.verifyNoEmailReceipientsError(loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of No Email Receipients error");
		}
	}
	
	@Then("^Verification of Email to field with invalid emailId$")
	public void verification_of_Email_to_field_with_invalid_emailId() throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Email to field with invalid emailId");
			loginfo = test.createNode("Verify the alert");
			homePage.clickOnVendorStatmentLink();
			vsPage.verifyInvalidEmailError(loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Email to field with invalid emailId");
		}
	}
	
	@Then("^Verification of Email functionality with valid data using excel data at \"([^\"]*)\"$")
	public void verification_of_Email_functionality_with_valid_data_using_excel_data_at(@Transform(ExcelDataToDataTable.class) DataTable vendorStatementData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Email functionality for the vendors selected");
			for(Map<String,String> data: vendorStatementData.asMaps(String.class, String.class)) {
				String emailTemplate = data.get("Email Template");
				String vendorCategory = data.get("Vendor Category");
				String currency = data.get("Currency");
				String vendors = data.get("Vendor");
				String receipients = data.get("Receipient Email");
				loginfo = test.createNode("Verify Email functionality for vendor: '"+vendors+"' selected");
				homePage.clickOnVendorStatmentLink();
				vsPage.selectVendors(vendorCategory, vendors, currency);
				vsPage.enterReceipients(vendors, receipients);
				vsPage.selectEmailTemplateAndEmailVendorStatement(emailTemplate);
				vsPage.verifyEmail(vendors, receipients, loginfo);
			}
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Email functionality for the vendors selected");
		}
	}
	
	@Then("^Verification of Vendor Statement using Generate Statement feature in Vendor record using excel at \"([^\"]*)\"$")
	public void verification_of_Vendor_Statement_using_Generate_Statement_feature_in_Vendor_record(@Transform(ExcelDataToDataTable.class) DataTable vendorStatementData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Generate Statement feature with Email in the Vendor record");
			for(Map<String,String> data: vendorStatementData.asMaps(String.class, String.class))  {
				String vendor = data.get("Vendor");
				String emailTemplate = data.get("Email Template");
				String currency = data.get("Currency");
				String email = data.get("Email");
				loginfo = test.createNode("Verify mailing Vendor Statement for the Vendor: '"+vendor+"' using Generate Statement feature");
				vsPage.openVendor(vendor);
				vsPage.verifyIndividualVendorStatement(vendor, emailTemplate, currency, email, loginfo);
			}
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Email functionality for the vendors selected");
		}
	}
	
	@Then("^Verification of Auto Email functionality in Vendor Statement using excel at \"([^\"]*)\"$")
	public void verification_of_auto_email_feature_in_Vendor_Statement(@Transform(ExcelDataToDataTable.class) DataTable vendorStatementData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Auto Email functionality in Vendor Statement");
			for(Map<String,String> data: vendorStatementData.asMaps(String.class, String.class)) {
				String internalIds = data.get("Internal Id");
				loginfo = test.createNode("Test Data >> InterlId's given in search: "+internalIds);
				vsPage.verifyAutoEmailFeatureInVendorStatement(internalIds, loginfo);
			}
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Email functionality for the vendors selected");
		}
	}
	
	@Then("^Verification of Vendor Portal Access for the Vendor using data \"([^\"]*)\" \"([^\"]*)\"$")
	public void verification_of_Vendor_Portal_Access_for_the_Vendor_using_data(String vendor, String password) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Vendor Portal Access in Vendor Statement");
			loginfo = test.createNode("Verify the Vendor Portal Access for the Vendor: '"+vendor+"'");
			vsPage.openVendor(vendor);
			vsPage.verifyVendorPortalAccessfeature(vendor, password, loginfo);
		}catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Email to field with invalid emailId");
		}
	}
	
}
