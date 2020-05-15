package dinesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop1 {
    private String brand;
    private int ram;
    private  int price;

    public Laptop1(String brand, int ram, int price) {
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


}
public class Comparator1{
    public static void main(String[] args) {

        List<Laptop1> laps=new ArrayList<>();
        laps.add(new Laptop1("dell",4,3000));
        laps.add(new Laptop1("appl",2,6000));
        laps.add(new Laptop1("hp",6,5000));

       Comparator<Laptop1> com=new Comparator<Laptop1>() {


            public int compare(Laptop1 l1, Laptop1 l2) {
                if (l1.getRam()>l2.getRam())
                return 1;
                else
                    return -1;
            }
        };


        Collections.sort(laps,com);
        for (Laptop1 l: laps){
            System.out.println(l);
        }

    }

}
