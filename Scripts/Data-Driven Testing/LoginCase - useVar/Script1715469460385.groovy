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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-beta.forces.id/login')

WebUI.setText(findTestObject('Object Repository/Page_Alpha/input__txtUser'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Alpha/input_Forgot password_txtrgeyuetlr'), '3Z9vEXbPUsBb8kkQDDKxXw==')

WebUI.click(findTestObject('Object Repository/Page_Alpha/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alpha/div_Dashboard'), 0)

WebUI.click(findTestObject('Object Repository/Page_Alpha/div_Hi there, Reza Wardhani'))

WebUI.click(findTestObject('Object Repository/Page_Alpha/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_Alpha/input__txtUser'), 'admin@admin.com')

WebUI.click(findTestObject('Object Repository/Page_Alpha/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alpha/span_This field is required'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Alpha/input__txtUser'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Alpha/input_Forgot password_txtrywd2t8jg'), '3Z9vEXbPUsBb8kkQDDKxXw==')

WebUI.click(findTestObject('Object Repository/Page_Alpha/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alpha/span_This field is required'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Alpha/input__txtUser'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Alpha/input_Forgot password_txtrywd2t8jg'), '3Z9vEXbPUsBBwp6rnkchUQ==')

WebUI.click(findTestObject('Object Repository/Page_Alpha/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Alpha/div_Login FailedInvalid username or passwor_94f133'), 
    0)

