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

WebUI.openBrowser('http://10.225.222.77/xcelerate/dashboard')

WebUI.authenticate('http://10.225.222.77/xcelerate/dashboard', 'abelavus', 'Elite123', 0)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.mouseOver(findTestObject('Page_Thomson Reuters - Dashboard/BindersICON'))

WebUI.click(findTestObject('Page_Thomson Reuters - Dashboard/CreateNewMENUICON'))

WebUI.waitForPageLoad(0)

WebUI.verifyImagePresent(findTestObject('Page_Thomson Reuters - Create/CreateICON'))

WebUI.verifyImagePresent(findTestObject('Page_Thomson Reuters - Create/SaveICON'))

WebUI.verifyImagePresent(findTestObject('Page_Thomson Reuters - Create/CreateHEADER'))

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/NameLABEL'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/NameFIELD'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/Please enter a name for this binderLABEL'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/DescriptionLABEL'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/DescriptionFIELD'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/Step1SelectedTAB'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/Step2TAB'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/Step3TAB'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/AvaliableReportsBLOCK'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Thomson Reuters - Create/SelectedReportsBLOCK'), 0)

WebUI.verifyImagePresent(findTestObject('Page_Thomson Reuters - Create/MoveToSelectedICON'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

