import java.util.HashSet;
import java.util.Scanner;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}



class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;   
    }


 

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }


    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }

}




class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }


    public double getPay() { return pay; }
    public void setPay(double pay) { this.pay = pay; }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}


public class Problem2 {
    public static void main(String[] args) {

        HashSet<Person> users = new HashSet<>();


        // Person a = new Person("Alibe", "al farbi 64");
        // Person b = new Person("sdfdsf", "al dfsdf 64");
        // Person c = new Person("wfewe", "al farbi 64");
        // Person d = new Person("sdfw", "al farbi 64");
        // Person e = new Person("wfwe", "al farbi 6334");

        // System.out.println(a);

        // users.add(a.toString());
        // users.add(b.toString());
        // users.add(c.toString());
        // users.add(d.toString());





        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Print all users, 2 - Add user, press any number - quit\n");
            int cmd = Integer.parseInt(sc.nextLine().trim());

            if (cmd == 1) {
                if (users.isEmpty()) {
                    System.out.println("users hashset is empty");
                } else {
                    users.forEach(System.out::println);
                }
            } else if (cmd == 2) {
                System.out.println("Select a type of user you want to add\n");
                System.out.println("1 - Person, 2 - Student, 3 - Staff\n");

                int type = Integer.parseInt(sc.nextLine().trim());
                
                System.out.println("Name: ");
                String name = sc.nextLine();

                System.out.println("Address: ");
                String address = sc.nextLine();

                if (type == 1) {
                    Person type1 = new Person(name, address);
                    users.add(type1);
                } else if (type == 2) {
                    System.out.println("Program: ");
                    String program = sc.nextLine();

                    System.out.println("Year: ");
                    int year = Integer.parseInt(sc.nextLine().trim());

                    System.out.print("Fee: ");
                    double fee = Double.parseDouble(sc.nextLine().trim());

                    Person type2 = new Student(name, address, program, year, fee);
                    users.add(type2);
                } else if (type == 3) {
                    System.out.println("School: ");
                    String school = sc.nextLine();

                    System.out.println("Pay: ");
                    double fee = Double.parseDouble(sc.nextLine().trim());

                    Person type3 = new Staff(name, address, school, fee);
                    users.add(type3);
                } else {
                    System.out.println("Unknown type of user");
                }

                System.out.println("Added successfully!");

            } else {
                break;
            }

            

        }

        sc.close();



    }
}

