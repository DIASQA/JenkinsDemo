package com.dias.gitCheckin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsGITCheckin {
	
 public static WebDriver driver= new FirefoxDriver();
 
 @Test
public static void Message(){
	System.out.println("Session Created");	
	driver.get("http://stackoverflow.com/questions/16137713/how-to-run-a-java-program-from-the-command-line");
	driver.manage().window().maximize();
}
}
