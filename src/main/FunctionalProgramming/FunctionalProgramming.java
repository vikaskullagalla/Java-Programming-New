package main.FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> wordsList = List.of("vikas", "kullagalla", "tcs", "java", "spring","tcs","TATA");
//        wordsList.stream().forEach(System.out::println);
//        wordsList.stream().filter(word -> word.length() > 5).forEach(System.out::println);
//        wordsList.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
//        wordsList.stream().sorted().forEach(System.out::println);
//        wordsList.stream().distinct().forEach(System.out::println);
//        wordsList.stream().sorted().limit(2).forEach(System.out::println);
//        wordsList.stream().sorted().distinct().skip(2).forEach(System.out::println);
        //forEachOrdered is used when we want to maintain the order of the elements
//        wordsList.stream().sorted().forEachOrdered(System.out::println);

//         List<String> list =  wordsList.stream().sorted().collect(Collectors.toList());System.out.println(list);
//         Set<String> set = wordsList.stream().sorted().collect(Collectors.toSet());System.out.println(set);

//        Map<Integer, String> map = wordsList.stream().sorted().collect(Collectors.toMap(word -> word.length(),word -> word));System.out.println(map);
//          Set<String> treeSet = wordsList.stream().sorted().collect(Collectors.toCollection(TreeSet::new));System.out.println(treeSet);
//         String str = wordsList.stream().sorted().collect(Collectors.joining(","));System.out.println(str);
         //groupingBy
//         Map<Integer, List<String>> map = wordsList.stream().collect(Collectors.groupingBy(String::length));System.out.println(map);
         //partitioningBy
//         Map<Boolean, List<String>> map1 = wordsList.stream().collect(Collectors.partitioningBy(word -> word.length() > 5));System.out.println(map1);
//         //counting
//         Map<Integer, Long> map2 = wordsList.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));System.out.println(map2);
//         //maxBy
//         Optional<String> max = wordsList.stream().collect(Collectors.maxBy(Comparator.comparing(String::length)));System.out.println(max);
//         //minBy
//         Optional<String> min = wordsList.stream().collect(Collectors.minBy(Comparator.comparing(String::length)));System.out.println(min);
//         //summingInt
//         int sum = wordsList.stream().collect(Collectors.summingInt(String::length));System.out.println(sum);
//         //averagingInt
//         double avg = wordsList.stream().collect(Collectors.averagingInt(String::length));System.out.println(avg);
//         //summarizingInt
         IntSummaryStatistics stats = wordsList.stream().collect(Collectors.summarizingInt(String::length));System.out.println(stats);

    }
}
