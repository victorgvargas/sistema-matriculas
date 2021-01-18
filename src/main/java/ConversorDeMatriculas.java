import java.util.Arrays;

public class ConversorDeMatriculas {

    public int[] converteNumero(String num) {
        char[] chArr = num.toCharArray();
        int[] arr = new int[chArr.length];

        for (int i = 0; i < chArr.length; i++) {
            arr[i] = Character.getNumericValue(chArr[i]);
        }
        return arr;
    }

    public String converteMatricula(String matricula) {
        char[] chArr = matricula.toCharArray();
        char[] newChArr = Arrays.copyOfRange(chArr, 0, chArr.length - 2);
        String num = new String(newChArr);
        return num;
    }

    public String calculaDigito(String num) {
        int[] numAConverter = this.converteNumero(num);
        int[] numConvertido = numAConverter.clone();
        int contador = 5;
        int soma = 0;
        String digito;
        String matriculaComDigito;

        for (int i = 0; i < numConvertido.length; i++) {
            numConvertido[i] *= contador;
            contador--;
            soma += numConvertido[i];
        }
        digito = Integer.toHexString(soma % 16).toUpperCase();
        matriculaComDigito = Arrays.toString(numAConverter).
                replace("[","").
                replace("]","").
                replace(",","").
                replace(" ","") + "-" + digito;
        return matriculaComDigito;
    }
}
