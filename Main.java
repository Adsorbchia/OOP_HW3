package seminar3.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine= new VendingMachine();
        vendingMachine.addHotDrinks(new Coffee("капучино", 70,100,155.5));
        vendingMachine.addHotDrinks(new Coffee("латте", 70,100,185.5));
        vendingMachine.addHotDrinks(new Coffee("раф", 70,100,175.5));
        vendingMachine.addHotDrinks(new Coffee("капучино", 70,200,200.5));
        vendingMachine.addHotDrinks(new Coffee("раф", 70,200,255.5));
        vendingMachine.addHotDrinks(new Coffee("латте", 70,200,275.5));
        vendingMachine.addHotDrinks(new Coffee("латте", 70,300,355.5));
        vendingMachine.addHotDrinks(new Coffee("капучино", 70,300,255.5));
        vendingMachine.addHotDrinks(new Tea("черный чай ", 80,100,70.5));
        vendingMachine.addHotDrinks(new Tea("зеленый чай", 75,100,71.5));
        vendingMachine.addHotDrinks(new Tea("черный чай ", 80,200,155.5));
        List<HotDrink> result = vendingMachine.getHotDrinkList();
        Iterator<HotDrink> iterator =result.iterator();
        while (iterator.hasNext()){
            HotDrink el = iterator.next();
            System.out.println(el);}
        System.out.println("-----------------");
        vendingMachine.sortHotDrinks(new HotDrinkComparator());
        result=vendingMachine.getHotDrinkList();
        Iterator<HotDrink> iterator2 =result.iterator();
        while (iterator2.hasNext()){
            HotDrink el = iterator2.next();
            System.out.println(el);}
    }
}
