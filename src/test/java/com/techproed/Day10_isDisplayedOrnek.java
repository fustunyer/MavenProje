package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayedOrnek {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void testtenOnce(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.bestbuy.com");

    }
    @Test
    public void titleTest(){
        String title=driver.getTitle();
        boolean iceriyorMu=title.contains("Best");
        Assert.assertTrue(iceriyorMu);

    }
    @Test
    public void logoTest(){
        WebElement logo=driver.findElement(By.xpath("//img[@class='logo']"));
        boolean logoGorunuyorMu=logo.isDisplayed();
        Assert.assertTrue(logoGorunuyorMu);
    }
    @Test
    public void mexicoLinkTest(){
        WebElement link=driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/mexico.svg']"));
        boolean linkGorunuyorMu= link.isDisplayed();
        Assert.assertTrue(linkGorunuyorMu);
    }
    @After
    public void kapat(){
        driver.quit();
    }


}
