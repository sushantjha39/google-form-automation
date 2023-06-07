package q;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.engines.ISAACEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;
import com.github.dockerjava.api.model.Event;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.asm.Advice.This;
import net.bytebuddy.description.ModifierReviewable.ForMethodDescription;

public class Free {
//    private static final Object assertactualTitle = null;
//	public static String baseurl="https://testpages.herokuapp.com/styled/index.html";
//
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        
//        // Declare and initialize the driver object
//        WebDriver driver = new ChromeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//
//        driver.get(baseurl);
//        driver.findElement(By.id("basicpagetest")).click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        driver.findElement(By.id("tablestest")).click();
//        String expectedTitle = "HTML TABLE Tag";
//        List<WebElement> elements = driver.findElements(By.tagName("h1"));
//
//        // Get the element at a specific index
//        
//        if(elements.equals(expectedTitle))
//        {
//        	System.out.println("Correct Title");
//        }
//        else {
//			System.out.println("Wrong title");
//		}
//        Thread.sleep(2000);
//        driver.navigate().back();
//        WebElement link = driver.findElement(By.xpath("//a[@href=https://testpages.herokuapp.com/styled/tag/dynamic-table.html']"));
//        link.click();
        
//    public int sum(int a,int b) 
//    {
//    	int c = a*b;
//    	return c;
//		
//	} 
//    
//    
//  public int sub(int a,int b) 
//  {
//  	int c = a*b;
//  	return c;
//		
//	}   
//  
//public void mul(int a,int b) 
//{
//	int c = a+b;
//	System.out.println(c);
	
//public int square(int a) {
//	int s = a*a;
//	return s;
//}
//public void sum(int a,int b)
//{
//	int sum = a +b;
//	System.out.println(sum);

	public void getData(int a) {
		if(a%2==0) {
			System.out.println("This is even...");
		
	}
	
		else if(a==0) {
			System.out.println("This is zero");
		}
		else if (a%2==1) {
			System.out.print("odd no.");
			
		}
}

} 
    

