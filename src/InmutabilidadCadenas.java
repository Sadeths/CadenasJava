public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilidad de Cadenas
        var cadena1 = "Hola";
        System.out.println("Cadena 1: " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("Cadena 1 modificado: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);
    }
}
