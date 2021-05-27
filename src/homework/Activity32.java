package homework;

import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ccao tam giac: ");
        int ccao = scanner.nextInt();
        for (int i = 1; i < ccao; i = i + 1) {
            for ( int j = ccao - 1; j >= i; j = j - 1) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k = k + 1){

                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

