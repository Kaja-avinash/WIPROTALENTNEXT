import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the character to be counted: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        File file = new File(fileName);

        Scanner fileScanner = new Scanner(file);

        int count = 0;

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine().toLowerCase();

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == ch) {
                    count++;
                }
            }
        }

        System.out.println("File '" + fileName + "' has " + count +
                " instances of letter '" + ch + "'.");

        fileScanner.close();
        sc.close();
    }
}