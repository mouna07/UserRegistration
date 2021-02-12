package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTesting {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void validateFirstName(){
        String testString1 = userRegistration.nameValidation("Akio");
        String testString2 = userRegistration.nameValidation("Suyog");
        String testString3 = userRegistration.nameValidation("Karan");
        String testString4 = userRegistration.nameValidation("Akshata");
        String testString5 = userRegistration.nameValidation("Franchesco");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Valid",testString4);
        Assert.assertEquals("Valid",testString5);

    }

    @Test
    public void validateLastName(){
        String testString1 = userRegistration.nameValidation("Takahashi");
        String testString2 = userRegistration.nameValidation("Mule");
        String testString3 = userRegistration.nameValidation("Chavan");
        String testString4 = userRegistration.nameValidation("Talankar");
        String testString5 = userRegistration.nameValidation("Fierre");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Valid",testString4);
        Assert.assertEquals("Valid",testString5);
    }

    @Test
    public void validateEmail(){
        String testString1 = userRegistration.emaileValidation("abc-100.hello@gmail.com.au");
        String testString2 = userRegistration.emaileValidation("smulye10@gmail.com");
        String testString3 = userRegistration.emaileValidation("somethingFreaky33@yopmail.com");
        String testString4 = userRegistration.emaileValidation("HeaveN63_44.gg@navi.gg");
        String testString5 = userRegistration.emaileValidation("7655_Hellokitty@businness.net");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Valid",testString4);
        Assert.assertEquals("Valid",testString5);
    }

    @Test
    public void validatePhoneNo(){
        String testString1 = userRegistration.mobileNumberValidation("91 8888674433");
        String testString2 = userRegistration.mobileNumberValidation("117 9898334455");
        String testString3 = userRegistration.mobileNumberValidation("1 9139818877");
        String testString4 = userRegistration.mobileNumberValidation("73 7788996655d");
        String testString5 = userRegistration.mobileNumberValidation("991 7878675644");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Valid",testString4);
        Assert.assertEquals("Valid",testString5);
    }

    @Test
    public void validatePassword(){
        String testString1 = userRegistration.passwordValidation("Saitan@666");
        String testString2 = userRegistration.passwordValidation("Ghost_$564");
        String testString3 = userRegistration.passwordValidation("SabrentK*445");
        String testString4 = userRegistration.passwordValidation("786@IamLucky");
        String testString5 = userRegistration.passwordValidation("DramOf11YearoldKid$");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Valid",testString4);
        Assert.assertEquals("Valid",testString5);
    }
}