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

WebUI.openBrowser('https://www.phptravels.net/')

WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/button_flights'))

if (typeTrip == 'One Way') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_One Way_trip'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Flying From_from'), flyingFrom)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/div_JOG Adi Sutjipto'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_To Destination_to'), Destination)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/div_CGK Soekarno Hatta IntlJakarta, Indonesia'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Departure Date_depart'), Departure_Date)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/a_1'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Adults_adults'), Passenger)

    WebUI.selectOptionByValue(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/select_Economy                Business                First'), 
        typeFlight, false)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/button_Search'))

    WebUI.click(findTestObject('Page_Flights - PHPTRAVEL/button_USD 33        Book Now'))
} else if (typeTrip == 'Round Trip') {
    WebUI.delay(3)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Round Trip_trip'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Flying From_from'), flyingFrom)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/div_JOG Adi Sutjipto'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_To Destination_to'), Destination)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/div_CGK Soekarno Hatta IntlJakarta, Indonesia'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Departure Date_depart'), Departure_Date)

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Return Date_returning'), Return_Date)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/a_1'))

    WebUI.setText(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/input_Adults_adults'), Passenger)

    WebUI.selectOptionByValue(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/select_Economy                Business                First'), 
        typeFlight, false)

    WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/button_Search'))

    WebUI.click(findTestObject('Page_Flights - PHPTRAVEL/button_USD 33        Book Now'))
}

