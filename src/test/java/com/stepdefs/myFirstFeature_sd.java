package com.stepdefs;


import com.pages.myFirstFeaturePage;
import com.openDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class myFirstFeature_sd extends openDriver {

public myFirstFeaturePage myfirst = PageFactory.initElements(driver, myFirstFeaturePage.class);

    @Given("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String url) {
        driver.get(url);
    }

    @And("^I accepted the cookies$")
    public void iAcceptedTheCookies() {
        driver.findElement(
            By.xpath(".//*[@id='drawer-dialog']/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/button")).click();
    }

    @And("^I clicked on help topic \"([^\"]*)\"$")
    public void iClickedOnHelpTopic(String HelpTopic) throws InterruptedException {
        Thread.sleep(1000);
//       Driver123.driver.findElement(By.xpath(".//*[@id='drawer-dialog']/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/ul/li[1]/a")).click();
        driver.findElement(By.linkText(HelpTopic)).click();
    }

    @When("^I clicked on help menu$")
    public void iClickedOnHelpMenu() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='pageWrapper']/header/div[1]/div[1]/nav[2]/ul/li[3]/span/a")).click();
    }

    @Then("^I should see \"([^\"]*)\" header text$")
    public void iShouldSeeHeaderText(String expectedHeaderHelp) {
//        myFirstFeaturePage my = new myFirstFeaturePage();
//        my.assertHeaderText(expectedHeaderHelp);


        myfirst.assertHeaderText(expectedHeaderHelp);

    }
}


