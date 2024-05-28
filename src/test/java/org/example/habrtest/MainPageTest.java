package org.example.habrtest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class MainPageTest {
    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.habr.com/ru");


    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

//    @Test
//    public void changeLogTest() {
//
//
//        WebElement userIcon = driver.findElement(By.cssSelector("[data-test-id='menu-toggle-user']"));
//       userIcon.click();
//
//        WebElement rulesLink = driver.findElement(By.xpath("//*[contains(text(), 'Правила сайта')]"));
//        rulesLink.click();
//
//
//        assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Changelog')]")).isDisplayed(),"Changelog не найден");
//    }

    @Test
    public void Companies() {


        WebElement userIcon = driver.findElement(By.cssSelector("[data-test-id='header']"));
        userIcon.click();

        WebElement popScience = driver.findElement(By.xpath("//*[contains(text(), 'Научпоп')]"));
        popScience.click();



        assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Компании')]")).isDisplayed(),"Компании не найдены");
    }


    @Test
    public void Authors() {


        WebElement userIcon = driver.findElement(By.cssSelector("[data-test-id='header']"));
        userIcon.click();

        WebElement popScience = driver.findElement(By.xpath("//*[contains(text(), 'Научпоп')]"));
        popScience.click();

        WebElement authors = driver.findElement(By.xpath("//*[contains(text(), 'Авторы')]"));
        authors.click();

//        WebElement authors = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/main/div/div/div/div[1]/div/div[3]/div[2]/div/span[5]/a"));
//        authors.click();



        assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Авторы')]")).isDisplayed(),"Авторы не найдены");
    }

    @Test
    public void Companies2() {


//        WebElement userIcon = driver.findElement(By.cssSelector("[data-test-id='header']"));
//        userIcon.click();
//
//        WebElement popScience = driver.findElement(By.xpath("//*[contains(text(), 'Научпоп')]"));
//        popScience.click();

        WebElement companies = driver.findElement(By.xpath("//*[contains(text(), 'Компании')]"));

        assertTrue(companies.isDisplayed(),"Компании не найдены");
    }

}
