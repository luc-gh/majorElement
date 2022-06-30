import java.util.*;

public class majorElement {
    public static void findMajor(int[] array, int tamanho){
        int maxCount = 0, count;
        int index = -1;

        for(int i = 0; i < tamanho; i++){
            count = 0;
            for(int j = 0; j < tamanho; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        if(maxCount > (int)tamanho/2){
            System.out.println("O valor majoritário é " + array[index] + ", que aparece " + maxCount + " vezes entre as " + tamanho + " totais.");
        }
        else{
            System.out.println("Não há valor majoritário.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, a = 0;
        int[] arrayint;
        System.out.println("Defina o número (natural positivo) de elementos do array: ");
        while(a == 0) {
            try {
                x = scanner.nextInt();
                if (x <= 0) {
                    System.out.println("Erro. O número digitado é inválido.");
                    a = 1;
                }
                else{
                    arrayint = new int[x];
                    for(int i = 0; i < arrayint.length; i++){
                        System.out.println("Digite o elemento " + (i+1) + ": ");
                        arrayint[i] = scanner.nextInt();
                    }
                    System.out.println("Seu array é: " + Arrays.toString(arrayint));

                    findMajor(arrayint, arrayint.length);
                    a = 1;
                }
            } catch (Exception e) {
                System.out.println("Erro. O número digitado é inválido.");
                a = 1;
            }
        }
    }
}
