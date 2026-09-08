import java.util.Scanner;
public class sum{
    static int sumOfArray(int[]arr){
        int i,sum=0;
        for(i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[]arr = new int[n];

        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum is : "+sumOfArray(arr));
    }
}
