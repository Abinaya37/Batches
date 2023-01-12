package com.Base_Runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Utility_Files;

public class Meesho extends Utility_Files {

	public static void main(String[] args) throws IOException {

		browserlaunch("edge");

		urllaunch("meesho.com");

		max();

		title(); // meesho // dont print

		WebElement email = driver.findElement(By.id("email"));

		sendValues(email, "Abinaya37");

		WebElement password = driver.findElement(By.xpath("//tagName[@attrNmae = 'attr value']"));

		sendValues(password, "12dshgfg");

		WebElement login_Btn = driver.findElement(By.xpath(""));

		clickOnElement(login_Btn);
		
		screenshot("path\\meesho.png");

	}


}
