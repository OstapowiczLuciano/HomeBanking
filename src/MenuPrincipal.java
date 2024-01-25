public class MenuPrincipal {
	
	public static void menu (){
		
		
             Imprimir.pantalla("""
             1- Datos de usuario
             2- Saldo
             3- Transferencia
             4- Pago online""");
             int op = Datos.num();

    
		        switch (op) {
		        
					case 1: 
						
						UserInfo.info();
						break;	
					
					case 2: 
						
						Saldo.cash();
						break;
						
					case 3: 
						
						Transferencia.enviar();
						break;
						
					case 4: 
						
						Pagos.online();
						break;
					
					default:
						
						Imprimir.pantalla("""
				         -----------------------------------------------
				         ***opción no disponible, vuelva a intentarlo***
				         -----------------------------------------------"""); 
						MenuPrincipal.menu();
						break;
				}
    
        
        
        
    }

}
