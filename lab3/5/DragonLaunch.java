import java.util.ArrayList;

public class DragonLaunch {
    private ArrayList<Person> line = new ArrayList<>();

    public void kidnap(Person p) {
        line.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boys = 0;
        int girls = 0;

        for (int i = 0; i < line.size(); i++) {
            if (line.get(i).getGender() == Gender.BOY) {
                boys++;
            } else {
                if (boys > 0) {
                    boys--;
                } else {
                    girls++;
                }
            }
        }

        int remaining = boys + girls;

        if (remaining == 0) {
            System.out.println("No one left! Dragon will NOT eat.");
            return false;
        } else {
            System.out.println(remaining + " left. Dragon WILL eat!");
            return true;
        }
    }

    public void printLine() {
        System.out.print("Line: ");
        for (int i = 0; i < line.size(); i++) {
            System.out.print(line.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Test 1: BBGG ===");
        DragonLaunch dl1 = new DragonLaunch();
        dl1.kidnap(new Person("Jee", Gender.BOY));
        dl1.kidnap(new Person("Alibek", Gender.BOY));
        dl1.kidnap(new Person("GOGOOG", Gender.GIRL));
        dl1.kidnap(new Person("akll", Gender.GIRL));
        dl1.printLine();
        dl1.willDragonEatOrNot();

        System.out.println();
        System.out.println("=== Test 2: GBGB ===");
        DragonLaunch dl2 = new DragonLaunch();
        dl2.kidnap(new Person("RKF", Gender.GIRL));
        dl2.kidnap(new Person("FRNF", Gender.BOY));
        dl2.kidnap(new Person("wferf", Gender.GIRL));
        dl2.kidnap(new Person("WNRf", Gender.BOY));
        dl2.printLine();
        dl2.willDragonEatOrNot();

        System.out.println();
        System.out.println("=== Test 3: BG ===");
        DragonLaunch dl3 = new DragonLaunch();
        dl3.kidnap(new Person("TEFKneom", Gender.BOY));
        dl3.kidnap(new Person("VLvl", Gender.GIRL));
        dl3.printLine();
        dl3.willDragonEatOrNot();

        System.out.println();
        System.out.println("=== Test 4: BGBG ===");
        DragonLaunch dl4 = new DragonLaunch();
        dl4.kidnap(new Person("TIma", Gender.BOY));
        dl4.kidnap(new Person("Damir", Gender.GIRL));
        dl4.kidnap(new Person("Broski", Gender.BOY));
        dl4.kidnap(new Person("alen", Gender.GIRL));
        dl4.printLine();
        dl4.willDragonEatOrNot();
    }
}
