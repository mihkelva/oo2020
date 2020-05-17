package w09_stream.kodused;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForEach {
    public static void main(String[] args) {
        // 2) Luua 3 List tüüpi muutujat, milles ühe sees on stringid, teise sees integer arvud ja forEachiga välja printida
        List<Integer> integerList = Arrays.asList(7,8,9,10,11);
        List<String> stringList = Arrays.asList("Üksi", "Kaksi", "Kolme", "Nelja", "Viisi", "Kuusi");
        List<Boolean> booleanList = Arrays.asList(true, true, true, true, true, false);


        integerList.forEach(System.out::println);
        stringList.forEach(i -> System.out.println(i));
        for (Boolean b : booleanList){
            System.out.println(b);
        }

        System.out.println();
        // 3) Kasutada filter/map/skip/min/max/count/collect funktsioone ja näidata midagi huvitavat nende andmetega

        List<Integer> newIntegerList = integerList.stream().filter(e -> e > 8).skip(1).collect(Collectors.toList());
        newIntegerList.forEach(System.out::println);
        System.out.println();

        System.out.println(stringList.stream().filter(e -> e.substring(0,1).equals("K")).count());
        System.out.println();

        List<Boolean> newBooleanList = booleanList.stream().map(e -> !e).skip(3).collect(Collectors.toList());
        newBooleanList.forEach(System.out::println);
        System.out.println();

       // 4) IntStream.of ja IntStream.range -iga näidata toimivust mingisugusest kogumikust välja filtreerida paaris
        // ja paaritud arvud ning kasutada allMatch/anyMatch funktsioone ka, et leida esinevus

        System.out.println(IntStream.of(2,3,4,6,8,10).skip(2).allMatch(e -> e % 2 == 0));
        System.out.println(IntStream.of(2,3,4,6,8,10).limit(2).anyMatch(e -> e % 2 != 0));
        System.out.println(IntStream.of(2,3,4,6,8,9,10).skip(2).limit(3).allMatch(e -> e % 2 == 0));
        System.out.println();

        IntStream.range(1, 10).filter(e -> e % 2 == 0).forEach(System.out::println);

    }
}

