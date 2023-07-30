package com.arms.bonyeon;

public class Tv {

    private String  color;
    private Integer chennel;
    private Boolean power;

    void power() {

        power = !power;

    }

    void channelUp() {

        ++chennel;

    }

    void channelDown() {

        --chennel;

    }
}
