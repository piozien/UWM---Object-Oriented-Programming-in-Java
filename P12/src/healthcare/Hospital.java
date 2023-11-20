package healthcare;

public class Hospital {
    private String name;
    private String address;
    private int patients;

    public Hospital(String name, String address, int patients) {
        this.name = name.isEmpty() || name == null ? "Centralny Szpital Kliniczny" : name;
        this.address = address.isEmpty() || address == null ? "ul. Zdrowia 100, 00-001 Warszawa" : address;
        this.patients = patients < 0 ? 200 : patients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() || name != null) {
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.isEmpty() && address != null) {
            this.address = address;
        }
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        if (patients > 0) {
            this.patients = patients;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Name: " + name + ". Addres: " + address + ". Number of patients: " + patients + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hospital hospital)) return false;

        if (patients != hospital.patients) return false;
        if (!name.equals(hospital.name)) return false;
        return address.equals(hospital.address);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + patients;
        return result;
    }

    public void admitPatient(int add) {
        patients += add;
        if (patients > 1000) {
            patients = 1000;
        }
    }
   public static void checkCapacity(Hospital obj){
       System.out.println("Current number of patients: " + obj.patients + ". The limit is still left: " + (1000 - obj.patients));
   }
}

