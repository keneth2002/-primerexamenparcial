package primerexamenparcial;

import java.util.Scanner;

public class CalculoDepreciacionActivos {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("*-*-*-SELECCIONE POR CUAL METODO SE CALCULARA LA DEPRECIACION : *-*-*-");
		System.out.println("1. Meodo de linea recta ");
		System.out.println("2. Metodo de la suma de los digitos por año ");
		System.out.println("3. Metodo de las unidades producidas ");
		System.out.println("4. Metodo de reduccion de saldo ");
		
		int met = lector.nextInt();
		
		switch (met){
		case 1 :
			System.out.println("INGRESE EL COSTO DEL ACTIVO : ");
			double a = lector.nextDouble();
			System.out.println("INGRESE EL VALOR DEL DESECHO : " );
	        double b = lector.nextDouble();
	        System.out.println("INGRESE LA VIDA UTIL DEL PRODUCTO : ");
	        int c = lector.nextInt();
	        int cont = c;
	        
	       
	        
	        
	        
	        
	        if(a<=0 || b<=0 || c<=0){
	        	System.out.println("DATOS INCORRECTOS, POR FAVOR INGRESE LOS VALORES CORRECTOS ");
	        	System.exit(0);
	        }else {
	         double deprean = (a - b) / c;
	         System.out.print("SU DEPRECIACION USANDO EL METODO DE LINEA RECTA ES : "  +  deprean );
	         double depreacum = deprean * c;
				System.out.print("\tSU DEPRECIACION ACUMULADA ES DE : "  + depreacum);
	        double libros1 =a - depreacum ;        
	         System.out.print("\tSU VALR DE LIBROS ES : " + libros1 );
	        }
	        break;
		case 3 :
			System.out.println("INGRESE EL COSTO DEL ACTIVO : ");
			double d = lector.nextDouble();
			System.out.println("INGRESE EL VALOR DEL DESECHO : " );
	        double e = lector.nextDouble();
	        System.out.println("INGRESE LA VIDA UTIL DEL PRODUCTO : ");
	        int co = lector.nextInt();
	        System.out.println("INGRESE VIDA UTIL EN UNIDADES : " );
	        double f1 = lector.nextDouble();
	        
		}

	}

}
