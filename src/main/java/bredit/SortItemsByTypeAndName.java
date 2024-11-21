package bredit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortItemsByTypeAndName {
    record Item (String type, String name) {}

    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Fruit", "Orange"));
        itemList.add(new Item("Fruit", "Apple"));
        itemList.add(new Item("Fruit", "Banana"));
        itemList.add(new Item("Animal", "Tiger"));
        itemList.add(new Item("Animal", "Dog"));
        itemList.add(new Item("Vehicle", "Car"));
        itemList.add(new Item("Vehicle", "Boat"));
        itemList.add(new Item("Vehicle", "Plane"));
        process(itemList);
    }

    public static void process (List<Item> itemList) {
        itemList.stream().collect(Collectors.groupingBy(item -> item.type, Collectors.toList()))
                .entrySet()
                .stream().map(stringListEntry ->
                        Map.entry(
                                stringListEntry.getKey(),
                                stringListEntry.getValue().stream().map(item -> item.name).sorted().toList())
                )
                .sorted(Map.Entry.comparingByKey())
                .forEach(stringListEntry -> {
                    System.out.println("-Type=" + stringListEntry.getKey());
                    stringListEntry.getValue().forEach(s -> System.out.println("\t-Name="+s));
                });
    }
}
