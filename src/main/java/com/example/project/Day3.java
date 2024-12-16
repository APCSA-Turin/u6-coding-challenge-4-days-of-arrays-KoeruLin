package com.example.project;

public class Day3 
{
      public static String[][] generateSnowflake(int size) 
      { //you will be tested on this method
        String[][] grid = new String[size][size];

        for (int i = 0; i < size; i++) 
        {
          grid[i][size / 2] = "*"; 
          grid[size / 2][i] = "*"; 
          grid[i][i] = "*";      
          grid[i][size - 1 - i] = "*"; 
        }

        for (int z = 0; z < size; z++)
        {
          for (int j = 0; j < size; j++)
          {
            grid[z][j] = (grid[z][j] == null) ? " " : grid[z][j];
          }
        }

        return grid;
      }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) 
    {
      for (int z = 0; z < snowflake.length; z++)
      {
        for (int j = 0; j < snowflake[z].length; j++)
        {
          System.out.print(snowflake[z][j]);
        }

        System.out.println("");
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) 
    {
      printSnowflake(generateSnowflake(5));
    }
}
