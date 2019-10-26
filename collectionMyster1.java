import java.util.*;

public class collectionMyster1{

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("skate","board");
        map.put("drive","car");
        map.put("program","computer");
        map.put("play","computer");

        
        collectionMystery1(map);

    }




public static void collectionMystery1(HashMap<String, String> map) {
    HashMap<String, String> result = new HashMap<String, String>();
    for (String k : map.keySet()) {
        String v = map.get(k);
        if (k.charAt(0) <= v.charAt(0)) {
            result.put(k, v);
        } else {
            result.put(v, k);
        }
    }
    System.out.println(result);
}

}