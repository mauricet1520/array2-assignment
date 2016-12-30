package com.tiy.practice;

/**
 * Created by crci1 on 12/30/2016.
 */
public class LuckyArray {

    public boolean getLuck(int[] myVaules) {
        for (int i = 0; i <myVaules.length; i++) {
            if (myVaules[i] == 1 || myVaules[i] == 3){
                return false;
            }

        }
        return true;
    }
}
