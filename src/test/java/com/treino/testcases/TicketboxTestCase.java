package com.treino.testcases;

import com.treino.frameworks.utils.TicketboxBaseTest;
import com.treino.tasks.TicketboxTask;
import org.testng.annotations.Test;

public class TicketboxTestCase extends TicketboxBaseTest {

    @Test
    public void tickeboxTest() throws InterruptedException {
        TicketboxTask ticketboxTask = new TicketboxTask(driver);
        driver.get("https://ticket-box.s3.eu-central-1.amazonaws.com/index.html");
        ticketboxTask.registarTicketbox();
        Thread.sleep(5000);
    }
}
