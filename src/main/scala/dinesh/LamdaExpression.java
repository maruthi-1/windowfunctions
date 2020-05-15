package dinesh;

import java.util.ArrayList;

import java.util.*;

public class LamdaExpression {

    public static void main(String[] args) {
            List<Integer> number= new ArrayList<Integer>();
            number.add(1);
            number.add(2);
            number.add(3);
            number.add(4);
            number.add(5);
            number.add(6);
            number.add(7);
            number.add(8);
            number.add(9);
            number.add(10);
            System.out.println(number);
number.forEach((Integer Value)->System.out.println(Value));
        number.forEach((Value)->System.out.println(Value));
        System.out.println(number.stream()
                .filter(e -> e%2==0)
                .mapToInt(e ->e * 2)
                .reduce(0,Integer::sum));

        }
    }


