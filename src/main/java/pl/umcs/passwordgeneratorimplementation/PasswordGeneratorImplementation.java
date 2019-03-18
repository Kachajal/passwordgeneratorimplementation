package pl.umcs.passwordgeneratorimplementation;

import pl.umcs.passwordgeneratorapi.PasswordGeneratorParameters;
import pl.umcs.passwordgeneratorapi.PasswordGeneratorService;

import java.util.List;
import java.util.Random;

public class PasswordGeneratorImplementation implements PasswordGeneratorService {

    private static final Random RANDOM = new Random();
    private static String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public String generate(PasswordGeneratorParameters passwordGeneratorParameters) {
        String generatedPassword = new String();
        for (int i = 0; i < passwordGeneratorParameters.getPasswordLength(); i++) {
            generatedPassword += (LOWERCASE_ALPHABET.charAt(RANDOM.nextInt(LOWERCASE_ALPHABET.length())));
        }
        return generatedPassword;
    }

    public List<String> generate(PasswordGeneratorParameters passwordGeneratorParameters, int count) {
        return null;
    }
}
