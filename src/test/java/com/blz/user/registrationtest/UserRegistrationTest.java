package com.blz.user.registrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration test = new UserRegistration();

    @Test
    public void givenFirstNameWithOneUpperCaseAtTheStart() {
        boolean firstName = test.validateFirstName("deepak");
        Assert.assertEquals(true, firstName);
    }

    @Test
    public void givenLastNameWithOneUpperCaseAtTheStart() {
        boolean lastName = test.validateLastName("Reddy");
        Assert.assertEquals(true, lastName);
    }

    @Test
    public void givenValidEmailHasMandatoryPartsandOptionalParts() {
        boolean email = test.validateEmail("abc@gmail.com.com");
        Assert.assertEquals(true, email);
    }

    @Test
    public void givenMobileFormatCountryCodeFollowedBySpaceAnd10DigitNumber() {
        boolean mobNum = test.validateMobilenumber("91 9182510123");
        Assert.assertEquals(true, mobNum);
    }

    @Test
    public void givenPasswordMinimum1NumericUpperCaseLowerCaseAndExact1SpecialCharacterValueAndMinimum8Characters() {
        boolean password = test.validatePassword("Deepak@reddy7");
        Assert.assertEquals(true, password);
    }

}



