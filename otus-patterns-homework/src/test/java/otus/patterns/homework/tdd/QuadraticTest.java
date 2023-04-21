package otus.patterns.homework.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static otus.patterns.homework.tdd.Quadratic.solve;

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

    @Test
    public void oneSolutionExists() {
        double[] actual = solve(1, 2, 1);
        double[] expected = {-1};

        assertThat(List.of(actual), containsInAnyOrder(expected));
    }

    @Test
    public void firstCoefficientIsZero() {
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> solve(0, 1, 1));

        String expectedMessage = "parameter [a] must not be zero";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void discriminantIsZero() {
        double[] actual = solve(1, 2 * Double.MIN_VALUE, Double.MIN_VALUE);
        double[] expected = {-Double.MIN_VALUE};

        assertThat(List.of(actual), containsInAnyOrder(expected));
    }
}
