package web.models;

public class Car {

    private String carModel;

    private String modelName;

    private int year;

    public Car() {
    }

    public Car(String carModel, String modelName, int year) {
        this.carModel = carModel;
        this.modelName = modelName;
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", modelName='" + modelName + '\'' +
                ", year=" + year +
                '}';
    }
}
