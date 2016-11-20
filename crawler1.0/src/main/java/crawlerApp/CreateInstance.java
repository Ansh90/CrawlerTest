package crawlerApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateInstance implements Runnable{

		   private Thread t;
		   private String threadName;
		   
		   CreateInstance( String name) {
		      threadName = name;
//		      System.out.println("Creating " +  threadName );
		   }
		   
		   @SuppressWarnings("static-access")
		public void run() {
//		      System.out.println("Running " +  threadName );
		      try {	
		    	  System.setProperty("webdriver.chrome.driver","//Users//Explorer//Downloads//chromedriver");
		    	  WebDriver driver = new ChromeDriver();	 
		    	  System.out.println(threadName);
		    	  if(threadName.contains("-0")){
					NaukriBot nkb = new NaukriBot();
					nkb.run(driver);
				}
				if(threadName.endsWith("-1")){
					LinkedInUpdateProfileBot linkedin = new LinkedInUpdateProfileBot();
					linkedin.run(driver);
				}
					Thread.sleep(1);
		      }catch (InterruptedException e) {
		         System.out.println("Thread " +  threadName + " interrupted.");
		      }
		     
		   }
		   
		   public void start () {
//		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
		}
