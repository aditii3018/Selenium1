package _Kit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.edge.driver", "E:\\DevOps_Project\\EdgeDriver\\msedgedriver.exe\\");
        WebDriver d = new EdgeDriver();
       // try {
            d.get("https://www.indiabix.com/");
            Thread.sleep(2000);
            d.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) d;
            js.executeScript("window.scrollBy(0,250)", "");
            Thread.sleep(2000);
            d.findElement(By.xpath("//a[normalize-space()='Networking Questions']")).click(); 
            Thread.sleep(2000);
            JavascriptExecutor js1 = (JavascriptExecutor) d;
            js1.executeScript("document.body.style.backgroundColor = 'black';");
            Thread.sleep(2000);
            d.findElement(By.xpath("//i[@class='mdi mdi-theme-light-dark mdi-rotate-315']")).click();

        //}
	}

}
