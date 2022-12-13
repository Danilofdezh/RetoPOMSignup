package com.phptravels.automation.steps;

import com.phptravels.automation.models.DataInjection;
import com.phptravels.automation.pageobjects.PhpTravelsPage;
import com.phptravels.automation.ui.ClickButton;
import net.thucydides.core.annotations.Step;

public class PhpTravelsPageSteps {
    PhpTravelsPage phpTravelsPage = new PhpTravelsPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser() {
        phpTravelsPage.open();
    }

    @Step
    public void fillFieldsInPhpTravelsPage() {
        phpTravelsPage.sendFirstName(dataInjection.getFirstName());
        phpTravelsPage.sendLastName(dataInjection.getLastName());
        phpTravelsPage.sendPhone(dataInjection.getMobileNumber());
        phpTravelsPage.sendEmail(dataInjection.getEmail());
        phpTravelsPage.sendPassword(dataInjection.getPassword());
        //phpTravelsPage.sendAccountType(dataInjection.getAccount_type());
        //ClickButton.clickJS(phpTravelsPage.getDriver(),phpTravelsPage.SignUpButton);
        phpTravelsPage.getDriver().findElement(phpTravelsPage.getSignUpButton()).submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}