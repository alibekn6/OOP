class Student {
    private String name; 
    private int id; 
    private int year;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.year = 1;
    }


    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }

    public int getId() {
        return this.id;
    }

    public void incr() {
        year++;
    }

}



class Main {
    public static void main(String[] args) {
        Student st1 = new Student("alice", 1234);

        System.out.println(st1.getName());

        st1.incr();
        System.out.println(st1.getYear());
        
    }
}