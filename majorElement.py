n = int(input("Insira o número de elementos do vetor: "))  # Pede-se o número de elementos do vetor
vetor = []      # Declaramos o vetor
maxCount = 0    # Declaramos a variável que recebe a contagem máxima dos valores repetidos no vetor
indice = -1     # Inicializamos o índice que terá a o valor de índice do valor majoritário

for i in range(n):                                  # loop para preencher vetor
    vetor.append(input('Elemento %i: ' % (i + 1)))  # insere os elementos na última posição do vetor

for j in range(n):                  # percorre o vetor
    contagem = 0                    # zera a contagem inicial para cada elemento do vetor no primeiro loop
    for h in range(n):              # percorre novamente o vetor, fazendo tal percurso para cada elemento do primeiro loop
        if vetor[j] == vetor[h]:    # compara o elemento do primeiro loop com o do segundo, em cada índice
            contagem += 1           # se os valores forem iguais, a contagem de repetições sobe
    if contagem > maxCount:         # comparamos o valor de repetições atual (do 2º loop) com o máximo já adquirido
        maxCount = contagem         # se o valor atual for maior que o máximo anterior, ele torna-se o novo máximo
        indice = j                  # com o novo máximo, também há um novo índice para a variável que tinha o índice máximo anterior

if maxCount > int(n / 2) and n != 0:        # se o número de elementos da matriz não for 0, e a condição da questão for satisfeita:
    print('O valor majoritário é %i, que aparece %i vezes entre as %i totais.' % (int(vetor[indice]), maxCount, n))
else:
    print("Não há elemento majoritário.")