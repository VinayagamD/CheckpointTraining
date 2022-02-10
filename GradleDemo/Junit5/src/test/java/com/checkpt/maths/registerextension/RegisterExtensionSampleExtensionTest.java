package com.checkpt.maths.registerextension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class RegisterExtensionSampleExtensionTest {

    @RegisterExtension
    static RegisterExtensionSampleExtension staticExtension = new RegisterExtensionSampleExtension("static version");

    @RegisterExtension
    RegisterExtensionSampleExtension instanceExtension = new RegisterExtensionSampleExtension("instance version");

    @Test
    public void demoTest() {
        Assertions.assertEquals("instance version", instanceExtension.getType());
    }
}