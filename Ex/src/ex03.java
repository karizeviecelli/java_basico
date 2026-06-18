import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor: ");
            vetor[i]= input.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        input.close();
    }
}
