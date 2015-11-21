package task03;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Random random = new Random();
    private static Set<RunningResult> runningResults = new TreeSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //Додавання результатів змагань
            addRunningResult(800, "чоловіча");
            addRunningResult(800, "жіноча");
            addRunningResult(1500, "чоловіча");
            addRunningResult(1500, "жіноча");
            addRunningResult(5000, "чоловіча");
            addRunningResult(10000, "чоловіча");
            addRunningResult(10000, "жіноча");
            addRunningResult(420000, "чоловіча");
            addRunningResult(420000, "жіноча");
        }

        //Видалення результатів змагань
        runningResults.remove(addRunningResult(123, "для видалення"));

        //Пошук за результатами змагань (для прикладу довше 99.5 секунд)
        System.out.println("Спорстмени, що мають результати більше за 99.5 секунд: ");
        runningResults.stream().filter((result) -> result.getTime() > 99.5).forEach(System.out::println);

        //Вивід найкращих результатів в категорії
        List<RunningResult> bestIn800m = runningResults.stream().filter(runningResult -> runningResult.getSubType().equals("800м"))
                .collect(Collectors.toList());
        Collections.reverse(bestIn800m);
        System.out.println("\nНайкращий у категорії 800м - " + bestIn800m.get(0));
    }

    private static RunningResult addRunningResult(int distance, String sex) {
        RunningResult runningResult = new RunningResult(distance + "м", Math.pow(random.nextDouble() * 10, 2), sex);
        runningResults.add(runningResult);
        return runningResult;
    }
}
