package com.homeoffice.pages;

import com.homeoffice.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Bhavesh
 */
public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
   By startNowButton = By.xpath("//section[@class='govuk-!-margin-bottom-6']/a");

    By nextStepButton = By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");

    By reasonForVisitList = By.xpath("//input[@id='response-0']");
    By nextStepButton1 = By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");
    By resultMessage = By.xpath("//span[contains(text(),'Check if you need a UK visa')]");

    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }
    public String getResultMessage(){
        return getTextFromElement(resultMessage);}


    public void clickStartNow(){
       clickOnElement(startNowButton);
   }

   public void selectNationality(String nationality){
       WebElement dropDown = driver.findElement(By.xpath("//select[@id='response']"));
       Select select = new Select(dropDown);
       select.selectByVisibleText(nationality);
   }

   public void clickNextStepButton(){
        clickOnElement(nextStepButton);
   }

   public void selectReasonForVisit(){
        clickOnElement(reasonForVisitList);
   }

   public void clickNextStepButton1(){
        clickOnElement(nextStepButton1);
   }


   public void anAustralianCominToUKForTourism(){
        clickStartNow();
        selectNationality("Australia");
        clickNextStepButton();
        selectReasonForVisit();
        clickNextStepButton1();

   }



}
