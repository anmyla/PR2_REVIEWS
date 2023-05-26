package Hashmap_WordCount;

import java.util.HashMap;

public class WordCount {
    private String text;
    private HashMap<String, Integer> wordCount = new HashMap<>();

    public WordCount(String text) {
        this.text = text;
    }

//------------------------THIS METHOD-----------------------------//
//    public void convertTextToMap () {
//        String[] splitText = text.split(" ");
//        for (int i = 0; i < splitText.length; i++) {
//            if (wordCount.get(splitText[i]) == null) {
//                wordCount.put(splitText[i], 0);
//            }
//            wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
//        }
//    }
//------------------------OR THIS METHOD-----------------------------//

//    public String removePunctuations(String str) {
//        String res = "";
//        for (Character c : str.toCharArray()) {
//            if(Character.isLetter(c))
//                res += c;
//        }
//        return  res;
//    }


    private void removePunctuations(){
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ' || Character.isLetter(text.charAt(i))){
                newText += text.charAt(i);
            }
        }
        this.text = newText.toLowerCase();
    }

    public void convertTextToMap () {
        removePunctuations();
        String[] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (wordCount.get(splitText[i]) == null) {
                wordCount.put(splitText[i], 1);
            }
            else {
                wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
            }
        }
    }

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }
}
