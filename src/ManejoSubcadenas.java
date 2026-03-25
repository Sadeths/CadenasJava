public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Tema de subcadenas
        //substring (inicio, fin (sin incluirlo))
        var cadena1 = "Hola Mundo";
        System.out.println("Cadena 1: " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("Subcadena 1: " + subcadena1);

        var subcadena2 = cadena1.substring(5, 10);
        System.out.println("Subcadena 2: " + subcadena2);
    }
}
