package com.practice.pages;

import org.openqa.selenium.By;
import com.practice.base.TestBase;

public class LoginPage extends TestBase{
//	
//	WebDriver driver;
//	
//	public void open() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public DashboardPage login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		return new DashboardPage();
	}
	
	public void clickForgetPasswordLink() {
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
	}
	
	}