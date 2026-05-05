package Array_lista_9;

import java.util.Scanner;

public class at_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidades de numeros que vc quer digitar");
        int num;
        int maior=0;
        int menor=0;

        num = sc.nextInt();
        int[] vert=new int[num];
        System.out.println("agora vamos diser qual o maior e o menor");
        for (int i=0;i<num;i++){
            vert[i]= sc.nextInt();
            menor=vert[0];
            if (vert[i]>maior) {
                maior=vert[i];
            }
            if (vert[i]<menor){
                menor=vert[i];
            }
        }
        System.out.println("O numero maior e: " +maior);
        System.out.println("O numero menor e: "+menor);
        sc.close();
    }
}
