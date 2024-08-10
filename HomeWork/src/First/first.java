package First;

import java.util.ArrayList;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer> randDoubleWin = new ArrayList<>();
        randDoubleWin.add(10);
        randDoubleWin.add(12);
        randDoubleWin.add(30);
        randDoubleWin.add(16);
        randDoubleWin.add(7);
        randDoubleWin.add(17);
        randDoubleWin.add(12);
        System.out.println("RandDoubleWin: " + randDoubleWin);
        int count = 0;
        while (true) {
            ArrayList<Integer> randDouble = getRandDouble();
            boolean isWin = IsWin(randDouble, randDoubleWin);
            count++;
            System.out.println("The result is: " + isWin);
            if (isWin) {
                break;
            }
        }
        System.out.println("Count: " + count);
    }

    public static ArrayList<Integer> RandDouble(ArrayList<Integer> arRed, ArrayList<Integer> arBlue) {
        ArrayList<Integer> arRedRand = new ArrayList<>();
        ArrayList<Integer> arBlueRand = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int rand = (int) (Math.random() * arRed.size());
            arRedRand.add(arRed.get(rand));
            arRed.remove(rand);
        }
        arRedRand.sort((o1, o2) -> o1 - o2);
        for (int i = 0; i < 1; i++) {
            int rand = (int) (Math.random() * arBlue.size());
            arBlueRand.add(arBlue.get(rand));
            arBlue.remove(rand);
        }
        System.out.println("Red: " + arRedRand);
        System.out.println("Blue: " + arBlueRand);
        ArrayList<Integer> arRand = new ArrayList<>();
        arRand.addAll(arRedRand);
        arRand.addAll(arBlueRand);
        return arRand;
    }

    public static boolean IsWin(ArrayList<Integer> randDouble, ArrayList<Integer> randDoubleWin) {
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < randDouble.size() - 1; i++) {
            for (int j = 0; j < randDoubleWin.size() - 1; j++) {
                if (randDouble.get(i) == randDoubleWin.get(j)) {
                    countRed++;
                }
            }
        }
        if (randDouble.get(randDouble.size() - 1) == randDoubleWin.get(randDoubleWin.size() - 1)) {
            countBlue++;
        }
        int count = countRed + countBlue;
        System.out.println("Count: " + count);
        if (count == 6) {
            return true;
        } else {
            return false;
        }
    }
    
    public static ArrayList<Integer> getRandDouble() {
        ArrayList<Integer> arRed = new ArrayList<>();
        ArrayList<Integer> arBlue = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arBlue.add(i + 1);
        }
        for (int i = 0; i < 35; i++) {
            arRed.add(i + 1);
        }
        // System.out.println("Red: " + arRed);
        // System.out.println("Blue: " + arBlue);
        ArrayList<Integer> randDouble = RandDouble(arRed, arBlue);
        System.out.println("RandDouble: " + randDouble);
        return randDouble;
    }
}
