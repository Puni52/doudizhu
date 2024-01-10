package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();


    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};

        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);

//        System.out.println(hm);
//        System.out.println(list);
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else if (i % 3 == 2) {
                player3.add(serialNumber);
            }
        }
        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        //看牌
        lookPoker("地主",lord);
        lookPoker("玩家一",player1);
        lookPoker("玩家二",player2);
        lookPoker("玩家三",player3);


    }
    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name+":");
        for(int serialNumber:ts){
            String poker=hm.get(serialNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }

}
