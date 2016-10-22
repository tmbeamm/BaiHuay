package com.example.baihuay.model;

import java.util.Random;

/**
 * Created by ComPuTer on 22/10/2559.
 */

public class Huay {
    Random rand = new Random();
    public  String getRandomTwoDigits(){
        int r = rand.nextInt(100);
        String str = Integer.toString(r);
        if(r<10)
            str = "0"+ r;
        return  str;
    }
    public  String getRandomThreeDigits(){
        int r = rand.nextInt(1000);
        String str = Integer.toString(r);
        if(r<10) {
            str = "00" + r;
        }
        else if(r>9 && r<100) {
            str = "0" + r;
        }
            return str;
    }

}
