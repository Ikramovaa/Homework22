import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException{

        //private static void fileReader ()throw FileNotFoundException {
        Song song = new Song();
        fileReader();

    }

    private static void fileReader(){
        try {
            FileReader fileReader = new FileReader("Metallica");
            Scanner file = new Scanner(fileReader);
            while (file.hasNextLine()) {
                System.out.println(file.next());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

     public static void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("Metallica");
        fileWriter.write("str:----Nothing else matter----" +
                "\n Author: Metallica" +
                "\n So close,no matter ow far" +
                "\n Couldn't be much more from the heart" +
                "\n Forever trusting who we are" +
                "\n And nothing else matters" +
                "\n And never opened myself this way" +
                "\n Life is ours,we live it our way" +
                "\n All these words I don't just say" +
                "\n And nothing else matters");
        fileWriter.close();
    }
}
