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

WebUI.openBrowser('https://auto-dashboard.now.sh/login')

WebUI.waitForElementClickable(findTestObject('ATAP Login/button_Login'), 30)

WebUI.setText(findTestObject('ATAP Login/txt_Username'), 'WrongUser')

WebUI.setText(findTestObject('ATAP Login/txt_Password'), 'hakim123')

WebUI.click(findTestObject('ATAP Login/button_Login'))

WebUI.waitForElementClickable(findTestObject('ATAP Login/button_OK'), 10)

WebUI.click(findTestObject('ATAP Login/button_OK'))

WebUI.setText(findTestObject('ATAP Login/txt_Username'), 'hakim')

WebUI.setText(findTestObject('ATAP Login/txt_Password'), 'WrongPassword')

WebUI.click(findTestObject('ATAP Login/button_Login'))

WebUI.waitForElementClickable(findTestObject('ATAP Login/button_OK'), 10)

WebUI.click(findTestObject('ATAP Login/button_OK'))

WebUI.setText(findTestObject('ATAP Login/txt_Username'), 'hakim')

WebUI.setText(findTestObject('ATAP Login/txt_Password'), 'hakim123')

WebUI.click(findTestObject('ATAP Login/button_Login'))

WebUI.waitForElementClickable(findTestObject('ATAP Main Details/button_NewCase'), 10)

