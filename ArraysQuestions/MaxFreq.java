import java.util.*;
public class MaxFreq {
    static void MaxFreq(int arr[]){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i]))
             map.put(arr[i], map.get(arr[i])+1);
            else map.put(arr[i], 1);
        }
        int max =0;
        int element = -1;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                element = key;
            }
        }
        System.out.println("Element "+element+" has max frequency which is : "+max);
        
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int[] num;
        num = new int[n];
        System.out.println("Enter Elements : ");
         for(int i =0; i< num.length; i++){
            num[i] = sc.nextInt();
         }
         System.out.println();
         MaxFreq(num);
         sc.close();
    }
}
