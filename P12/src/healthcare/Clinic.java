package healthcare;

import java.util.Objects;

public class Clinic extends Hospital {
    private String specjalization;
    private int doctors;

    public Clinic(String name, String address, int patients, String specjalization, int doctors) {
        super(name, address, patients);
        this.specjalization = specjalization == null || specjalization.isEmpty() ? "general" : specjalization;
        this.doctors = doctors < 0 ? 20: doctors;
    }

    public String getSpecjalization() {
        return specjalization;
    }

    public void setSpecjalization(String specjalization) {
        if(!specjalization.isEmpty() || specjalization != null){
            this.specjalization = specjalization;
        }
    }

    public int getDoctors() {
        return doctors;
    }

    public void setDoctors(int doctors) {
        if (doctors > 0) {
            this.doctors = doctors;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": Name: " + super.getName() + ". Address: " + super.getAddress() +". Number of patients: " + super.getPatients()+". Specjalization: " + specjalization+". Number of doctors: " + doctors+".";
    }

    @Override
    public void admitPatient(int add) {
        super.admitPatient(add);
        if(super.getPatients() > 500){
            super.setPatients(500);
        }
        doctors+=20;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clinic clinic)) return false;
        if (!super.equals(o)) return false;


        if (doctors != clinic.doctors) return false;
        return Objects.equals(specjalization, clinic.specjalization);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + specjalization.hashCode();
        result = 31 * result + doctors;
        return result;
    }

}
