package interfacetugas;

public class BinatangMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("hehehehe","Abu-abu","Kedelai",4);
        Gorilla gorilla = new Gorilla("Hauum Hauum","Hitam manis", "Gulali",2);
        Singa singa = new Singa("Roaarrrr","Coklat","CingaCIng",4);

        keledai.displayData();
        gorilla.displayData();
        singa.displayData();
    }
}
