package education;

public class University extends School {
    private String type;
    private int studies;


    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        this.type = type.isEmpty() ? "university of technology" : type;
        this.studies = studies <= 0 ? 10 : studies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.isEmpty()) {
            this.type = type;
        }
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if (studies > 0) {
            this.studies = studies;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " Type: " + type +
                ". Number of fields of study: " + studies;
    }

    @Override
    public void recruitment(int arg) {
        super.recruitment(arg);
        this.studies += (int) (0.1 * getStudents());
    }

    @Override
    public boolean equals(Object obj) {
        University other = (University) obj;
        if (super.equals(obj)) {
            return this.studies == other.studies;
        }
        return false;
    }
}
