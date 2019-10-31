package IOOuterActive.Languages;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Language {
    private static ArrayList<String> output = new ArrayList<>();

    public void readFile() throws FileNotFoundException {
        URL url = Language.class.getResource("danish.txt");
        File file = new File(url.getPath());
        Scanner read = new Scanner(file);
        read.useDelimiter("\n");
        while (read.hasNext()) {
            output.add(read.next().trim());
        }
    }

    public void languageOutput(int n) {
        System.out.print(output.get(n) + " ");
    }
}
