package org.example.testcodePractice;

import org.example.testcodePractice.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {


    @Override
    public String generatorPassword() {
        return "abcdefgh"; //8글자임
    }
}
