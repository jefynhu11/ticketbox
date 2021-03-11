package com.treino.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TicketboxAppObjects {

    private final WebDriver driver;

    public TicketboxAppObjects (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstNameTextField() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement lastNameTextField() {
        return driver.findElement(By.id("last-name"));
    }
    public WebElement emailTextField() {
        return driver.findElement(By.id("email"));
    }
    public WebElement friendCheckBox() {
        return driver.findElement(By.id("friend"));
    }
    public WebElement specialRequests() {
        return driver.findElement(By.id("requests"));
    }
    public WebElement iAgreeCheckBox() {
        return driver.findElement(By.id("agree"));
    }
    public WebElement signatureTextField() {
        return driver.findElement(By.id("signature"));
    }
    public WebElement confirmTicketsButton() {
        return driver.findElement(By.cssSelector("#app  button[type='submit']"));
    }
    public WebElement ticketSuccessfullyTextLabel() {
        return driver.findElement(By.cssSelector("#app .success p"));
    }

}
