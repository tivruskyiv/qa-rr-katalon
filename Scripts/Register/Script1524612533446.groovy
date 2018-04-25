import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://raceroster.com/events/2018/12356/the-event-director-classic-2020')

WebUI.click(findTestObject('Page_2018  The Event Director Class/a_Register'))

WebUI.waitForPageLoad(0)

WebUI.sendKeys(findTestObject('Page_2018  The Event Director Class/input_sign-in-email'), 'acejwarren@gmail.com')

WebUI.sendKeys(findTestObject('Page_2018  The Event Director Class/input_sign-in-password'), 'itsfreerealestate')

WebUI.click(findTestObject('Page_2018  The Event Director Class/button_Sign In'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Register for The Event Directo/input_self_register'))

WebUI.clearText(findTestObject('Page_Register for The Event Directo/input_registrant_firstname_1'))

WebUI.sendKeys(findTestObject('Page_Register for The Event Directo/input_registrant_firstname_1'), 'John')

WebUI.clearText(findTestObject('Page_Register for The Event Directo/input_registrant_lastname_1'))

WebUI.sendKeys(findTestObject('Page_Register for The Event Directo/input_registrant_lastname_1'), 'Doe')

WebUI.clearText(findTestObject('Page_Register for The Event Directo/input_registrant_email_1'))

WebUI.sendKeys(findTestObject('Page_Register for The Event Directo/input_registrant_email_1'), 'acejwarren@gmail.com')

WebUI.clearText(findTestObject('Page_Register for The Event Directo/input_registrant_phone_1'))

WebUI.sendKeys(findTestObject('Page_Register for The Event Directo/input_registrant_phone_1'), '555-667-1111')

WebUI.clearText(findTestObject('Page_Register for The Event Directo/input_registrant_manage_1-7953'))

WebUI.sendKeys(findTestObject('Page_Register for The Event Directo/input_registrant_manage_1-7953'), 'No')

