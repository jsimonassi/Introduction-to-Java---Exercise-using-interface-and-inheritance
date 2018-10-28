package formas;

import java.util.Scanner;

public class Front {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int lado1, lado2, raio;
        
        System.out.println("Quantas formas você deseja inserir? ");
        int tam = teclado.nextInt();
        Object[] vet = new Object[tam];
        
        for(int i = 0; i < tam; i++){
            System.out.println("\nQuadrado-----[1]\n");
            System.out.println("\nRetangulo----[2]\n");
            System.out.println("\nCírculo------[3]\n");
            int op = teclado.nextInt();
            
            if (op == 1){
                System.out.println("Informe o tamanho inteiro do lado:");
                lado1 = teclado.nextInt();
                Quadrado novo = new Quadrado(lado1);
                vet[i] = novo;
            }
            
            else if (op == 2){
                System.out.println("Informe o tamanho inteiro da base:");
                lado1 = teclado.nextInt();
                System.out.println("Informe o tamanho inteiro da altura:");
                lado2 = teclado.nextInt();
                Retangulo novo = new Retangulo(lado1, lado2);
                vet[i] = novo;
            }
            
            else if(op == 3){
                System.out.println("Informe o tamanho inteiro do raio:");
                raio = teclado.nextInt();
                Circulo novo = new Circulo(raio);
                vet[i] = novo;
            }
        }
        
        for(int i = 0; i < tam; i++)
            System.out.println(vet[i]);
    }
    
}
