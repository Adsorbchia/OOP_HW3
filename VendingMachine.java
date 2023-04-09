package seminar3.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    protected List<HotDrink> hotDrinkList;

    public VendingMachine() {
        this.hotDrinkList = new ArrayList<>();

    }

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }
public void addHotDrinks(HotDrink item){
        hotDrinkList.add(item);
}

public void sortHotDrinks(HotDrinkComparator hotDrinkComparator){
    Collections.sort(hotDrinkList,hotDrinkComparator);
}


    }

