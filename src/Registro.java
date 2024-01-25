public class Registro {
	
	public static void alta(){

        Imprimir.pantalla("""
        -------------------------------------------------
        -------***Bienvenidos a Homebanking***-----------
        ***A continuación Resgistre su Usuario y Clave***
        -------------------------------------------------""");
        Imprimir.pantalla("""
        ------***Ingrese usuario a registrar***----------""");
        String userRegistro = Datos.txt();
        Imprimir.pantalla("""
        ------***Ingrese Clave a registrar***------------""");
        String passRegistro = Datos.txt();
    
        Validacion.verificar(userRegistro, passRegistro);
        
    }

}
