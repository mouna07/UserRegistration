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
        String testString4 = userRegistration.nameValidation("@kshata");
        String testString5 = userRegistration.nameValidation("aKio");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Invalid",testString4);
        Assert.assertEquals("Invalid",testString5);

    }

    @Test
    public void validateLastName(){
        String testString1 = userRegistration.nameValidation("Takahashi");
        String testString2 = userRegistration.nameValidation("Mule");
        String testString3 = userRegistration.nameValidation("Chavan");
        String testString4 = userRegistration.nameValidation("$hadow");
        String testString5 = userRegistration.nameValidation("tAkahaShi");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Invalid",testString4);
        Assert.assertEquals("Invalid",testString5);
    }

    @Test
    public void validateEmail(){
        String testValidString1 = userRegistration.emaileValidation("abc@yahoo.com");
        String testValidString2 = userRegistration.emaileValidation("abc-100@yahoo.com");
        String testValidString3 = userRegistration.emaileValidation("abc.100@yahoo.com");
        String testValidString4 = userRegistration.emaileValidation("abc111@abc.com");
        String testValidString5 = userRegistration.emaileValidation("abc-100@abc.net");
        String testValidString6 = userRegistration.emaileValidation("abc.100@abc.com.au");
        String testValidString7 = userRegistration.emaileValidation("abc@1.com");
        String testValidString8 = userRegistration.emaileValidation("abc@gmail.com.com");
        String testValidString9 = userRegistration.emaileValidation("abc+100@gmail.com");

        String testInvalidString1 = userRegistration.emaileValidation("abc");
        String testInvalidString2 = userRegistration.emaileValidation("abc@.com.my");
        String testInvalidString3 = userRegistration.emaileValidation("abc123@gmail.a");
        String testInvalidString4 = userRegistration.emaileValidation("abc123@.com");
        String testInvalidString5 = userRegistration.emaileValidation("abc123@.com.com");
        String testInvalidString6 = userRegistration.emaileValidation(".abc@abc.com");
        String testInvalidString7 = userRegistration.emaileValidation("abc()*@gmail.com");
        String testInvalidString8 = userRegistration.emaileValidation("abc@%*.com");
        String testInvalidString9 = userRegistration.emaileValidation("abc..2002@gmail.com");
        String testInvalidString10 = userRegistration.emaileValidation("abc.@gmail.com");
        String testInvalidString11 = userRegistration.emaileValidation("abc@abc@gmail.com");
        String testInvalidString12 = userRegistration.emaileValidation("abc@gmail.com.1a");

        Assert.assertEquals("Valid",testValidString1);
        Assert.assertEquals("Valid",testValidString2);
        Assert.assertEquals("Valid",testValidString3);
        Assert.assertEquals("Valid",testValidString4);
        Assert.assertEquals("Valid",testValidString5);
        Assert.assertEquals("Valid",testValidString6);
        Assert.assertEquals("Valid",testValidString7);
        Assert.assertEquals("Valid",testValidString8);
        Assert.assertEquals("Valid",testValidString9);

        Assert.assertEquals("Invalid",testInvalidString1);
        Assert.assertEquals("Invalid",testInvalidString2);
        Assert.assertEquals("Invalid",testInvalidString2);
        Assert.assertEquals("Invalid",testInvalidString3);
        Assert.assertEquals("Invalid",testInvalidString4);
        Assert.assertEquals("Invalid",testInvalidString5);
        Assert.assertEquals("Invalid",testInvalidString6);
        Assert.assertEquals("Invalid",testInvalidString7);
        Assert.assertEquals("Invalid",testInvalidString8);
        Assert.assertEquals("Invalid",testInvalidString9);
        Assert.assertEquals("Invalid",testInvalidString10);
        Assert.assertEquals("Invalid",testInvalidString11);
        Assert.assertEquals("Invalid",testInvalidString12);
    }

    @Test
    public void validatePhoneNo(){
        String testString1 = userRegistration.mobileNumberValidation("91 8888674433");
        String testString2 = userRegistration.mobileNumberValidation("117 9898334455");
        String testString3 = userRegistration.mobileNumberValidation("1 9139818877");
        String testString4 = userRegistration.mobileNumberValidation("73 77889 966");
        String testString5 = userRegistration.mobileNumberValidation("991 78786 75644");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Invalid",testString4);
        Assert.assertEquals("Invalid",testString5);
    }

    @Test
    public void validatePassword(){
        String testString1 = userRegistration.passwordValidation("Saitan@666");
        String testString2 = userRegistration.passwordValidation("Ghost_$564");
        String testString3 = userRegistration.passwordValidation("SabrentK*445");
        String testString4 = userRegistration.passwordValidation("@IamLucky");
        String testString5 = userRegistration.passwordValidation("DramOf11Year###oldKid$");

        Assert.assertEquals("Valid",testString1);
        Assert.assertEquals("Valid",testString2);
        Assert.assertEquals("Valid",testString3);
        Assert.assertEquals("Invalid",testString4);
        Assert.assertEquals("Invalid",testString5);
    }
}
