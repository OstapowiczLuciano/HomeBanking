public class Saldo {
	
	public static void cash () {
		
		int saldo = 30000;
		 
		Imprimir.pantalla("""
		-------------------------------		
		Su saldo actual es de: """ + saldo);
		Imprimir.pantalla("""
        -------------------------------
        Ingrese la opción deseada:
        1- Ultimos movimientos
        2- Consulta de CBU
        3- Volver al menú principal
        4- Salir de Homebanking
        -------------------------------""");
        int op = Datos.num();
        
        switch (op) {
        
		case 1: 
			
			Imprimir.pantalla("""
            ------Lugar-------   -Fecha-
            Supermercado Pampa   05/05/23
            Perfumeria Azul      05/05/23
            Verduleria Juan      06/05/23
            caniceria Pablo      07/05/23
            Lo de beto           08/05/23""");
			
			Imprimir.subMenu();
			System.exit(0);
			
		case 2:
			
			Imprimir.pantalla("""
            --------------------------------
            Su CBU es: 158975986354487885247 """);
						
			Imprimir.subMenu();
			System.exit(0);
			
		case 3:
			
			MenuPrincipal.menu();
			break;
		
		case 4:
			
			Imprimir.pantalla("""
			----------------------------------
			***Gracias por usar Homebanking***
			----***Extraiga su tarjeta***-----""");
			System.exit(0);
		
		default:
			
			Imprimir.pantalla("""
			------------------------------------------------		
			--***Opción incorrecta, vuelva a intentarlo***--
			------------------------------------------------""");
			Saldo.cash();
			break;
		}
		
        
        
       		
	} 

}
