package seminars.six;
import java.util.Arrays;
import java.util.List;

import static seminars.six.CalculateAverage.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        String result = compareAverage(average1,average2);
        System.out.println(result);
    }
}
