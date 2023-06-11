// ***List,Map(dictionary in java)***
import java.util.*;;

public class Collection{
    public static void main(String[] args) {
       ArrayList <String>arr=new ArrayList<>();
        arr.add("amith");
        arr.add("fadfah");
    //     arr.add("dda");
    //     arr.add("vaseith");
    //     // arr.clear();
    //     arr.remove("dda");
    //     System.out.println(arr.size());
    //     System.out.println(arr.contains("amith"));

    //     System.out.println(arr);
    List<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(1);
    System.out.println(list);
    // Map key value collection similar to dictionary
    Map<String,String>dic=new HashMap<>();
    dic.put("amith","genious");
    dic.put("aamith","genious");
    // System.out.println(dic.isEmpty());
    // dic.clear();
    // System.out.println(dic.containsKey("amith"));
//  System.out.println(dic.keySet().toArray(new String[0]));

    // System.out.println(dic);
    HashMap<String,Double>dic_Item=new HashMap<>();
    dic_Item=new HashMap<>();
        dic_Item.put("Rice 1kg",20.00);
        dic_Item.put("Wheat 1kg",30.00);
        dic_Item.put("Onion 1kg",20.00);
        dic_Item.put("Tomato 1kg",120.00);
        dic_Item.put("Lays 1pac",20.00);
        // System.out.println(dic_Item);
       Object[] ar=dic_Item.keySet().toArray();
       for(Object val:ar)
       {
        System.out.println(val);
       }

    }
}