import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/**
 * Created by HuYongBin on 2014/12/5.
 */
public class Main {

    public static void main(String[] args) {
//        lambde表达式中使用var,可加annotation。paramters必须统一加var
//        BiConsumer<String, String> consumer = (@NotNull var x, @Nullable var y) -> x.process(y);
        List<String> values = makeData();
        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    private static List<String> makeData() {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;
    }

}
