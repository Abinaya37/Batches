package com.Base_Runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Utility_Files;

public class Runner extends Utility_Files {

	public static void main(String[] args) throws IOException {

		browserlaunch("chrome");

		urllaunch("www.facebook.com");

		String title = title(); // fb //print
		System.out.println(title);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Abinaya");

		screenshot("path\\fblogin.png");
		
		
		
	}

}
