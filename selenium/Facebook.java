package learn.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
