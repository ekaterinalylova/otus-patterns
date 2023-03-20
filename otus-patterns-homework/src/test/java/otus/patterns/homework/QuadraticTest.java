package otus.patterns.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static otus.patterns.homework.Quadratic.solve;

public class QuadraticTest {

    @Test
    public void solutionNotExists() {
        assertEquals(0, solve(1, 0, 1).length);
    }

}
