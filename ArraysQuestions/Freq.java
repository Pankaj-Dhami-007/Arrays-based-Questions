import java.util.*;
public class Freq {
    static void frequency(int arr[]){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i =0; i< arr.length; i++){
        if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
        else map.put(arr[i], 1);
    }

    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          System.out.println("Frequency of "+entry.getKey()+ " is "+entry.getValue());
    }
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 2, 3, 4, 4, 4, 5};
        frequency(num);
    }
}
