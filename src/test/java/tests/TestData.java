package tests;

import com.github.javafaker.Faker;
import utils.RandomGenerator;

import java.util.Locale;


public class TestData {
    Faker faker = new Faker(new Locale("de-De"));
    String name = faker.funnyName().name(),
            lastname = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            number = faker.number().digits(10),
            gender = RandomGenerator.randomGender(),
            hobby = RandomGenerator.randomHobby(),
            month = RandomGenerator.randomMonths(),
            year = String.valueOf(faker.number().numberBetween(1900, 2000)),
            day = String.valueOf(faker.number().numberBetween(10, 28)),
            subject = RandomGenerator.randomSubject(),
            picture = "test.png",
            address = faker.address().streetAddress(),
            state = "NCR",
            city = "Noida";

}
