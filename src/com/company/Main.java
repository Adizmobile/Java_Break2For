package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arrA[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0 ; i < 3; i++){
            for (int j = 0; j < 3; j ++){
                if (i==1 && j==2){
                    break;
                }
                System.out.println(i + "   " + j);
            }
        }
    }
}
