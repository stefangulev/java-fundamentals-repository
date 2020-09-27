package VehicleCatalogue;

public class VehicleCatalogue {
    String type;
    String model;
    String color;
    int horsePower;

    public VehicleCatalogue (String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
