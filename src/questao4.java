import java.util.Arrays;

public class questao4 {
    public static void main(String[] args) {
        
        int[] primeiroArray = {1, 2, 3, 4, 5};
        int[] segundoArray = {6, 7, 8, 9, 10};
        
        int[] resultadoOrdenacao = arraysOrdenados(primeiroArray, segundoArray);
        
        System.out.println("Resultado da união ordenada: " + Arrays.toString(resultadoOrdenacao));
    }

    public static int[] arraysOrdenados(int[] primeiroArray, int[] segundoArray) {
        
        int tamanhoArray1 = primeiroArray.length;
        int tamanhoArray2 = segundoArray.length;
        
        int tamanhoResultado = tamanhoArray1 + tamanhoArray2;
        
        int[] arrayResultante = new int[tamanhoResultado];
        
        int indiceArray1 = 0, indiceArray2 = 0, indiceResultado = 0;
        
        StringBuilder resultStringBuilder = new StringBuilder();
        
        while (indiceArray1 < tamanhoArray1 && indiceArray2 < tamanhoArray2) {
            
            if (primeiroArray[indiceArray1] < segundoArray[indiceArray2]) {
                arrayResultante[indiceResultado++] = primeiroArray[indiceArray1++];
            } else {
                arrayResultante[indiceResultado++] = segundoArray[indiceArray2++];
            }
        }
        
        while (indiceArray1 < tamanhoArray1) {
            arrayResultante[indiceResultado++] = primeiroArray[indiceArray1++];
        }
        
        while (indiceArray2 < tamanhoArray2) {
            arrayResultante[indiceResultado++] = segundoArray[indiceArray2++];
        }
        
        resultStringBuilder.append("[");
        for (int i = 0; i < tamanhoResultado; i++) {
            resultStringBuilder.append(arrayResultante[i]);
            if (i < tamanhoResultado - 1) {
                resultStringBuilder.append(", ");
            }
        }
        resultStringBuilder.append("]");
        
        return arrayResultante;
    }
}

