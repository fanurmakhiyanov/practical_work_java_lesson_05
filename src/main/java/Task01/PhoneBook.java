package fanur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    static Map<String, ArrayList<String>> phoneMap = new HashMap<>();

    public void addRow(String name, String phoneNumber) {
        if (!phoneMap.containsKey(name)) {
            phoneMap.put(name, new ArrayList<>(List.of(phoneNumber)));
        } else {
            phoneMap.get(name).add(phoneNumber);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (var row : phoneMap.entrySet()) {
            result.append("\n" + row.getKey() + ": " + row.getValue());
        }
        return result.toString();
    }

}
