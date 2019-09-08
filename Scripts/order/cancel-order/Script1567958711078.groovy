import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('home/option-menu'))

WebUI.click(findTestObject('order/order'))

WebUI.click(findTestObject('order/click-option-menu'))

WebUI.click(findTestObject('order/choose-food'))

WebUI.click(findTestObject('order/click-option-table'))

WebUI.click(findTestObject('order/choose-table'))

WebUI.click(findTestObject('order/click-option-qty'))

WebUI.click(findTestObject('order/choose-qty'))

WebUI.click(findTestObject('order/click-order-button'))

WebUI.waitForElementClickable(findTestObject('order/click-ordermodal-button'), 5)

WebUI.click(findTestObject('order/click-ordermodal-button'))

WebUI.click(findTestObject('order/cancel-order-button'))

WebUI.waitForElementClickable(findTestObject('order/cancel-order-modal-button'), 0)

WebUI.click(findTestObject('order/cancel-order-modal-button'))

