package Array_lista_9;

import java.util.Scanner;

public class at_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidades de numeros que vc quer digitar");
        int num =sc.nextInt();
        int[] vert=new int[num];
        int i=0;
        System.out.println("Diremos a ordem inversa dos números que você digitar");
        for (;i<num;i++){
            vert[i]=sc.nextInt();
            if (i+1==num){
                System.out.println("A ordem inversa é:");
            }
            if (i+1==num){
                for (;i>=0;i--){
                    System.out.println(vert[i]);
                }break;
            }
        }
        sc.close();
        }
    }
