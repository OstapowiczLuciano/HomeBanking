import javax.swing.event.TreeWillExpandListener;

public class Validacion {
	
public static void verificar(String userRegistro,String passRegistro){
        
        int intentos = 1;
        int acumulador = 1;
        
        do {
            Imprimir.pantalla("""
            -----------------------------------------------
            -------***Bienvenidos a Homebanking***---------
            ***A continuación Ingrese su Usuario y Clave***
            -----------------------------------------------""");
            Imprimir.pantalla("""
            -----------------------------------------------		
            --------Ingrese su usuario, por favor:---------
            ----------------------------------------------- """);
            String user = Datos.txt();
            Imprimir.pantalla("""
            -----------------------------------------------		
            --------Ingrese su contraseña, por favor:------
            ----------------------------------------------- """);
            String pass = Datos.txt();

            if (user.equals(userRegistro) && pass.equals(passRegistro)){
                Imprimir.pantalla("""
                -----------------------------------------------
                -----***Bienvenidos al Menu Principal***-------
                ***A continuación Ingrese la opción deseada***-
                -----------------------------------------------""");
                MenuPrincipal.menu();
                return;
                
            } else {
                Imprimir.pantalla("""
                -----------------------------------------------------------		
                --***Usuario o Clave incorrectos, intentelo nuevamente***--
                -----------------------------------------------------------""");
                acumulador*=intentos;
                ++intentos;
                
                }
                
           
            
        	}while (intentos <= 3);
	            
	        Imprimir.bloqueo();
	        System.exit(0);
        
        		
        			
            			
        			
        			
						
        			
        			
        
        
        
       
        
             
              
        
    }

}
