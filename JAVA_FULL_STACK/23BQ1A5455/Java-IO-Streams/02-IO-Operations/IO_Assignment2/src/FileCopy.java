import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String output = sc.nextLine();

        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);

        int data;

        while ((data = fis.read()) != -1) {

            fos.write(data);

        }

        fis.close();
        fos.close();
        sc.close();

        System.out.println("File is copied.");
    }
}