import java.util.Scanner;

public class Three {
    static void Selection(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minidx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Selection(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println("\nEnter the kth index");
        int k = sc.nextInt();
        System.out.println(arr[k-1]);
    }
}
