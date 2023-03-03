package calcualdora;

import java.util.Scanner;

public class CalculadoraED {

	public static void main(String[] args) {
		/**
		 * //Se crea el objeto
		 * //se instancia el scanner para leer lo que se pide al usuario por pantalla
		 * //Se llama al método imprimirCabecera para imprimir la cabecera de la aplicación.
		 * //Se llama al método imprimirSeleccionOp() para imprimir el menú de operaciones disponibles.
		 */
		CerebroCalculadoraED cce = new CerebroCalculadoraED();  
		Scanner teclado = new Scanner(System.in); 
		String entrada;
		
	/**
	 * //se utiliza un case para cada una de las opciones disponibles en el menu
	 * //un break para salir del switch cuando se introduzca la operación 
	 * //si pulsas x sales del bucle 
	 *  // Salir del programa
	 *  //si introduces una opción que no corresponde se imprime el syso de abajo
	 *  //el while determina que hasta que no se introduce una x, no se sale del bucle
	 */
	    do {
	        imprimirCabecera(); 
	        imprimirSeleccionOp(); 

	        entrada = teclado.next();
	        switch (entrada) { 
	            case "1":
	            case "2":
	            case "3":
	            case "4":
	            case "5":
	            case "6":
	            case "7":
	            case "8":
	            case"9":
	            case"10":
	            case"11":
	                cce.procesarOperacion(entrada);
	                break; 
	            case "x": 
	               
	                break;
	            default: 
	                System.out.println("Entrada no reconocida"); 
	        }
	    } while (!entrada.equals("x")); 
	    imprimirDespedida(); //imprime despedida
	}
	/**
	 *  //método para imprimir cabecera
	 */
	private static void imprimirCabecera() {
	    System.out.println("*----------------------------------*\n" +
	                       "*----------Calculadora ED----------*\n" +
	                       "*----------------------------------*");
	}

	/**
	 * //método para imprimir despedida
	 */
	private static void imprimirDespedida() { 
		System.out.println("*-----------------------------------------*\n "
						+ "*----¡Gracias por usar Calculadora ED!----*\n"+
						"*-----------------------------------------*");
		
	}
	/**
	 * //método que pregunta al usuario que operación desea realizar 
	 */
	private static void imprimirSeleccionOp() { 
		Operaciones[] ops = Operaciones.values();
		for(Operaciones op: ops)
		{
			System.out.println(op.getOpcionMenu());
	    }
		System.out.println("¿Qué operación desea realizar? (x para terminar)");
	}
	
	
	
	

}