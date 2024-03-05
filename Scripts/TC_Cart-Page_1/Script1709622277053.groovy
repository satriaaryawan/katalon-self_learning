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

//Call test case
WebUI.callTestCase(findTestCase('TC_OTP-Page_1'), [:], FailureHandling.STOP_ON_FAILURE)

//Input OTP
WebUI.setText(findTestObject('OTP-1'), '9')
WebUI.setText(findTestObject('OTP-2'), '9')
WebUI.setText(findTestObject('OTP-3'), '9')
WebUI.setText(findTestObject('OTP-4'), '9')
WebUI.setText(findTestObject('OTP-5'), '9')
WebUI.setText(findTestObject('OTP-6'), '9')

//Verify the shipping address show
WebUI.verifyElementPresent(findTestObject('Shipping Address'), 30, FailureHandling.CONTINUE_ON_FAILURE)

//Verify the shipping address show
WebUI.verifyElementPresent(findTestObject('Share Cart'), 30, FailureHandling.CONTINUE_ON_FAILURE)