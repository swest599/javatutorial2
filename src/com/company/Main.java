package com.company;

    public class Main {

        public static void main(String[] args) {
        int number = -1;
        if((number %2 == 0) && (number > 0)){
                System.out.println("positive even");
        }else if ((number %2 != 0) && (number > 0)){
                System.out.println("positive odd");
            }else if((number %2 != 0) && (number < 0)){
                System.out.println("negative odd");
            }else{
                System.out.println("negative even");
            }
        }
    }
