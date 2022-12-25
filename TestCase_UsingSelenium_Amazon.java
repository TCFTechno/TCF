package Amazon_Automation.Amazon_Automatio_bdd;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestcaseUsingselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resource\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();

		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys("8015524253");

		WebElement continuelogin = driver.findElement(By.id("continue"));
		continuelogin.click();

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("prabha123");

		WebElement signinbtn = driver.findElement(By.id("auth-signin-button"));

		signinbtn.click();
		Thread.sleep(3000);

		WebElement validate_user_homepage = driver.findElement(By.xpath("//span[text()='Hello, prabha']"));

		// Assert.assertEquals("Hello, prabha", validate_user_homepage);

		WebElement search_bar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_bar.sendKeys("speakers");

		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();

		WebElement eco_dot = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));

		eco_dot.click();

		driver.get("https://www.amazon.in/s?k=speakers&ref=nb_sb_noss");

		System.out.println("work");

		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {

			String wTitle = driver.switchTo().window(string).getTitle();
			System.out.println(wTitle);
		}
		WebElement findElement = driver.findElement(By.xpath("//a[text()=' Free Delivery ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", findElement);

		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();

		// WebElement product_title =
		// driver.findElement(By.xpath("//span[@id='productTitle']"));

		// System.out.println(text);

		WebElement productsearch2 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

		productsearch2.sendKeys("Echo Dot (4th Gen, 2020 release)| Smart speaker with Alexa (Black)");

		WebElement searchbtn1 = driver.findElement(By.id("nav-search-submit-button"));
		searchbtn1.click();

		WebElement eco_dot2 = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));

		eco_dot2.click();
		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

		driver.get(
				"https://www.amazon.in/s?k=Echo+Dot+%284th+Gen%2C+2020+release%29%7C+Smart+speaker+with+Alexa+%28Black%29&crid=Q43WE4UTIPY4&sprefix=%2Caps%2C295&ref=nb_sb_noss_2");

		System.out.println("work");
		Set<String> windowHandless = driver.getWindowHandles();

		for (String string : windowHandless) {

			String wTitle = driver.switchTo().window(string).getTitle();
			System.out.println(wTitle);
		}
		WebElement addtocart2 = driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
		addtocart2.click();

		// span[@id="submit.add-to-cart"]

		driver.get("https://www.amazon.in/cart/smart-wagon?newItems=C52a9fe39-0e39-4aaf-a436-f02538852c9d,1");

		WebElement proceedtobuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedtobuy.click();

		WebElement fullname = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));

		fullname.sendKeys("prabha");

		WebElement doorno = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		doorno.sendKeys("27/53 krishna apartment");
		
		
		WebElement phone = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		phone.sendKeys("8015524253");

		WebElement address = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		phone.sendKeys("chennai chennai");

		WebElement Village = driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		Village.sendKeys("avadi vellnooor village");
		
		WebElement landmark = driver.findElement(By.id("ddress-ui-widgets-landmark"));
		Village.sendKeys("veltecch college");
		
		
	
		WebElement usethisaddress = driver.findElement(By.xpath("//span[text()='Use this address']//preceding::input[1]"));

		usethisaddress.click();
		
		
		Thread.sleep(2000);
		WebElement Other_UPi_Apps_radiobtn= driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		Other_UPi_Apps_radiobtn.click();

		WebElement upiId_text= driver.findElement(By.xpath("//input[@id='pp-0Y2tBA-107']"));
		upiId_text.sendKeys("8681071796@ybl");
		
		WebElement verify_upi= driver.findElement(By.xpath("//span[@id='pp-0Y2tBA-108-announce']"));
		verify_upi.click();

	}
}