package org._jd.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private User user;

    @BeforeEach
    public void createUser(){
        user = new User("A", "a", false);
    }

    @Test
    public void authUser(){
        assertThat(user.authenticate("A", "a")).isEqualTo(true);
    }

    @Test
    public void authWrongPassUser(){
        assertThat(user.authenticate("A", "b")).isEqualTo(false);
    }
}
