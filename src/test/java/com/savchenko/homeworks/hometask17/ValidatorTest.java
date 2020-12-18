package com.savchenko.homeworks.hometask17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    private final String testing1 = "[{(text)}]";
    private final String testing2 = "[{texting} body}]";
    private final String testing3 = "[{body//(another test) //data}]";
    private final String testing4 = "[{data1}{data2}{data3})]";

    @Test
    public void ParenthesesBalancedHappyTest() {
        assertTrue(Validator.areParenthesesBalanced(testing1));
        assertTrue(Validator.areParenthesesBalanced(testing3));
    }

    @Test
    public void ParenthesesBalancedNotHappyTest() {
        assertTrue(Validator.areParenthesesBalanced(testing2));
        assertTrue(Validator.areParenthesesBalanced(testing4));

    }
}
