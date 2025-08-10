import java.util.*;

class ARRAY01{
    public static void main(String args []){
        // System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers = new int[n];
    System.out.println("ENter eleme]nts:");
    for(int i = 0; i<n;i++){
        numbers[i]=sc.nextInt();
    }
    for(int i =0;i<n;i++){
        System.out.print(numbers[i]);
    }

    }
}