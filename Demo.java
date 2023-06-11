package com.practice.easyProblems;

public class Demo {

    public static void main(String[] args) {

        int[] array={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(palindrome("MOM"));
        System.out.println(palindrome("banana"));
        for (int x:threeSum(array)){
            System.out.print(x);
        }

    }

    public static boolean palindrome(String word){

        String reversed="";
        int N=word.length();
        for (int i=N-1; i>=0; i--){
            reversed+=word.charAt(i);
        }
        return word.equals(reversed);

    }

    public static int[] threeSum(int[] array){

        int N=array.length;
        for (int x=0; x<N-2; x++){
            for (int y=x+1; y<N-1; y++){
                for (int z=y+1; z<N; z++){
                    if (array[x]+array[y]+array[z]==0){
                        return new int[]{x, y, z};
                    }
                }
            }
        }
        return null;

    }

}
