package Delfinen;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void calcAgeZeroYears() {
        Member member = new Member("Kasper", 24, "1234", true,
                LocalDate.of(2022, 5, 19));
        int age = member.calcAge();
        assertEquals(0, age);
    }
    @Test
    void calcAgeOneYear() {
        Member member = new Member("Kasper", 24, "1234", true,
                LocalDate.of(2021, 5, 19));
        int age = member.calcAge();
        assertEquals(1, age);
    }
    @Test
    void calcAgeOneYearOneMonth() {
        Member member = new Member("Kasper", 24, "1234", true,
                LocalDate.of(2021, 4, 19));
        int age = member.calcAge();
        assertEquals(1, age);
    }
    @Test
    void calcAgeElevenMonth() {
        Member member = new Member("Kasper", 24, "1234", true,
                LocalDate.of(2021, 6, 19));
        int age = member.calcAge();
        assertEquals(0, age);
    }
}