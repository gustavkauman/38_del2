package IOOuterActive.Languages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Scanner;

public class Language {
    private static ArrayList<String> output = new ArrayList<>();

    public void readFile() throws FileNotFoundException, UnsupportedEncodingException {
        String url = Language.class.getResource("danish.txt").getPath();
        String configPath = URLDecoder.decode(url, "UTF-8");
        File file = new File(configPath);
        Scanner read = new Scanner(file);
        read.useDelimiter("\n");
        while (read.hasNext()) output.add(read.next().trim());
    }

    public void languageOutput(int n) {
        System.out.print(output.get(n) + " ");
    }
}
