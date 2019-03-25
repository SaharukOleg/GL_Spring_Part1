package study.basecamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import study.basecamp.NumberGenerator;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();
    @Value("${maxNumber}")
    private int maxNumber;

    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

}
