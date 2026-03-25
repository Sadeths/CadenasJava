public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar sucadenas
        //indexof() - devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        //subcadena a buscar "Hola"
        var inidce1 = cadena1.indexOf("Hola");
        System.out.println("Indice 1 de la subcadena: " + inidce1);
        //lastIndexOf() - devuelve el indice de la ultima aparicion de la subcadena
        //subcadena de Mundo 
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("Indice 2 de la subcadena: " + indice2);
        //subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("Indice 3 de la subcadena: " + indice3);

    }
}
