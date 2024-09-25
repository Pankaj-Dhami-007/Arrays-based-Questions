import java.util.*;
public class TwoNoSum {
    static boolean pairSum(int arr[], int targetSum){
        //int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            int complement = targetSum-num;
            if(set.contains(num)){
                System.out.println("Pair found : ("+num+", "+complement+")");
                return true;
            }
            else{
                set.add(complement);
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {10, 15, 3, 7};
        int targetSum = 17;
        if (pairSum(arr, targetSum)) {
            System.out.println("Pair exists ");
        }
        else{
            System.out.println("Not exists");
        }
    }
}
