import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class battlenetUS {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://us.battle.net");
		
		//Let's get this party started!
		driver.findElement(By.linkText("Create an Account")).click();
		
		//What's your birthday?
		driver.findElement(By.name("dobMonth")).sendKeys("June");
		driver.findElement(By.name("dobDay")).sendKeys("5");
		driver.findElement(By.name("dobYear")).sendKeys("1987");
		
		//Who are you?
		driver.findElement(By.name("firstname")).sendKeys("Murky");
		driver.findElement(By.name("lastname")).sendKeys("McGrill");
		
		//E-mail?
		driver.findElement(By.name("emailAddress")).sendKeys("ershoptest+robobunny@gmail.com");
		driver.findElement(By.name("emailAddressConfirmation")).sendKeys("ershoptest+robobunny@gmail.com");
		
		//Pick a password.
		driver.findElement(By.name("password")).sendKeys("blizzard1");
		driver.findElement(By.name("rePassword")).sendKeys("blizzard1");
		
		//Select a secret question!
		driver.findElement(By.name("question1")).sendKeys("What was your childhood nickname?");
		driver.findElement(By.name("answer1")).sendKeys("mom");
		
		//Accept the ToS... or else.
		driver.findElement(By.xpath("//*[@id='agreedToToU-link']")).click();
		driver.findElement(By.xpath("//*[@id='blizzardNewsletter-link']")).click();
		
		//Make it a thing!
		driver.findElement(By.id("creation-submit")).click();
		
		//Tidy up now.
		driver.quit();
		
		
		
		
		
		
		


	}

}
