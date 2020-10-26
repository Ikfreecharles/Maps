import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> toyotaPrices = new ArrayList<>();
        toyotaPrices.add(15000);
        toyotaPrices.add(20000);
        toyotaPrices.add(18000);
        int toyotaAvPrice = averagePrice(toyotaPrices);

        var toyota = cars("Toyota", toyotaAvPrice);
        System.out.println(toyota.keySet() + ": " + toyota.get("Toyota"));

        ArrayList<Integer> bmwPrices = new ArrayList<>();
        bmwPrices.add(23000);
        bmwPrices.add(23000);
        bmwPrices.add(50000);
        int bmwAvPrice = averagePrice(bmwPrices);

        var bmw = cars("BMW", bmwAvPrice);
        System.out.println(bmw.keySet() + ": "  + bmw.get("BMW"));
    }

    //method to map car to its average price
    protected static Map<String, Integer> cars (String carName, int avPrice){
        var cars = new HashMap<String, Integer>();
        cars.put(carName, avPrice);
        return cars;
    }

    //method to calculate average price from an ArrayList of prices
    protected static int averagePrice(ArrayList<Integer> price){
        int avPrice = 0;
        for(int eachPrice: price){
            avPrice += eachPrice;
        }
        return avPrice/price.size();
    }
}
