import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DecorLib {

    public static void main(String[] args) {

        String inputFileName = "decor.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("an_")){
                    System.out.printf("\"" + line.trim() + "\",");
                    System.out.printf("\"" + line.trim() +"_ex" + "\",");
                    System.out.printf("\"" + line.trim() + "_sh" + "\",");
                }
                if (line.startsWith("tl_")){
                    continue;
                }
                else {
                    System.out.printf("\"" + line.trim() + "\",");
                    System.out.printf("\"" + line.trim() + "_sh" + "\",");
                }




            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

