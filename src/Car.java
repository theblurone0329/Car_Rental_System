public class Car {

    private String brand;
    private String model;
    private String plate;
    private String year;
    private String seat;
    private String price;
    
    Car(String brand, String model, String plate, String year, String seat, String price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.seat = seat;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public String getYear() {
        return year;
    }

    public String getSeat() {
        return seat;
    }

    public String getPrice() {
        return price;
    }
}
