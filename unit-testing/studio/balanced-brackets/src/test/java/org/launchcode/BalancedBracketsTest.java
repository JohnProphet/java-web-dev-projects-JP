package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[*]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[0][][0]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Joshua][is][the][coolest]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]This Test Will Fail["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]["));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[][][Code"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[L][a][u"));
    }
}