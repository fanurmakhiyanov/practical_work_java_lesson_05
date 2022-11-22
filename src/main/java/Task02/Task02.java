package Task02;

import java.util.*;
import java.util.Collections;
import java.util.logging.Logger;

public class Task02 {
    public static String main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        ArrayList<String> workerList = new ArrayList<>(List.of(
                "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"));
        logger.info(sortNameDescending(getMapNames(workerList)));

        public static Map<String, Integer> getMapNames (List<String> workerList) {
            Map<String, Integer> countMap = new HashMap<>();

            for (String worker : workerList) {
                String name = worker.split(" ")[0];
                if (!countMap.containsKey(name))
                    countMap.put(name, 1);
                else
                    countMap.put(name, countMap.get(name) + 1);
            }
            return countMap;
        }

        public static String sortNameDescending (Map < String, Integer > map){
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Map<String, Integer> result = new LinkedHashMap<>();
            list.sort(Map.Entry.comparingByValue());
            Collections.reverse(list);
            return list.toString();

        }
    }
}
