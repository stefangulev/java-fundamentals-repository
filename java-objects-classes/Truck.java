package VehicleCatalogue;

public class Truck {
    String type;
    String model;
    String color;
    int horsepower;

    public Truck (String type, String model, String color, int horsepower) {
        this.type = "Truck";
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return  this.color;
    }

    public Integer getHorsePower() {
        return this.horsepower;
    }
    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", this.type, this.model, this.color, this.horsepower);
    }
}

