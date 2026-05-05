package Array_lista_9;

import java.util.Scanner;

public class at_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidades de numeros que vc quer digitar");
        int num = sc.nextInt();
        int[] vert = new int[num];
        int i;
        for (i = 0; i < num; i++) {
            vert[i] = sc.nextInt();
        }
        System.out.println("Agora digite um outro número e diremos se ele está ou não na lista");
        int num1 = sc.nextInt();
        for (i = 0; i < num; i++){
            if (vert[i]==num1) {
                System.out.println("Está presente na lista");
                num1=0;
            } else {num1=1;}
        } if (num1!=0){
            System.out.println("Não está na lista");
        }
        sc.close();
    }
}
