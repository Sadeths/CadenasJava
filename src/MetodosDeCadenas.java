public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";
        
        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("Cadena con caracteres reemplazados: " + nuevaCadena);

        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("Cadena en mayusculas: " + mayusculas);

        // Convertir a minusculas
        System.out.println("Cadena en minusculas: " + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes  ";
        System.out.println("Cadena 2 con espacios: " + cadena2);
        System.out.println("Cadena 2 sin espacios: " + cadena2.trim());

    }
}
