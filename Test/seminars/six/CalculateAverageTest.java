package seminars.six;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAverageTest {
    @Test
    void testCalculateAverage() {
        List<Integer> inputList = List.of(5);
        double expectedAverage = 5.0;
        double actualAverage = CalculateAverage.calculateAverage(inputList);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void testCompareAverage() {

        double average1 = 5.0;
        double average2 = 6.0;
        String expectedResult = "Второй список имеет большее среднее значение";
        String actualResult = CalculateAverage.compareAverage(average1, average2);

        assertEquals(expectedResult, actualResult);
    }
}