public class GeneradorEmail {
    public static void main(String[] args) {
        //Crear un programa para generar un email a partir de los siguientes datos:
        //Nombre, empresa, dominio

        System.out.println("*** Generador de Email ***");

        //Se declaran las variables 
        var nombre = "Samahel Thomas";
        var empresa = " Google";
        var dominio = ".com.gt";

        //Se imprime el nombre del usuario 
        System.out.println("Nombre del usuario: " + nombre);
        nombre = nombre.toLowerCase().replace(" ", ".");
        System.out.println("Nombre del usuario normalizado: " + nombre);
        System.out.println("\n");
        
        //Se imprime el nombre de la empresa
        System.out.println("Nombre de la empresa: " + empresa);
        System.out.println("Extension del dominio: " + dominio); 
        var dominioEmail = empresa.toLowerCase().replace(" ", "@") + dominio;
        System.out.println("Dominio de email normalizado: " + dominioEmail);
        System.out.println("\n");

        //Se imprime el email generado
        System.out.println("Email final generado: " + nombre + dominioEmail);
        System.out.println("\n");
        System.out.println("*** Fin del programa ***");
    }
}
