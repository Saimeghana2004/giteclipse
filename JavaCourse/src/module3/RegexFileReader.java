package module3;
 import java.io.*;
import java.util.regex.*;

public class RegexFileReader {

    public static void main(String[] args) {
        try {
            // Step 1: Read the file using FileReader and BufferedReader
            FileReader fileReader = new FileReader("sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            bufferedReader.close();

            String text = content.toString();
            System.out.println("Original Content:\n" + text);

            // Step 2: Define a pattern (example: find all words starting with capital letters)
            Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
            Matcher matcher = pattern.matcher(text);

            System.out.println("\nUsing all 10 regex methods:\n");

            // 1. matches()
            boolean fullMatch = matcher.matches();
            System.out.println("1. matches(): " + fullMatch);

            // Reset matcher
            matcher.reset();

            // 2. find()
            System.out.println("2. find():");
            while (matcher.find()) {
                System.out.println("Found: " + matcher.group());
            }

            // Reset matcher
            matcher.reset();

            // 3. lookingAt()
            boolean lookingAt = matcher.lookingAt();
            System.out.println("3. lookingAt(): " + lookingAt);

            // Reset matcher
            matcher.reset();

            // 4. group()
            if (matcher.find()) {
                System.out.println("4. group(): " + matcher.group());
            }

            // 5. start()
            matcher.reset();
            if (matcher.find()) {
                System.out.println("5. start(): " + matcher.start());
            }

            // 6. end()
            matcher.reset();
            if (matcher.find()) {
                System.out.println("6. end(): " + matcher.end());
            }

            // 7. group(int group)
            Pattern patternWithGroup = Pattern.compile("(\\b[A-Z])[a-z]*\\b");
            Matcher matcherGroup = patternWithGroup.matcher(text);
            if (matcherGroup.find()) {
                System.out.println("7. group(1): " + matcherGroup.group(1));
            }

            // 8. replaceAll()
            String replaced = matcher.replaceAll("[CAP]");
            System.out.println("8. replaceAll():\n" + replaced);

            // 9. replaceFirst()
            matcher.reset();
            String replacedFirst = matcher.replaceFirst("[FIRST]");
            System.out.println("9. replaceFirst():\n" + replacedFirst);

            // 10. split()
            String[] words = pattern.split(text);
            System.out.println("10. split():");
            for (String word : words) {
                System.out.println(word);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



