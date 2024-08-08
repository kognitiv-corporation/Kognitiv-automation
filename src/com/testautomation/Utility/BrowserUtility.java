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

/*            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "resources/drivers/new/chromedriver.exe");

            // Set Chrome options for headless mode
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Run in headless mode
            options.addArguments("--no-sandbox"); // Bypass OS security model
            options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
            options.addArguments("--remote-debugging-port=9222"); // Enable remote debugging
            options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
            //options.setHeadless(false); // Disable headless mode

            // Initialize the ChromeDriver with the specified options
            driver = new ChromeDriver(options);

            // Maximize the browser window
            driver.manage().window().maximize();

            // Open the specified URL
            driver.get(url);

            // Pause for 5 seconds to allow the page to load
            Thread.sleep(5000);*/

            // Linux
            //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            System.setProperty("webdriver.chrome.driver", "resources/drivers/linux64/chromedriver");

            //Win
            //System.setProperty("webdriver.chrome.driver", "resources/drivers/win64_2/chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-debugging-port=9222");
            options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration

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
