import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {

    static List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        task2(list);
        System.out.println();

    }

    public static <T> void findMinMax(Stream<T> stream, Comparator<T> comparator, BiConsumer<T, T> minMaxConsumer) {
        minMaxConsumer.accept(
                stream.min(comparator).orElse(null),
                stream.max(comparator).orElse(null));
    }

    public static void task2(List<Integer> list) {
        List<Integer> result = list.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(result);
    }
}