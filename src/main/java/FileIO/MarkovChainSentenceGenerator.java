package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MarkovChainSentenceGenerator {

    private Map<String, List<String>> markovChain;
    private Random random;

    public MarkovChainSentenceGenerator() {
        markovChain = new HashMap<>();
        random = new Random();
    }

    public void train(String text) {
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];
            String nextWord = words[i + 1];

            markovChain.computeIfAbsent(currentWord, k -> new ArrayList<>()).add(nextWord);
        }
    }

    public String generateSentence(int length) {
        String seed = getRandomSeed();
        StringBuilder sentence = new StringBuilder(seed);

        for (int i = 0; i < length; i++) {
            String nextWord = generateWord(seed);
            if (nextWord != null) {
                sentence.append(" ").append(nextWord);
                seed = nextWord;
            } else {
                break;  // Stop if no next word is available
            }
        }

        return sentence.toString();
    }

    private String getRandomSeed() {
        List<String> allWords = new ArrayList<>(markovChain.keySet());
        return allWords.get(random.nextInt(allWords.size()));
    }

    private String generateWord(String seed) {
        List<String> possibilities = markovChain.get(seed);

        if (possibilities != null && !possibilities.isEmpty()) {
            int randomIndex = random.nextInt(possibilities.size());
            return possibilities.get(randomIndex);
        } else {
            return null;
        }
    }

    public static String readFromFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        }
        return content.toString();
    }

    public static void main(String[] args) {
        MarkovChainSentenceGenerator generator = new MarkovChainSentenceGenerator();

        // Read training text from a file
        String filePath = "HarryPotter.txt";
        try {
            String trainingText = readFromFile(filePath);
            generator.train(trainingText);

            // Generate a new sentence with a random seed
            int sentenceLength = 1000;
            String generatedSentence = generator.generateSentence(sentenceLength);

            if (!generatedSentence.isEmpty()) {
                System.out.println("Generated sentence: \n" + generatedSentence);
            } else {
                System.out.println("No sentence generated.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
