package org.helper_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Base_class {
	
	
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert a1;
	public static JavascriptExecutor js;

	
	public static void maxWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void toFetchTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

	public static void toFetchurl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	public static void toRefresh() {
		driver.navigate().refresh();

	}

	public static void toForward() {
		driver.navigate().forward();

	}

	public static void toBackward() {
		driver.navigate().back();

	}

	public static void toCloseBrowser(WebDriver driver) {
		driver.close();
	}

	public static void toHold(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void launchUrl(WebDriver driver, String Url) {
		driver.get(Url);
	}

	public static void fillTextBox(WebElement element, String textvalue) {
		element.sendKeys(textvalue);

	}

	public static void toClickButton(WebDriver driver,WebElement ref) {
		ref.click();

	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void toDoubleClick(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void toTakeSnap(String picname) throws IOException {
TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Jeyachandran\\eclipse-workspace\\Framework3\\ScreenShots\\" + picname + ".png");
		FileUtils.copyFile(s, d);

	}

	public static void toMoveToElement(WebElement ref) {
		a = new Actions(driver);
		a.moveToElement(ref).perform();

	}

	public static void toDragAndDrop(WebElement s, WebElement d) {
		a = new Actions(driver);
		a.dragAndDrop(s, d).perform();
	}

	public static void toEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void toAccept() {
		a1 = driver.switchTo().alert();

		a1.accept();

	}

	public static void toDismiss() {
		a1 = driver.switchTo().alert();

		a1.dismiss();
	}

	public static void toSendkeys(String ref) {
		a1 = driver.switchTo().alert();

		a1.sendKeys(ref);
	}

	public static void toGetText() {
		a1 = driver.switchTo().alert();

		String t = a1.getText();
		System.out.println(t);
	}

	public static void toPressTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void toSelectAll() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void keyDown() {

	}

	public static void toSwitchIntoFrame(WebElement ref) {
		driver.switchTo().frame(ref);

	}

	public static void toSwitchIntoFrame(String id) {
		driver.switchTo().frame(id);

	}

	public static void toParentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void toDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void FrameSize(String iframe) {
		List<WebElement> allframe = driver.findElements(By.tagName(iframe));
		int count = allframe.size();
		System.out.println(count);
	}

	public static void getWindowHandle() {
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

	}

	public static void getwindowhandles() {
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
	}

	public static void toScrollUp(WebElement ref) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}

	public static void toScrollDown(WebDriver driver,WebElement web) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", web);

	}

	// BASE CLASS FOR READ

//	public static String readFromExcel(String fileName, int rowNo, int cellNo, String sheetName) throws IOException {
//
//		File f = new File(
//				"C:\\Users\\Jeyachandran\\eclipse-workspace\\Framework3\\external files\\" + fileName + ".xlsx");
//
//		FileInputStream fin = new FileInputStream(f);

//		Workbook b = new XSSFWorkbook(fin);
//
//		Sheet sh = b.getSheet(sheetName);
//
//		Row r = sh.getRow(rowNo);
//
//		Cell c = r.getCell(cellNo);
//		String Input;
//		int type = c.getCellType();
//
//		if (type == 1) {
//			Input = c.getStringCellValue();
//
//		} else if (DateUtil.isCellDateFormatted(c)) {
//			Date da = c.getDateCellValue();
//			SimpleDateFormat sdf = new SimpleDateFormat("dd mm yyyy");
//			Input = sdf.format(da);
//
//		}
//
//		else {
//			double num = c.getNumericCellValue();
//			long l = (long) num;
//			Input = String.valueOf(l);
//		}
//
//		return Input;
//	}
//
//	public static void sysout(String excel) {
//		System.out.println(excel);
//	}
//
//	// base class for write in excel
//
//	public static String toWrite(String Data, String sheet, int rowNo, int cellNo, String cellValue)
//			throws IOException {
//
//		File f = new File("C:\\Users\\Jeyachandran\\eclipse-workspace\\Framework3\\external files\\" + Data + "xlsx");
//
//		FileOutputStream fo = new FileOutputStream(f);
//
//		Workbook w = new XSSFWorkbook();
//		Sheet sh = w.createSheet(sheet);
//		Row ro = sh.createRow(rowNo);
//		Cell c1 = ro.createCell(cellNo);
//		Cell c2 = ro.createCell(cellNo);
//		c1.setCellValue(cellValue);
//		c2.setCellValue(cellValue);
//		w.write(fo);
//		return sheet;

	}


	

