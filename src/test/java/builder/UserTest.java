package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUser() {
        User user = User.builder().firstName("Stepan").age(18).gender("m").occupation("dev").occupation("manager").build();

        assertEquals("Stepan", user.getFirstName());
        assertEquals(18, user.getAge());
        assertEquals("m", user.getGender());
        assertArrayEquals(new String[] {"dev", "manager"}, user.getOccupations().toArray(new String[0]));

    }
}