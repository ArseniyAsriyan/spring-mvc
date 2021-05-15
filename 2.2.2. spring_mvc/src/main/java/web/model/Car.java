package web.model;


public class Car {
    private String model;
    private String engine;
    private String series;

    public Car() {

    }

    public Car(String model, String engine, String series) {
        this.model = model;
        this.engine = engine;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
