import java.util.HashMap;
import java.lang.String;

public class hashmap_m {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "KIT ");
        hm.put(2, "KIT 2 ");
        hm.put(3, "KIT 3 ");
        hm.put(4, "KIT 4 ");

        System.out.println(hm.containsKey(1));

        String msg = "hello";

        for (int k : hm.keySet()) {
            msg = hm.compute(k, (key, val) -> {
                return val + "hello world";
            });
        }
        System.out.println(msg);
        System.out.println(hm);
    }

}
