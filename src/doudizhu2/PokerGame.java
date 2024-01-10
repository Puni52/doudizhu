package doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerGame {

    static HashMap<Integer,String>hm=new HashMap<>();
    static ArrayList<Integer>list=new ArrayList<>();


    static{
        String[] color={"♦","♣","♥","♠"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2",};

        int serialNumber=1;
        for(String n:number){
            for(String c:color){
                hm.put(serialNumber,c+n);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        serialNumber++;
        hm.put(serialNumber,"大王");
        System.out.println(hm);
       }

       public PokerGame() {
        //洗牌


        //发牌



        //看牌




       }




}
