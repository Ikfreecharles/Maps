import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
         students.put("Charles", "Nigeria");
         students.put("Izabela", "Poland");
         students.put("Chibuikem", "Nigeria");
         students.put("Tomiwa", "Nigeria");
         students.put("Nicholas", "Zimbabwe");

         //Print to the console the country of any of your classmates
         System.out.println(students.get("Charles"));

         System.out.println("\n***********************************************\n");

         //Print all map entries
         for (Map.Entry<String, String> eachStudent: students.entrySet()) {
            System.out.println(eachStudent.getKey() + ": " + eachStudent.getValue());
         }

         System.out.println("\n***********************************************\n");

         //Print all unique country names
         ArrayList<String> uniqueCountries =  new ArrayList<>();

         for (Map.Entry<String, String> everyStudent: students.entrySet()) {
            if(!uniqueCountries.contains(everyStudent.getValue())){
                uniqueCountries.add(everyStudent.getValue());
            }
         }
         for (String uniqueCountry: uniqueCountries) {
            System.out.println(uniqueCountry);
         }
    }
}
