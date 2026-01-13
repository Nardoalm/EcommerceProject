package training.fileTraning;

import java.io.*;

public class FIleTraining {
    public static void main(String[] args) {
        String[] lines = { "Bom dia", "Boa tarde", "Boa noite"};
        String path = "/Users/leonardo/Desktop/teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            BufferedReader br = new BufferedReader(new FileReader(path));
            System.out.println(br.readLine());

            for (String txt : lines){
                bw.write(txt);
                bw.newLine();
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
