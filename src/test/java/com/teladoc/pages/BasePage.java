package com.teladoc.pages;

import com.teladoc.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

// We can create more re-usable methods here and extend them to pages (login, dashboard, etc)
public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
