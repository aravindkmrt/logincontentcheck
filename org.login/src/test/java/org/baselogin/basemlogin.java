package org.baselogin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basemlogin {
	public static WebDriver driver;
	public static Actions ac;
	public static Alert al;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static ArrayList<String> a;
	public static Row row;
	public static Sheet sheet;
	Cell cell;
	
	String html = "MyReport.html";

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void toGetTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static String enteredTxt(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(" : "+attribute);
		return attribute;

	}
	public static String Txt(WebElement element) {
		String s1 = element.getText();
		System.out.print(s1);
		return s1;

	}
	public static void waitingWeb() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	public static void pageLoadTime() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toMove(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static void toContext(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).perform();

	}

	public static void toDrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();

	}
	public static void enable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void display(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void select(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
	}


	public static void alertAccept() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		driver.switchTo().defaultContent();

	}

	public static void alertDismiss() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		driver.switchTo().defaultContent();

	}

	public static void alertType(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);

	}

	public static void alertGetTxt() {
		al = driver.switchTo().alert();
		al.getText();

	}

	public static void frameName(String name) {
		driver.switchTo().frame(name);

	}

	public static void frameIndex(int i) {
		driver.switchTo().frame(i);

	}

	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void frameParent() {
		driver.switchTo().parentFrame();

	}

	public static void framedefault() {
		driver.switchTo().defaultContent();

	}

	public static void selectIndex(WebElement element, int i) {
		s = new Select(element);
		s.selectByIndex(i);
	}

	public static void selectText(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void selectValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void multiple(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void allSelectedOption(List<WebElement> element) {
		for(int i = 0; i<element.size(); i++){
			
			 
		    String s3 = element.get(i).getText();
				

		}
	}
		public static void clickall(List<WebElement> element1) {
			for (WebElement maritalStatus: element1 ) {
				maritalStatus.click();
				 String list = maritalStatus.getAttribute("value");
				 System.out.println(list);
				 }

			}

		public static void btnClick(WebElement element) throws Exception {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
		}
		
		public static void alertAccept1() throws AWTException {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
	public String getValueFromDropDown(WebElement element, String compareText) {
		List<WebElement> options = new Select(element).getAllSelectedOptions();
		for (WebElement option : options) {
			if (option.getText().equals(compareText)) {
				return option.getText();
			}
		}
		return null;
	}

	

	public static void deselectIndex(WebElement element, int i) {
		s = new Select(element);
		System.out.println(i);

	}

	public static void deselectVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deselectValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);

	}

	public static void windowsId() {
		Set<String> windowsId = driver.getWindowHandles();
		System.out.println(windowsId);

	}

	public static void windowId() {
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}
public static void alertAccept2() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
public static void switchWindow(int i) {
	Set<String> windowHandles = driver.getWindowHandles();
	a= new ArrayList();
	List<String>listofwindowid =  a ;
	listofwindowid.addAll(windowHandles);
	String index = listofwindowid.get(i);
	driver.switchTo().window(index);
}
public static void switchWindow1(int j) {
	Set<String> windowHandles = driver.getWindowHandles();
	a= new ArrayList();
	List<String>listofwindowid =  a ;
	listofwindowid.addAll(windowHandles);
	String index = listofwindowid.get(j);
	driver.switchTo().window(index);
}

public static void back() {
	driver.navigate().back();
		}
public static void Refresh() {
	driver.navigate().refresh();
		}


	////////////////////// Screen SHot //////////////////////////////////////

	// Creating a method getScreenshot and passing two parameters
	// driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir")+"\\screenshot" + screenshotName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// Returns the captured file path
		return destination;
	}

	
	
	
	
		
	
		}
		
	
	

