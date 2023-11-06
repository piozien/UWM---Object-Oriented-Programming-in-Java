package pl.travel.akt;

class Vacation {
    private String location;
    private double cost;

    public Vacation(String location, double cost){
        this.location = location;
        if(cost < 0){
            this.cost = 15.5;
        }
        else{
            this.cost = cost;
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setCost(double cost) {
        this.cost = cost >= 0 ? cost : this.cost;
        }


    public double getCost() {
        return cost;
    }
}
