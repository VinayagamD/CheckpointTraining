package com.checkpt.maths.parameterizedtest;

import com.checkpt.maths.Numbers;
import com.checkpt.maths.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceTest {

    @ParameterizedTest(name = "For {index} : value is {0}")
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void testForParameterized(int source){
        System.out.println(source);
    }

    /*
    Failed Test Case
    @ParameterizedTest(name = "For {index} : value is {0} and String {1}")
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}, strings = {"A","b", "c", "d", "E", "f"})
    public void testForParameter_WithTwoSource(int source, String source2){
        System.out.println(source);
        System.out.println(source2);
    }
    */


    @ParameterizedTest(name = "{index}: {0}")
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void testIsOdd_ShouldReturnTrueForOddNumbers(int number) {
        assertTrue(Numbers.isOdd(number));
    }

    @ParameterizedTest(name = "{index}: {0}")
    @ValueSource(ints = {2, 4, 6, -2, 14, 10000})
    void testIsOdd_ShouldReturnFalseForEvenNumbers(int number) {
        assertFalse(Numbers.isOdd(number));
    }

    @ParameterizedTest(name = "{index}: {0}")
    @ValueSource(strings = {"", " "})
    void testIsBlank_ShouldReturnTrueNullOrBlankStrings(String input) {
        assertTrue(Strings.isBlank(input));
    }

    @ParameterizedTest(name = "{index}: {0}")
    @NullSource
    void testIsBlank_ShouldReturnTrueNullInputs(String input) {
        assertTrue(Strings.isBlank(input));
    }

    @ParameterizedTest(name = "{index}: {0}")
    @EmptySource
    void testIsBlank_ShouldReturnTrueEmptyInputs(String input) {
        assertTrue(Strings.isBlank(input));
    }

    @ParameterizedTest(name = "{index}: {0}")
    @NullAndEmptySource
    void testIsBlank_ShouldReturnTrueNullAndEmptyInputs(String input) {
        assertTrue(Strings.isBlank(input));
    }

    @ParameterizedTest(name = "{index} : {0}")
    @NullAndEmptySource
    @ValueSource(strings = {"  ", "\t", "\n"})
    void testIsBlank_ShouldReturnTrueForAllTypesOfBlankStrings(String input) {
        assertTrue(Strings.isBlank(input));
    }

}
