//Tipe Data Number -> Konversi

public class KonversiNumber {
    public static void main(String[] args) {
        //Konversi Tipe Data Number
        // Widening Casting (Otomatis): byte->short->int->long->float->double
        // Narrowing Casting (Manual) : double->float->long->int->char->short->byte

        //Otomatis
        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong3 = iniInt2;
        double iniDouble2 = iniLong3;

        //Manual
        float iniFloat2 = (float) iniDouble2;
        long iniLong4 = (long) iniFloat2;
        int iniInt3 = (int) iniLong4;
        short iniShort3 = (short) iniInt3;
    }
}
