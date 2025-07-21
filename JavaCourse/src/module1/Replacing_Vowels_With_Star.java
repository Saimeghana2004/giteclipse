package module1;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Replacing_Vowels_With_Star {

    public static void main(String[] args) throws IOException {
        // Step 1: Write to file
        String originalText = "This is a Test paragraph. Another Line starts Here. Java Regex is Powerful.";
        FileWriter writer = new FileWriter("sample.txt");
        writer.write(originalText);
        writer.close();

        // Step 2: Read from file
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();

        // Step 3: Replace vowels with '*'
        String replacedText = content.toString().replaceAll("(?i)[aeiou]", "*");

        // Step 4: Write modified content to new file or overwrite
        FileWriter modifiedWriter = new FileWriter("sample_modified.txt");
        modifiedWriter.write(replacedText);
        modifiedWriter.close();

        System.out.println("Vowels replaced and written to sample_modified.txt");
    }
}
