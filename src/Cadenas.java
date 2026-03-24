public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");
        
        var cadena1 = "Hola";
        System.out.println("Cadena 1: " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("Cadena 2: " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Cadena 3: " + cadena3);

        //Cadena de multiples líneas (text block)
        var cadena4 = """
                Este es un texto
                multilinea
                mas
                lineas
                """;
        System.out.println("Cadena 4: " + cadena4);
    }
}
