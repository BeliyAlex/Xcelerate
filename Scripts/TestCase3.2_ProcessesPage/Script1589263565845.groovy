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

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/icon_Processes'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/header_Processes'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/block_ErrorMessage'))

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

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/block_ProcessLogs'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/list_ProcessLogs'), 'style', 
    '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/column_Name'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/column_Module'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/column_StartDate'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/column_End Date'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/column_EmptyField'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/column_Status'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/arrow_FirstPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/arrow_PreviousPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/img_NumberPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/arrow_NextPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/arrow_LastPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/button_OpenCloseProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/button_RefreshProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/block_BusinessErrors'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/list_BusinessErrors'), 'style', 
    '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Date'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Module'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Desc1'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Desc2'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Desc3'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Submodule'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Notes'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/column_Value'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/arrow_FirstPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/arrow_PreviousPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/img_NumberPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/arrow_NextPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/arrow_LastPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_DownloadReportBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_OpenCloseBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_RefreshBusinessErrors'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenCloseData'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenCloseMaintenance'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenCloseEmployee'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenClosePartnerCompensation'))

WebUI.click(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/button_OpenCloseProcessLogs'))

WebUI.click(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_OpenCloseBusinessErrors'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenCloseData'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenCloseMaintenance'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenCloseEmployee'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenClosePartnerCompensation'), 'src', 
    ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/button_OpenCloseProcessLogs'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Open.svg', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_OpenCloseBusinessErrors'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Open.svg', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_DownloadReportBusinessErrors'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Data'), 'style', 'display: none;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Maintenance'), 'style', 'display: none;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Employee'), 'style', 'display: none;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_PartnerCompensation'), 'style', 'display: none;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/list_ProcessLogs'), 'style', 
    'display: none;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/list_BusinessErrors'), 'style', 
    'display: none;', 0)

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenCloseData'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenCloseMaintenance'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenCloseEmployee'))

WebUI.click(findTestObject('XceleratePortal/Processes/button_OpenClosePartnerCompensation'))

WebUI.click(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/button_OpenCloseProcessLogs'))

WebUI.click(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_OpenCloseBusinessErrors'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenCloseData'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenCloseMaintenance'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenCloseEmployee'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/button_OpenClosePartnerCompensation'), 'src', 
    ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/button_OpenCloseProcessLogs'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Close.svg', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_OpenCloseBusinessErrors'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Close.svg', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_DownloadReportBusinessErrors'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Data'), 'style', 'display: block;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Maintenance'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_Employee'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/list_PartnerCompensation'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/ProcessLogsBlock/list_ProcessLogs'), 'style', 
    'display: block;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/list_BusinessErrors'), 'style', 
    'display: block;', 0)

WebUI.click(findTestObject('XceleratePortal/Processes/link_ViewMessage'))

WebUI.verifyTextPresent('You have 2 process errors. View less', false)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/text_ErrorMessage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

