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

CustomKeywords.'xcelerate.EnterPortal.LoginToPortal'()

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/img_TRLogo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_DashboardMenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_ToolsMenu'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_SecurityMenu'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_GlobalsMenu'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_AuditMenu'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_BindersMenu'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/div_SystemMenu'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/img_ProfileIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Dashboard/label_Profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Welcome,', false)

WebUI.verifyTextPresent('Aliaksandr Belavus', false)

WebUI.closeBrowser()

