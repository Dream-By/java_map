package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String[] name=new String[n];
        int[] phone=new int[n];

        for(int i=0;i<n;i++)
        {
            name[i]=in.nextLine();
            phone[i]=in.nextInt();
            in.nextLine();
        }
        HashMap<String,Integer> hash=new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String s=name[i];
            int p=phone[i];
            hash.put(s,p);
        }

        while(in.hasNext())
        {
            String s=in.nextLine();
            if(hash.containsKey(s))
                System.out.println(s+"="+hash.get(s));
            else
                System.out.println("Not found");

        }


    }
}
