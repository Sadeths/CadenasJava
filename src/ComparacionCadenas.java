public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparcion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparcion de cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referncia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        //Comparamos cadena1 con cadena3 (referncias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Comparar contenido usaremos el metodo equals
        System.out.print("cadena1 es igual a contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
