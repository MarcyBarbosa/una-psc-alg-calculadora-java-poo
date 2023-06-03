public class CalculadoraAcoes {
    
    private double numeroUm;
    private double numeroDois;
    private String operacao;

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }
    
    public Double getNumeroUm() {
        return numeroUm;
    }
    
    public void setNumeroDois(Double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public Double getNumeroDois() {
        return numeroDois;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getOperacao() {
        return operacao;
    }


    public double somar() {
        return numeroUm + numeroDois;
    }
    
    public double subtrair() {
        return numeroUm - numeroDois;
    }
    
    public double multiplicar() {
        return numeroUm * numeroDois;
    }
    
    public double dividir() {
        return numeroUm / numeroDois;
    }
    
    public double potenciar() {
        return Math.pow(numeroUm, numeroDois);
    }
    
    public double raizNumeroUm() {
        return Math.sqrt(numeroUm);
    }
    
    public double raizNumeroDois() {
        return Math.sqrt(numeroDois);
    }

    public void acao() {
        switch (operacao) {
            case "+":
            double resultadoSoma = somar();
                System.out.printf("O resultado dessa adição é %.2f", resultadoSoma);
                break;

            case "-":
                double resultadoSubtração = subtrair();
                System.out.printf("O resultado dessa subtração é %.2f", resultadoSubtração);
                break;

            case "*":
                double resultadoMultiplicao = multiplicar();
                System.out.printf("O resultado dessa multiplicação é %.2f", resultadoMultiplicao);
                break;

            case "/":
            double resultadoDivisao = dividir();
                if (numeroDois == 0) {
                    System.out.println("Impossível realizar uma divisão por zero.");
                    break;
                } else
                    System.out.printf("O resultado dessa divisão é  %.2f", resultadoDivisao);
                break;

            case "^":
                if (numeroDois == 0) {
                    double potencia = 1;
                    System.out.println("O resultado dessa potência é " + potencia);
                    break;
                } else {
                    double potenciaReal = potenciar();
                    System.out.printf("O resultado dessa potência é %.2f", potenciaReal);
                    break;
                }

            case "R":
                if (numeroUm <= 0) {
                    double resultadoRaizDois = raizNumeroDois();
                    System.out.printf("Raiz do primeiro: Não existe raiz de número negativo. \n Raiz do segundo: %.2f", resultadoRaizDois);
                    break;
                } else if (numeroDois <= 0) {
                    double resultadoRaizUm = raizNumeroUm();
                    System.out.printf("Raiz do primeiro: %.2f \n Raiz do segundo: Não existe raiz de número negativo.", resultadoRaizUm);
                    break;
                } else if (numeroUm <= 0 && numeroDois <= 0) {
                    System.out.println("Não existe raiz de número negativo.");
                    break;
                } else {
                    double resultadoRaizUm = raizNumeroUm();
                    double resultadoRaizDois = raizNumeroDois();
                    System.out.printf("Raiz do primeiro: %.2f \nRaiz do segundo: %.2f", resultadoRaizUm, resultadoRaizDois);
                    break;
                }
            default:
                System.out.println("Operação inválida, tente novamente");
            }
       }

}

