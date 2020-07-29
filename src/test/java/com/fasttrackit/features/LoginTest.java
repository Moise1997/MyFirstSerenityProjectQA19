package com.fasttrackit.features;


import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.usefull.BaseTest;
import com.fasttrackit.usefull.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.invoke.ConstantCallSite;


@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;


    private String user = "aladin@yahoo.com";
    private String pass = "ghiceste";

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(Constants.USER_NAME,Constants.USER_PASS);
        loginSteps.verifyLoggedIn("Bonda Moise Dan");
    }

    @Test
    public void invalidUserEmailTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("aladin",Constants.USER_PASS);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void invalidPassLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(Constants.USER_NAME,"1234567");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyPasswrodTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(Constants.USER_NAME,"");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("",Constants.USER_PASS);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailAndPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("","");
        loginSteps.verifyNotLoggedIn();
    }


}
