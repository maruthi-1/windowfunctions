package dinesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private  int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Comparable1{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop lap) {
        if (this.getRam()>lap.getRam())
        return 1;
        else
            return -1;
    }
}
public class Comparable1 {
     public static void main(String[] args) {

         List<String> laps=new ArrayList<>();
//         laps.add(new Laptop("dell",4,3000));
//         laps.add(new Laptop("appl",2,6000));
//         laps.add(new Laptop("hp",6,5000));


         laps.add("sjadgask");
         laps.add("dfah");
         laps.add("sjadgask");
         laps.add("dfah"); laps.add("sjadgask");
         laps.add("dfah"); laps.add("sjadgask");
         laps.add("dfah"); laps.add("sjadgask");
         laps.add("dfah"); laps.add("sjadgask");
         laps.add("dfah");



         Collections.sort(laps);
         for (String l: laps){
             System.out.println(l);
         }

     }

}
