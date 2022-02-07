package com.checkpt.maths.parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvSourceAndFileTest {

    @ParameterizedTest(name = "Csv Test for {index} and value {0} {1}")
    @CsvSource({"test,TEST","tEst,TEST","Java,JAVA"})
    void testToUpperCase_ShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
        String actual = input.toUpperCase();
        assertEquals(expected,actual);
    }


    @ParameterizedTest(name = "Csv Test for delimiter {index} and value {0} {1}")
    @CsvSource(value = {"test:test","tEst:test","Java:java"}, delimiter = ':')
    void testToLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actual = input.toLowerCase();
        assertEquals(expected,actual);
    }

    @ParameterizedTest(name = "CSV File Test {index} : {0} {1}")
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void testToUpperCase_ShouldGenerateTheExpectedUpperCaseValueFromCSVFile(
            String input, String expected
    ) {
        String actual = input.toUpperCase();
        assertEquals(expected,actual);
    }


}
