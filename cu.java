package com.company;
import java.util.Random;
import java.util.Scanner;
/*1 den 49 a kadar olan sayıları rastegele çekmek ve birbirlerinden farklı olmalılar */
public class Main {
    public static void main(String[] args) {
        int kolon=0,number;
        boolean numbercheck[]= new boolean[50];
        while(kolon<8) {
            for (int i = 0; i < 6;) {
                number = 1 + (int) (Math.random() * 49);
            if(numbercheck[number]==false){
                System.out.print(" "+number+" ");
                i++;
                numbercheck[number]=true;
            }
            }
            kolon++;
            System.out.println();
        }
    }
}
