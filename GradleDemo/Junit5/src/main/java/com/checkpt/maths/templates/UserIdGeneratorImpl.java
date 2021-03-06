package com.checkpt.maths.templates;

public class UserIdGeneratorImpl implements UserIdGenerator {

    private boolean isFeatureEnabled;

    public UserIdGeneratorImpl(boolean isFeatureEnabled) {
        this.isFeatureEnabled = isFeatureEnabled;
    }

    @Override
    public String generate(String firstName, String lastName) {
        String initialAndLastName = firstName.substring(0, 1).concat(lastName);
        return isFeatureEnabled ? "checkpt".concat(initialAndLastName) : initialAndLastName;
    }
}
