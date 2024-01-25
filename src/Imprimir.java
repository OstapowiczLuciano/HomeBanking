import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Imprimir {
	
	public static void pantalla (String txt){
        System.out.println(txt);

    }
	
	public static void subMenu() {
		
                Imprimir.pantalla("""
                ---------------------------------
                Ingrese la opción deseada:
                1- Volver al menú principal
                2- Salir de Homebanking
                ---------------------------------""");
                int seleccion = Datos.num();
                
                switch (seleccion) {
                
				case 1:
					
					MenuPrincipal.menu();
					break;
					
				case 2:
					Imprimir.pantalla("""
        			----------------------------------
        			***Gracias por usar Homebanking***
        			----***Extraiga su tarjeta***-----""");
        			break;

				default:
					Imprimir.pantalla("""
        			------------------------------------------------		
        			---------***Opción incorrecta***----------------
        			---------***Retire su tarjeta***----------------
        			------------------------------------------------""");
					break;
					
				}
                
        			
                
                
	}
	
	public static void bloqueo() {
		
		Imprimir.pantalla("""
    			------------------------------------------------
    			***Usuario Bloqueado, su tarjeta fue retenida***
    			------------------------------------------------
    			Elija la opción correspondiente para Información:
    			
    			1- Información
    			 """);
    	
    			int op = Datos.num();
    			
    			if (op == 1) {
    				
				Imprimir.pantalla("""
				-------------------------------------------------
				***Comuniquese con el Banco al Nro. 4589-6531----
				de lunes a viernes en el horario de 10 a 15 hs***
				-------------------------------------------------""");
				Imprimir.pantalla("""
    			----***Gracias por usar Homebanking***-----------
    			--------***Extraiga su tarjeta***----------------""");
				return;
    				
    			}else {
    				Imprimir.pantalla("""
    				--------------------------
    				***Opción no disponible***		
    				-***Retire su tarjeta***--
    				--------------------------""");
    				System.exit(0);
    			}

                	
    	
    }

	
}
