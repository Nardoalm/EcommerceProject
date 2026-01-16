package training.helpMyFriend;

import java.io.*;

public class FileTraining {
    public static void main(String[] args) {
        String[] lines = { "Bom dia", "Boa tarde", "Boa noite"};
        String path = "/Users/leonardo/Desktop/teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String txt : lines){
                bw.write(txt);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error to write the archive: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
