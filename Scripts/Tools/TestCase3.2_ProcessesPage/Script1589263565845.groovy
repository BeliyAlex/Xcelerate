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

WebUI.mouseOver(findTestObject('XceleratePortal/Dashboard/div_ToolsMenu'))

WebUI.click(findTestObject('XceleratePortal/Dashboard/a_ProcessesPageMenu'))

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/img_ProcessesIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/h2_Processes'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/div_ErrorMessage'))

WebUI.verifyTextPresent('View more', false)

WebUI.verifyTextNotPresent('View less', false)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/a_ViewMoreLink'))

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Tools/Processes/ul_ErrorMessageText'), GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/div_DataBlock'))

//Verify that block is expanded
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_DataList'), 'style', '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/div_MaintenanceBlock'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_MaintenanceList'), 'style', '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/div_EmployeeBlock'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_EmployeeList'), 'style', '', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/div_PartnerCompensationBlock'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_PartnerCompensationList'), 'style', '', 
    0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_ProcessLogsBlock'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_ProcessLogsList'), 'style', 
    '', 0)

//Verify columns in Process Logs table
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/th_NameColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/th_ModuleColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/th_StartDateColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/th_EndDateColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/th_EmptyFieldColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/th_StatusColumn'))

//Verify pagination in Process Logs table
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/a_FirstPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/a_PreviousPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/span_NumberPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/a_NextPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/a_LastPageProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_OpenCloseProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/a_RefreshProcessLogs'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/div_BusinessErrorsBlock'))

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/div_BusinessErrorsList'), 
    'style', '', 0)

//Verify columns in Business Errors table
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_DateColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_ModuleColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_Desc1Column'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_Desc2Column'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_Desc3Column'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_SubmoduleColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_NotesColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/th_ValueColumn'))

//Verify pagination in Business Errors table
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/a_FirstPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/a_PreviousPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/span_NumberPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/a_NextPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/a_LastPageBusinessErrors'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_DownloadReport'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_OpenCloseBusinessErrorsBlock'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/a_RefreshBusinessErrorsBlock'))

//Collapse all the blocks
WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseDataBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseMaintenanceBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseEmployeeBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenClosePartnerCompensationBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_OpenCloseProcessLogs'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_OpenCloseBusinessErrorsBlock'))

//Verify correct displaying status of Open/Close button on each block
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseDataBlock'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseMaintenanceBlock'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseEmployeeBlock'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenClosePartnerCompensationBlock'), 'src', 
    ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Open.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_OpenCloseProcessLogs'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Open.svg', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_OpenCloseBusinessErrorsBlock'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Open.svg', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_DownloadReport'))

//Verify that block is collapsed
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_DataList'), 'style', 'display: none;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_MaintenanceList'), 'style', 'display: none;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_EmployeeList'), 'style', 'display: none;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_PartnerCompensationList'), 'style', 'display: none;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_ProcessLogsList'), 'style', 
    'display: none;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/div_BusinessErrorsList'), 
    'style', 'display: none;', 0)

//Expand all the blocks
WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseDataBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseMaintenanceBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseEmployeeBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/img_OpenClosePartnerCompensationBlock'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_OpenCloseProcessLogs'))

WebUI.click(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_OpenCloseBusinessErrorsBlock'))

//Verify correct displaying status of Open/Close button on each block
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseDataBlock'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseMaintenanceBlock'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenCloseEmployeeBlock'), 'src', ((((('http://' + 
    GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/img_OpenClosePartnerCompensationBlock'), 'src', 
    ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + '/xcelerate/Content/images/svg/Close.svg', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_OpenCloseProcessLogs'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Close.svg', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/img_OpenCloseBusinessErrorsBlock'), 
    'src', ((((('http://' + GlobalVariable.User) + ':') + GlobalVariable.Password) + '@') + GlobalVariable.Environment) + 
    '/xcelerate/Content/images/svg/Close.svg', 0)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Processes/BusinessErrorsBlock/button_DownloadReportBusinessErrors'))

//Verify that blocks is expanded
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_DataList'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_MaintenanceList'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_EmployeeList'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/div_PartnerCompensationList'), 'style', 'display: block;', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/ProcessLogsBlock/div_ProcessLogsList'), 'style', 
    'display: block;', 0)

WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Tools/Processes/BusinessErrorsBlock/div_BusinessErrorsList'), 
    'style', 'display: block;', 0)

//Expand error message
WebUI.click(findTestObject('XceleratePortal/Tools/Processes/a_ViewMoreLink'))

//Verify that "View more" changed to "View less"
WebUI.verifyTextPresent('View less', false)

WebUI.verifyTextNotPresent('View more', false)

//Verify displaying error message
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Tools/Processes/ul_ErrorMessageText'))

WebUI.closeBrowser()

