package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://www.google.com");
        //Test case: Google.com un basligi "Google arama Sayfasi" olsun
        String title=driver.getTitle();
        //Google in title "Google Arama Sayfasi" na esit mi degil mi?

        Assert.assertEquals("Google Arama Sayfasi",title);
        //Assert.assertEquals(5,5);
        //Assert.assertEquals(true,false);
        //  Assert.assertEquals("yazi",title);


    }
    @Test
    public void test2(){
        driver.get("http://www.amazon.com");
        // Amazon.com'un başlığı Amazon kelimesini içeriyor olsun.
        String title=driver.getTitle();
        boolean iceriyorMu=title.contains("Amazon");
        Assert.assertTrue(iceriyorMu);//true oldugunu dogrula
    }
    @Test
    public void test3(){
        driver.get("http://www.facebook.com");
        String title=driver.getTitle();
        //Facebook title i youtube kelimesini icermesin
        boolean iceriyorMu=title.contains("Youtube");
        Assert.assertFalse(iceriyorMu);//false oldugunu dogrula
        System.out.println("Test dogrulama islemi bitti");

    }
    @Test
    public void test4(){
        driver.get("http://www.google.com");
        String title=driver.getTitle();
        System.out.println("Merhabalar");
        Assert.assertEquals("Google Arama Sayfasi",title);
        //eger test basarisiz olduysa bulunan testin kalan kismi calismaz. diger teste gonderir
        System.out.println("Test dogrulama islemi bitti");

    }







}
