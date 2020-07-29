package com.fasttrackit.features;

import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.usefull.BaseTest;
import com.fasttrackit.usefull.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;



public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCartTest(){
        loginSteps.login(Constants.USER_NAME, Constants.USER_PASS);

    }
}

