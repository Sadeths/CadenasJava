public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("Cadena original: " + cadena);

        // Reemplzar "Mundo" por a " a todos"
        var nuevaCadena = cadena.replace("Mundo" , "a todos");
        System.out.println("Cadena nueva: " + nuevaCadena);

        // Reemplazar " Hola" por " Adios"
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("Cadena nueva: " + nuevaCadena);
    }
}
