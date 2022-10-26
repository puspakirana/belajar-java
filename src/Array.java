public class Array {
    public static void main(String[] args) {
        //Cara1
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Puspa";
        stringArray[1] = "Ariel";
        stringArray[2] = "Aurora";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Moana";

        System.out.println(stringArray[0]);

        //Cara 2
        String[] stringArray2 = new String[3];

        //Cara 3
        int[] arrayInt = new int[] {
                10, 90, 80, 67, 29
        };

        //Cara 4
        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        System.out.println(arrayInt.length);

        //Array di dalam array
        String[][] members = {
                {"Aurora", "Ariel"},
                {"Budi", "Mamat"},
                {"Siapa", "Kamu"}
        };

        System.out.println(members[2][1]);
    }
}
