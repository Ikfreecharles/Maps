import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {
    public static void main(String[] args) {
//        var employees = new HashMap<String, String>();
//
//        employees.put("a1234", "Steve Jobs");
//        employees.put("a1235", "Bill Gates");
//        employees.put("a1236", "Jeff Bezos");
//        employees.put("a1237", "Larry Page");
//        employees.put("a1238", "Sergey Brinn");
//
////        for (Map.Entry<String, String> employee: employees.entrySet()) {
////            System.out.println("The employee id is " + employee.getKey() + " & employee name is " + employee.getValue());
////        }

//        System.out.println(employees.get(employee("a1236")));

        var employees2 = new TreeMap<String, String>();
        employees2.put("a1234", "Steve Jobs");
        employees2.put("a1235", "Bill Gates");
        employees2.put("a1236", "Jeff Bezos");
        employees2.put("a1237", "Larry Page");
        employees2.put("a1238", "Sergey Brinn");

        for (Map.Entry<String, String> employee: employees2.entrySet()) {
            System.out.println("The employee id is " + employee.getKey() + " & employee name is " + employee.getValue());
        }

        System.out.println(employees2.get(employee("A1234")));
    }
    protected static String employee (String key){
        return key.toLowerCase();
    }
}
