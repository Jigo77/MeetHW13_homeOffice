package com.homeoffice.testsuite;

import com.homeoffice.pages.HomePage;
import com.homeoffice.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();

    @BeforeMethod
    public void inIT() {
        homePage = new HomePage();
    }

    @Test
    public void home1() throws InterruptedException {
        homePage.iframeHandle();
    }

    @Test
    public void aus() throws InterruptedException {
        homePage.anAustralianCominToUKForTourism();
    }


}
