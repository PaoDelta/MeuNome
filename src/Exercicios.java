package PACKAGE_NAME;
public class Exercicios {
    public static void main(String[] args) {
        System.out.println("Exercicio a \n Imprimir numeros de 100 a 200");
        int[] array = new int[201];
        for (int i = 100; i <= 200; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Exercicio b \n Imprima a soma dos números pares de 1 até 1000.");
        int soma=0;
        int e = 2;
        while(e<=1000){
            soma =soma +e;
            e+=2;
        }
        System.out.println(soma);
        System.out.println("Exercicio c \n Imprima todos os múltiplos de 5, entre 1 e 100.");
        int o = 5;
        while(o<=100){
            System.out.println(o);
            o+=5;
        }
        System.out.println("Exercicio d \n  Imprima os fatoriais de 1 a 6.");
        int fatorial = 1;
        for (int n = 1; n <= 6; n++) {
            fatorial = n * fatorial;
            System.out.println(fatorial);
        }
        System.out.println("Exercicio e \n  Imprima os primeiros números da série de Fibonacci até passar de 50.");
        int[] numeros = new int[50];
        numeros[0]=0;
        numeros[1]=1;
        for(int i=2; i<50; i++)
        {
            numeros[i] = numeros[i-1] + numeros[i-2];
            System.out.print(", " + numeros[i]);
        }
        System.out.println("Exercicio f ");
        int x = 13;
        int y = 0;
        while( x !=1 ){
            if( x % 2 == 0){
                y = x/2;
            }else{
                y = 3*x+1;
            }
            System.out.println(y);
            x = y;
        }
    }
}
