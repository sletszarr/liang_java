package Chapter12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bnamora on 1/24/17.
 */

public class Chapter12_13_WriteData {

    public static void main(String[] args) throws IOException {

        File file = new File("scores.txt");
        String[] names = {"Abi", "Ary", "Baginda", "Bayu", "Dimas",
                "Oji", "Lechsa", "Suparto", "Abidin"};

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i < 1000; i++) {
            int randScore = (int) (Math.random() * 100);
            int randName = (int) (Math.random() * names.length);
            output.println(names[randName] + ": " + randScore);
        }

        output.close();

    }

}
