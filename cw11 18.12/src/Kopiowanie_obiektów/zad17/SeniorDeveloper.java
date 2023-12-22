package Kopiowanie_obiektów.zad17;

public class SeniorDeveloper extends Developer implements Cloneable{
    private double bonus;

    public SeniorDeveloper(String name, int age, double salary, double bonus) throws CloneNotSupportedException {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + bonus + ".";
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public SeniorDeveloper clone() throws CloneNotSupportedException {
        return (SeniorDeveloper) super.clone();
    }
}
