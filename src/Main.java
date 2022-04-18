public class Main {
    public static void main(String[] args) {
        ///Задача 1:
        int[] task0 = new int[3];
        task0[0] = 1;
        task0[1] = 2;
        task0[2] = 3;
        float[] task1 = {1.57f, 7.654f, 9.986f};
        float[] temperatureSheetW1 = { 38.4f, 38.1f, 38.1f, 37.9f, 37.4f, 37.0f, 36.6f};
        /// Задача 2:
        for (int i = 0; i < task0.length; i++) {
            if (i == task0.length - 1){
                System.out.print(task0[i]);
            } else {
                System.out.print(task0[i] + ",");}
        }
        System.out.println();
        for (int i = 0; i < task1.length; i++) {
            if (i == task1.length - 1) {
                System.out.print(task1[i]);
            } else {
                System.out.print(task1[i] + ",");
            }
        }
        System.out.println();
        for (int i = 0; i < temperatureSheetW1.length; i++) {
            if (i == temperatureSheetW1.length - 1) {
                System.out.print(temperatureSheetW1[i]);
            } else {
                System.out.print(temperatureSheetW1[i] + ",");
            }
        }
        System.out.println();
        ///Задача 3:
        for (int x = task0.length - 1; x >= 0; x--) {
            if (x > 0){
                System.out.print(task0[x] + ",");
            } else {
                System.out.print(task0[x]);}
        }
        System.out.println();
        for (int x = task1.length - 1; x >= 0; x--) {
            if (x > 0){
                System.out.print(task1[x] + ",");
            } else {
                System.out.print(task1[x]);}
        }
        System.out.println();
        for (int x = temperatureSheetW1.length - 1; x >= 0; x--) {
            if (x > 0){
                System.out.print(temperatureSheetW1[x] + ",");
            } else {
                System.out.print(temperatureSheetW1[x]);}
        }
        System.out.println();
        ///Задание 4:
        for (int i = 0; i < task0.length; i++) {
            if (task0[i]%2 != 0){
                task0[i] = task0[i] + 1;
            } else {
                task0[i] = task0[i];}
            System.out.print(task0[i]);
        }
    }
}