package org.example.testcodePractice;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPasswordGenerator implements org.example.testcodePractice.PasswordGenerator {
    /**
     * Special characters allowed in password.
     */
    public static final String ALLOWED_SPL_CHARACTERS = "!@#$%^&*()_+";

    public static final String ERROR_CODE = "ERRONEOUS_SPECIAL_CHARS";

    public String generatePassword() {
        // PasswordGenerator : 주어진 규칙을 만족하는 비밀번호를 생성한다.
        // (https://www.passay.org/javadocs/org/passay/PasswordGenerator.html)
        PasswordGenerator gen = new PasswordGenerator();

        //CharacterData : 이 규칙의 문자 데이터
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        // CharacterRule : 패스워드에 특정 문자가 들어있는지 확인한다.
        // lowerCaseChars 규칙의 새로운 생성자
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        //setNumberOfCharacters : 비밀번호에 필요한 문자수를 정한다
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterData digitChars = EnglishCharacterData.Digit;
        CharacterRule digitRule = new CharacterRule(digitChars);
        digitRule.setNumberOfCharacters(2);

        CharacterData specialChars = new CharacterData() {
            public String getErrorCode() {
                return ERROR_CODE;
            }

            public String getCharacters() {
                return ALLOWED_SPL_CHARACTERS;
            }
        };
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);

        // 0 ~ 12
        // generatePassword(길이, 규칙들) : 길이와 규칙에 맞게 비밀번호를 생성하여 반환한다
        return gen.generatePassword((int) (Math.random() * 13),
                                    splCharRule, lowerCaseRule, upperCaseRule, digitRule);
    }

    @Override
    public String generatorPassword() {
        return null;
    }
}