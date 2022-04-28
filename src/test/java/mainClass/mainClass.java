package mainClass;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class mainClass {
	
	
	WebDriver driver = hooksclass.driver;
	Random rnd = new Random();
	int number = rnd.nextInt(99);
	
	String uniqueString1 = String.format("%02d", number);
	String uniqueString=uniqueString1+"SDETHandsOnPV";
	String uniqueID= String.format("%02d", number)+"0000";
	String uniqueIDUpdated= String.format("%02d", number)+"1111";



	@Given("User Logged In")
	public void user_navigated_to_the_Login_page() {
		
		
		driver.get("http://retailm1.upskills.in/admin/index.php?route=common/dashboard&token=fOtazgcSDn3hST8dy4F1RPyPR15xQsnO");
		driver.manage().window().maximize();
		
	    System.out.println("User navigated to the Login page");
	}

	@Given("Enter Username {string} and Password {string}")
	public void enter_Username_and_password(String un, String pw) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("input-username")).sendKeys(un);;
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		Thread.sleep(2000);

	    
	}
	
	@Then("Error message displayed")
	public void error_message_displayed() {
	   System.out.println("error message");
	}
	@When("User Logged in to the Home page")
	public void user_navigated_to_the_Homepage_page() {
		if (driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText()=="Dashboard"){
			System.out.println("User is navigated SUCCESSFULLY to the Home page");
		}
	}
	@When("New Coupon Created")
	public void couponCreation() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='menu-marketing']/a")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id='menu-marketing']/ul/li[3]"));
		element.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@data-original-title='Add New']")).click();

		driver.findElement(By.id("input-name")).sendKeys(uniqueString);
		Thread.sleep(4000);
		driver.findElement(By.id("input-code")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("input-code"))	.sendKeys(uniqueID);
		Thread.sleep(7000);
		WebElement element1 = driver.findElement(By.xpath("//button[@type='submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		element1.click();
		Thread.sleep(5000);


	}
	@Then("Coupon Validated then Edited")
	public void couponCreationValidation() throws InterruptedException {
		 List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/descendant::td[contains(.,'SDETHandsOnPV')]"));
		 Iterator<WebElement> itr = element.iterator();
		while (itr.hasNext()) {

			//WebElement i = itr.next();
			//System.out.print(i + "Next element");
			//String elementString=i.getText();


			//if (elementString.contains("SDETHandsOnPV"))
				Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/descendant::a[last()]")).click();
               
			Thread.sleep(5000);
			driver.findElement(By.id("input-code")).clear();
			driver.findElement(By.id("input-code")).sendKeys(uniqueIDUpdated);
			WebElement element1 = driver.findElement(By.xpath("//button[@type='submit']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			element1.click();
			Thread.sleep(5000);
			break;


		}

	}
	@Then("Coupon Deleted")
	public void DeleteCoupon() throws InterruptedException {
		List<WebElement> element = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr/td[@class='text-left']"));
		Iterator<WebElement> itr = element.iterator();
		while (itr.hasNext()) {

			WebElement i = itr.next();
			System.out.print(i + "Next element");
			String elementString=i.getText();


			if (elementString.contains("SDETHandsOnPV")){
				driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
				Thread.sleep(5000);
				driver.switchTo( ).alert( ).accept();
				Thread.sleep(5000);
				break;



			}}

	}






}
