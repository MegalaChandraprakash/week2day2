package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.get("http://www.leafground.com/home.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement num1=driver.findElementByXPath("//label [text( )='Find position of button (x,y)']");
		System.out.println("Position is : "+num1.getLocation());
		WebElement num2 = driver.findElementById("color");
		System.out.println("The colour is ; +num2.get CssValue('background-colotr");
		WebElement num3 = driver.findElementById("size");
		System.out.println("The size is ; +num3.get size()");

	}

}
