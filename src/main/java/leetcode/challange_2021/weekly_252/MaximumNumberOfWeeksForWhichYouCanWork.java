package leetcode.challange_2021.weekly_252;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumNumberOfWeeksForWhichYouCanWork {
    public long numberOfWeeks(int[] milestones) {
        var list = Arrays.stream(milestones).sorted().boxed().collect(Collectors.toList());
        long total = 0;
        while (list.size() > 1) {
            var size = list.size();
            var substitute = (list.get(size - 1) - list.get(size - 2));
            total += list.get(size - 2) * 2L;
            list.set(size - 1, substitute);
            list.remove(list.get(size - 2));
            list.sort(null);
        }
        return list.get(0) > 0 ? total + 1: total ;
    }
}
