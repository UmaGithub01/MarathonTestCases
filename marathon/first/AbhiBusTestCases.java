package marathon.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusTestCases {
	public static void main(String[] args) throws InterruptedException {
		//Load URL
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Destination

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[contains(@data-id,'Chennai')]")).click();
		
		//to Station
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[contains(@data-id,'Bangalore')]")).click();
		
		//Tomorrow
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		//Print the name of the first resulting bus (use .getText())
		System.out.println(driver.findElement(By.xpath("//h5[@class='title']")).getText());
		//Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//div[@id='seat-filter-bus-type']//span[text()='Sleeper']")).click();
		//Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		System.out.println(driver.findElement(By.xpath("(//div[@class='text-grey']/small)[1]")).getText());
		//Click Show Seats
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		// Choose any one Available seat
		driver.findElement(By.xpath("(//div[@class='Tooltip-Wrapper '])[1]")).click();
		//Select the first resulting checkbox from the Boarding Point and Dropping Point
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='place-container']/div[1]/div[1]/div/input")).click();
		//Print Seats Selected, Total Fare
		System.out.println(driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']/span[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id=\"seating-selected-seat-details\"]/span[2]")).getText());
		//Get the Title of the page(use .getTitle())
		driver.getTitle();
		

	}

}
