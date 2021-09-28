import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_National'), Nationality, false)

if (Gender == 'pria') {
    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR_title_1'), 'Mr', false)
} else if (Gender == 'wanita') {
    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR_title_1'), 'Miss', false)
}

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), First_name)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), Last_name)

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_National_1'), Nationality, false)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_1'), Dob, false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), Day)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), Year)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), Passport)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_passPort_1'), ExpDate, false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), ExpDay)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), ExpYear)

if (Gender == 'pria') {
    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR_title_2'), 'Mr', false)
} else if (Gender == 'wanita') {
    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR_title_2'), 'Miss', false)
}

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_2'), First_name)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_2'), Last_name)

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_National_2'), Nationality, false)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_2'), Dob, false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_2'), Day)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_2'), Year)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_2'), Passport)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_passPort_2'), ExpDate, false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_2'), ExpDay)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_2'), ExpYear)

if (Gender == 'pria') {
    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR_title_3'), 'Mr', false)
} else if (Gender == 'wanita') {
    WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR_title_3'), 'Miss', false)
}

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_3'), First_name)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_3'), Last_name)

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_National_3'), Nationality, false)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_3'), Dob, false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_3'), Day)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_3'), Year)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_3'), Passport)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_passPort_3'), ExpDate, false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_3'), ExpDay)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_3'), ExpYear)

if (Payment == 'Bank Transfer') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment_BankTransfer'))
} else if (Payment == 'Pay Later') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment_Paylater'))
} else if (Payment == 'Wallet Balance') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment_WalletBalance'))
} else if (Payment == 'Paypal') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment_Paypal'))
} else if (Payment == 'Stripe') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment_Stripe'))
} else if (Payment == 'Paddle') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Payment_Paddle'))
}

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing, you agree to the   Terms and Conditions'))

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

