package q;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class trek {
	private static Random random=new Random();
	 
		public static String baseurl="https://docs.google.com/forms/d/e/1FAIpQLScllahy_tP2xN1jKZ9tY917MEjnnkliINCvaz91kffn3H5hEQ/viewform";

	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        
	        // Declare and initialize the driver object
	         ChromeDriver driver = new ChromeDriver(options);

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        String[] sunitaHusbandArray=new String[4];
	        sunitaHusbandArray[0]="Ramya";
	        sunitaHusbandArray[1]="Ramesh";
	        sunitaHusbandArray[2]="Manu";
	        sunitaHusbandArray[3]="Vishnu";
	        
	        String[] recommendationArray=new String[1];
	        recommendationArray[0]="Yes, I want to know about trendy outfits which suits me";
//	        recommendationArray[1]="No, I don't need recommendations";
	        String[] deliveryArray=new String[4];
	        deliveryArray[0]="within 1hour";
	        deliveryArray[1]="within 2hour";
	        deliveryArray[2]="within 4hours";
	        deliveryArray[3]="within 12hours";
	        String[] appArray=new String[2];
	        appArray[0]="Yes, I want to save my time";
	        appArray[1]="No, I prefer to see the fabric and worth of cloths on shop";
	        String[] nearbyStoresArray=new String[1];
	        nearbyStoresArray[0]="Yes, I will pay using upi/card/netbanking at nearby clothing store";
	        
	        
	        String[] shopsArray=new String[3];
	        shopsArray[0]="Yes, I want to get cloths available in my nearby shops.";
	        shopsArray[1]="No, I only prefer online shopping over myntra, flipkart, meeso etc.";
	        shopsArray[2]="I prefer both the above options";
	       for(int i = 1;i<300;i++) {
	    	   			if(i%5!=0) {
	    	   				prioritizeTask(driver,i);
	    	   				continue;
	    	   			}
	                	 driver.get(baseurl);
	                	 driver.findElement(By.xpath("//*[text()='"+shopsArray[random.nextInt(3)]+"']")).click();
//	                	 Thread.sleep(2000);
	                	 driver.findElement(By.xpath("//*[text()='"+nearbyStoresArray[random.nextInt(1)]+"']")).click();
//	                	 Thread.sleep(1000);
	                	
	                	 driver.findElement(By.xpath("//*[text()='"+appArray[random.nextInt(2)]+"']")).click();
	                	 driver.findElement(By.xpath("//*[text()='"+deliveryArray[random.nextInt(4)]+"']")).click();
	                	 driver.findElement(By.xpath("//*[text()='"+recommendationArray[random.nextInt(1)]+"']")).click();
	                	 driver.findElement(By.xpath("//*[text()='"+sunitaHusbandArray[random.nextInt(4)]+"']")).click();
	                	 driver.findElement(By.xpath("//*[text()='Submit']")).click();
//	                	Thread.sleep(2000);
	                	 System.out.println("Random record "+i+" saved");
	       }
	       driver.quit();
}
	    
	    public static void prioritizeTask(ChromeDriver driver,int i) {
	    	driver.get(baseurl);
	    	driver.findElement(By.xpath("//*[text()='Yes, I want to get cloths available in my nearby shops.']")).click();
       	 	driver.findElement(By.xpath("//*[text()='Yes, I will pay using upi/card/netbanking at nearby clothing store']")).click();
       	 	driver.findElement(By.xpath("//*[text()='Yes, I want to save my time']")).click();
       	 	driver.findElement(By.xpath("//*[text()='within 4hours']")).click();
       	 	driver.findElement(By.xpath("//*[text()='Yes, I want to know about trendy outfits which suits me']")).click();
       	 	driver.findElement(By.xpath("//*[text()='Ramya']")).click();
       	 	driver.findElement(By.xpath("//*[text()='Submit']")).click();
       	 	System.out.println("Priortize record "+i+" saved");
	    }
}  
	     