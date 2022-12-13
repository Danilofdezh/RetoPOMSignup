package com.phptravels.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.phptravels.net/signup")
public class PhpTravelsPage extends PageObject {

    public By FirstNameInput = By.name("first_name");
    public By LastNameInput = By.name("last_name");
    public By PhoneInput = By.name("phone");
    public By EmailInput = By.name("email");
    public By PasswordInput = By.name("password");
    public By AccountTypeInput = By.xpath("//*[@id='select2-account_type-container']");
    public By SignUpButton = By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");

    public void sendFirstName (String string){

        getDriver().findElement(FirstNameInput).sendKeys(string);
    }
    public void sendLastName (String string){

        getDriver().findElement(LastNameInput).sendKeys(string);
    }
    public void sendPhone (String string){

        getDriver().findElement(PhoneInput).sendKeys(string);
    }
    public void sendEmail (String string){

        getDriver().findElement(EmailInput).sendKeys(string);
    }
    public void sendPassword (String string){

        getDriver().findElement(PasswordInput).sendKeys(string);
    }
    public void sendAccountType (String string){

        getDriver().findElement(AccountTypeInput).sendKeys(string);
    }

    public By getSignUpButton() {
        return SignUpButton;
    }

}
