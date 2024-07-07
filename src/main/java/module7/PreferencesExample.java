package module7;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.prefs.Preferences;


public class PreferencesExample {

    private Preferences prefs;


    public PreferencesExample() {

        prefs = Preferences.userNodeForPackage(PreferencesExample.class);

    }


    public void setPreference(String key, String value) {

        prefs.put(key, value);

    }


    public String getPreference(String key) {

        return prefs.get(key, "default");

    }


    public void removePreference(String key) {

        prefs.remove(key);

    }


    public static void main(String[] args) {

        PreferencesExample example = new PreferencesExample();

        example.setPreference("username", "user1");

        System.out.println("Username: " + example.getPreference("username"));

        example.removePreference("username");

        System.out.println("Username after removal: " + example.getPreference("username"));

    }
    
    public void iterateMapJava7(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public List<String> filterListJava7(List<String> list) {
        List<String> filteredList = new ArrayList<>();
        for (String item : list) {
            if (item.startsWith("A")) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }


}

