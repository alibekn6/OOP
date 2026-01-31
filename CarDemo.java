class Car {
  private String name;
  private int age;


  Car(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String printInfo() {
    return this.name;
  }

}


public class CarDemo {

  public static void main(String[] args) {


    Car car1 = new Car("Car1", 12);
    System.out.println(car1.printInfo());


    System.out.println(car1.name);
    System.out.println(car1.age);

  }


}
