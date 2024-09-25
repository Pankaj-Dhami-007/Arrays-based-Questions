public class MissingNo {
    static int findMissingNo(int arr[]){
        int n = arr.length+1;
        int totalSum= n*(n+1)/2;
        
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        //System.out.println(newArray.length);
        return totalSum - sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        System.out.println("Missing no is : "+findMissingNo(arr));
        
    }
}
