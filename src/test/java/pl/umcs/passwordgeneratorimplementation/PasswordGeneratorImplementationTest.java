package pl.umcs.passwordgeneratorimplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.umcs.passwordgeneratorapi.PasswordGeneratorParameters;


class PasswordGeneratorImplementationTest {
    PasswordGeneratorImplementation testClass = new PasswordGeneratorImplementation();

    @Test
    void shouldGeneratePasswordOfProperLength() {
        PasswordGeneratorParameters parameters = new PasswordGeneratorParameters();
        parameters.setPasswordLength(10);
        String generatedPassword = testClass.generate(parameters);
        Assertions.assertEquals(10, generatedPassword.length());
    }
}