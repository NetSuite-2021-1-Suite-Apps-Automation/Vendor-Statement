package com.qa.vendorStatementRP.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.vendorStatementRP.util.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//li[contains(@id,'ns-header-menu-userrole-item')]/a/span[@class='ns-role-menuitem-text']")
	List<WebElement> rolesList;
	
	@FindBy(xpath = "//span[text()='Transactions']")
	WebElement transactionsLink;
	
	@FindBy(xpath = "//span[text()='Purchases']")
	WebElement PurchasesLink;
	
	@FindBy(xpath = "//span[text()='Vendor Statement']")
	WebElement vendorStatementLink;
	
	@FindBy(xpath = "//div[@class='ns-role']/span[2]")
	WebElement role;
	
	@FindBy(xpath = "//div[@id='devpgloadtime']//following-sibling::div[@class='ns-logo']//img")
	List<WebElement> images;
	
	public HomePage() {
		action = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public VendorStatementPage clickOnVendorStatmentLink(){
		eleAvailability(driver, By.xpath("//span[text()='Transactions']"), 10);
		action.moveToElement(transactionsLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Purchases']"), 10); // Explicit Wait
		action.moveToElement(PurchasesLink).build().perform();
		eleAvailability(driver, By.xpath("//span[text()='Vendor Statement']"), 10); // Explicit Wait
		vendorStatementLink.click();
		
		if(isAlertPresent()) {
			driver.switchTo().alert().accept();
		}
		
		return new VendorStatementPage();
	}
	
	public void changeRole(String company, String roleData, String roleType, String selectedRole) throws InterruptedException {
		action = new Actions(driver);
		String currentRole = role.getText().trim();
		if(currentRole.equals(selectedRole)) {
			System.out.println("Role already selected");
		} else {
			action.moveToElement(driver.findElement(By.xpath("//div[@id='spn_cRR_d1']/a"))).build().perform();
			for(int i=0;i<rolesList.size();i++) {
				WebElement roleElement = rolesList.get(i);
				String roleValue = roleElement.getText().trim();
				if(roleValue.contains(company) && roleValue.contains(roleData) && roleValue.contains(roleType)) {
					roleElement.click();
					break;
				}
			}
		}
		
	}
}
