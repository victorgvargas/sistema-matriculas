import java.io.IOException;
import java.util.Scanner;

public class SistemaDeMatriculas {
    public static void main(String[] args) throws IOException {
        String dir;
        String outputDir;
        Scanner sc = new Scanner(System.in);
        ManipuladorDeArquivos manipuladorDeArquivos = new ManipuladorDeArquivos();

        System.out.println("Forneça o diretório do arquivo de matriculas sem DV:");
        dir = sc.nextLine();
        System.out.println("Forneça o diretório do arquivo a ser escrito:");
        outputDir = sc.nextLine();
        manipuladorDeArquivos.criaArquivosDV(dir, outputDir);
        System.out.println("Forneça o diretório do arquivo de matriculas a serem verificadas:");
        dir = sc.nextLine();
        System.out.println("Forneça o diretório do arquivo a ser escrito:");
        outputDir = sc.nextLine();
        manipuladorDeArquivos.verificaArquivos(dir, outputDir);
    }
}
