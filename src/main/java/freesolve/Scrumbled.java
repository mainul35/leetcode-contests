package freesolve;

/*
You are running a classroom and suspect that some of your students are passing around the answers to multiple choice questions disguised as random strings.

Your task is to write a function that, given a list of words and a string, finds and returns the word in the list that is scrambled up inside the string, if any exists. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:
words = ['cat', 'baby', 'dog', 'bird', 'car', 'ax']
string1 = 'tcabnihjs'
find_embedded_word(words, string1) -> cat (the letters do not have to be in order)

string2 = 'tbcanihjs'
find_embedded_word(words, string2) -> cat (the letters do not have to be together)

string3 = 'baykkjl'
find_embedded_word(words, string3) -> None / null (the letters cannot be reused)

string4 = 'bbabylkkj'
find_embedded_word(words, string4) -> baby

string5 = 'ccc'
find_embedded_word(words, string5) -> None / null

string6 = 'breadmaking'
find_embedded_word(words, string6) -> bird

All Test Cases:
find_embedded_word(words, string1) -> cat
find_embedded_word(words, string2) -> cat
find_embedded_word(words, string3) -> None / null
find_embedded_word(words, string4) -> baby
find_embedded_word(words, string5) -> None / null
find_embedded_word(words, string6) -> bird

Complexity analysis variables:

W = number of words in `words`
S = maximal length of each word or string
*/
public class Scrumbled {
    public static void main(String[] argv) {
        String[] words = new String[]{"cat", "baby", "dog", "bird", "car", "ax"};
        String string1 = "tcabnihjs";
        String string2 = "tbcanihjs";
        String string3 = "baykkjl";
        String string4 = "bbabylkkj";
        String string5 = "ccc";
        String string6 = "breadmaking";


        var out = find_embedded_word(words, string1);
        System.out.println(out);

        out = find_embedded_word(words, string2);
        System.out.println(out);

        out = find_embedded_word(words, string3);
        System.out.println(out);

        out = find_embedded_word(words, string4);
        System.out.println(out);

        out = find_embedded_word(words, string5);
        System.out.println(out);

        out = find_embedded_word(words, string6);
        System.out.println(out);
    }

    private static String find_embedded_word(String[] words, String scrumbled) {
        var out = "";
        for (int i = 0; i < words.length; i++) {
            out = find_embedded_word_from_words(words[i], scrumbled, "");
            if (out != null) {
                return out;
            }
        }
        return null;
    }

    private static String find_embedded_word_from_words(String word, String scrumbled, String store) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < scrumbled.length(); j++) {
                if (word.charAt(i) == scrumbled.charAt(j)) {
                    store += "" + scrumbled.charAt(j);
                    scrumbled = scrumbled.substring(0, j) + "" + scrumbled.substring(j + 1);
                    break;
                }
            }
        }
        return store.length() == word.length() ? word : null;
    }
}