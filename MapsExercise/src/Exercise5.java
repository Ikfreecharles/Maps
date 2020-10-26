import java.util.Map;
import java.util.TreeMap;

public class Exercise5 {
    public static void main(String[] args) {
        printLn(yourOptions(6.40, pizzaMenu()));
    }
    //Pizza Menu
    private static Map<String, Double> pizzaMenu (){
        var pizzaMenu = new TreeMap<String, Double>();
        pizzaMenu.put("Banana Pizza", 5.0);
        pizzaMenu.put("Schinken Pizza", 4.20);
        pizzaMenu.put("Ham Pizza", 6.50);
        pizzaMenu.put("Italian Special Pizza", 9.25);
        return pizzaMenu;
    }
    //Check which pizza you can afford
    protected static Map<String, Double> yourOptions (double wallet, Map<String, Double> menu){
        var affordablePizza = new TreeMap<String, Double>();
        for (Map.Entry<String, Double> eachMenu: menu.entrySet()) {
            if(wallet >= eachMenu.getValue()){
                affordablePizza.put(eachMenu.getKey(), eachMenu.getValue());
            }
        }
        return affordablePizza;
    }
    //Method to print out pizza you can afford
    protected static void printLn(Map<String, Double> menu){
        System.out.println("Below is a list of pizza you can afford");
        for (Map.Entry<String, Double> iterator: menu.entrySet()) {
            System.out.println(iterator.getKey() + ": " + iterator.getValue());
        }
    }
}
