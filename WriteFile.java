import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            File file = new File("../hello.txt");
            FileWriter fileWriter = new FileWriter(file, true);//FileWriterの第2引数でtrueを指定すると追記

            fileWriter.write("こんにちは\n");
            fileWriter.write("お元気ですか？\n");
            fileWriter.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
