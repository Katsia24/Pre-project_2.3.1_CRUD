package web.model;

public class Car {
    private String model;
    private int year;
    private String madeInCountry;

    public Car() {
    }

    public Car(String model, int year, String madeInCountry) {
        this.model = model;
        this.year = year;
        this.madeInCountry = madeInCountry;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.madeInCountry = madeInCountry;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", madeInCountry='" + madeInCountry + '\'' +
                '}';
    }

}
