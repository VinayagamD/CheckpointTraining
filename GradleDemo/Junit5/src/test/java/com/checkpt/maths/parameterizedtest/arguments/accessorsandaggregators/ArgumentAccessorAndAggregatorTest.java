package com.checkpt.maths.parameterizedtest.arguments.accessorsandaggregators;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentAccessorAndAggregatorTest {

    @ParameterizedTest(name = "Argument Accesor Test for case {index} input '{0}' '{1}' '{2}' and expected full name {3} ")
    @CsvSource({"Isaac,,Newton,Isaac Newton", "Charles,Robert,Darwin,Charles Robert Darwin"})
    void testFullName_ShouldGenerateTheExpectedFullName(ArgumentsAccessor argumentsAccessor) {
        String firstName = argumentsAccessor.getString(0);
        String middleName = (String) argumentsAccessor.get(1);
        String lastName = argumentsAccessor.get(2, String.class);
        String expectedFullName = argumentsAccessor.getString(3);

        Person person = new Person(firstName, middleName, lastName);
        assertEquals(expectedFullName, person.fullName());
    }

    @ParameterizedTest(name = "Argument Aggregator Test for case {index} input '{1}' '{2}' '{3}' and expected full name {0}")
    @CsvSource({"Isaac Newton,Isaac,,Newton", "Charles Robert Darwin,Charles,Robert,Darwin"})
    void fullName_ShouldGeneratedTheExpectedFullName(
            String expectedFullName,
            @AggregateWith(PersonAggregator.class) Person person
    ){
        assertEquals(expectedFullName, person.fullName());
    }
}
