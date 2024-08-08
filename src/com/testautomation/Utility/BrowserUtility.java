package com.testautomation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrowserUtility {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver getDriver(String browserName, String url) throws InterruptedException {

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.out.println("Setting up ChromeDriver for Ubuntu...");

            // Commented out your original ChromeDriver setup for reference
            /*
            // Set the path to the ChromeDriver executable
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
            Thread.sleep(5000);
            */

            // Linux
            // Get the user directory (the current working directory)
            String userDir = System.getProperty("user.dir");

            // Set the path to the ChromeDriver executable dynamically
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            //System.setProperty("webdriver.chrome.driver", userDir + "/resources/drivers/linux64/chromedriver");

            //Win
            //System.setProperty("webdriver.chrome.driver", "resources/drivers/win64_2/chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");

            // New ChromeOptions for headless mode on Ubuntu
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-debugging-port=9222");
            options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

            // Check network connectivity
            if (!isUrlReachable(url)) {
                System.out.println("The URL " + url + " is not reachable. Please check the network settings.");
                driver.quit();
                return null;
            }

            System.out.println("Navigating to URL: " + url);
            driver.get(url);
            Thread.sleep(5000);
        } else if (browserName.equalsIgnoreCase("IE")) {
            // Commented out your original IE setup for reference
            /*
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
            */
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            // Commented out your original Firefox setup for reference
            /*
            System.setProperty("webdriver.gecko.driver", "L:\\TestAutomationFramework\\CucumberJarFiles\\chromedriver_win32_2.37\\chromedriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(url);
            */
        }

        return driver;
    }

    private static boolean isUrlReachable(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            return (200 <= responseCode && responseCode <= 399);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
