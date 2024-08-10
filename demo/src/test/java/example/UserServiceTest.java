package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.example.UserService;

public class UserServiceTest {

    @Test
    public void testGetAge() {
        UserService userService = new UserService();
        Integer age = userService.getAge("110101199003077272");
        System.out.println(age);
    }

    @Test
    public void testGetGender() {
        UserService userService = new UserService();
        String gender = userService.getGender("110101199003071011");

        Assertions.assertEquals("男", gender);
    }

    @Test
    public void testGetAgeWithNullIdCard() {
        UserService userService = new UserService();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> userService.getAge(null));
        Assertions.assertEquals("无效的身份证号码", exception.getMessage());
    }

    @Test
    public void testGetAgeWithInvalidLength() {
        UserService userService = new UserService();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> userService.getAge("12345"));
        Assertions.assertEquals("无效的身份证号码", exception.getMessage());
    }

    @Test
    public void testGetAgeSuccess() {
        UserService userService = new UserService();
        Integer age = userService.getAge("110101199003077272");
        Integer expectedAge = Period.between(
                LocalDate.parse("19900307", DateTimeFormatter.ofPattern("yyyyMMdd")),
                LocalDate.now()).getYears();
        Assertions.assertEquals(expectedAge, age);
    }

    @Test
    public void testGetGenderWithNullIdCard() {
        UserService userService = new UserService();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> userService.getGender(null));
        Assertions.assertEquals("无效的身份证号码", exception.getMessage());
    }

    @Test
    public void testGetGenderWithInvalidLength() {
        UserService userService = new UserService();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> userService.getGender("12345"));
        Assertions.assertEquals("无效的身份证号码", exception.getMessage());
    }

    @Test
    public void testGetGenderForFemale() {
        UserService userService = new UserService();
        String gender = userService.getGender("110101199003070022");
        Assertions.assertEquals("女", gender);
    }

    @Test
    public void testGetGenderForMale() {
        UserService userService = new UserService();
        String gender = userService.getGender("110101199003071011");
        Assertions.assertEquals("男", gender);
    }
}
