import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteConversao {
    private ConversorDeMatriculas conversorDeMatriculas = new ConversorDeMatriculas();

    @Test
    void deveriaConverterNumero() {
        int[] numsArray = conversorDeMatriculas.converteNumero("9876");
        int[] arrayComparado = {9,8,7,6};
        Assertions.assertArrayEquals(arrayComparado, numsArray);
    }

    @Test
    void deveriaConverterMatricula() {
        String num = conversorDeMatriculas.converteMatricula("9876-B");
        Assertions.assertEquals("9876",num);
    }

    @Test
    void deveriaCalcularDigito() {
        String num = conversorDeMatriculas.calculaDigito("0047");
        Assertions.assertEquals("0047-A", num);
    }
}
