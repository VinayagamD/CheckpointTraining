package com.checkpt.maths.parameterizedtest;

import com.checkpt.maths.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MethodSourceTest {

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of("  ", true),
                Arguments.of("not blank", false)
        );
    }

    @ParameterizedTest(name = "{index}: {0} \t {1}")
    @MethodSource("provideStringsForIsBlank")
    void testIsBlank_ShouldReturnTrueForNullOrBlackStrings(String input, boolean expected) {
        assertEquals(expected, Strings.isBlank(input));
    }

    @ParameterizedTest
    @MethodSource
    void isBlank_ShouldReturnTrueForNullOrBlankStringsOneArgument(String input) {
        assertTrue(Strings.isBlank(input));
    }

    private static Stream<String> isBlank_ShouldReturnTrueForNullOrBlankStringsOneArgument() {
        return Stream.of(null, "", "  ");
    }

    @ParameterizedTest
    @MethodSource("com.checkpt.maths.parameterizedtest.StringParams#blankStrings")
    void testIsBlank_ShouldReturnTrueForNullOrBlankStringsExternalArgument(String input) {
        assertTrue(Strings.isBlank(input));
    }


}
