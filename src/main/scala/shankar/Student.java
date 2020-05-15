package shankar;


public class Student implements Comparable {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "";
    }

    public static void main(String[] args) {
        Student e1 = new Student("Adam", 45);
     Student e2 = new Student("Steve", 60);
        int retval = e1.compareTo(e2);

        switch(retval) {
            case -1: {
                System.out.println("The " + e2.getName() + " is older!");
                break;
            }

            case 1: {
                System.out.println("The " + e1.getName() + " is older!");
                break;
            }

            default:
                System.out.println("The two persons are of the same age!");

        }
    }


    public int compareTo(Student o) {
        if(this.age == o.age)
         return 0;
            else
                return this.age > o.age ? 1 : -1;
        }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
