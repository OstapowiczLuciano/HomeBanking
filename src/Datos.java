import java.util.Scanner;

public class Datos {
	
	public static String txt (){

        Scanner miTeclado = new Scanner(System.in);
        String info = miTeclado.nextLine();
        return info;
    }
    
    public static int num (){

        Scanner miTeclado = new Scanner(System.in);
        int info = miTeclado.nextInt();
        return info;
    }
    public static long cbu (){

        Scanner miTeclado = new Scanner(System.in);
        long info = miTeclado.nextLong();
        return info;
    }
    
   

}
