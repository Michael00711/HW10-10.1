package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer num : list) {
            System.out.println(num);
        }

        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(getSum(list));
        System.out.println(getOddNumbers(list));
        System.out.println(convertToStringList(list));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("2i");
        System.out.println(doubling(strings));

        System.out.println(findIndexByPhoneNumber("016/161616"));
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String str : strings) {
            doubledList.add(str + str);
        }
        return doubledList;
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        String[] PHONE_BOOK = new String[]{"016/161616", "016/161617", "016/161618"};
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (PHONE_BOOK[i].equals(phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
