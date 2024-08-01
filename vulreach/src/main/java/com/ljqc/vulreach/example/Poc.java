package com.ljqc.vulreach.example;

import java.io.IOException;

public class Poc extends Exception {
    public void setName(String str) {
        try {
            Runtime.getRuntime().exec(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
