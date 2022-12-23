package com.practice.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public void initialization() throws IOException {
		prop = new Properties();
		String propPath = "./src/main/java/com/practice/config/config.properties";
		FileInputStream fis = new FileInputStream(propPath);
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equals("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
//			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void tearDown() {
		driver.quit();
	}

}
