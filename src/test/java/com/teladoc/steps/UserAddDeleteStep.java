package com.teladoc.steps;

import com.teladoc.pages.UserAddDeletePage;
import com.teladoc.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserAddDeleteStep {
    UserAddDeletePage userAction = new UserAddDeletePage();

    @When("I navigate to the url")
    public void navigateToTheUrl() {
        Driver.getDriver().getCurrentUrl();
    }

    @Then("I verify url by title")
    public void VerifyUrlByTitle() {
        String pageTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Protractor practice website - WebTables";
       assertEquals(pageTitle, expectedTitle);
    }

    @Then("I click on Add User button on the right side")
    public void clickAddUserButton() {
        userAction.addUser.click();
    }

    @Then("I enter {string} as first name")
    public void enterFirstName(String firstName) {
        userAction.firstName.clear();
        userAction.firstName.sendKeys(firstName);
    }

    @Then("I enter {string} as last name")
    public void enterLastName(String lastName) {
        userAction.lastName.clear();
        userAction.lastName.sendKeys(lastName);
    }

    @Then("I enter {string} as username")
    public void setUserName(String userName) {
        userAction.userName.clear();
        userAction.userName.sendKeys(userName);
    }

    @Then("I set {string}")
    public void setUserPassword(String passWord) {
        userAction.password.clear();
        userAction.password.sendKeys(passWord);
    }

    @Then("I select {string} type")
    public void chooseCustomerType(String customerType) {
        if (customerType.equalsIgnoreCase("Customer BBB")) {
            userAction.chooseCompanyBBB.click();
        } else if (customerType.equalsIgnoreCase("Customer AAA")) {
            userAction.chooseCompanyAAA.click();
        }
    }

    @Then("I choose user {string}")
    public void chooseUserRole(String chooseUserType) {
        Select sel = new Select(userAction.userRole);
        sel.selectByVisibleText(chooseUserType);
    }

    @Then("I enter user {string}")
    public void setUserEmail(String email) {
        userAction.userEmail.clear();
        userAction.userEmail.sendKeys(email);
    }

    @Then("I enter {string} in numeric format with dashes")
    public void enterPhoneNumberInNumericFormat(String phoneNumber) {
        userAction.userPhone.clear();
        userAction.userPhone.sendKeys(phoneNumber);
    }

    @Then("I click on the Save button")
    public void clickSaveButton() {
        userAction.saveButton.click();
    }

    @Then("I verify that the {string} I created is present in the table")
    public void verifyCreatedUser(String givenUserName) {
        String actualUserName = userAction.userNameCell.getText();
        for (WebElement each : userAction.userList) {
            if (each.equals(givenUserName)) {
               assertTrue("User Name found", actualUserName.equals(givenUserName));
            } else {
                assertTrue("User not found", actualUserName.equals(givenUserName));
            }
        }
    }

    @Then("I click on the delete user button to delete user novak")
    public void deleteUserButtonClick() {
        userAction.deleteUserIcon.click();
    }

    @Then("Confirmation Dialog window should display on the screen")
    public void confirmationWindowDisplay() {
        assertEquals(userAction.confirmationWindow.getText(), "Confirmation Dialog");
    }

    @Then("I click on the OK button")
    public void deleteConfirm() {
        userAction.deleteConfirm.click();
    }

    @Then("Verify that {string} name does not exist in the list")
    public void verifyUserDeleted(String deletedUserName) {
        for (WebElement each : userAction.userList) {
            if (each.equals(deletedUserName)) {
               assertFalse("False", deletedUserName.equals("novak"));
            } else {
                assertTrue("True", deletedUserName.equals("novak"));
            }
        }
    }

}
