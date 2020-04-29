package com.exercise.cleancode;

public class meaningful {

    public static void copyChars(char[] source,char[] destination){
        for (int i = 0; i < source.length; i++){
            destination[i] = source[i];
        }
    }

    public void test() {
        for (int i = 0; i < 34; i++) {
            System.out.println(i);

        }
        int NUMBER_OF_TASKS = 100;
        int realDaysPerIdealDay = 4;
        int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;
        int[] taskEstimate = new int[100];
        for (int i = 0; i < taskEstimate.length; i++){
            taskEstimate[i] = i;
        for (int j = 0; j < NUMBER_OF_TASKS; j++){
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays) / WORK_DAYS_PER_WEEK;

            }
        }
    }
}
