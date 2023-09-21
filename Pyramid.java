import java.util.Scanner;
import java.lang.Math;
public class Pyramid {
    public static void main(String[] args){
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter number of lines: ");
            int num = myObj.nextInt();
            for(int i = 0; i < num; i++) {
                for(int k = 0; k < num-i; k++){
                    System.out.print("  ");
                }
                for(int k = 0; k < i; k++){
                    System.out.print((int)Math.pow(2,k) + " ");
                }
                System.out.print((int)Math.pow(2,i) + " ");
                for(int k = 0; k < i; k++){
                    System.out.print((int)Math.pow(2,i - k - 1) + " ");
                }
                for(int k = 0; k < num-i; k++){
                    System.out.print("  ");
                }
                System.out.println();
            }
    }
}
