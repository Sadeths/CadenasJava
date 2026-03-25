public class CaracteresEspeciales {
    public static void main(String[] args) {
        //caracteres especiales
        //\n - imprimir un salto de linea 
        var cadena1 = "Hola \nMundo";
        System.out.println("Cadena 1: " + cadena1);

        //'\t' - tabulador 
        var cadena2 = "\tHola\tMundo";
        System.out.println("Cadena 2: " + cadena2);

        // '\'' - agrega una comilla simple
        var cadena3 = "Hola \' Mundo";
        System.out.println("Cadena 3: " + cadena3);

        // '\"' - agrega una comilla doble
        var cadena4 = "Hola \" Mundo";
        System.out.println("Cadena 4: " + cadena4);

        // '\\' - agrega una barra invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("Cadena 5: " + cadena5);

    }
}
