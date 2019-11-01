package IOOuterActive.Languages;

import IOOuterActive.Main;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Language {
    private static ArrayList<String> output = new ArrayList<>();

    public void readFile() {
        InputStream in = Main.class.getClassLoader().getResourceAsStream("danish.txt");
        Scanner read = new Scanner(in);
        read.useDelimiter("\n");
        while (read.hasNext()) output.add(read.next().trim());
    }

    public void languageOutput(int n) {
        System.out.print(output.get(n) + " ");
    }
}
