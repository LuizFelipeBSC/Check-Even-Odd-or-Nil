import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Variaveis
        int x, y, z;//Tipo numerico
        
        boolean par;//Tipo logico
        boolean inpar;
        boolean nulo;
        
        System.out.printf("Informe o primeiro valor: ");
        x = ler.nextInt();
        System.out.printf("Informe o Segundo valor: ");
        y = ler.nextInt();

        System.out.println(z = x + y);
        
        //par = (x > 0) && ((x %  2) == 0);
        //inpar = (x > 0) && ((x % 2) != 0);
        //nulo = (x == 0);
        
        //par = (y > 0) && ((y %  2) == 0);
        //inpar = (y > 0) && ((y % 2) != 0);
        //nulo = (y == 0);
       
         par = (z > 0) && ((z %  2) == 0);
         inpar = (z > 0) && ((z % 2) != 0);
         nulo = (z == 0);
        
        System.out.println("Par é: " + par);
        System.out.println("Inpar é: " + inpar);
        System.out.println("Nulo é: " + nulo);

    }
}
