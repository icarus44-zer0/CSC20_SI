// https://www.codestepbystep.com/problem/view/java/collections/map/reverse
// Josh Poe 2019 
// 


public static Map<String,Integer> reverse (Map<Integer,String> map){

    Collection<Integer> keys = new ArrayList<Integer>();
    Collection<String> vals = new ArrayList<String>();
    Map<String,Integer> map2 = new HashMap<String,Integer>();

     keys = map.keySet();
     vals = map.values();

    Iterator<Integer> itr = keys.iterator(); 
    Iterator<String> itr2 = vals.iterator(); 


     while(itr.hasNext()){
        map2.put(itr2.next(),itr.next());
      }

     return map2; 

 }
