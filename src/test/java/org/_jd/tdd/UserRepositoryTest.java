package org._jd.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoryTest {
    private static UserRepository repository;
    private static User user1;
    private static User user2;
    private static User user3;
    private static User user4;

    @BeforeAll
    public static void createRepo(){
        repository = new UserRepository();
        user1 = new User("A", "a", false);
        user2 = new User("B", "b", true);
        user3 = new User("C", "c", false);
        user4 = new User("D", "d", false);

        user1.authenticate("A", "a");
        user2.authenticate("B", "b");
        user3.authenticate("C","d");
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);
    }

    @Test
    public void findAByName(){
        assertThat(repository.findByName("A")).isEqualTo(user1);
    }

    @Test
    public void userWasntAdded(){
        assertThat(repository.findByName("C")).isNull();
    }

    @Test
    public void logoutAllExceptAdmins(){
        repository.logoutAll();
        assertThat(user1.isAuthenticate || user4.isAuthenticate).isEqualTo(false);
    }

    @Test
    public void adminsWasntLoggedOut(){
        repository.logoutAll();
        assertThat(user2.isAuthenticate).isEqualTo(true);
    }
}
