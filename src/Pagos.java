public class Pagos {
	
	public static void online() {
		
		int saldo = 30000;
		
		
				Imprimir.pantalla(""" 
                Ingrese la opción deseada: 
                1- Luz
                2- Agua
                3- Gas
                4- Telefono""");
                int op = Datos.num();

                switch (op) {
                
                    case 1:
                    	
                    	Imprimir.pantalla("""
                    	--------------------------------		
                    	---Ingrese su Nro. de cliente:--
                    	--------------------------------""");
                        int num = Datos.num();
                        
                        Imprimir.pantalla("""
                        --------------------------------		
                        ---Ingrese el monto a pagar:----
                        --------------------------------""");
                        int monto = Datos.num();
                        
                        if (monto <= saldo) {
                        	Imprimir.pantalla("""
                        	-----------------------------------------		
                        	La transferencia fue realizada con exito
                        	Su saldo actual es de: """+ (saldo - monto));
                        	Imprimir.pantalla("""
                        	-----------------------------------------""");	
                        } else {
                        	Imprimir.pantalla("""
                        	----------------------------------------------------		
                        	La operación no puede realizarse por falta de fondos
                        	----------------------------------------------------"""); 
                        }
		                Imprimir.subMenu();
		                System.exit(0);
		                
                    case 2:
                    	
                    	Imprimir.pantalla("""
                    	--------------------------------		
                    	---Ingrese su Nro. de cliente:--
                    	--------------------------------""");
                        num = Datos.num();
                        
                        Imprimir.pantalla("""
                        --------------------------------		
                        ---Ingrese el monto a pagar:----
                        --------------------------------""");
                        monto = Datos.num();
                        
                        if (monto <= saldo) {
                        	Imprimir.pantalla("""
                        	-----------------------------------------		
                        	La transferencia fue realizada con exito
                        	Su saldo actual es de: """+ (saldo - monto));
                        	Imprimir.pantalla("""
                        	-----------------------------------------""");	
                        } else {
                        	Imprimir.pantalla("""
                        	----------------------------------------------------		
                        	La operación no puede realizarse por falta de fondos
                        	----------------------------------------------------"""); 
                        }
                        Imprimir.subMenu();
                        System.exit(0);
		                
                    case 3:
                    	
                    	Imprimir.pantalla("""
                    	--------------------------------		
                    	---Ingrese su Nro. de cliente:--
                    	--------------------------------""");
                        num = Datos.num();
                        
                        Imprimir.pantalla("""
                        --------------------------------		
                        ---Ingrese el monto a pagar:----
                        --------------------------------""");
                        monto = Datos.num();
                        
                        if (monto <= saldo) {
                        	Imprimir.pantalla("""
                        	-----------------------------------------		
                        	La transferencia fue realizada con exito
                        	Su saldo actual es de: """+ (saldo - monto));
                        	Imprimir.pantalla("""
                        	-----------------------------------------""");	
                        } else {
                        	Imprimir.pantalla("""
                        	----------------------------------------------------		
                        	La operación no puede realizarse por falta de fondos
                        	----------------------------------------------------"""); 
                        }
                        Imprimir.subMenu();
                        System.exit(0);
		                
                    case 4:
                    	
                    	Imprimir.pantalla("""
                    	--------------------------------		
                    	---Ingrese su Nro. de cliente:--
                    	--------------------------------""");
                        num = Datos.num();
                        
                        Imprimir.pantalla("""
                        --------------------------------		
                        ---Ingrese el monto a pagar:----
                        --------------------------------""");
                        monto = Datos.num();
                        
                        if (monto <= saldo) {
                        	Imprimir.pantalla("""
                        	-----------------------------------------		
                        	La transferencia fue realizada con exito
                        	Su saldo actual es de: """+ (saldo - monto));
                        	Imprimir.pantalla("""
                        	-----------------------------------------""");	
                        } else {
                        	Imprimir.pantalla("""
                        	----------------------------------------------------		
                        	La operación no puede realizarse por falta de fondos
                        	----------------------------------------------------"""); 
                        }
                        Imprimir.subMenu();
                        System.exit(0);
		                
                    default:
                        System.out.println ("""
                        -----------------------------------------------
                        ***opción no disponible, vuelva a intentarlo***
                        -----------------------------------------------""");
                        Pagos.online();
                        break;
                }

            
	}

}
