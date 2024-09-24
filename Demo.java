import java.util.Arrays;

class Demo
{
    static void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = 0; j < arr.length-i-1; j++) 
            {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void change(int i)
    {
        i=99;
    }
    public static void main(String[] args) {
        
        // Array : 
        
        // int arr[5];
        // int arr[]=new int[5];
        // int []arr1=new int[5];
        // int[] arr2=new int[5];

        // int arr3[]; // null 
        // arr3=new int[5]; // more flexible way


        // int arr[]={10,20,30,40,50};// initialization of 1D array 

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);

        // for (int i = 0; i < arr.length; i++) 
        // {
        //     System.out.println(arr[i]);
        // }

        // for (int element : arr) 
        // {
        //     System.out.println(element);
        // }

        // System.out.println(Arrays.toString(arr));

        // new int[]{10,20,30}; // this is also an array

        // System.out.println(Arrays.toString(new int[]{10,20,30}));

        // System.out.println(Arrays.binarySearch(arr, 30));
        int newArr[]=new int[10];
        for (int i = 0; i < newArr.length; i++) 
        {
            newArr[i]=(int)(10*Math.random()+1);
        }
        System.out.println("Before sort :"+Arrays.toString(newArr));
        // Arrays.sort(newArr);
        bubbleSort(newArr);
        System.out.println("After sorting :"+Arrays.toString(newArr));

        int i=10;
        change(i);
        System.out.println(i);// ?

        String countries[]={"india","america","australia"};
        // 3 country 4 states
        String states[][]={
            {"UP","MP","HR","Bihar"},
            {"NYC","Texas","San Fransisco","california"},
            {"Sydney","victoria","South Wales","melbourn"}
        };

        for (int row = 0; row < states.length; row++) 
        {
            for (int col = 0; col < states[row].length; col++) 
            {
                System.out.print("\t"+states[row][col]);
            }
            System.out.println();
        }

    }
}