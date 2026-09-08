import java.util.Scanner;
public class ExamCalc{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total marks obtained:");
        double total=sc.nextInt();
        System.out.println("Enter maximum marks:");
        int max=sc.nextInt();
        double result=(total/max)*(100);
        System.out.printf("Percentage is %.2f",result);
    }
}

    
