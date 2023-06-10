import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = teclado.next();

        System.out.println("Digite que tipo de professor você é digite: 1 se é um professor horista, 2 se é um professor clt ou 3 se é um professor pj");
        int TipoDeProf = teclado.nextInt();


        int horista =1;
        int clt = 2;
        int pj = 3;

        if(TipoDeProf == clt){
            System.out.println("digite seu salário mensal");
            double SalarioCLT = teclado.nextDouble();
            System.out.println("O professor: " + nome + " recebe um salário de R$ " + SalarioCLT + " por mês");
        }
        else if(TipoDeProf == horista){
            System.out.println("digite o número de horas trabalhadas");
            Double HorasTrabalhadas = teclado.nextDouble();
            System.out.println("digite o valor recebido por hora de trabalho");
            double ValorHora = teclado.nextDouble();
            double SalarioHorista = HorasTrabalhadas * ValorHora;
            System.out.println("O professor: " + nome + " recebe um salário de R$ " + SalarioHorista + " por mês");

        }
        else if(TipoDeProf == pj){
            System.out.println("digite o valor do seu contrato com a institução");
            double SalarioPJ = teclado.nextDouble();
            System.out.println("O professor: " + nome + " recebe um salário de R$ " + SalarioPJ + " por mês");
        }
        else {
            System.out.println("este número não é equivalente a um tipo de professor");
        }
        teclado.close();
    }
}
