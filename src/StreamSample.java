import java.util.Comparator;
import java.util.List;
public class StreamSample {
    public static void main(String[] args) {
        List<String> names = List.of("YAMADA", "TANAKA", "YASUDA", "suzuki", "iida");

        names.stream().map(String::toLowerCase).forEach(System.out::println);
        long count = names.stream().filter(name -> name.contains("A")).count();
        List<String> sortedResult1 = names.stream().sorted().toList();
        List<String> sortedResult2 = names.stream().sorted(Comparator.reverseOrder()).toList();
        boolean startY= names.stream().anyMatch(name -> name.startsWith("Y"));

        System.out.println(count);
        System.out.println(sortedResult1);
        System.out.println(sortedResult2);
        System.out.println(startY);
    }
}
