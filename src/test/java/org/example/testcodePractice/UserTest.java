package org.example.testcodePractice;

import org.example.testcodePractice.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워트 초기한다")
    @Test
    void passwordTest() {
        // given : user가 주어졌을 때
        User user = new User();

        // when : 초기화 메서드를 호출하면
        user.initPassword(() -> "abcdefgh");

        //then : user의 패스워드기 not null인지 확인한다.
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워트 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        // given : user가 주어졌을 때
        User user = new User();

        // when : 초기화 메서드를 호출하면
        user.initPassword(() -> "abcde");

        //then : user의 패스워드기  null인지 확인한다.
        assertThat(user.getPassword()).isNull();
    }

}