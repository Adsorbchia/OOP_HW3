package seminar3.hw;

public class Tea extends HotDrink {
    public Tea(String name, Integer temperature, Integer volume, Double price) {
        super(name, temperature, volume, price);
    }

    @Override
    public String toString() {
        return "Tea" +" "+  name  +
                " "+  "temperature =" + temperature + " "+
                "volume =" + volume +" " +
                "price =" + price;
    }
}
