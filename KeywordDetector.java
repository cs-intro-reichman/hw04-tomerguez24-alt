public class KeywordDetector{
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };

        String[] keywords = {"synergy", "disrupt", "leverage", "paradigm", "transform"};

        detectAndPrint(sentences, keywords);
    }

    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String sentenceLower = sentence.toLowerCase();
            boolean found = false;

            for (int j = 0; j < keywords.length; j++) {
                String keywordLower = keywords[j].toLowerCase();
                if (sentenceLower.contains(keywordLower)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(sentence);
            }
        }
    }
}
