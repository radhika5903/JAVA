import java.util.Scanner;

public class loops {
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a<=n);
;    }
}
