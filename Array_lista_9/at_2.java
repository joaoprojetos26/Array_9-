package Array_lista_9;

import java.util.Scanner;

public class at_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int[] vert=new int[num];
        int soma=0;
        for (int i=0;i<num;i++){
            vert[i]= sc.nextInt();
            soma=vert[i]+soma;
        }
        System.out.println("soma total: " +soma);
        sc.close();
    }
}
