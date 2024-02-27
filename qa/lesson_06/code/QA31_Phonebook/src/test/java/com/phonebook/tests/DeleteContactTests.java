package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{
    //precondition
    @BeforeMethod
    public void precondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        }
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        clickOnLoginButton();
        clickOnAddLink();
        fillContactForm(new Contact()
                .setName("Adam")
                .setLastName("Karl")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Berlin")
                .setDescription("goalkeeper"));
        clickOnSaveButton();
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = sizeOfContacts();
        removeContact();
        pause(1000);
        int sizeAfter = sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

}
