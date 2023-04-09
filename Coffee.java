package seminar3.hw;

public class Coffee extends HotDrink{
    public Coffee(String name, Integer temperature, Integer volume, Double price) {
        super(name, temperature, volume, price);
    }

    @Override
    public String toString() {
        return "Coffee" +" " + name + " " +
                "temperature=" + temperature +" "+
                "volume=" + volume + " "+
                "price=" + price;
    }
}
