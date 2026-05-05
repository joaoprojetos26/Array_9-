package Array_lista_9;

import java.util.Locale;
import java.util.Scanner;

public class at_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidades de numeros que vc quer digitar");
        int num =sc.nextInt();
        int[] vert=new int[num];
        for (int i=0;i<num;i++){
            vert[i]= sc.nextInt();
        }
        System.out.println("os numeros digitados foram");
        for (int i=0;i<num;i++){
            System.out.println(vert[i]);
        }
        sc.close();
    }
}
