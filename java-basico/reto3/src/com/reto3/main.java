package com.reto3;

public class main {
    public static void main(String[] args) {
        String[] text = {"Hello", "how", "are you? "};
        String phrases;
        for (String words : text) {
            phrases = words + " ";
            System.out.print(phrases);
        }
    }
}
