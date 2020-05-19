package w11_proovikontrolltoo.generics;

import java.util.List;

public class Generics {

    public static <T> T getFirst(List<T> list) {
        if (list.isEmpty()) return null;
        return list.get(0);
    }

    public static <T extends House> int getBedrooms(T type) {
        return type.bedrooms;
    }

    public static <T> String getType(T type) {
        return type.getClass().getSimpleName();
    }

}