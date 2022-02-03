package com.checkpt.maths;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class helps to test BL of {@link MathUtil}
 */

class MathUtilTest {

    private MathUtil testInstance;
    private TestInfo testInfo;
    private TestReporter testReporter;

    /**
     * This initializes method in lifecycle hook
     */
    @BeforeEach
    void setUp(TestInfo testInfo,TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        this.testInstance = new MathUtil();
    }

    /**
     * This method refs to test BL of {@link  MathUtil#add(int, int)}
     */
    @Test
    @Tag("Math")
    void testAdd_Success() {
        int expected = 20;
        int actual = testInstance.add(10,10);
        assertEquals(expected,actual, "This method expected " + expected + " actually returned "+actual);
    }

    /**
     * This method refs to test BL of {@link  MathUtil#add(int, int)}
     */
    @Test
    @Tag("Math")
    void testAdd_SuccessPositiveNumbers() {
        int expected = 20;
        int actual = testInstance.add(10,10);
        assertEquals(expected,actual, "This method expected " + expected + " actually returned "+actual);
    }

    /**
     * This method refs to test BL of {@link  MathUtil#add(int, int)}
     */
    @Test
    @Tag("Math")
    void testAdd_SuccessNegativeNumbers() {
        testReporter.publishEntry("Method with display name " +testInfo.getDisplayName()+" and with tag "+testInfo.getTags());
        int expected = -20;
        int actual = testInstance.add(-10,-10);
        assertEquals(expected,actual, "This method expected " + expected + " actually returned "+actual);
    }

    /**
     * This method refs to test BL of {@link  MathUtil#add(int, int)}
     */
    @Nested
    @DisplayName("for Add method utils")
    @Tag("Math")
    class TestAddMethod {

        @Test
        public void testForPositiveNumber(){
            int expected = 20;
            int actual = testInstance.add(10,10);
            assertEquals(expected,actual, "This method expected " + expected + " actually returned "+actual);
        }

        @Test
        public void testForNegativeNumber(){
            int expected = 20;
            int actual = testInstance.add(10,10);
            assertEquals(expected,actual, "This method expected " + expected + " actually returned "+actual);
        }
    }

    /**
     * This method refs to test BL of {@link  MathUtil#add(int, int)}
     */
    @Test
    @DisplayName("Test for math all combinations")
    @Tag("Math")
    public void testMath_SuccessAllCombination(){
        assertAll(
                () ->  assertEquals(20, testInstance.add(10,10)),
                () ->  assertEquals(-20, testInstance.add(-10,-10)),
                () ->  assertEquals(0, testInstance.add(-10,10))
        );
    }

    @Test
    @DisplayName("This is a failed test")
    @Disabled
    void failedTest(){
        fail("This is always failing case");
    }

    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    @Test
    @DisplayName("Test Range for JDK 8 to JDK 17")
    void testJDKRange(){
        System.out.println("JDK Ranging from FROM 8 to 17");
    }

    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    @Test
    @DisplayName("Test Range for JDK 8 to JDK 17")
    void testBelowJDKRange(){
        System.out.println("JDK Ranging from FROM 8 to 17");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    @DisplayName("Test For Windows")
    void testForWindows(){
        System.out.println("Windows OS Test Case");
    }

    @EnabledOnOs(OS.MAC)
    @Test
    @DisplayName("Test For Windows")
    void testForMAC(){
        System.out.println("Mac OS Test Case");
    }

    @Test
    @Tag("Math")
    void sub() {
    }

    @Test
    @Tag("Math")
    void mul() {
    }


    @Test
    @Tag("Math")
    void testDiv_FailureCaseInputs() {
       ArithmeticException exception = assertThrows(ArithmeticException.class,() -> testInstance.div(10,0),"Expected exception on not working business case");
//       NullPointerException exception1 = assertThrows(NullPointerException.class,() -> testInstance.div(10,0),"UnExpected exception on it fails");
//       ArithmeticException exception2 = assertThrows(ArithmeticException.class,() -> testInstance.div(10,10),"Expected exception on not working business case");

    }


    /**
     * This method refs to test BL of {@link  MathUtil#computeCircleArea(int)}
     */
    @Test
    @DisplayName("Compute CircleArea")
    @Tag("Circle")
    void testComputeCircleArea_Success(){
        double expected = 314.159265358979323846;
        double actual = testInstance.computeCircleArea(10);
        assertEquals(expected, actual);
    }
}