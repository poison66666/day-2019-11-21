import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = f1 + f2;
        while(true){
            if(f1 == n){
                System.out.println(0);
            }
            else if(n > f1 && n <= f2){
                if(Math.abs(f2-n)>Math.abs(f1-n)){
                    System.out.println(Math.abs(f1-n));
                }else{
                    System.out.println(Math.abs(f2-n));
                }
                break;
            }
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}
