package freesolve;

/*
We are working on a word puzzle and need to find common English words. We are given some CSV input of words along with their occurrence count in a large body of text.

Write a function that, given a maximum number of words C and a maximum word length K, returns the C most common words of length [2..K] together with their occurrence counts.

counts = [
	"POINT,333858038",
	"NOT,4522732626",
	"INTO,1144226142",
	"ON,4594521081",
	"FOR,6545282031",
	"NOW,679337516",
	"ONE,2148983086",
	"BEHAVIOR,104177552",
	"WAITS,2911079",
	"PEOPLE,658716166",
	"HI,15453893",
	"FORM,352032932",
	"OF,30966074232",
	"THROUGH,647091198",
	"BETWEEN,744064796",
	"FOUR,262968583",
	"LEFT,306802162",
	"OFF,302535533",
	"FROM,3469207674",
	"NO,1400645478",
	"FORMS,136468034",
	"A,45916054218"
]

# Sample usage with maximum word length 5, to find top 15 words:
# Expected output (in order, pseudodata):
get_list(counts, 15, 5) =>
[
	OF:     30966074232
	FOR:    6545282031
	ON:     4594521081
	NOT:    4522732626
	FROM:   3469207674
	ONE:    2148983086
	NO:     1400645478
	INTO:   1144226142
	NOW:    679337516
	FORM:   352032932
	POINT:  333858038
	LEFT:   306802162
	OFF:    302535533
	FOUR:   262968583
	FORMS:   136468034
]

Complexity Analysis:

n: Number of lines in the input
c: Number of words in the output
*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonEnglishWords {
    public static void main(String[] argv) {
        String[] counts = {
                "POINT,333858038",
                "NOT,4522732626",
                "INTO,1144226142",
                "ON,4594521081",
                "FOR,6545282031",
                "NOW,679337516",
                "ONE,2148983086",
                "BEHAVIOR,104177552",
                "WAITS,2911079",
                "PEOPLE,658716166",
                "HI,15453893",
                "FORM,352032932",
                "OF,30966074232",
                "THROUGH,647091198",
                "BETWEEN,744064796",
                "FOUR,262968583",
                "LEFT,306802162",
                "OFF,302535533",
                "FROM,3469207674",
                "NO,1400645478",
                "FORMS,136468034",
                "A,45916054218"
        };

        var out = get_list(counts, 15, 5);
        System.out.println(out);
    }

    private static List<String> get_list(String[] counts, int count, int maxLen) {

        var map = new HashMap<String, String>();

        for(int i = 0; i< counts.length; i++) {
            var splitted = counts[i].split(",");
            map.put(splitted[0], splitted[1]);
        }

        var entryStream = map.entrySet().stream();
        // find with maximum word length maxLen
        entryStream = findMaxWordLen(entryStream, maxLen);

        // find top count words
//        entryStream = findTopCounting(entryStream, count);

        return entryStream
                .map(stringStringEntry -> stringStringEntry.getKey() + ": " + stringStringEntry.getValue())
                .collect(Collectors.toList());
    }

    private static Stream<Map.Entry<String, String>> findMaxWordLen(Stream<Map.Entry<String, String>> entryStream, int maxLen) {
        System.out.println(maxLen);
        return entryStream
                .filter(stringStringEntry -> stringStringEntry.getKey().length() >= 2 && stringStringEntry.getKey().length() < maxLen);
    }

    private static Stream<Map.Entry<String, String>> findTopCounting(Stream<Map.Entry<String, String>> entryStream, int count) {
        return entryStream
                .sorted(Comparator.comparingLong(value -> Long.parseLong(value.getValue())))
//                .limit(count);
    ;
    }
}
