package com.pages;

import com.openDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class myFirstFeaturePage extends openDriver {



    public void assertHeaderText(String expectedHeaderHelp){
        String actualHeaderHelp = null;

        System.out.println("expectedHeaderHelp===+=>" + expectedHeaderHelp);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        if (expectedHeaderHelp.equals("Cabin bags and hold luggage")) {
            actualHeaderHelp = driver.findElement(
                By.xpath(".//*[@id='pageWrapper']/div[4]/div[2]/div[1]/div/div/div[1]/h1")).getText();
        }

        else if (expectedHeaderHelp.equals("What would you like to know?")) {
            actualHeaderHelp = driver.findElement(By.xpath(".//*[@id='ce75daf7cc0247ba822d96669bc93d01']/h1")).getText();
        }

        System.out.println("actualHeaderHelp==>this is for prasad" + actualHeaderHelp);

//        assertEquals(expectedHeaderHelp,actualHeaderHelp);
        assertTrue(actualHeaderHelp.contains(expectedHeaderHelp));
    }






}
