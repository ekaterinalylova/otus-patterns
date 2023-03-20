package otus.patterns.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static otus.patterns.homework.Quadratic.solve;

public class QuadraticTest {

    @Test
    public void solutionNotExists() {
        double[] actual = solve(1, 0, 1);

        assertEquals(0, actual.length);
    }

    @Test
    public void twoSolutionsExists() {
        double[] actual = solve(1, 0, -1);
        double[] expected = {1, -1};

        assertThat(List.of(actual), containsInAnyOrder(expected));
    }

}
