package sathvikaFristTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelApp_Automation_Saturday {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("vasuvespag");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("vasu1234");
		Thread.sleep(2000);
		WebElement loginbutt=driver.findElement(By.id("login"));
		loginbutt.click();
		Thread.sleep(2000);
		WebElement il=driver.findElement(By.id(""));
		
		WebElement drop=driver.findElement(By.id("location"));
		Select v=new Select(drop);
		Thread.sleep(2000);
		v.selectByVisibleText("Melbourne");
		WebElement search_butt=driver.findElement(By.id("Submit"));
		search_butt.click();
		Thread.sleep(2000);
		WebElement h=driver.findElement(By.id("radiobutton_1"));
		h.click();
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.id("continue"));
		a.click();
		WebElement fristname=driver.findElement(By.id("first_name"));
		fristname.sendKeys("hhhh");
		WebElement lastName=driver.findElement(By.id("last_name"));
		lastName.sendKeys("yyyyy");
		WebElement billingAdd=driver.findElement(By.id("address"));
		billingAdd.sendKeys("yyyyy22222");
		//cc_num
		WebElement creditcard=driver.findElement(By.id("cc_num"));
		creditcard.sendKeys("2222222222222222");
		WebElement b=driver.findElement(By.id("cc_type"));
		Select cctype=new Select(b);
		cctype.selectByIndex(2);
		WebElement ui=driver.findElement(By.id("cc_exp_month"));
		Select expmonth=new Select(ui);
		expmonth.selectByVisibleText("January");
		WebElement ui2=driver.findElement(By.id("cc_exp_year"));
		Select expyear=new Select(ui2);
		expyear.selectByIndex(5);
		WebElement uu=driver.findElement(By.id("cc_cvv"));
		uu.sendKeys("789");
		WebElement book=driver.findElement(By.id("book_now"));
		book.click();
		/*driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement oder=driver.findElement(By.id("order_no"));
		String uy=oder.getAttribute("order_no");
		System.out.println(uy);*/
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement order = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
        String text = order.getAttribute("value");
        System.out.println("Order No:"+text);
		System.out.println("changes are done");


		
		
		
		
	}

}
