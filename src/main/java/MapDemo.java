import java.util.*;

public class MapDemo {
    static HashMap<Character, Integer> vowelMap2 = new HashMap<>();
    static HashMap<Character, Integer> consonantMap = new HashMap<>();

    public static void main(String[] args) {
        /*
        z) count the number of chars in a given string
        a) count all the vowels from given string
        b) and how many times each vowel appears in that string
        c) a) and b) but for a list of strings - 1p
        d) c) but for consonants - 1p
         */

        String test = "Ana are mere dulci";
        int stringLength = test.length();
        //Overengineering
//        int cnt = 0;
//        for (Character ch : test.toCharArray())
//            ++cnt;

        int vowelCounter = 0;
        for (Character ch : test.toCharArray()) {
            if (isVowel(ch))
                ++vowelCounter;
        }


        //HashMap<Character, IncrementableInt> vowelMap = new HashMap<>();
        HashMap<Character, Integer> vowelMap = new HashMap<>();
        String vowelStr = "aeiou";
        for (Character ch : vowelStr.toCharArray()) {
            //vowelMap.put(ch, new IncrementableInt());
            vowelMap.put(ch, 0);
        }
        for (Character ch : test.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (isVowel(ch)) {
                    vowelMap.put(ch, vowelMap.get(ch) + 1);
                    //vowelMap.get(ch).increment();
                }
            }
        }

        ArrayList<String> list = new ArrayList<>();
        list.add(test);
        list.add(test);
        list.add(test);

        for (Character ch : vowelStr.toCharArray()) {
            vowelMap2.put(ch, 0);
        }
        // here
        String consonantStr = "bcdfghjklmnpqrst";
        for (Character ch : consonantStr.toCharArray()) {
            consonantMap.put(ch, 0);
        }

        for (String text : list) {
            counter(text);
        }
    }

    static void counter(String text) {
        for (Character ch : text.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (isVowel(ch)) {
                    vowelMap2.put(ch, vowelMap2.get(ch) + 1);
                } else {
                    consonantMap.put(ch, consonantMap.get(ch) + 1);
                }
            }
        }
    }


    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}


class IncrementableInt {
    int counter = 0;

    public void increment() {
        ++counter;
    }

    public int getCounter() {
        return counter;
    }
}