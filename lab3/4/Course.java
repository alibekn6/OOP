public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(String name, String description, int credits, String prerequisite) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', description='" + description +
                "', credits=" + credits + ", prerequisite='" + prerequisite + "'}";
    }
}
