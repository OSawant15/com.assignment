import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> sortKeys = new ArrayList<Integer>();
        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(4,"Omkar");
        h1.put(6,"Rohan");
        h1.put(3,"Mike");
        h1.put(2,"John");
        h1.put(8,"Lance");
        for(Map.Entry<Integer, String> set :
        h1.entrySet()){
            sortKeys.add(set.getKey());
        }
        System.out.println("Sorted list is:");
        Collections.sort(sortKeys);
        for(Integer x : sortKeys){
            System.out.println("key:"+ x+ "," + "Value:"+ h1.get(x));
        }
    }
}