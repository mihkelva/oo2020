package w03_klassikomplekt.Game.Character;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < 100; i = i + 2) {
            arrayList.add(i);
            counter++;
        }
        System.out.println(counter);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
            System.out.println(arrayList);


        Set setList = new HashSet();
        setList.add("Hallo");
        setList.add("Hello");
        setList.add("Hallo");
        setList.add("Helloo");
        setList.add("Hallo");
        setList.add("Hellou");
        setList.add("Hallo");
        setList.add("Hallo");
        setList.add("Hola");

        int helloCounter = 0;
        for(Object object : setList) {
            String hello = ((String) object).toLowerCase();
            if (hello.equals("hallo")) {
                helloCounter++;
            }
        }
        System.out.printf("Kokku on 'hellosid' %d tükki %n", helloCounter);
        System.out.printf("Kokku on listi pikkus %d elementi %n",setList.size());

        System.out.printf("String %s decimal %d on siin lauses %n", "hei", 6 );


        String oranges = "Apelsinid";
        Map<String, Integer> fruitBasket = new HashMap<String, Integer>();
        fruitBasket.put(oranges, 5);
        fruitBasket.put("Õunad", 2);
        fruitBasket.put("Mandariinid", 6);
        fruitBasket.put("Pirnid",7);
        fruitBasket.put("Porgandid", 1);
        fruitBasket.put("Kaalikad", 0);
        fruitBasket.put("Kartulid", 2);
        fruitBasket.put("Mangod", 4);

        System.out.println(fruitBasket);
        fruitBasket.remove("Kaalikad");
        System.out.println(fruitBasket);
        System.out.printf("%s - %d %n", oranges,fruitBasket.get(oranges));



        Map<String, Integer> longjump = new TreeMap<String, Integer>();
        longjump.put("Peeter", 140);
        longjump.put("Mati", 120);
        longjump.put("Kalle", 170);
        longjump.put("Tõnis", 130);
        longjump.put("Lauri", 150);

        System.out.println(longjump);
    }
}
