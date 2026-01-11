package training.fileTraning;

import java.io.*;

public class FIleTraining {
    public static void main(String[] args) {
        String path = "eula.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("Hello world");

            BufferedReader br = new BufferedReader(new FileReader(path));
            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
