package marathon.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTestCases {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for b");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item']//div)[1]")).click();
		WebElement sortdd = driver.findElement(By.id("s-result-sort-select"));
		Select sec = new Select(sortdd);
		sec.selectByVisibleText("Newest Arrivals");
		System.out.println(driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[@data-cy='price-recipe'])[1]")).getText());
		driver.getTitle();
	}

}
