public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //Tipe data bukan primitif tidak memiliki nilai default
        Integer iniInteger =10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; //null
        iniShort = 100;

        //konversi primitif -> bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        int iniIntAgain = iniInteger2;

        short shortNum = iniInteger2.shortValue();
        byte byteNum = iniInteger2.byteValue();

        Long amount = 1_000_000L;
    }
}
