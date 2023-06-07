package q;

import java.time.Duration;
import java.util.Random;
import java.util.Scanner;

import org.apache.tools.ant.types.resources.First;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.beust.ah.A;

public class test {
	public static void main(String[] args) {

		String base="https://flipbay.in/";
		        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--remote-allow-origins=*");
		        
		        // Declare and initialize the driver object
		         ChromeDriver driver = new ChromeDriver(options);

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		        for(int i=1;i<100;i++) {
		        driver.get(base);
		        System.out.println("Random record "+i+" saved");
		        
	}
	}}


