import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeExercise03 {
    public static void main(String[] args) {
        System.out.println("PracticeExercise03");

        String sentence = "java is easy and java is powerful and java is popular JAVA . JAVA . is the best";
        String word = "java";

        String [] sentence_words = sentence.split(" ");
        int word_count = 0;
        for(String word_ : sentence_words){
            word_ = word_.toLowerCase();
            if(word.equals(word_)){
                word_count++;
            }
        }
        System.out.println("word_count: "+ (word_count));



        int StringTokenizer_count = 0;
        StringTokenizer tokenizerText = new StringTokenizer(sentence);
        while (tokenizerText.hasMoreTokens()) {
            if(tokenizerText.nextToken().toLowerCase().equals(word)){
                StringTokenizer_count++;
            }
        }
        System.out.println("StringTokenizer count:" + (StringTokenizer_count));



        Pattern pattern = Pattern.compile("\\bjava\\b");
        Matcher matcher = pattern.matcher(sentence.toLowerCase());
        int match_count = 0;
        while (matcher.find()) {
            match_count++;
        }
        System.out.println("match_count: "+ (match_count));


        Pattern wordsPattern = Pattern.compile("\\bjava|is\\b");
        Matcher matcher_words = wordsPattern.matcher(sentence.toLowerCase());
        int matcher_words_count = 0;
        while (matcher_words.find()) {
            matcher_words_count++;
        }
        System.out.println("matcher_words_count: "+ (matcher_words_count));
    }
}
