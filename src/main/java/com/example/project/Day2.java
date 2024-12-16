
package com.example.project;
import java.util.Random;

public class Day2
{
    public static String[][] nameSort(String[] names)
    { 
        Random random = new Random();
        String[] nice = new String[names.length];
        String[] naughty = new String[names.length];
        int niceLength = 0;
        int naughtyLength = 0;

        for(int i = 0; i < names.length; i++)
        {
            int assign = random.nextInt(2);

            switch (assign)
            {
                case 0:
                    nice[niceLength] = names[i];
                    niceLength++;
                    break;
                case 1:
                    naughty[naughtyLength] = names[i];
                    naughtyLength++;
                    break;
            }
        }

        String[][] fullList = {nice, naughty};

        return fullList; 
    }

    public static void main(String[] args)
    {
        String[] blah = {"one", "two", "three", "four", "five", "six", "seven"};
        String[][] test = nameSort(blah);

        for (String name : test[0])
        {
            System.out.println(name);
        }

        for (String names : test[1])
        {
            System.out.println(names);
        }
    }
}