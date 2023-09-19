public class ExemplosBasicos    {
    public static void main (String... args)    {
        //  indent (indentação)
        // Repetição manual, a ser evitada.
        // System.out.println(1);
        // System.out.println(2);
        // Repetição controlada por contador
        int counter = 1;
        while (counter <= 10)   {
            System.out.println("Contador: " + counter);
            counter += 1;
        }
        System.out.println("Finalizado!");

        for(int cont = 1; cont <= 10; cont++)   {
            System.out.println(cont);
        }

        System.out.println("Segundo loop finalizado!");

        int contador = 1;

        do {
            //%d é um placeholder para a variável
            System.out.printf("Valor da vez: %d\n", contador);
            contador += 1;
        } while (contador <= 3);
    }
}