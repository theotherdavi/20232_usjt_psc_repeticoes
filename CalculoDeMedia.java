import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


public class CalculoDeMedia {
    public static void main (String... args)    {
        // Professor irá informar o número de alunos que tem
        // Ele não pode informar um valor menor ou igual a 0
        // Para cada aluno, vamos calcular a média

        int n;

        do {
            n = parseInt(showInputDialog("Quantos alunos você tem?"));
        } while (n <= 0);
        for(int cont = 1; cont <= n; cont++)    {
            double a1, a2, a3;

            do {
                a1 = parseDouble(showInputDialog("Insira a nota A1 (Mínimo 0, Máximo 30)"));
            } while (a1 < 0 || a1 > 30);

            do {
                a2 = parseDouble(showInputDialog("Insira a nota A2 (Mínimo 0, Máximo 30)"));
            } while (a2 < 0 || a2 > 30);

            do {
                a3 = parseDouble(showInputDialog("Insira a nota A3 (Mínimo 0, Máximo 40)"));
            } while (a3 < 0 || a3 > 40);

            double media = a1 + a2 + a3;

            javax.swing.JOptionPane.showMessageDialog(null, "O valor da média do aluno é: " + media);

            if(media >= 70)  javax.swing.JOptionPane.showMessageDialog(null, "O aluno foi aprovado!");
            else    javax.swing.JOptionPane.showMessageDialog(null, "O aluno foi reprovado...");
        }
    }
}
