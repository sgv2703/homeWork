package lesson4;

import java.util.*;

class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Cat", "Java",
                "Yava", "Kent", "Coffee",
                "Dog", "Beta", "Humster",
                "Cat", "Java", "Yava", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("smirnov", "8999123321");
        directory.add("smirnov", "8912155326");
        directory.add("habarov", "8917155552");
        directory.add("habarov", "8913455672");
        directory.add("smirnov", "899999999");
        directory.add("petrov", "899111111");
        directory.add("habarov", "89923231999");
        directory.add("ivanov", "8888123113");
        directory.add("kuznecov", "8324325234");

        System.out.println("smirnov " + directory.get("smirnov"));
        System.out.println("petrov" + directory.get("petrov"));
        System.out.println("habarov" + directory.get("habarov"));
        System.out.println("ivanov" + directory.get("ivanov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
