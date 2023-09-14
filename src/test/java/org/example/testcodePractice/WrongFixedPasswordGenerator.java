package org.example.testcodePractice;

import org.example.testcodePractice.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatorPassword() {
        return "abcdh"; //5글자임
    }

}
