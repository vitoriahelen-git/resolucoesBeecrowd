# Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
# o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor 
# a ser pago.

# Entrada
# O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois 
# inteiros e um valor com 2 casas decimais.

# Saída
# A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os 
# dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.


codigo1, quantidade1, valorUnitario1 = input().split()
codigo2, quantidade2, valorUnitario2 = input().split()

codigo1 = int(codigo1)
quantidade1 = int(quantidade1)
valorUnitario1 = float(valorUnitario1)


codigo2 = int(codigo2)
quantidade2 = int(quantidade2)
valorUnitario2 = float(valorUnitario2)

total = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2)

print("VALOR A PAGAR: R$", str("{:.2f}".format(total)))
