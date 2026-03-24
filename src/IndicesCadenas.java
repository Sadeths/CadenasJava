public class IndicesCadenas {
    public static void main(String[] args) {
        //Manejo de indices en cadenas
        var cadena1 = "Hola Mundo";



        // Recuperar el primer caracter 
        var primerCaracter = cadena1.charAt(0); //Recuperar el caracter "H"
        System.out.println("Primer caracter: " + primerCaracter);
        //Recuperar el ultimo caracter (posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("Ultimo caracter: " + ultimoCaracter);
        //Recuperar el 6to caracter (posicion 5)
        var sextocaracter = cadena1.charAt(5);
        System.out.println("Sexto caracter: " + sextocaracter);
    }
}
