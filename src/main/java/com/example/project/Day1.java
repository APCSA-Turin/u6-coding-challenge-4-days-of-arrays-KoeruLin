package com.example.project;
import java.util.Random;
public class Day1
{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name)
    {
        Random random = new Random();
    
        if (name.isBlank() || name == null)
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        return elf_names[random.nextInt(4)] + " " + name;  
    }
}