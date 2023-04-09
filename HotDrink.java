package seminar3.hw;

public abstract class HotDrink {
    protected String name;
    protected Integer temperature;
    protected Integer volume;
    protected Double price;

    public HotDrink(String name, Integer temperature, Integer volume, Double price) {
        this.name = name;
        this.temperature = temperature;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
