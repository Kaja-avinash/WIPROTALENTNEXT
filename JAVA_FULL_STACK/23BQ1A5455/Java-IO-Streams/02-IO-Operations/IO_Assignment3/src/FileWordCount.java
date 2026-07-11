import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter output file name: ");
        String output = sc.nextLine();

        Scanner fileScanner = new Scanner(new File(input));

        Map<String, Integer> map = new TreeMap<>();

        while (fileScanner.hasNext()) {

            String word = fileScanner.next();

            map.put(word, map.getOrDefault(word, 0) + 1);

        }

        FileWriter writer = new FileWriter(output);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            writer.write(entry.getKey() + " : " + entry.getValue());

            writer.write(System.lineSeparator());

        }

        writer.close();
        fileScanner.close();
        sc.close();

        System.out.println("Word count written successfully.");
    }
}