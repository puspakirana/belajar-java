public class MethodOverloading {
    //Ketentuan: data parameter di method tsb harus beda jumlah / tipe data
    static void sayHello(){
        System.out.println("Hello World");
    }

    static void sayHello(String name){
        System.out.println("Hello, "+name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Puspa");
        sayHello("Puspakirana", "Stavira");
    }
}
