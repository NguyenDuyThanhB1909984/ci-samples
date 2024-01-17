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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://viblo.asia/p/mot-so-websites-luyen-tap-automation-test-online-RQqKLe6NZ7z')

WebUI.click(findTestObject('Object Repository/Page_Mt s websites luyn tp automation test online/i_icon fa fa-close'))
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Mt s websites luyn tp automation test online/p_B qua'))

WebUI.click(findTestObject('Object Repository/Page_Mt s websites luyn tp automation test online/a_httpautomationpractice.comindex.php'))

WebUI.switchToWindowTitle('InMotion Hosting')

WebUI.click(findTestObject('Object Repository/Page_InMotion Hosting/center_ecbiz312.inmotionhosting.comYour IP _d50657'))
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Page_InMotion Hosting/center_ecbiz312.inmotionhosting.comYour IP _d50657'))

WebUI.click(findTestObject('Object Repository/Page_InMotion Hosting/center_ecbiz312.inmotionhosting.comYour IP _d50657'))
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Page_InMotion Hosting/center_ecbiz312.inmotionhosting.comYour IP _d50657'))

WebUI.click(findTestObject('Object Repository/Page_InMotion Hosting/h2_ecbiz312.inmotionhosting.com'))
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/Page_InMotion Hosting/h2_ecbiz312.inmotionhosting.com'))

WebUI.closeBrowser()

