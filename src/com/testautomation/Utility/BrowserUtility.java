package com.testautomation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserUtility {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver getDriver(String browserName, String url) throws InterruptedException {

			if (browserName.equalsIgnoreCase("Chrome")) {
				//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
				System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--remote-debugging-port=9222");

				driver = new ChromeDriver(options);
				//driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				Thread.sleep(5000);
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "L:\\TestAutomationFramework\\CucumberJarFiles\\chromedriver_win32_2.37\\chromedriver.exe");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "accept");
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability("ignoreZoomSetting", true);
				capabilities.setCapability("requireWindowFocus", true);

				driver = new InternetExplorerDriver(capabilities);
				driver.manage().window().maximize();
				driver.get(url);
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "L:\\TestAutomationFramework\\CucumberJarFiles\\chromedriver_win32_2.37\\chromedriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
			}

		return driver;
	}

	public static void quitDriver() {
		{
			driver.close();
			driver.quit();

		}
	}

}
