package com.example.project;
import java.util.Random;

public class Day4
{
    
    private static String[] reindeer_names = 
    {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer 
    { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute

        private String name;
        private int distanceTraveled = 0;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int remainingRunTime;
        private int remainingRestTime;



        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) 
        {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.remainingRunTime = runDuration;
            this.remainingRestTime = 0;
        }

        public String getName()
        {
            return name;
        }

        public int getDistanceTraveled()
        { // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond()
        { //this method is required but not tested
            if (remainingRunTime > 0)
            {
                distanceTraveled += speed;
                remainingRunTime--;

                if (remainingRunTime == 0)
                {
                    remainingRestTime = restDuration;
                }
            }
            else if (remainingRestTime > 0)
            {
                remainingRestTime--;

                if (remainingRestTime == 0)
                {
                    remainingRunTime = runDuration;
                }
            }
        }

        public static String simulateRace(int time, Reindeer[] reindeers)
        { //you will be tested on this method
            for (int i = 1; i <= time; i++)
            {
                for (Reindeer reindeer : reindeers)
                {
                    reindeer.simulateSecond();
                }
            }
        
            Reindeer winner = reindeers[0];

            for (Reindeer reindeer : reindeers)
            {
                winner = (winner.getDistanceTraveled() > reindeer.getDistanceTraveled()) ? winner : reindeer;
            }

            return winner.getName();
        }
    
        public static void main(String[] args) 
        { // for testing purposed 
        }
 
    }
}



