import java.util.Scanner;
public class CalculadoraDisplay{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraAcoes Acoes = new CalculadoraAcoes();

        while (true) {

            System.out.println("\n Calculadora");
           
            System.out.println("\nDigite a operação que deseja fazer de acordo com a tabela a baixo ou digite 'Q' para sair:");
            System.out.println("+ -> Soma\n - ->Subtração\n * -> Multiplicação\n / -> Divisão\n ^ -> Potenciação\n R -> Raiz");
            Acoes.setOperacao(scanner.next());
            
            if (Acoes.getOperacao().equalsIgnoreCase("Q") || Acoes.getOperacao().equalsIgnoreCase("q")) {
                System.out.println("Você saiu do programa!");
                break;
            }
            System.out.print("Digite o primeiro número: ");
            Acoes.setNumeroUm(scanner.nextDouble());

    
            System.out.print("Digite o segundo número: ");
            Acoes.setNumeroDois(scanner.nextDouble());
    
           
            
          
           
            Acoes.acao();
        }
        scanner.close();
    }
    
}
