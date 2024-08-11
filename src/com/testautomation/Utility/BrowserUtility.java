package com.testautomation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class BrowserUtility {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver getDriver(String browserName, String url) throws InterruptedException {

        if (browserName.equalsIgnoreCase("Chrome")) {


            // Linux
            String userDir = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            //System.setProperty("webdriver.chrome.driver", userDir + "/resources/drivers/linux64/chromedriver");

            //Win
            //System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-debugging-port=9222");
            options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration

            driver = new ChromeDriver(options);
            //driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Check network connectivity
/*            if (!isUrlReachable(url)) {
                System.out.println("The URL " + url + " is not reachable. Please check the network settings.");
               // driver.quit();
                return null;
            }*/

            driver.get(url);

            System.out.println("Navigating to URL: " + url);

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
            // Set GeckoDriver path
            System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

            // Set environment variables for Firefox
            Map<String, String> env = System.getenv();
            env.put("MOZ_HEADLESS", "1");
            env.put("MOZ_CRASHREPORTER_DISABLE", "1");
            env.put("MOZ_CRASHREPORTER_NO_REPORT", "1");
            env.put("MOZ_REMOTE_SETTINGS_DEVTOOLS", "1");

            // Set Firefox options
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-debugging-port=9222");
            options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration

            // Initialize WebDriver with options
            WebDriver driver = new FirefoxDriver(options);
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.get(url);
            System.out.println("Navigating to URL: " + url);

            try {
                Thread.sleep(5000); // Let the user actually see something!
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return driver;
    }

    public static void quitDriver() {
        {
            driver.close();
            //driver.quit();

        }
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

}