package VehicleCatalogue;

public class Car {
    String type;
    String model;
    String color;
    int horsepower;

    public Car (String type, String model, String color, int horsepower) {
        this.type = "Car";
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
