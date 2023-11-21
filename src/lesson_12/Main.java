package lesson_12;

import lesson_12.football.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        // Добавление элементов .put
        hashMap.put("Zenit", 20);
        hashMap.put("Spartak", 18);
        hashMap.put("Rubin11", 15);
        hashMap.put("Rubin22", 333);
        hashMap.put("Lokomotiv", 10);
        hashMap.put(null, 111);

//        ArrayList<String> list = new ArrayList<>();
//
//        for (String s : list) {
//
//        }

        HashMap<String, Team> table = new HashMap<>();


        table.put("Zenit", new Team(30, 20, 21));
        table.put("Spartak", new Team(25, 20, 31));
        table.put("Rubin", new Team(35, 20, 27));


//        for (Map.Entry<String, Team> e : hashMap.entrySet()) {
//            System.out.println(e.getKey() + " \n Games: " + e.getValue().getGames()
//                    " \n Score: " + e.getValue().getScore() +
//                    " \n Goals: " + e.getValue().getGoals());
//        }

        //4- Печать ключей

        for (String s: table.keySet()) {
            System.out.println(s + ";");
        }

        //5-вернуть значение по ключу

        for (String s: table.keySet()) {
            System.out.println("Goals of " + s + " = "  + table.get(s).getGoals() + ";" );
        }
    }
}
