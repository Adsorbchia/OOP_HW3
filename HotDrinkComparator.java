package seminar3.hw;

import java.util.Comparator;

public class HotDrinkComparator implements Comparator<HotDrink> {
    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
