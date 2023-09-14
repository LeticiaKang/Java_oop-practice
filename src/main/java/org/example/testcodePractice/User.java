package org.example.testcodePractice;

public class User {

    private String password;

    // 비밀번호를 초기화 해주는 메서드
    public void initPassword(PasswordGenerator passwordGenerator){

        String password = passwordGenerator.generatorPassword();

        // 비밀번호가 최소 8자 이상 12자 이하이면 조건을 만족하기 때문에 초기화하지 않는다.
        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }
    }
    
    // User클래스는 static이 아니라 getter가 있어야 함
    public String getPassword() {
        return password;
    }
}
