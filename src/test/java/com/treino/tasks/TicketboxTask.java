package com.treino.tasks;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.treino.appobjects.TicketboxAppObjects;
import com.treino.frameworks.utils.Screenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TicketboxTask {

    private final WebDriver driver;
    private final TicketboxAppObjects ticketboxAppObjects;

    public TicketboxTask (WebDriver driver) {
        this.driver = driver;
        ticketboxAppObjects = new TicketboxAppObjects(driver);
    }

    public void registarTicketbox() throws InterruptedException {
        ticketboxAppObjects.firstNameTextField().sendKeys("Jeferson");
        ticketboxAppObjects.lastNameTextField().sendKeys("Lopes Eugenio");
        ticketboxAppObjects.emailTextField().sendKeys("jef@lol.com.br");
        ticketboxAppObjects.friendCheckBox().click();
        ticketboxAppObjects.specialRequests().sendKeys("Mensagem de teste");
        ticketboxAppObjects.iAgreeCheckBox().click();
        ticketboxAppObjects.signatureTextField().sendKeys("Jeferson Eugenio");
        ticketboxAppObjects.confirmTicketsButton().click();
        validarTicketSuccess();
        Thread.sleep(3000);
    }

    private void validarTicketSuccess() {
        if (ticketboxAppObjects.ticketSuccessfullyTextLabel().getText().equals("Ticket(s) successfully ordered.")) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ticketboxAppObjects.ticketSuccessfullyTextLabel());
            ExtentTestManager.getTest().log(Status.PASS, "O registo foi sucesso", Screenshot.capture());
        } else {
            ExtentTestManager.getTest().log(Status.PASS, "O registo não foi sucesso", Screenshot.capture());
        }
    }
}
