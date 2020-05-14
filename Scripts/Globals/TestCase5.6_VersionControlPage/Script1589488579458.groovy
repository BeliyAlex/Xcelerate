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

WebUI.mouseOver(findTestObject('XceleratePortal/Dashboard/div_GlobalsMenu'))

WebUI.click(findTestObject('XceleratePortal/Dashboard/a_VersionControlPageMenu'))

WebUI.waitForPageLoad(GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/div_VersionsLoadedMessage'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/img_VersionControlIcon'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/h2_VersionControl'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/div_VersionControlTable'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_YearColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_ScenarioColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_VersionColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_GLBookColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_ActiveColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/button_AddVersionControl'))

WebUI.click(findTestObject('XceleratePortal/Globals/Version Control/button_AddVersionControl'))

//Verify new row
WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/select_Year'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/select_Scenario'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/select_Version'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/select_GLBook'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/label_ActiveCheckbox'))

//Verify that checkbox is checked
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Globals/Version Control/input_ActiveCheckbox'), 'class', 
    'ng-pristine ng-untouched ng-valid ng-not-empty', GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/button_Save'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/button_Remove'))

//Verify options in textbox
WebUI.verifyOptionsPresent(findTestObject('XceleratePortal/Globals/Version Control/select_Year'), ['111: 11', '12', '2016: FY2016'
        , '2017: FY2017', '2018: FY2018', '2019: FY2019', '2020: FY2020', '2021: FY2021', 'gfg: fgf', 'NA: No Fiscal Year'])

//Verify selected option by default
WebUI.verifyOptionSelectedByLabel(findTestObject('XceleratePortal/Globals/Version Control/select_Year'), '2020: FY2020', 
    false, GlobalVariable.TimeOut)

WebUI.verifyOptionsPresent(findTestObject('XceleratePortal/Globals/Version Control/select_Scenario'), ['NA: No Scenario'
        , 'Forecast_Input', 'Forecast_Adjustment', 'Budget_Input', 'Budget_Adjustment', 'Actual', ''])

WebUI.verifyOptionSelectedByLabel(findTestObject('XceleratePortal/Globals/Version Control/select_Scenario'), '', false, 
    GlobalVariable.TimeOut)

WebUI.verifyOptionsPresent(findTestObject('XceleratePortal/Globals/Version Control/select_Version'), ['V5: Version 5', 'V4: Version 4'
        , 'V3: Version 3', 'V2: Version 2', 'V1: Version 1', 'NA: No Version', 'Active', ''])

WebUI.verifyOptionSelectedByLabel(findTestObject('XceleratePortal/Globals/Version Control/select_Version'), '', false, GlobalVariable.TimeOut)

WebUI.verifyOptionsPresent(findTestObject('XceleratePortal/Globals/Version Control/select_GLBook'), ['NA: No GL Book', 'ee'
        , 'Cash', 'Accrual', ''])

WebUI.verifyOptionSelectedByLabel(findTestObject('XceleratePortal/Globals/Version Control/select_GLBook'), '', false, GlobalVariable.TimeOut)

WebUI.click(findTestObject('XceleratePortal/Globals/Version Control/label_ActiveCheckbox'))

//Verify that checkbox is unchecked
WebUI.verifyElementAttributeValue(findTestObject('XceleratePortal/Globals/Version Control/input_ActiveCheckbox'), 'class', 
    'ng-untouched ng-valid ng-empty ng-dirty ng-valid-parse', GlobalVariable.TimeOut)

WebUI.click(findTestObject('XceleratePortal/Globals/Version Control/button_Remove'))

//Verify that new row is removed
WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/select_Year'), GlobalVariable.TimeOut)

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/select_Scenario'), GlobalVariable.TimeOut)

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/select_Version'), GlobalVariable.TimeOut)

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/select_GLBook'), GlobalVariable.TimeOut)

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/label_ActiveCheckbox'), GlobalVariable.TimeOut)

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/button_Save'), GlobalVariable.TimeOut)

WebUI.verifyElementNotPresent(findTestObject('XceleratePortal/Globals/Version Control/button_Remove'), GlobalVariable.TimeOut)

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_YearColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_ScenarioColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_VersionColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_GLBookColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/th_ActiveColumn'))

WebUI.verifyElementVisible(findTestObject('XceleratePortal/Globals/Version Control/button_AddVersionControl'))

WebUI.closeBrowser()

