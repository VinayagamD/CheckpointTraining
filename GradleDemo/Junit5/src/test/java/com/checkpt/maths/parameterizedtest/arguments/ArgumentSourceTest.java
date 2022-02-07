package com.checkpt.maths.parameterizedtest.arguments;

import com.checkpt.maths.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArgumentSourceTest {

    @ParameterizedTest(name = "Test For ArgumentSource {index}: {0}")
    @ArgumentsSource(BlanksStringArgumentsProvider.class)
    void testIsBlank_ShouldReturnNullOrBlankStringArgProvider(String input) {
        assertTrue(Strings.isBlank(input));
    }
}
