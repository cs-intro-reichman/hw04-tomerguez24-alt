public class KeywordsDetector {
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

        String[] keyword = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};

        detectAndPrint(sentences, keyword);
    }

    public static void detectAndPrint(String[] sentences, String[] keyword) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            boolean found = false;

            for (int j = 0; j < keyword.length; j++) {
                if (sentence.toLowerCase().contains(keyword[j].toLowerCase())) {
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
