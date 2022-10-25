public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Puspakirana";

        int age = 22;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        //Sejak java 10 ada kata kunci var untuk membuat variable (tdk perlu sebutkan tipe datanya, tapi harus inisialisasi value)
        var age2 = 22;
        var address2 = "UK";
        var name2 = "Angel";

        System.out.println(name2);
        System.out.println(age2);
        System.out.println(address2);

        //Kata kunci final
        //final -> variabel konstan, tidak boleh diubah
        final var name3 = "Mia";
        System.out.println(name3);

    }
}
