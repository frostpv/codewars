package cata7;

import java.util.Arrays;

public class SuzukiChores {
    public static int[] choreAssignments(int[] chores) {
        choresValidation(chores);
        Arrays.sort(chores);
        return populateResultArray(chores, createResultArray(chores.length));
    }

    private static int[] populateResultArray(int[] chores, int[] resultArray){
        for (int i = 0; i <= resultArray.length-1; i++) {
            resultArray[i] = chores[i] + chores[(chores.length -1) - i];
        }
        Arrays.sort(resultArray);
        return resultArray;
    }

    private static int[] createResultArray(int inputArrayLent) {
        return new int[inputArrayLent/2];
    }

    private static void choresValidation (int[] chores) {
        if(isChoresEmpty(chores)) {
            throw new IllegalArgumentException("Chores shouldn't be empty");
        }

        if(!isAllChoresIsLessThanTen(chores)) {
            throw new IllegalArgumentException("Chore shouldnt be more than 10");
        }

        if(!isChoreLentIsCorrect(chores)) {
            throw new IllegalArgumentException("Chores lent more than 30");
        }
    }

    private static boolean isChoreLentIsCorrect(int[] chores) {
        return chores.length <= 30;
    }

    private static boolean isChoresEmpty(int[] chores) {
        return chores == null || chores.length == 0;
    }

    private static boolean isAllChoresIsLessThanTen (int[] chores) {
        for (int chore : chores) {
            if(chore > 10) {
                return false;
            }
        }
        return true;
    }
}
