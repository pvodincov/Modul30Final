import java.io.*;
import java.io.BufferedReader;



public class CpDecor {
    public static void main(String[] args) {

        String inputFileName = "decor.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                if (line.startsWith("an_")){
                    System.out.println("cp -r lib/" + line.trim() + "  ~/work/mfarm/Resources/library/.");
                    System.out.println("cp -r lib/" + line.trim() + "_ex" + "  ~/work/mfarm/Resources/library/.");
                    System.out.println("cp -r lib/" + line.trim() + "_sh" + "  ~/work/mfarm/Resources/library/.");

                  /*  System.out.printf("\"" + line.trim() +"_ex" + "\",");
                    System.out.printf("\"" + line.trim() + "_sh" + "\",");*/
                }
                if (line.startsWith("tl_")){
                    continue;
                }
                else {
                    System.out.println("cp -r lib/" + line.trim() + "  ~/work/mfarm/Resources/library/.");
                    System.out.println("cp -r lib/" + line.trim() + "_sh" + "  ~/work/mfarm/Resources/library/.");
                }
                /*String text_decor;
                String text_decor_sh;
                text_decor ="cp -r lib/" + line.trim() + "  ~/work/mfarm/Resources/library/.";
                text_decor_sh = "cp -r lib/" + line.trim() +  "_sh" + "  ~/work/mfarm/Resources/library/.";
                System.out.println(text_decor.trim());
                System.out.println(text_decor_sh.trim());*/

               // Write line = new Write(NewDecor.txt)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

