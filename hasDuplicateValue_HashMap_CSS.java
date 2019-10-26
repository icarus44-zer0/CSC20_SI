// https://www.codestepbystep.com/problem/view/java/collections/map/hasDuplicateValue
// Josh Poe 2019
// 

public static boolean hasDuplicateValue (Map<String,String> map){

    Collection<String> list = new ArrayList<String>();
     list = map.values();
     
     Set<String> set = new HashSet<String>(list);
    
     if(set.size() < list.size())
         return true;
    else 
        return false;
}

