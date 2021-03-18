Feature: Automation Testing on Vendor Statement Suite App

Scenario: Test scenario for Statement date & Start date field validations
Then Verify all the field validations
Then Verify Start date exceed Statement Date error
Then Verify the alert while printing vendor statement without selecting the vendor

Scenario: Test scenario for Vendor List verifications
Then Verify the vendors in the vendor sublist based on vendor category using excel data at "C:\Users\Sravan Kumar\Desktop\2021.1 SuiteApp Automation Data\Vendor Statement_DevProdRP.xlsx,Vendor List Validations"
Then Verify the vendors in the vendor sublist when Include zero balance checkbox is checked
Then Verify Mark All functionality with Email functionality using excel data at "C:\Users\Sravan Kumar\Desktop\2021.1 SuiteApp Automation Data\Vendor Statement_DevProdRP.xlsx,Mark All with Email"
Then Verify Unmark All functionality with Print & Email functionality

#Scenario: Test scenario for verifying the Print functionality
#Then Select the vendors and print statement using excel data at "C:\Users\Sravan Kumar\Desktop\2021.1 SuiteApp Automation Data\Vendor Statement_DevProdRP.xlsx,Print Functionality"

Scenario: Verification of Email functionality
Then Verification of No Email template error
Then Verification of No Email Receipients error
Then Verification of Email to field with invalid emailId
Then Verification of Email functionality with valid data using excel data at "C:\Users\Sravan Kumar\Desktop\2021.1 SuiteApp Automation Data\Vendor Statement_DevProdRP.xlsx,Email Functionality"
Then Verification of Vendor Statement using Generate Statement feature in Vendor record using excel at "C:\Users\Sravan Kumar\Desktop\2021.1 SuiteApp Automation Data\Vendor Statement_DevProdRP.xlsx,Individual Vendor Statement"
Then Verification of Auto Email functionality in Vendor Statement using excel at "C:\Users\Sravan Kumar\Desktop\2021.1 SuiteApp Automation Data\Vendor Statement_DevProdRP.xlsx,Auto Email"
Then Verification of Vendor Portal Access for the Vendor using data "Bob Ford, CPA" "test123"