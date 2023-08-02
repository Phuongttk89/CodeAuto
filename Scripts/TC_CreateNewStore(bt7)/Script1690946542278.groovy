import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.DelayQueue
import java.util.concurrent.Delayed

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
import com.thoughtworks.selenium.webdriven.commands.Click

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys

def store= 'pstoreauto5zz'

//create store
WebUI.click(findTestObject('CreateNewStore/btn_partneraccount'))
//WebUI.openBrowser('https://partners.shopify.com/2085214')
WebUI.click(findTestObject('CreateNewStore/btn_addstore'))
WebUI.click(findTestObject('Object Repository/CreateNewStore/btn_create_development_store'))
WebUI.setText(findTestObject('Object Repository/CreateNewStore/input_storename'),store)
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/CreateNewStore/btn_createstore'))
WebUI.delay(7)


