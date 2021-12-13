public class Dice {
    package com.snakeAndLadders;
    import java.lang.Math;
    public class Dice{
        private static int min;
        private static int max;
        public static void setNoofDice(int n){
            min= n;
            max= 6*n;
        }
    public static int getMax(){
        return max;
    }
    public static int getmax(){
        int range =max-min+1;
        int ran= (int)(Math.random()*range)+min;
        return rand;
    }
}
