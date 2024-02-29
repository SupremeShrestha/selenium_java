package org.example.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Commonfunctions {
    public static void click(By locator, WebDriver driver){
        driver.findElement(locator).click();
    }
}
