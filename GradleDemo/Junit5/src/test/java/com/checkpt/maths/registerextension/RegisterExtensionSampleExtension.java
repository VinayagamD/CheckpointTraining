package com.checkpt.maths.registerextension;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterExtensionSampleExtension implements BeforeAllCallback, BeforeEachCallback {

    private final String type;
    Logger logger = LoggerFactory.getLogger(RegisterExtensionSampleExtension.class);

    public RegisterExtensionSampleExtension(String type) {
        this.type = type;
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        logger.debug("Type {} In beforeAll : {}", type, extensionContext.getDisplayName());
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        logger.debug("Type {} In beforeEach : {}", type, extensionContext.getDisplayName());
    }

    public String getType() {
        return type;
    }
}
