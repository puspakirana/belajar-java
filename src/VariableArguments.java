public class VariableArguments {
    public static void main(String[] args) {
        //bisa memasukkan value tak terbatas
        sayCongrats("Puspa", 80,90,79,48);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total/values.length;
        if(finalValue >= 75) {
            System.out.println("Selamat "+name+ ", Anda Lulus");
        } else {
            System.out.println("Maaf Anda gagal");
        }
    }
}
