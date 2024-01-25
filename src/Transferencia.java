public class Transferencia {
	
	public static void enviar () {
		
		int saldo = 30000;
		
		Imprimir.pantalla("""
                ----------------------
                ***Elija una opción***
                1- CBU  
                2- Alias
                ----------------------""");
                int op = Datos.num();

                switch (op) {

                    case 1:
                    	
                        Imprimir.pantalla("""
                        -------------------------		
                        ----Ingrese el CBU-------
                        -------------------------""");
                        long num = Datos.cbu();
                        
                        Imprimir.pantalla("""
                        --------------------------		
                        Ingrese monto a transferir
                        --------------------------""");
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
                        ---------------------------		
                        -----Ingrese el Alias------
                        ---------------------------""");
                        String dest = Datos.txt();
                        
                        Imprimir.pantalla("""
                        ---------------------------------		
                        ----Ingrese monto a transferir---
                        ---------------------------------""");
                        monto = Datos.num();
                        
                        if (monto <= saldo) {
                        	Imprimir.pantalla("""
                        	-----------------------------------------		
                        	La transferencia fue realizada con exito
                        	Su saldo actual es de: """+(saldo - monto));
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
                        Imprimir.pantalla("""
                        -----------------------------------------------
                        ***opción no disponible, vuelva a intentarlo***
                        -----------------------------------------------""");
                        Pagos.online();
                        break;
                        
                }
		
	}

}
