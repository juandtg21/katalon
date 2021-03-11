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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://siaweb.itm.edu.co/ClaveAlumnos.asp')

WebUI.selectOptionByIndex(findTestObject('ItmLoginOR/Page_Sistema de Informacin Acadmico Estudiantes/select_CarnDocumento de Identidad'), 
    1)

WebUI.setText(findTestObject('ItmLoginOR/Page_Sistema de Informacin Acadmico Estudiantes/input_Gua para pago de matrcula_Documento'), 
    '1036643582')

WebUI.setText(findTestObject('ItmLoginOR/Page_Sistema de Informacin Acadmico Estudiantes/input_Clave_Clave'), 'joker316')

WebUI.selectOptionByLabel(findTestObject('ItmLoginOR/Page_Sistema de Informacin Acadmico Estudiantes/year'), '2020-2', false)

WebUI.click(findTestObject('ItmLoginOR/Page_Sistema de Informacin Acadmico Estudiantes/input_Perodo Acadmico_Ingresar'))

WebUI.click(findTestObject('ItmLoginOR/Page_Sistema de Informacin Acadmico/a_Asignaturas Canceladas'))

WebUI.verifyElementPresent(findTestObject('ItmLoginOR/Page_Asignaturas Canceladas - ITM/td_NO TIENE ASIGNATURAS CANCELADAS'), 
    0)

WebUI.closeBrowser()

