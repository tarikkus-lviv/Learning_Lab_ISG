package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenStream {
    public static void main(String[] args) {
//        1 method
//        List<Integer> numbers = Arrays.asList(1, 2, 12, 45, 64, 65, 65, 75);

//        2method
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 150; i ++) {
            numbers.add(i);
        }
//        numbers.add(3);
//        numbers.add(56);
//        numbers.add(4);
//        numbers.add(18);

        List<Integer> filtered = numbers.stream().filter(num -> num%2==0)
                .limit(15)
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
