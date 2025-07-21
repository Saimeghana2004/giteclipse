package FileReadWritePrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperCaseFileConverter {
    public  UpperCaseFileConverter(String[] args) {
        if (args.length == 0) {
           String filepath="C:\\Users\\Dell\\eclipse-workspace\\JavaCourse\\src\\FileReadWritePrograms\\sample.txt";
            
        }

        String FilePath = args[0];
        File inputFile = new File(FilePath);
        File outputFile = new File("uppercase_output.txt");

        if (!inputFile.exists()) {
            System.out.println("File not found: " + inputFile.getAbsolutePath());
            return;
        }

        try (
            FileReader fr = new FileReader(FilePath);
            FileWriter fwUpper = new FileWriter(outputFile)
        ) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fwUpper.write(Character.toUpperCase((char) ch));
            }

            System.out.println("Uppercase content written to: " +FilePath.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
