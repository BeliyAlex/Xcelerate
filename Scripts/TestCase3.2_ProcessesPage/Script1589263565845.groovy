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

CustomKeywords.'xcelerate.EnterPortal.LoginToPortal'()

WebUI.mouseOver(findTestObject('XceleratePortal/Dashboard/menu_Tools'))

WebUI.click(findTestObject('XceleratePortal/Dashboard/menu_Processes'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/icon_Processes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/header_Processes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/block_ErrorMessage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('You have 2 process errors. View more', false)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/link_ViewMessage'))

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Processes/text_ErrorMessage'), 3)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/block_Data'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Data'), 'style', '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/block_Maintenance'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Maintenance'), 'style', '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/block_Employee'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Employee'), 'style', '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/block_PartnerCompensation'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_PartnerCompensation'), 'style', '', 0)

WebUI.verifyOptionsPresent(findTestObject('XceleratePortal/Processes/tableheader_ProcessLogs'), ['Module', 'Name'])

