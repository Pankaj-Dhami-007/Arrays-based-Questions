public class FindSubArray {
    static void print(int arr[]){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(arr[j]+" ");
            }
           System.out.println(); 
        }
    }
    static int findMaxSum(int arr[]){
        int n = arr.length;
        int sum =0;
        int maxSum =0;
        for(int i =0; i<n; i++){
            for(int j = i; j<n; j++){
            
                //System.out.print(arr[j]+" ");
                for(int k =i; k<=j; k++){
                    sum+= arr[k];
                }
                if(sum > maxSum){
                      maxSum = sum;
                }
                sum =0;
            }
            
        }
        return maxSum;
    }
    static void subArr(int arr[]) throws InterruptedException{
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i; j<n; j++){
                Thread.sleep(100);
                //System.out.print(arr[j]+" ");
                for(int k =i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            
        }
    }
    public static void main(String[] args){
        int num[] = {1, 2, 3, 4, 5};
        try {
            subArr(num); 
        } catch (Exception e) {
            // TODO: handle exception
        }
       System.out.println("Max sum is : "+findMaxSum(num)); 
       print(num);
    }
}
