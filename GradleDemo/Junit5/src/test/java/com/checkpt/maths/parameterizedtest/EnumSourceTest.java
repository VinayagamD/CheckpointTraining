package com.checkpt.maths.parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;
import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnumSourceTest {

    @ParameterizedTest(name = "For All 12 Months {index}: {0}")
    @EnumSource(Month.class)
    void testGetValueForMonth_IsAlwaysBetweenOneAndTwelve(Month month){
        int monthNumber = month.getValue();
        assertTrue(monthNumber >=1 && monthNumber<=12);
    }

    @ParameterizedTest(name = "For some Month with 30 Days {index}: {0}")
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void testSomeMonths_Are30DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(30, month.length(isALeapYear));
    }

    @ParameterizedTest(name = "For other Month with 31 Days {index}: {0}")
    @EnumSource(
            value = Month.class,
            names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER", "FEBRUARY"},
            mode = EnumSource.Mode.EXCLUDE)
    void testExceptFourMonths_OthersAre31DaysLong(Month month) {
        System.out.println(month.getValue());
        final boolean isALeapYear = false;
        assertEquals(31, month.length(isALeapYear));
    }

    @ParameterizedTest(name = "For other Month ends with BER {index}: {0}")
    @EnumSource(value = Month.class, names = ".+BER", mode = EnumSource.Mode.MATCH_ANY)
    void testFourMonths_AreEndingWithBer(Month month) {
        EnumSet<Month> months =
                EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
        assertTrue(months.contains(month));
    }



}
