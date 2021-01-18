import java.io.*;

public class ManipuladorDeArquivos {
    private ConversorDeMatriculas conversorDeMatriculas = new ConversorDeMatriculas();

    public void verificaArquivos(String dir, String outputDir) throws IOException {
        FileReader arq = new FileReader(dir);
        BufferedReader lerArq = new BufferedReader(arq);
        FileWriter arqOutput = new FileWriter(outputDir);
        PrintWriter gravarArq = new PrintWriter(arqOutput);

        String numMatricula = lerArq.readLine();
        while (numMatricula != null) {
            String matricula = this.conversorDeMatriculas.converteMatricula(numMatricula);
            String numFinal = this.conversorDeMatriculas.calculaDigito(matricula);
            if (numFinal.equals(numMatricula)) {
                gravarArq.printf(numFinal + " verdadeiro%n");
            }
            else {
                gravarArq.printf(numFinal + " falso%n");
            }
            numMatricula = lerArq.readLine();
        }

        arq.close();
        arqOutput.close();
    }

    public void criaArquivosDV(String dir, String outputDir) throws IOException {
        FileReader arq = new FileReader(dir);
        BufferedReader lerArq = new BufferedReader(arq);
        FileWriter arqOutput = new FileWriter(outputDir);
        PrintWriter gravarArq = new PrintWriter(arqOutput);

        String numMatricula = lerArq.readLine();
        while (numMatricula != null) {
            String numFinal = this.conversorDeMatriculas.calculaDigito(numMatricula);
            gravarArq.printf(numFinal + "%n");
            numMatricula = lerArq.readLine();
        }

        arq.close();
        arqOutput.close();
    }
}
