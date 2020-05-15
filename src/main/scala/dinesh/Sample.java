package dinesh;

import java.util.ArrayList;
import java.util.List;

public class Sample {
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
        //System.out.println(number);
      Timeit.code(() ->  System.out.println(number.parallelStream()
              //.Stream()
                .filter(e -> e%2==0)
                .mapToInt(Sample::compute )
                .sum()));

    }
public static int compute(int number){
        try {
            Thread.sleep(1000);
        }catch (Exception e){}
        return number*2;
}

}
