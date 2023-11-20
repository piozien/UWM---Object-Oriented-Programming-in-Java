package pl.edu.uwm.zad21;
class Intern extends Employee{
    private double intershipLength;

    public Intern(String name, String department, double salary, double intershipLength) {
        super(name, department, salary);
        this.intershipLength = intershipLength;
    }

    public double getIntershipLength() {
        return intershipLength;
    }

    public void setIntershipLength(double intershipLength) {
        this.intershipLength = intershipLength;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Intern intern = (Intern) o;

        return Double.compare(intershipLength, intern.intershipLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(intershipLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
