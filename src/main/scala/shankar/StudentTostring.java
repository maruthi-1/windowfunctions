package shankar;

public class StudentTostring {

    int rollno;
    String name;
    String city;

    StudentTostring(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public static void main(String args[]){
        StudentTostring s1=new StudentTostring(101,"Raj","lucknow");
        StudentTostring s2=new StudentTostring(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }


    public String toString(){//overriding the toString() method
        return rollno+" "+name+" "+city;
    }
}
