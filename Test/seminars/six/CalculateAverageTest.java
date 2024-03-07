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
        double average3 = 7.0;
        double average4 = 7.0;
        double average5 = 9.0;
        double average6 = 8.0;
        String expectedResult = "Второй список имеет большее среднее значение";
        String expectedResult1 = "Средние значения равны";
        String expectedResult2 = "Первый список имеет большее среднее значение";
        
        String actualResult = CalculateAverage.compareAverage(average1, average2);
        String actualResult1 = CalculateAverage.compareAverage(average3, average4);
        String actualResult2 = CalculateAverage.compareAverage(average5, average6);

        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }
}
