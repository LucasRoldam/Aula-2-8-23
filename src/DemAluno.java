import java.util.Scanner;

public class DemAluno {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = ler.next();

        while (nome.isBlank()) {
            System.out.println("O nome não pode ser em branco. Digite novamente");
            nome = ler.next();
        }

        System.out.println("Digite seu RA");
        int ra = ler.nextInt();

        while (ra < 0) {
            System.out.println("O RA não pode ser negativo. Digite novamente");
            ra = ler.nextInt();
        }

        System.out.println("Digite a nota da prova 1");
        int pv1 = ler.nextInt();

        while (pv1 < 0 || pv1 > 10) {
            System.out.println("A nota deve estar entre 0 e 10. Digite novamente");
            pv1 = ler.nextInt();
        }

        System.out.println("Digite a nota da prova 2");
        int pv2 = ler.nextInt();

        while (pv2 < 0 || pv2 > 10) {
            System.out.println("A nota deve estar entre 0 e 10. Digite novamente");
            pv2 = ler.nextInt();
        }

        System.out.println("Digite a nota do trabalho");
        int nt = ler.nextInt();

        while (nt < 0 || nt > 10) {
            System.out.println("A nota deve estar entre 0 e 10. Digite novamente");
            nt = ler.nextInt();
        }

        Aluno aluno = new Aluno(nome,ra,pv1,pv2,nt);

        aluno.CalcMedia();
        aluno.Situacao();
        System.out.println(aluno);

    }
}