#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	
	int n, maxC, contagem, index = -1, x, i, j;
	
	printf("Defina o numero de elementos do vetor: ");
	scanf("%d", &n);
	printf("\n");
	
	int vetor[n];
	
	for(x = 0; x < n; x++){
		printf("Digite o valor do elemento %d: ", x+1);
		scanf("%d", &vetor[x]);
		printf("\n");
	}
	
	for(i = 0; i < n; i++){
		contagem = 0;
		for(j = 0; j < n; j++){
			if(vetor[i] == vetor[j]){
				contagem++;
			}
		}
		if(contagem > maxC){
			maxC = contagem;
			index = i;
		}
	}
	
	if(maxC > n/2){
		printf("\nO valor majoritario eh %d, que aparece %d vezes entre as %d totais.", vetor[index], maxC, n);
	}
	else{
		printf("Nao ha valor majoritario.");
	}
	
	
	return 0;
}
