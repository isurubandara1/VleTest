package org.example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver .get("https://vle.sab.ac.lk/login/index.php");
        Thread.sleep(2000);

        // step 1: username Field Test
        WebElement usernameField = driver.findElement(By.id("username"));
          //test is it empty
        String currentValue = usernameField.getAttribute("Value");
        if(currentValue.isEmpty()){
            System.out.println("username field is empty");
        }
         //field enable or not
        if(usernameField.isEnabled()){
            System.out.println("field is enable");
            usernameField.sendKeys("Testuser");
        }
        

        // ===== Step 2: Password Field Test =====
        WebElement passwordField = driver.findElement(By.id("login_password"));

        // Type attribute verify කරනවා (password ද?)
        String fieldType = passwordField.getAttribute("type");
        if (fieldType.equals("password")) {
            System.out.println("✅ Password field is masked (secure)");
        }

        passwordField.sendKeys("wrong_password");

        // ===== Step 3: Login Button Test =====
        WebElement loginBtn = driver.findElement(By.id("loginbtn"));

        // Button text verify කරනවා
        String btnText = loginBtn.getText();
        System.out.println("Button text: " + btnText); // "Log in"

        // Button enabled ද?
        if (loginBtn.isEnabled()) {
            loginBtn.click();
            System.out.println("✅ Login button clicked");
        }

        Thread.sleep(2000); // Wait for response
//
//        // ===== Step 4: Error Message Verify =====
//        // Safe way - findElements use කරනවා
//        List<WebElement> errors = driver.findElements(By.id("loginerrormessage"));
//
//        if (errors.size() > 0 && errors.get(0).isDisplayed()) {
//            String errorText = errors.get(0).getText();
//            System.out.println("✅ Error appeared: " + errorText);
//
//            // Expected error verify කරනවා
//            if (errorText.contains("Invalid")) {
//                System.out.println("✅ TEST PASSED - Correct error shown");
//            } else {
//                System.out.println("❌ TEST FAILED - Wrong error");
//            }
//        } else {
//            System.out.println("❌ TEST FAILED - No error message");
//        }
//
//        // ===== Cleanup =====
//        Thread.sleep(2000);
//        driver.quit();
    }
}