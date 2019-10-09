package com.temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingWithDriver {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
/*	//@BeforeTest
	public void driverInitialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	//@AfterTest
	public void driverClosing() {
		driver.quit();	
	}
	@Test
	public void testCaseExecution() throws InterruptedException {*/
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("www.loquinsquare.com");
		Thread.sleep(9000);
		driver.quit();
	}}
