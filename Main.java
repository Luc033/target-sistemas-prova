import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.


// declarando variáveis para efetuar a soma e a ArrayList que receberá os resultados do cálculo
        int numUm = 0;
        int numDois = 1;
        ArrayList<Integer> sequencia = new ArrayList<Integer>();
        sequencia.add(numUm);
        sequencia.add(numDois);

        // neste laço de repetição será efetuado a soma entre os dois valores e armazenado os seus resultados da sequência de Fibonnaci dentro da ArrayList
        for (int i = 0; i < 10; i++) {
            numUm += numDois;
            numDois += numUm;
            sequencia.add(numUm);
            sequencia.add(numDois);
        }

        // Varíavel exemplo recebe um valor que será verificado se tal valor consta dentro da sequência de Fibonnaci e será imprimido a resposta
        int exemplo = 34;
        if (sequencia.contains(exemplo)){
            System.out.println("O número " + exemplo + " consta na sequência de Fibonacci.");
        }else{
            System.out.println("O número " + exemplo + " não consta na sequência de Fibonacci.");
        }

// Exercício 3 não foi efetuado pois não foi localizado anexa aos dados da vaga ou durante a execução da exercício, muito menos, no site oficial da empresa o referido JSON ou XML. Por favor não me desconsidere por conta disso, caso queiram, posso estar realizando estar etapa novamente, sem problema nenhum.

/*
   4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
    - SP – R$67.836,43
    - RJ – R$36.678,66
    - MG – R$29.229,88
    - ES – R$27.165,48
    - Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
*/
        double faturamentoSp = 67836.43;
        double faturamentoRj = 36678.66;
        double faturamentoMg = 29229.88;
        double faturamentoEs = 27165.48;
        double faturamentoOutros = 19849.53;
        double faturamentoTotal = faturamentoSp + faturamentoRj + faturamentoMg + faturamentoEs + faturamentoOutros;

        DecimalFormat df = new DecimalFormat("#.00");

        String percentualSp = df.format((faturamentoSp/faturamentoTotal) * 100).concat("%");
        String percentualRj = df.format((faturamentoRj/faturamentoTotal) * 100).concat("%");
        String percentualMg = df.format((faturamentoMg/faturamentoTotal) * 100).concat("%");
        String percentualEs = df.format((faturamentoEs/faturamentoTotal) * 100).concat("%");
        String percentualOutros = df.format((faturamentoOutros/faturamentoTotal) * 100).concat("%");

        String mensagem = """
                Valor percentual mensal da distribuidora
                São Paulo: %s
                Rio de Janeiro: %s
                Minas Gerais: %s
                Espírito Santo: %s
                Outros: %s
                """.formatted(percentualSp, percentualRj, percentualMg, percentualEs, percentualOutros);
        System.out.println(mensagem);

/*
* 5) Escreva um programa que inverta os caracteres de um string.
    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse;
* */
        String original = "TARGET SISTEMAS";  // String a ser invertida
        String invertida = "";

        // Invertendo a string manualmente
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}