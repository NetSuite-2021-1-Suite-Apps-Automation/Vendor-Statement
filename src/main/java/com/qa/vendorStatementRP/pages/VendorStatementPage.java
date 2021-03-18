package com.qa.vendorStatementRP.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.qa.vendorStatementRP.util.TestBase;

public class VendorStatementPage extends TestBase{
	
	@FindBy(xpath = "//input[@id='custpage_enddate']")
	WebElement statementDate;
	
	@FindBy(xpath = "//input[@id='custpage_startdate']")
	WebElement startDate;
	
	@FindBy(xpath = "//input[@id='inpt_custpage_emailtemplate1']")
	WebElement emailTemplate;
	
	@FindBy(xpath = "//input[@id='inpt_custpage_vendorcategory2']")
	WebElement vendorCategory;
	
	@FindBy(xpath = "//input[@id='inpt_Vendor_CATEGORY1']")
	WebElement vendorCategoryInSearch;
	
	@FindBy(xpath = "//span[@id='Vendor_CATEGORY_fs_lbl']//a[@class='smalltextnolink']")
	WebElement vendorCategoryLabelInSearch;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr[contains(@class,'uir-list-row-tr')]//a[contains(@id,'qsTarget_')]")
	List<WebElement> vendorsInSearch;
	
	@FindBy(xpath = "//input[@id='custpage_queue']")
	WebElement queue;
	
	@FindBy(xpath = "//span[@id='custpage_check1_fs']/img")
	WebElement checkbox;
	
	@FindBy(xpath = "//input[@id='custpage_print']")
	WebElement printBtn;
	
	@FindBy(xpath = "//tr[contains(@id,'custpage_detailsrow')]//td[2]//a")
	List<WebElement> vendorList;
	
	@FindBy(xpath = "//span[text()='Lists']")
	WebElement listsLink;
	
	@FindBy(xpath = "//span[text()='Relationships']")
	WebElement relationshipsLink;
	
	@FindBy(xpath = "//span[text()='Vendors']")
	WebElement vendorsLink;
	
	@FindBy(xpath = "//input[contains(@id,'inpt_searchid')]")
	WebElement viewDropdown;
	
	@FindBy(xpath = "//span[@id='searchid_fs_lbl']//a[@class='smalltextnolink']")
	WebElement viewLabel;
	
	@FindBy(xpath = "//span[@class='ns-icon ns-filters-onoff-button']")
	WebElement filtersDiv;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> dropdownList;
	
	@FindBy(xpath = "//input[@id='custpage_markall']")
	WebElement markAllBtn;
	
	@FindBy(xpath = "//input[@id='custpage_unmarkall']")
	WebElement unMarkAllBtn;
	
	@FindBy(xpath = "//input[@id='custpage_send']")
	WebElement emailBtn;
	
	@FindBy(xpath = "//td[contains(@class,'uir-list-row-cell listtext')]//a")
	List<WebElement> vendorsList;
	
	@FindBy(xpath = "//select[@id='currency']")
	WebElement currencyDropdown;
	
	@FindBy(xpath = "//input[@type='button']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//a[@id='custpage_vendorstxt']")
	WebElement vendorSublist;
	
	@FindBy(xpath = "//a[@id='s_commtxt']")
	WebElement communicationTab;
	
	@FindBy(xpath = "//div[@id='messages_layer']//table[@id='messages__tab']//tbody//tr")
	List<WebElement> emailLogList;
	
	@FindBy(xpath = "//span[@id='custpage_includezero_fs']/img")
	WebElement includeZeroCheckbox;
	
	@FindBy(xpath = "//input[@name='inpt_custpage_pagination']")
	WebElement paginationDropdown;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr[contains(@id,'row')]//td[count(//thead//div[contains(text(),'Name')]//parent::td//preceding-sibling::td)+1]//a")
	List<WebElement> vendorGeneralListInNS;
	
	@FindBy(xpath = "//form//tr[contains(@id,'row')]//td[count(//form//table[@id='div__labtab']//div[contains(text(),'Name')]//parent::td//preceding-sibling::td)+1]//a")
	List<WebElement> vendorNamesList;
	
	@FindBy(xpath = "//form//tr[contains(@id,'row')]//td[count(//form//table[@id='div__labtab']//div[contains(text(),'VENDOR ID')]//parent::td//preceding-sibling::td)+1]//a")
	List<WebElement> vendorNamesListInSearch;
	
	@FindBy(xpath = "//input[@id='custpage_generatestatement']")
	WebElement generateStatementBtn;
	
	@FindBy(xpath = "//input[@name='inpt_custpage_currentvendorcurency']")
	WebElement currencyDropdownInPopup;
	
	@FindBy(xpath = "//textarea[@id='custpage_bulkemailaddress']")
	WebElement bulkEmailTextarea;
	
	@FindBy(xpath = "//input[@id='savesearch']")
	WebElement editSearchBtn;
	
	@FindBy(xpath = "//span[@id='filters_filterfilter_fs']//input[@name='inpt_filterfilter']")
	WebElement filterDropdownInSearch;
	
	@FindBy(xpath = "//iframe[@id='filter_frame']")
	WebElement filterFrame;
	
	@FindBy(xpath = "//a[@id='Entity_INTERNALID_popup_list']")
	WebElement filterArrowBtn;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//input[@id='st']")
	WebElement searchBox;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//input[@id='Search']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//div[@id='inner_popup_div']//a[@class='smalltextnolink']")
	List<WebElement> searchList;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//input[@id='update']")
	WebElement doneBtn;
	
	@FindBy(xpath = "//input[@id='set']")
	WebElement setBtn;
	
	@FindBy(xpath = "//input[@id='btn_multibutton_save']")
	WebElement saveBtnInSearch;
	
	@FindBy(xpath = "//td[@id='spn_multibutton_save']//following-sibling::td//div")
	WebElement saveArrowInSearch;
	
	@FindBy(xpath = "//span[text()='Save & Run']")
	WebElement saveAndRunBtn;
	
	@FindBy(xpath = "//input[@id='edit']")
	WebElement editBtn;
	
	@FindBy(xpath = "//a[@id='parameterstxt']")
	WebElement parametersTab;
	
	@FindBy(xpath = "//input[@id='custscript_auto_email_frequency']")
	WebElement frequencyBox;
	
	@FindBy(xpath = "//input[@id='custscript_last_run_date']")
	WebElement lastRunDateBox;
	
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']//following-sibling::td//div")
	WebElement saveArrowInScript;
	
	@FindBy(xpath = "//span[text()='Save and Execute']")
	WebElement saveAndExecuteBtn;
	
	@FindBy(xpath = "//input[@id='refresh']")
	WebElement refreshBtn;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr[@id='row0']//td[6]")
	WebElement scriptStatus;
	
	@FindBy(xpath = "//div[@class='uir-record-name']")
	WebElement recordName;
	
	@FindBy(xpath = "//td[text()='Internal ID']")
	WebElement internalIdCriteria;
	
	@FindBy(xpath = "//input[@id='filters_remove']")
	WebElement removeBtn;
	
	@FindBy(xpath = "//span[@id='custentity_employee_external_access_fs']//img")
	WebElement vendorExternalAccessCheckbox;
	
	@FindBy(xpath = "//span[@id='custentity_employee_external_notificatio_fs']//img")
	WebElement vendorExternalAccessNotificationCheckbox;
	
	@FindBy(xpath = "//input[@id='custpage_password']")
	WebElement portalPasswordBox;
	
	@FindBy(xpath = "//input[@id='btn_multibutton_submitter']")
	WebElement saveBtnInVendor;
	
	@FindBy(xpath = "//input[@id='loginid']")
	WebElement portalUsername;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement portalPassword;
	
	@FindBy(xpath = "//button[@id='login']")
	WebElement portalLoginBtn;
	
	public VendorStatementPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyVendorPortalAccessfeature(String vendor, String password, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
	    
		String email = driver.findElement(By.xpath("//span[@id='email_fs']//a")).getText().trim();
		editBtn.click();
		Thread.sleep(1500);
		enableCheckbox(vendorExternalAccessCheckbox);
		enableCheckbox(vendorExternalAccessNotificationCheckbox);
		portalPasswordBox.sendKeys(password);
		saveBtnInVendor.click();
		
		// Verify login access in the SkyDoc Portal
		eleClickable(driver, editBtn, 15);
		je.executeScript("window.open('about:blank','_blank');");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.get(prop.getProperty("portalUrl"));
		eleAvailability(driver, portalUsername, 10);
	    portalUsername.sendKeys(email);
	    portalPassword.sendKeys(password);
	    portalLoginBtn.click();
	    
	    try {
	    	driver.switchTo().frame("myFrame");
		    eleClickable(driver, By.xpath("//a[@id='vendStatment']"), 10);
		    driver.findElement(By.xpath("//a[@id='vendStatment']")).click();
		    eleAvailability(driver, By.xpath("//h2[text()='Vendor Statements']"), 10);
		    String vendorStatementPage = driver.findElement(By.xpath("//h2[text()='Vendor Statements']")).getText();
		    if(vendorStatementPage.contains("Vendor Statements")) {
		    	System.out.println("Vendor Portal access enabled for the Vendor: '"+vendor+"'");
		    	logInfo.pass("Vendor Portal access enabled for the Vendor: '"+vendor+"'");
		    }
	    }catch(NoSuchElementException e) {
	    	System.out.println("Vendor Portal access denied for the Vendor: '"+vendor+"'");
	    	logInfo.fail("Vendor Portal access denied for the Vendor: '"+vendor+"'");
	    }
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
	}
	
	public void enableCheckbox(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		WebElement parentSpan = (WebElement)je.executeScript("return arguments[0].parentNode;", element);
		if(parentSpan.getAttribute("class").equals("checkbox_unck"))
			element.click();
	}
	
	public void verifyAutoEmailFeatureInVendorStatement(String internalIds, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		action = new Actions(driver);
		
		// Open Search & enter Internal Id's
		driver.get(prop.getProperty("searchUrl"));
		editSearchBtn.click();
		eleClickable(driver, filterDropdownInSearch, 10);
		filterDropdownInSearch.click();
		for (int i = 0; i < dropdownList.size(); i++) {
			if(dropdownList.get(i).getText().trim().equals("Internal ID")) {
				dropdownList.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.switchTo().frame(filterFrame);
		action.moveToElement(filterArrowBtn).click(filterArrowBtn).build().perform();
		eleAvailability(driver, searchBox, 10);
		String[] multipleInternalIds = internalIds.split(",");
		for (int i = 0; i < multipleInternalIds.length; i++) {
			searchBox.sendKeys(multipleInternalIds[i]);
			searchBtn.click();
			Thread.sleep(1500);
			for (int j = 0; j < searchList.size(); j++) {
				if(searchList.get(j).getText().trim().equals(multipleInternalIds[i])) {
					searchList.get(j).click();
					break;
				}
			}
			searchBox.clear();
		}
		doneBtn.click();
		setBtn.click();
		driver.switchTo().defaultContent();
		if (saveBtnInSearch.getAttribute("value").equals("Save & Run")) {
			saveBtnInSearch.click();
		}else {
			action.moveToElement(saveArrowInSearch).build().perform();
			eleAvailability(driver, saveAndRunBtn, 10);
			saveAndRunBtn.click();
		}
		
		List<String> vendorsNamesInSearch = new ArrayList<>();
		for (int i = 0; i < vendorNamesListInSearch.size(); i++) {
			String text = vendorNamesListInSearch.get(i).getText().trim();
			vendorsNamesInSearch.add(text);
		}
		
		// Open & execute the script
		je.executeScript("window.open('about:blank','_blank');");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.get(prop.getProperty("scriptUrl"));
		editBtn.click();
		Thread.sleep(2000);
		parametersTab.click();
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		action.click(frequencyBox).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys(frequencyBox, "1").build().perform();
		String date = getYesterdayDate();
		action.click(lastRunDateBox).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys(lastRunDateBox, date).build().perform();
		action.moveToElement(saveArrowInScript).build().perform();
		eleAvailability(driver, saveAndExecuteBtn, 10);
		saveAndExecuteBtn.click();
		eleAvailability(driver, refreshBtn, 10);
		refreshBtn.click();
		while (!scriptStatus.getText().trim().equals("Complete")) {
			Thread.sleep(3000);
			refreshBtn.click();
		}
		Thread.sleep(1500);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		
		// Verify Vendor record for the Email
		for (int i = 0; i < vendorNamesListInSearch.size(); i++) {
			boolean emailFlag = false;
			action.keyDown(Keys.CONTROL).click(vendorNamesListInSearch.get(i)).keyUp(Keys.CONTROL).build().perform();
			ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs1.get(1));
	        String vendor = recordName.getText().trim();
		    String email = driver.findElement(By.xpath("//span[@id='email_fs']//a")).getText().trim();
		    if (!email.isBlank()) {
				je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				communicationTab.click();
				try {
					WebElement loadingEle = driver
							.findElement(By.xpath("//table[@id='messages_splits']//td[contains(text(),'Loading')]"));
					eleToBeInvisible(driver, loadingEle, 10);
				} catch (Exception e) {
				}
				for (int j = 0; j < emailLogList.size(); j++) {
					action.moveToElement(emailLogList.get(j)).build().perform();
					String text = emailLogList.get(j).getText();
					Date date2 = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("M/d/yyyy");
					String todayDate = formatter.format(date2);
					System.out.println(todayDate);
					if (text.contains(email.replace(",", "; ")) && text.contains("Invoice Copy")
							&& text.contains("vendorstmt") && text.contains(todayDate)) {
						emailFlag = true;
						System.out.println("Email sent successfully to Vendor: '" + vendor + "'");
						logInfo.pass("Email sent successfully to Vendor: '" + vendor + "'");
						break;
					}
				}
				if(!emailFlag) {
					System.out.println("Email unable to sent to the Vendor: '" + vendor + "'");
					logInfo.pass("Email unable to sent to the Vendor: '" + vendor + "'");
				}
			}else {
				System.out.println("Email Id is blank & unable to send email to the Vendor: '" + vendor + "'");
				logInfo.pass("Email Id is blank & unable to send email to the Vendor: '" + vendor + "'");
			}
		    driver.close();
		    driver.switchTo().window(tabs1.get(0));
		}
		
		// Remove Criteria in the Saved search & save
		editSearchBtn.click();
		eleClickable(driver, internalIdCriteria, 10);
		internalIdCriteria.click();
		eleClickable(driver, removeBtn, 10);
		removeBtn.click();
		if (saveBtnInSearch.getAttribute("value").equals("Save & Run")) {
			saveBtnInSearch.click();
		}else {
			action.moveToElement(saveArrowInSearch).build().perform();
			eleAvailability(driver, saveAndRunBtn, 10);
			saveAndRunBtn.click();
		}
		
	}

	public void verifyIndividualVendorStatement(String vendor, String emailTemplateData, String currency, String email,
			ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		action = new Actions(driver);
		
		Thread.sleep(1500);
		eleClickable(driver, generateStatementBtn, 10);
		generateStatementBtn.click();
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.manage().window().maximize();
		emailTemplate.click();
		for (int i = 0; i < dropdownList.size(); i++) {
			if(dropdownList.get(i).getText().trim().equals(emailTemplateData)) {
				dropdownList.get(i).click();
				break;
			}
		}
		if (!currency.equals("All")) {
			currencyDropdownInPopup.click();
			for (int i = 0; i < dropdownList.size(); i++) {
				if (dropdownList.get(i).getText().trim().equals(currency)) {
					dropdownList.get(i).click();
					break;
				}
			} 
		}
		action.click(bulkEmailTextarea).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(bulkEmailTextarea, email).build().perform();							
		emailBtn.click();
		
		boolean emailFlag = false;
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			alert.accept();
			if(alertMsg.contains(vendor))
				emailFlag = true;
		}
		driver.close();
		if(isAlertPresent())
			driver.switchTo().alert().accept();
		driver.switchTo().window(tabs.get(0));
		if (emailFlag) {
		    je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			communicationTab.click();
		    try {
				WebElement loadingEle = driver.findElement(By.xpath("//table[@id='messages_splits']//td[contains(text(),'Loading')]"));
				eleToBeInvisible(driver, loadingEle, 10);
			} catch (Exception e) {}
		    for (int i = 0; i < emailLogList.size(); i++) {
				action.moveToElement(emailLogList.get(i)).build().perform();
				String text = emailLogList.get(i).getText();
				if(text.contains(email.replace(",", "; ")) && text.contains("Invoice Copy") && text.contains("vendorstmt")) {
					System.out.println("Email sent successfully to Vendor: '"+vendor+"'");
					logInfo.pass("Email sent successfully to Vendor: '"+vendor+"'");
					break;
				}else {
					System.out.println("Email unable to sent to the Vendor: '"+vendor+"'");
					logInfo.pass("Email unable to sent to the Vendor: '"+vendor+"'");
				}
			}
		}
	}
	
	public void openVendor(String vendor) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		// Navigate to vendors list
		Thread.sleep(2000);
		eleAvailability(driver, By.xpath("//span[text()='Lists']"), 10);
		action.moveToElement(listsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Relationships']"), 10);
		action.moveToElement(relationshipsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Vendors']"), 10);
		vendorsLink.click();
		
		if(isAlertPresent())
			driver.switchTo().alert().accept();
		
		for(int i=0;i<vendorNamesList.size();i++) {
			WebElement currentVendor = vendorNamesList.get(i);
			String text = currentVendor.getText();
			if(text.equals(vendor)) {
				action.moveToElement(currentVendor).build().perform();
				WebElement parentTr = (WebElement)je.executeScript("return arguments[0].parentNode.parentNode;", currentVendor);
				String rowId = parentTr.getAttribute("id");
				if(rowId.isBlank()) {
					WebElement vendorRow = (WebElement)je.executeScript("return arguments[0].parentNode;", parentTr);
					rowId = vendorRow.getAttribute("id");
				}
				driver.findElement(By.xpath("//table[@id='div__bodytab']//tr[@id='"+rowId+"']//a[text()='View']")).click();
				break;
			}
		}
	}
	
	public void verifyVendorListWhenIncludeZeroBalanceIsChecked(ExtentTest logInfo) throws InterruptedException {
		action = new Actions(driver);
		List<String> vendorsNamesInVS = new ArrayList<>();
		List<String> vendorsNamesInNS = new ArrayList<>();
		includeZeroCheckbox.click();
		Thread.sleep(1500);
		int vendorCount = Integer.parseInt(paginationDropdown.getAttribute("value").split("of")[1].trim());
		for (int i = 0; i < vendorsList.size(); i++) {
			action.moveToElement(vendorsList.get(i)).build().perform();
			String vendorName = vendorsList.get(i).getText().trim();
			vendorsNamesInVS.add(vendorName);
		}
		if(vendorCount>25) {
			action.moveToElement(paginationDropdown).click(paginationDropdown).build().perform();
			for (int i = 1; i < dropdownList.size(); i++) {
				if(i>1)
					action.moveToElement(paginationDropdown).click(paginationDropdown).build().perform();
				dropdownList.get(i).click();
				Thread.sleep(1500);
				for (int j = 0; j < vendorsList.size(); j++) {
					action.moveToElement(vendorsList.get(j)).build().perform();
					String vendorName = vendorsList.get(j).getText().trim();
					vendorsNamesInVS.add(vendorName);
				}
			}
		}
		
		// Get vendor names in NetSuite
		Thread.sleep(2000);
		eleAvailability(driver, By.xpath("//span[text()='Lists']"), 10);
		action.moveToElement(listsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Relationships']"), 10);
		action.moveToElement(relationshipsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Vendors']"), 10);
		action.keyDown(Keys.CONTROL).click(vendorsLink).keyUp(Keys.CONTROL).build().perform();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
		// Change the view
		viewDropdown.sendKeys("Vendor General");
		viewLabel.click();
		
		// Get vendors list in NS
		for(int j=0;j<vendorGeneralListInNS.size();j++) {
			action.moveToElement(vendorGeneralListInNS.get(j)).build().perform();
			String text = vendorGeneralListInNS.get(j).getText().trim();
			vendorsNamesInNS.add(text);
		}
		
		driver.close();
		driver.switchTo().window(tabs.get(0));
		
		if(vendorsNamesInNS.size() == vendorsNamesInVS.size()) {
			boolean vendorFlag = true;
			for (int i = 0; i < vendorsNamesInNS.size(); i++) {
				if(!vendorsNamesInNS.get(i).equals(vendorsNamesInVS.get(i)))
					vendorFlag = false;
			}
			
			if (vendorFlag) {
				System.out.println("All the vendors in the Vendor Statement are displayed correctly when 'Include Zero Balance' checkbox is checked");
				logInfo.pass("All the vendors in the Vendor Statement are displayed correctly when 'Include Zero Balance' checkbox is checked");
			} else {
				System.out.println("Vendors in the Vendor Statement are not displaying correctly");
				logInfo.fail("Vendors in the Vendor Statement are not displaying correctly");
			}
		}else {
			System.out.println("Vendor count doesn't match with NetSuite Vendors. Expected count of vendors is "+vendorsNamesInNS.size());
			logInfo.fail("Vendor count doesn't match with NetSuite Vendors. Expected count of vendors is "+vendorsNamesInNS.size());
		}
	}
	
	public void verifyEmailSentToVendor(String vendorName, String receipientEmail, ExtentTest logInfo) {
		action = new Actions(driver);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		for (int i = 0; i < vendorsList.size(); i++) {
			action.moveToElement(vendorList.get(i)).build().perform();
			if(vendorList.get(i).getText().trim().equals(vendorName.trim())) {
				action.keyDown(Keys.CONTROL).click(vendorList.get(i)).keyUp(Keys.CONTROL).build().perform();
				break;
			}
		}
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    communicationTab.click();
	    je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    try {
			WebElement loadingEle = driver.findElement(By.xpath("//table[@id='messages_splits']//td[contains(text(),'Loading')]"));
			eleToBeInvisible(driver, loadingEle, 10);
		} catch (Exception e) {}
	    for (int i = 0; i < emailLogList.size(); i++) {
			action.moveToElement(emailLogList.get(i)).build().perform();
			String text = emailLogList.get(i).getText();
			if(text.contains(receipientEmail.replace(",", "; ")) && text.contains("Invoice Copy") && text.contains("vendorstmt")) {
				System.out.println("Email sent successfully to Vendor: '"+vendorName+"'");
				logInfo.pass("Email sent successfully to Vendor: '"+vendorName+"'");
				break;
			}else {
				System.out.println("Email unable to sent to the Vendor: '"+vendorName+"'");
				logInfo.pass("Email unable to sent to the Vendor: '"+vendorName+"'");
			}
		}
	    driver.close();
	    driver.switchTo().window(tabs.get(0));
	}
	
	public void verifyEmail(String vendorsData, String receipientsData, ExtentTest logInfo) throws InterruptedException {
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			alert.accept();
			if(vendorsData.contains("/")) {
				String[] multipleReceipients = receipientsData.split("/");
				String[] multipleVendors = vendorsData.split("/");
				for (int i = 0; i < multipleVendors.length; i++) {
					if(alertMsg.contains(multipleVendors[i]))
						verifyEmailSentToVendor(multipleVendors[i], multipleReceipients[i], logInfo);
					else {
						System.out.println("Email unable to sent to the Vendor: "+multipleVendors[i]);
						logInfo.fail("Email unable to sent to the Vendor: "+multipleVendors[i]);
					}
				}
			}else {
				if(alertMsg.contains(vendorsData))
					verifyEmailSentToVendor(vendorsData, receipientsData, logInfo);
				else {
					System.out.println("Email unable to sent to the Vendor: "+vendorsData);
					logInfo.fail("Email unable to sent to the Vendor: "+vendorsData);
				}
			}
		}else {
			System.out.println("Email unable to send. No alert occured");
			logInfo.fail("Email unable to send. No alert occured");
		}
	}
	
	public void enterReceipients(String vendorsData, String receipientsData) {
		action = new Actions(driver);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		if(receipientsData.contains("/")) {
			String[] multipleReceipients = receipientsData.split("/");
			String[] multipleVendors = vendorsData.split("/");
			if(multipleVendors.length == multipleReceipients.length) {
				for (int j = 0; j < multipleReceipients.length; j++) {
					// Select Items in the click to add list
					for(int i=0;i<vendorsList.size();i++) {
						WebElement currentVendor = vendorsList.get(i);
						String text = currentVendor.getText().trim();
						if(text.equals(multipleVendors[j])) {
							if(i==0)
								executor.executeScript("arguments[0].scrollIntoView(true);", vendorSublist);
							else
								executor.executeScript("arguments[0].scrollIntoView(true);", vendorList.get(i-1));
							WebElement parentTd = (WebElement)executor.executeScript("return arguments[0].parentNode;", currentVendor);
							WebElement parentTr = (WebElement)executor.executeScript("return arguments[0].parentNode;", parentTd);
							String trId = parentTr.getAttribute("id");
							
							// Enter Receipient email
							WebElement emailToTextArea = driver.findElement(By.xpath("//tr[@id='"+trId+"']//textarea"));
							action.click(emailToTextArea).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(emailToTextArea, multipleReceipients[j]).build().perform();							
						}
					}
				}
			}else {
				System.out.println("No.of vendors selected & no.of receipients emails given does'nt match");
			}
		}else {
			for(int i=0;i<vendorsList.size();i++) {
				WebElement currentVendor = vendorsList.get(i);
				String text = currentVendor.getText().trim();
				if(text.equals(vendorsData)) {
					if(i==0)
						executor.executeScript("arguments[0].scrollIntoView(true);", vendorSublist);
					else
						executor.executeScript("arguments[0].scrollIntoView(true);", vendorList.get(i-1));
					WebElement parentTd = (WebElement)executor.executeScript("return arguments[0].parentNode;", currentVendor);
					WebElement parentTr = (WebElement)executor.executeScript("return arguments[0].parentNode;", parentTd);
					String trId = parentTr.getAttribute("id");
					
					// Enter Receipient email
					WebElement emailToTextArea = driver.findElement(By.xpath("//tr[@id='"+trId+"']//textarea"));
					action.click(emailToTextArea).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(emailToTextArea, receipientsData).build().perform();
				}
			}
		}
	}
	
	public void selectEmailTemplateAndEmailVendorStatement(String emailTemplateData) {
		// Select Email template
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0,0)");
		emailTemplate.sendKeys(emailTemplateData);
		queue.click();
		
		// Click Email button
		emailBtn.click();
//		SimpleDateFormat formatMinutes = new SimpleDateFormat("mm");
//		String getMinutes = formatMinutes.format(new Date());
//		System.out.println(getMinutes);
//		return getMinutes;
	}
	
	public void verifyNoEmailReceipientsError(ExtentTest logInfo) throws InterruptedException {
		// Select email template
		emailTemplate.sendKeys("Invoice Email Template");
		queue.click();
		
		// Remove 1st vendor receipient email text
		driver.findElement(By.xpath("//tr[@id='custpage_detailsrow0']//textarea")).clear();
		
		// Select first vendor "Print" checkbox
		driver.findElement(By.xpath("//tr[@id='custpage_detailsrow0']//img")).click();
		emailBtn.click();
		
		// Verify the alert
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			if(alertMsg.contains("Please enter Email for the selected Vendor")) {
				System.out.println("Email not entered for the vendor selected. Alert occured: "+alertMsg);
				logInfo.pass("Email not entered for the vendor selected. Alert occured: "+alertMsg);
			}
			alert.accept();
		}else {
			System.out.println("Alert not occured");
			logInfo.fail("Alert not occured");
		}
	}
	
	public void verifyInvalidEmailError(ExtentTest logInfo) throws InterruptedException {
		action = new Actions(driver);
		// Select email template
		emailTemplate.sendKeys("Invoice Email Template");
		queue.click();
		
		// Enter invalid email Id in Email to field
		WebElement emailToTextArea = driver.findElement(By.xpath("//tr[@id='custpage_detailsrow0']//textarea"));
		action.click(emailToTextArea).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(emailToTextArea, "testEmail").build().perform();
		
		// Select first vendor "Print" checkbox & click email button
		driver.findElement(By.xpath("//tr[@id='custpage_detailsrow0']//img")).click();
		emailBtn.click();
		
		// Verify the alert
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			if(alertMsg.contains("SSS_INVALID_TO_EMAIL")) {
				System.out.println("Recipient Email is invalid. Alert occured: "+alertMsg);
				logInfo.pass("Recipient Email is invalid. Alert occured: "+alertMsg);
			}
			alert.accept();
		}else {
			System.out.println("Alert not occured");
			logInfo.fail("Alert not occured");
		}
	}
	
	public void verifyNoEmailTemplateError(ExtentTest logInfo) throws InterruptedException {
		// Select first vendor "Print" checkbox & click email button
		driver.findElement(By.xpath("//tr[@id='custpage_detailsrow0']//img")).click();
		emailBtn.click();
		
		// Verify the alert
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			if(alertMsg.contains("Please select one email template")) {
				System.out.println("Email Template not selected. Alert occured: "+alertMsg);
				logInfo.pass("Email Template not selected. Alert occured: "+alertMsg);
			}
			alert.accept();
		}else {
			System.out.println("Alert not occured");
			logInfo.fail("Alert not occured");
		}
	}
	
	public void printVendorStatement(String vendorsData, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		// Click Print Button
		executor.executeScript("window.scrollTo(0,0)");
		printBtn.click();
		
		String poPageWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String child: allWindows) {
			if(!poPageWindow.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		if(driver.getTitle().isBlank()) {
			Thread.sleep(4000);
			driver.close();
			// Switch to PO Window
			driver.switchTo().window(poPageWindow);
			if(vendorsData.contains("/")) {
				System.out.println("Vendor statement print successfull for vendors: "+vendorsData.replace("/", ", "));
				logInfo.pass("Vendor statement print successfull for vendors: "+vendorsData.replace("/", ", "));
			}
			else {
				System.out.println("Vendor statement print successfull for vendor: "+vendorsData);
				logInfo.pass("Vendor statement print successfull for vendor: "+vendorsData);
			}
		}else {
			logInfo.fail("Vendor Statement not printed");
		}
	}
	
	public void verifyStatementsInQueue(int countInVsPage, ExtentTest logInfo) {
		String queueValue = queue.getAttribute("value");
		int queueCount = Integer.parseInt(queueValue);
		if(countInVsPage == queueCount) {
			System.out.println("Statements in queue field value is displaying correctly");
			logInfo.pass("Statements in queue field value is displaying correctly");
		}else {
			System.out.println("Statements in queue field value is nots displaying correctly");
			logInfo.fail("Statements in queue field value is nots displaying correctly");
		}
	}
	
	public int selectVendors(String vendorCategoryData, String vendorsData, String currencyData) throws InterruptedException {
		int vendorCount = 0;
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		action = new Actions(driver);
		// Select Vendor category
		String selectedCategory = vendorCategory.getAttribute("value");
		if(vendorCategoryData.isBlank()) {
			if(!selectedCategory.isBlank()) {
				vendorCategory.click();
				for(int i=0;i<dropdownList.size();i++) {
					String text = dropdownList.get(i).getText().trim();
					if(text.isBlank())
						dropdownList.get(i).click();
				}
			}
		}
		else
			vendorCategory.sendKeys(vendorCategoryData);
		
		queue.click();
		
		// Select Currency & Vendors
		if(vendorsData.contains("/")) {
			boolean selectedCurrencyFlag = false;
			String[] multipleVendors = vendorsData.split("/");
			String[] multipleCurrencies = currencyData.split(",");
			for (int j = 0; j < multipleVendors.length; j++) {
				// Select Items in the click to add list
				for(int i=0;i<vendorsList.size();i++) {
					WebElement currentVendor = vendorsList.get(i);
					String text = currentVendor.getText().trim();
					if(text.equals(multipleVendors[j])) {
						if(i==0)
							executor.executeScript("arguments[0].scrollIntoView(true);", vendorSublist);
						else
							executor.executeScript("arguments[0].scrollIntoView(true);", vendorList.get(i-1));
						WebElement parentTd = (WebElement)executor.executeScript("return arguments[0].parentNode;", currentVendor);
						WebElement parentTr = (WebElement)executor.executeScript("return arguments[0].parentNode;", parentTd);
						String trId = parentTr.getAttribute("id");
						
						// Select currency
						if(!multipleCurrencies[j].equals("All")) {
							driver.findElement(By.xpath("//tr[@id='"+trId+"']//button")).click();
							String vsPageWindow = driver.getWindowHandle();
							Set<String> allWindows = driver.getWindowHandles();
							for(String child: allWindows) {
								if(!vsPageWindow.equals(child)) {
									driver.switchTo().window(child);
									currencyDropdown.sendKeys(multipleCurrencies[j]);
									saveBtn.click();
								}
							}
							selectedCurrencyFlag = true;
							driver.switchTo().window(vsPageWindow);
						}else {
							driver.findElement(By.xpath("//tr[@id='"+trId+"']//img")).click();
						}
						vendorCount++;
					}
				}
			}
			if(selectedCurrencyFlag) {
				for (int j = 0; j < multipleVendors.length; j++) {
					if(multipleCurrencies[j].equals("All")) {
						for(int i=0;i<vendorsList.size();i++) {
							WebElement currentVendor = vendorsList.get(i);
							String text = currentVendor.getText().trim();
							if(text.equals(multipleVendors[j])) {
								action.moveToElement(currentVendor).build().perform();
								WebElement parentTd = (WebElement)executor.executeScript("return arguments[0].parentNode;", currentVendor);
								WebElement parentTr = (WebElement)executor.executeScript("return arguments[0].parentNode;", parentTd);
								String trId = parentTr.getAttribute("id");
								driver.findElement(By.xpath("//tr[@id='"+trId+"']//img")).click();
							}
						}
					}
				}
			}
		}else {
			for(int i=0;i<vendorsList.size();i++) {
				WebElement currentVendor = vendorsList.get(i);
				String text = currentVendor.getText().trim();
				if(text.equals(vendorsData)) {
					if(i==0)
						executor.executeScript("arguments[0].scrollIntoView(true);", vendorSublist);
					else
						executor.executeScript("arguments[0].scrollIntoView(true);", vendorList.get(i-1));
					WebElement parentTd = (WebElement)executor.executeScript("return arguments[0].parentNode;", currentVendor);
					WebElement parentTr = (WebElement)executor.executeScript("return arguments[0].parentNode;", parentTd);
					String trId = parentTr.getAttribute("id");
					Thread.sleep(2000);
					// Select currency
					if(!currencyData.equals("All")) {
						driver.findElement(By.xpath("//tr[@id='"+trId+"']//button")).click();
						String vsPageWindow = driver.getWindowHandle();
						Set<String> allWindows = driver.getWindowHandles();
						for(String child: allWindows) {
							if(!vsPageWindow.equals(child)) {
								driver.switchTo().window(child);
								currencyDropdown.sendKeys(currencyData);
								saveBtn.click();
							}
						}
						driver.switchTo().window(vsPageWindow);
					}else {
						driver.findElement(By.xpath("//tr[@id='"+trId+"']//img")).click();
					}
					vendorCount++;
				}
			}
		}
		return vendorCount;
	}
	
	public void unmarkAllWithPrint(ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollTo(0,0)");
		
		// Click on Unmark all button
		unMarkAllBtn.click();
		Thread.sleep(1500);
		
		// Click on print button
		printBtn.click();
		
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			if(alertMsg.contains("Please select atleast one Vendor")) {
				System.out.println("Vendor Statement print unsuccessfull. Alert occured: "+alertMsg);
				logInfo.pass("Vendor Statement print unsuccessfull. Alert occured: "+alertMsg);
			}
			alert.accept();
		}else {
			System.out.println("Alert not occured");
			logInfo.fail("Alert not occured");
		}
	}
	
	public void unmarkAllWithEmail(ExtentTest logInfo) throws InterruptedException {
		// Click on email button
		emailBtn.click();
		
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			if(alertMsg.contains("Please select atleast one Vendor")) {
				System.out.println("Email not sent. Alert occured: "+alertMsg);
				logInfo.pass("Email not sent. Alert occured: "+alertMsg);
			}
			alert.accept();
		}else {
			System.out.println("Alert not occured");
			logInfo.fail("Alert not occured");
		}
	}
	
	public void markAllWithEmail(String category, String recipientEmails, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		action = new Actions(driver);
		je.executeScript("window.scrollTo(0,0)");
		
		// Select template
		emailTemplate.sendKeys("Invoice Email Template");
		
		// Select Category
		vendorCategory.click();
		for(int i=0;i<dropdownList.size();i++) {
			String text = dropdownList.get(i).getText().trim();
			if(text.equals(category)) {
				dropdownList.get(i).click();
				break;
			}
		}
		
		// Click on Mark all button
		markAllBtn.click();
		Thread.sleep(1500);
		List<String> vendorsToBeEmailed = new ArrayList<>();
		for(int j=0;j<vendorList.size();j++) {
			action.moveToElement(vendorList.get(j)).build().perform();
			String text = vendorList.get(j).getText().trim();
			vendorsToBeEmailed.add(text);
		}
		
		// Enter all the Recipient's Email
		String[] multipleReceipients = recipientEmails.split("/");
		if(vendorsToBeEmailed.size() == multipleReceipients.length) {
			for (int i = 0; i < vendorsToBeEmailed.size(); i++) {
				for(int j=0;j<vendorList.size();j++) {
					if(vendorList.get(i).getText().contains(vendorsToBeEmailed.get(i))) {
						action.moveToElement(vendorList.get(j)).build().perform();
						WebElement parentTr = (WebElement)je.executeScript("return arguments[0].parentNode.parentNode;", vendorList.get(i));
						String trId = parentTr.getAttribute("id");
						
						// Enter Receipient email
						WebElement emailToTextArea = driver.findElement(By.xpath("//tr[@id='"+trId+"']//textarea"));
						action.click(emailToTextArea).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(emailToTextArea, multipleReceipients[i]).build().perform();
						break;
					}
				}
			}
			
			// Click on Email button
			je.executeScript("window.scrollTo(0,0)");
			emailBtn.click();
			if(isAlertPresent()) {
				Thread.sleep(1000);
				Alert alert = driver.switchTo().alert();
				String alertMsg = alert.getText();
				alert.accept();
				for (int i = 0; i < vendorsToBeEmailed.size(); i++) {
					if(alertMsg.contains(vendorsToBeEmailed.get(i)))
						verifyEmailSentToVendor(vendorsToBeEmailed.get(i), multipleReceipients[i], logInfo);
					else {
						System.out.println("Email unable to sent to the Vendor: "+vendorsToBeEmailed.get(i));
						logInfo.fail("Email unable to sent to the Vendor: "+vendorsToBeEmailed.get(i));
					}
				}
			}else {
				System.out.println("Email unable to send. No alert occured");
				logInfo.fail("Email unable to send. No alert occured");
			}
		}else {
			System.out.println("No.of vendors selected & no.of receipients emails given does'nt match");
			logInfo.fail("No.of vendors selected & no.of receipients emails given does'nt match");
		}
	}

	public void verifyVendorListAfterFilter(String category, String template, ExtentTest logInfo) throws InterruptedException {
		action = new Actions(driver);
		List<String> vendorListAfterFilterInVsPage = new ArrayList<>();
		List<String> vendorListAfterFilterInNs = new ArrayList<>();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollTo(0,0)");
		// Get vendor names from Vendor Statement Page
		emailTemplate.sendKeys(template);
		if(category.isBlank()) {
			vendorCategory.click();
			for(int i=0;i<dropdownList.size();i++) {
				String text = dropdownList.get(i).getText().trim();
				if(text.isBlank())
					dropdownList.get(i).click();
			}
		}
		else
			vendorCategory.sendKeys(category);
		queue.click();
		Thread.sleep(3000);
//		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		for(int j=0;j<vendorList.size();j++) {
			action.moveToElement(vendorList.get(j)).build().perform();
			String text = vendorList.get(j).getText().trim();
			vendorListAfterFilterInVsPage.add(text);
		}
		
		// Get vendor names in Netsuite
		// Navigate to vendors list
		Thread.sleep(2000);
		eleAvailability(driver, By.xpath("//span[text()='Lists']"), 10);
		action.moveToElement(listsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Relationships']"), 10);
		action.moveToElement(relationshipsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Vendors']"), 10);
		action.keyDown(Keys.CONTROL).click(vendorsLink).keyUp(Keys.CONTROL).build().perform();
		
		String poPageWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String child: allWindows) {
			if(!poPageWindow.equals(child)) {
				driver.switchTo().window(child);
				
				// Change the view
				viewDropdown.sendKeys(prop.getProperty("search"));
				viewLabel.click();
				
				// Expand the filters section
				eleClickable(driver, By.xpath("//span[@class='ns-icon ns-filters-onoff-button']"), 5);
				String flag = filtersDiv.getAttribute("aria-expanded");
				if(flag.equals("false")) {
					action.moveToElement(filtersDiv).build().perform();
					filtersDiv.click();
				}
				
				// Select category
				if(!category.isEmpty()) {
					eleAvailability(driver, By.xpath("//input[@id='inpt_Vendor_CATEGORY1']"), 3);
					vendorCategoryInSearch.sendKeys(category);
					vendorCategoryLabelInSearch.click();
					Thread.sleep(2000);
				}
				else {
					eleAvailability(driver, By.xpath("//input[@id='inpt_Vendor_CATEGORY1']"), 3);
					vendorCategoryInSearch.sendKeys("- All -");
					vendorCategoryLabelInSearch.click();
					Thread.sleep(2000);
				}
				
				// Get vendors list in NS
				for(int j=0;j<vendorsInSearch.size();j++) {
					String text = vendorsInSearch.get(j).getText().trim();
					vendorListAfterFilterInNs.add(text);
				}
			}
		}
		
		driver.close();
		// Switch to PO Window
		driver.switchTo().window(poPageWindow);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		// Compare both the lists
		if(category.isBlank())
			category="NULL";
		
		boolean flag = true;
		if(vendorListAfterFilterInVsPage.size() == vendorListAfterFilterInNs.size()) {
			for (int i = 0; i < vendorListAfterFilterInVsPage.size(); i++) {
				if(!vendorListAfterFilterInVsPage.get(i).contains(vendorListAfterFilterInNs.get(i)))
					flag = false;
			}
		}
		else
			flag = false;
		
		if(flag) {
			System.out.println("Vendors are displayed correctly in the Vendors sublist based on the Vendor category = "+category);
			logInfo.pass("Vendors are displayed correctly in the Vendors sublist based on the Vendor category = "+category);
		}
		else {
			System.out.println("Vendors are not displayed correctly in the Vendors sublist based on the Vendor category = "+category);
			logInfo.fail("Vendors are not displayed correctly in the Vendors sublist based on the Vendor category = "+category);
		}
	}
	
	public void verifyAlertForInvalidDateRange(ExtentTest logInfo) throws InterruptedException {
		action.click(statementDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(statementDate, "9/28/2020").build().perform();
		queue.click();
		eleClickable(driver, By.xpath("//input[@id='custpage_startdate']"), 5);
		action.click(startDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(startDate, "11/6/2020").build().perform();
		queue.click();
		if (isAlertPresent()) {
			driver.switchTo().alert().accept();
		}
		eleClickable(driver, By.xpath("//input[@id='inpt_custpage_emailtemplate1']"), 5);
		emailTemplate.sendKeys("79 Consulting");
		checkbox.click();
		printBtn.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for invalid date range: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
	}
	
	public void verifyStartDateFieldValidations(ExtentTest logInfo) throws InterruptedException {
		action = new Actions(driver);
		Thread.sleep(2000);
		// Verification of Start Date Field with alphabets
		action.click(startDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(startDate, "abc").build().perform();
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Start Date Field with alphabets: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Start Date Field with numbers
		Thread.sleep(500);
		startDate.sendKeys("12");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Start Date Field with numbers: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Start Date Field with special characters
		Thread.sleep(500);
		startDate.sendKeys("@#$");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Start Date Field with special characters: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Start Date Field with alpha-numerics
		Thread.sleep(500);
		startDate.sendKeys("abc123");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Start Date Field with alpha-numerics: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Start Date Field with alphabets & special characters
		Thread.sleep(500);
		startDate.sendKeys("abc@#$");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Start Date Field with alphabets & special characters: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Start Date Field with numbers & special characters
		Thread.sleep(500);
		startDate.sendKeys("123@#$");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Start Date Field with numbers & special characters: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Start Date Field with value of the month
		Thread.sleep(500);
		startDate.sendKeys("13/13/2020");
		queue.click();
		if(isAlertPresent()) {
			driver.switchTo().alert().accept();
		}
		Thread.sleep(3000);
		String date1 = startDate.getAttribute("value");
		if(date1.equals("12/13/2020")) {
			logInfo.pass("Value of the month adjusted to 12");
			System.out.println("Value of the month adjusted to 12");
		}else {
			logInfo.fail("Value of the month is not adjusted to 12");
			System.out.println("Value of the month is not adjusted to 12");
		}
		
		// Verification of Start Date Field with value of the day
		action.click(startDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(startDate, "1/40/2020").build().perform();
		queue.click();
		if(isAlertPresent()) {
			driver.switchTo().alert().accept();
		}
		Thread.sleep(3000);
		String date2 = startDate.getAttribute("value");
		if(date2.equals("1/31/2020")) {
			logInfo.pass("Value of the date adjusted to 31");
			System.out.println("Value of the date adjusted to 31");
		}else {
			logInfo.fail("Value of the date is not adjusted to 31");
			System.out.println("Value of the date is not adjusted to 31");
		}
		
		// Verification of Start Date field with more than 2 digit numbers
		action.click(startDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(startDate, "123").build().perform();
		queue.click();
		while(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			alert.accept();
		}
		Thread.sleep(3000);
		String date3 = startDate.getAttribute("value");
		System.out.println(date3);
		if(date3.contains("1/23")) {
			logInfo.pass("Start Date adjusted to '"+date3+"' when Start Date field is given as '123'");
			System.out.println("Start Date adjusted to '"+date3+"' when Start Date field is given as '123'");
		}else {
			logInfo.fail("Start Date is not adjusted when Start Date field is given as '123'");
			System.out.println("Start Date is not adjusted when Start Date field is given as '123'");
		}
		
		// Verification of Start Date Field when no statement date is entered
		action.click(startDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		queue.click();
		while(isAlertPresent()) {
			driver.switchTo().alert().accept();
		}
		Thread.sleep(3000);
		String date4 = startDate.getAttribute("value");
		if(date4.isBlank()) {
			logInfo.fail("Date is empty");
			System.out.println("Date is empty");
		}else {
			logInfo.pass("Start date is taken as current date");
			System.out.println("Start date is taken as current date");
		}
	}
	
	public void verifyStatementDateFieldValidations(ExtentTest logInfo) throws InterruptedException {
		action = new Actions(driver);
		// Verification of Statement Date Field with alphabets
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(statementDate, "abc").build().perform();
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Statement Date Field with alphabets: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Statement Date Field with numbers
		Thread.sleep(500);
		statementDate.sendKeys("12");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Statement Date Field with numbers: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Statement Date Field with special characters
		Thread.sleep(500);
		statementDate.sendKeys("@#$");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Statement Date Field with special characters: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Statement Date Field with alpha-numerics
		Thread.sleep(500);
		statementDate.sendKeys("abc123");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Statement Date Field with alpha-numerics: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Statement Date Field with alphabets & special characters
		Thread.sleep(500);
		statementDate.sendKeys("abc@#$");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Statement Date Field with alphabets & special characters: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Statement Date Field with numbers & special characters
		Thread.sleep(500);
		statementDate.sendKeys("123@#$");
		queue.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			logInfo.pass("Alert occured for verification of Statement Date Field with numbers & special characters: "+alertMsg);
			alert.accept();
		}else {
			System.out.println("No alert occured");
			logInfo.fail("No alert occured");
		}
		
		// Verification of Statement Date Field with value of the month
		Thread.sleep(1000);
		statementDate.sendKeys("13/13/2020");
		queue.click();
		Thread.sleep(3000);
		String date1 = statementDate.getAttribute("value");
		if(date1.equals("12/13/2020")) {
			logInfo.pass("Value of the month adjusted to 12");
			System.out.println("Value of the month adjusted to 12");
		}else {
			logInfo.fail("Value of the month is not adjusted to 12");
			System.out.println("Value of the month is not adjusted to 12");
		}
		
		// Verification of Statement Date Field with value of the day
		action.click(statementDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(statementDate, "1/40/2020").build().perform();
		queue.click();
		Thread.sleep(3000);
		String date2 = statementDate.getAttribute("value");
		if(date2.equals("1/31/2020")) {
			logInfo.pass("Value of the date adjusted to 31");
			System.out.println("Value of the date adjusted to 31");
		}else {
			logInfo.fail("Value of the date is not adjusted to 31");
			System.out.println("Value of the date is not adjusted to 31");
		}
		
		// Verification of Statement Date field with more than 2 digit numbers
		action.click(statementDate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(statementDate, "123").build().perform();
		queue.click();
		while(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			alert.accept();
		}
		Thread.sleep(3000);
		String date3 = statementDate.getAttribute("value");
		System.out.println(date3);
		if(date3.contains("1/23")) {
			logInfo.pass("Statement Date adjusted to '"+date3+"' when Statement Date field is given as '123'");
			System.out.println("Statement Date adjusted to '"+date3+"' when Statement Date field is given as '123'");
		}else {
			logInfo.fail("Statement Date is not adjusted when Statement Date field is given as '123'");
			System.out.println("Statement Date is not adjusted when Statement Date field is given as '123'");
		}
		
		// Verification of Statement Date Field when no statement date is entered
		statementDate.clear();
		statementDate.sendKeys("");
		queue.click();
		Thread.sleep(3000);
		String date4 = statementDate.getAttribute("value");
		if(date4.isBlank()) {
			logInfo.fail("Date is empty");
			System.out.println("Date is empty");
		}else {
			logInfo.pass("Statement date is taken as current date");
			System.out.println("Statement date is taken as current date");
		}
	}

	public void verifyAlertForNoVendorSelectedError(ExtentTest loginfo) {
		printBtn.click();
		if(isAlertPresent()) {
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			if(alertMsg.contains("Please select atleast one Vendor")) {
				System.out.println("Alert occured while printing vendor statement without selecting the vendor: "+alertMsg);
				loginfo.pass("Alert occured while printing vendor statement without selecting the vendor: "+alertMsg);
			}else {
				System.out.println("No alert occured while printing vendor statement without selecting the vendor");
				loginfo.fail("No alert occured while printing vendor statement without selecting the vendor");
			}
			alert.accept();
		}
	}
}
