public class KeywordDetector {
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

        // Keywords — EXACT as provided, including case
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};

        detectAndPrint(sentences, keywords);
    }

    // Prints any sentence and matching keyword, EXACT format
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];

            for (int j = 0; j < keywords.length; j++) {
                String keyword = keywords[j];

                if (sentence.contains(keyword)) {   // exact case-sensitive match
                    System.out.println("Found keyword: " + keyword);
                    System.out.println(sentence);
                    System.out.println(); // empty line EXACTLY as tests expect
                }
            }
        }
    }
}
