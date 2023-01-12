import java.io.*;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class IconCopy {
    public static void main(String[] args) throws IOException {

        String inputFileName = "icon_fix.txt";

        List<String> text = Files.readAllLines(Paths.get("C:\\Users\\tester\\IdeaProjects\\untitled\\icon.txt"));
        while (text.contains("")) text.remove("");
        Files.write(Paths.get("C:\\Users\\tester\\IdeaProjects\\untitled\\icon_fix.txt"), text);



        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("cp ../farm/docroot/swfs/" + line + ".swf tmprast/DR");


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
