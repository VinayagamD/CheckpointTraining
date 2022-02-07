package com.checkpt.maths.parameterizedtest.arguments.customannotations;

import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(VariableArgumentsProvider.class)
public @interface VariableSource {
    /**
     * The name of the value which is passed string
     * @return from ArgumentsProvider
     */
    String value();
}
