package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class FileOperation {


    public static void writeWordsToFile(Map<String, String> words, String fileName) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> entrySet : words.entrySet()) {
                bw.write(entrySet.getKey());
                bw.write(", ");
                bw.write(entrySet.getValue());
                bw.newLine();
            }
        }
    }

    public static Map<String, String> readWords(String fileName) throws Exception {
        Map<String, String> words = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] diff = line.split(", ");
                if (diff.length >= 2) {
                    words.put(diff[0], diff[1]);
                }
            }
        }
        return words;
    }
}
