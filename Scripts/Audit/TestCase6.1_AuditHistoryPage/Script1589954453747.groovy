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

WebUI.mouseOver(findTestObject('XceleratePortal/Dashboard/div_AuditMenu'))

WebUI.click(findTestObject('XceleratePortal/Dashboard/a_AuditHistoryPageMenu'))

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/img_AuditHistoryIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/h2_AuditHistory'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/div_AuditHistoryTable'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_UserIDColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_UserIDFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_TimeStampColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_TimeStampFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_TemplateColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_TemplateFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_DescriptionKeyColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_DescriptionKeyFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_TypeColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_TypeFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_SubTypeColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_SubTypeFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_ValueColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_ValueFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_FirstPage'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_PreviousPage'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_NumberPage'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_NextPage'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/a_LastPage'))

//Select filter icon
WebUI.click(findTestObject('XceleratePortal/Audit/span_UserIDFilterIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/form_FilterWindow'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/div_ShowitemswithvaluethatLabel'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_FilterDropdown'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/span_FilterDropdownArrow'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/input_FilterField'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/button_Filter'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/button_Clear'))

//Verify value in Filter dropdown by default
WebUI.verifyElementText(findTestObject('XceleratePortal/Audit/span_FilterDropdown'), 'Is equal to')

WebUI.click(findTestObject('XceleratePortal/Audit/span_FilterDropdownArrow'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/div_FilterDropdownOptions'))

//Verify filter options in dropdown
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/li_IsequaltoOption'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/li_IsnotequaltoOption'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/li_StartswithOption'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/li_ContainsOption'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/li_DoesnotcontainOption'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Audit/li_EndswithOption'))

//Verify focus in list of filter options
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Audit/li_IsequaltoOption'), 'class', 'k-item k-state-selected k-state-focused', 
    GlobalVariable.TimeOut)

WebUI.click(findTestObject('XceleratePortal/Audit/li_IsequaltoOption'))

//Verify that list of filter options isn't displayed
WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Audit/div_FilterDropdownOptions'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('XceleratePortal/Audit/button_Clear'))

WebUI.closeBrowser()

