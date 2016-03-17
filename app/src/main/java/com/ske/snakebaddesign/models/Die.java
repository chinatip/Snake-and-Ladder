package com.ske.snakebaddesign.models;

import java.util.Random;

public class Die {

    public int roll(){
        return 1 + new Random().nextInt(6);
    }

}
