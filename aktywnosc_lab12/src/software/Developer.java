package software;

public class Developer implements Cloneable{
    private String name;
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, String programmingLanguage, int projectsCompleted) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
    }

    public int getProjectsCompleted() {
        return projectsCompleted;
    }

    public void setProjectsCompleted(int projectsCompleted) {
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    protected Developer clone() throws CloneNotSupportedException {
        return (Developer) super.clone();
    }
}
