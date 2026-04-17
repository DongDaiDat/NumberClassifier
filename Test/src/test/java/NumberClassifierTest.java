import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
void testMorePositives() {
    int[] input = {1, 2, -1};
    assertEquals("More positives", NumberClassifier.classify(input));
}

@Test
void testMoreNegatives() {
    int[] input = {-1, -2, 1};
    assertEquals("More negatives", NumberClassifier.classify(input));
}

@Test
void testEqual() {
    int[] input = {1, -1};
    assertEquals("Equal", NumberClassifier.classify(input));
}
    @Test
void testAllPositive() {
    int[] input = {1, 2, 3};
    assertEquals("More positives", NumberClassifier.classify(input));
}

@Test
void testAllNegative() {
    int[] input = {-1, -2, -3};
    assertEquals("More negatives", NumberClassifier.classify(input));
}

@Test
void testEmptyArray() {
    int[] input = {};
    assertEquals("Equal", NumberClassifier.classify(input));
}
}
