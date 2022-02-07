package com.teladoc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import java.util.List;

public class UserAddDeletePage extends BasePage {

    @FindBy(xpath = "//button[@type='add']")
    public WebElement addUser;

    @FindBy(xpath = "//input[@name='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[contains(text(),'Company BBB')]")
    public WebElement chooseCompanyBBB;

    @FindBy(xpath = "//*[contains(text(),'Company AAA')]")
    public WebElement chooseCompanyAAA;

    @FindBy(xpath = "//*[@name='RoleId']")
    public WebElement userRole;

    @FindBy(xpath = "//*[@name='Email']")
    public WebElement userEmail;

    @FindBy(xpath = "//*[@name='Mobilephone']")
    public WebElement userPhone;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement saveButton;

    @FindBy(how = How.XPATH,using = "//table/tbody/tr/td[3]")
    public List <WebElement> userList;

    @FindBy(how = How.XPATH,using = "//table/tbody/tr")
    public List <WebElement> userTable;

    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public WebElement userNameCell;

    @FindBy(xpath = "//input[@ng-model=searchValue']")
    public WebElement searchbar;

    @FindBy(xpath = "//td[.='novak']/../td[11] //*[@class='icon icon-remove']")
    public WebElement deleteUserIcon;

    @FindBy(xpath = "//*[@title='Minimize']")
    public WebElement chatBoxMinimize;

    @FindBy(xpath = "//*[contains(text(), 'Confirmation Dialog')]")
    public WebElement confirmationWindow;

    @FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
    public WebElement deleteConfirm;

}
