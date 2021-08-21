package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
	
public class Radio {

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/radio.html");

			String title = driver.getTitle();
			System.out.println(title);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("yes").click();
			WebElement box1=driver.findElementByXPath("(//input[@name=\"news\"])[2]");			
			if (box1 .isSelected()) {
				System.out.println("default buttpon selected is Checked");
			}
			
			WebElement box2 =driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]");
			if (box2.isSelected() == false) {
				box2.click();
			}
			else {
				System.out.println("Age group is selected");
			}
	}

		}
