package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logn2 {
	

	
		public WebDriver driver;
		@FindBy(name = "username")
		private WebElement username;
		@FindBy(id = "password")
		private WebElement password;
		@FindBy(id = "login")
		private WebElement login;
		@FindBy(xpath = "//a[text()='New User Register Here']")
		private WebElement registration;
		

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}

		public WebElement getRegistration() {
			return registration;
		}

		
			
		}
		

		
		

	



