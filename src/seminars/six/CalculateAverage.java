package seminars.six;

import java.util.List;

public class CalculateAverage {
    public static double calculateAverage(List<Integer> list){
        int sum = 0;
        for(int number: list){
            sum+= number;
        }
        return (double) sum / list.size();
    }
    public static String compareAverage(double average1, double average2) {
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}

