// Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
// o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o 
// valor a ser pago.

// Entrada
// O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois 
// inteiros e um valor com 2 casas decimais.

// Saída
// A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os 
// dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

import java.io.IOException;
import java.util.Scanner; 

public class BC_1010_Calculo_Simples {

    public static void main(String[] args) throws IOException{
        try(Scanner lerTeclado = new Scanner(System.in)){
            int codigo1, codigo2, quantidadePeca1, quantidadePeca2; 
            double valorUnitario1, valorUnitario2, total; 

            codigo1 = lerTeclado.nextInt(); 
            quantidadePeca1 = lerTeclado.nextInt();
            valorUnitario1 = lerTeclado.nextDouble();
            codigo2 = lerTeclado.nextInt(); 
            quantidadePeca2 = lerTeclado.nextInt(); 
            valorUnitario2 = lerTeclado.nextDouble();

            total = (quantidadePeca1 * valorUnitario1) + (quantidadePeca2 * valorUnitario2); 

            System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        }
    }
}