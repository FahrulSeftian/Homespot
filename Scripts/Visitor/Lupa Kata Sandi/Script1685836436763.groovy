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

WebUI.navigateToUrl('https://homespotstaging.bitcorp.id/')

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/img'))

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Login  Daftar'))

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Lupa Kata Sandi'))

WebUI.setText(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/input_Lupa Kata Sandi_email'), 'est12@yopmail.com')

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Kirim'))


'Wait 10 seconds to let users input on otp field'

WebUI.delay(10)

'Get Text from Otp field after user input'

captchaText = WebUI.getText(findTestObject('Visitor_kalkulator KPR/Page_Homespot/input_Kode_otpInput'))

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Kirim'))

WebUI.setEncryptedText(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/input_Password Baru_newPassword'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/input_Konfirmasi Password Baru_retypeNewPassword'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Kirim'))

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Login  Daftar'))

WebUI.setText(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/input_Lupa Kata Sandi_email'), 'est12@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/input_Password_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

'Wait 10 seconds to let users input on captcha field'

WebUI.delay(10)

'Get Text from Captcha field after user input'

captchaText = WebUI.getText(findTestObject('Lupa Kata Sandi/Page_Homespot/input_Kode_captchaInput'))

WebUI.click(findTestObject('Object Repository/Lupa Kata Sandi/Page_Homespot/p_Masuk'))

WebUI.closeBrowser()

