package Hashmap_WordCount;

public class MainWordCount {
    public static void main(String[] args) {


        String str = "hallo8 hallo die. der das Hallo DIE Der ok1 hallo mah eh die";
        WordCount wordCount = new WordCount(str);

        wordCount.convertTextToMap();
        System.out.println(wordCount.getWordCount());



    }
}
