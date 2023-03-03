package calcualdora;

import java.util.Scanner;

public class CerebroCalculadoraED {
/**
 * //Se declaran todas las variables que se van a utilizar en el cerebrocalculadoraED
 *  //array para el historial
 *  //variable para declarar el tamaño del historial
 *  //scanner para leer por pantalla
 */
	private Operaciones operacion; 
	private double resultado, numero1, numero2;
	private String[] historial; 
	private final int TAMANOHISTORIAL = 5; 
	Scanner tecladoCce = new Scanner(System.in); 
 
	CerebroCalculadoraED() {
		historial = new String[TAMANOHISTORIAL];
		resultado = 0;
	}
	/**
	 * //switch para introducir cada una de las funciones que va a tener la calculadora y su correspondiente número para inicializar esa función
	 * @param op se establece el parámetro op 
	 */
	public void procesarOperacion(String op) {
		Operaciones operacion;
		System.out.println("proceso " + op);
		switch (op) {  
		case "1":
			operacion = Operaciones.SUMAR;//función suma
			operarSuma(operacion);
			break;
		case "2":
			operacion = Operaciones.RESTAR;//función resta
			operarResta(operacion);
			break;
		case "3":
			operacion = Operaciones.MULTIPLICAR;//función multiplicación
			operarMultiplica(operacion);
			break;
		case "4":
			operacion = Operaciones.DIVIDIR; //función división
			operarDivide(operacion);
			break;
		case "5":
			operacion = Operaciones.SUMAR_RES; //función sumar resultado
			operarSumaRes(operacion);
			break;
		case "6":
			operacion = Operaciones.RESTAR_RES; //función restar resultado
			operarRestaRes(operacion);
			break;
		case "7":
			operacion = Operaciones.MULTIPLICAR_RES; //función multiplicación resultado
			operarMultiplicaRes(operacion);
			break;
		case "8":
			operacion = Operaciones.DIVIDIR_RES; //función dividir resultado
			operarDivideRes(operacion);
			break;
		case "9":
			operacion = Operaciones.RESULTADO; //función mostrar resultado
			mostrarResultadoActual(operacion);
			break;
		case "10":
			operacion = Operaciones.RANDOM; //función número aleatorio
			numeroAleatorio(operacion);
			break;
		case "11":
			operacion = Operaciones.HISTORIAL; //función mostrar historial
			operarHistorial(operacion);
			break;
		default:
			System.out.println("ERROR: La operación " + op + " no es conocida.");
		}
	}
	/**
	 * //Suma dos números introducidos por el usuario y muestra el resultado.
	 * @param op
	 */
	private void operarSuma(Operaciones op) {
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 + this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Resta dos números introducidos por el usuario y muestra el resultado
	 * @param op
	 */
	private void operarResta(Operaciones op) { 
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 - this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Multiplica dos números introducidos por el usuario y muestra el resultado
	 * @param op
	 */
	private void operarMultiplica(Operaciones op) { 
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 * this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Divide dos números introducidos por el usuario y muestra el resultado
	 * @param op
	 */
	private void operarDivide(Operaciones op) { //Divide dos números introducidos por el usuario y muestra el resultado
		infoOperacion(op);
		pedirDosNumeros();
		this.resultado = this.numero1 / this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Suma un número introducido por el usuario al resultado actual y muestra el resultado
	 * @param op
	 */
	private void operarSumaRes(Operaciones op) { 
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado + this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Resta un número introducido por el usuario al resultado actual y muestra el resultado
	 * @param op
	 */
	private void operarRestaRes(Operaciones op) { 
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado + this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Multiplica un número introducido por el usuario al resultado actual y muestra el resultado
	 * @param op
	 */
	private void operarMultiplicaRes(Operaciones op) {
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado * this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Divide el resultado actual entre un número introducido por el usuario y muestra el resultado
	 * @param op
	 */
	private void operarDivideRes(Operaciones op) {
		infoOperacion(op);
		pedirUnNumero();
		this.resultado = this.resultado / this.numero2;
		mostrarResultado(op);
		anadirHistorial(op);
	}
	/**
	 * //Muestra el resultado actual
	 * @param op
	 */
	private void mostrarResultadoActual(Operaciones op) {
		infoOperacion(op);
		System.out.println("El valor actual del resultado es: " + this.resultado + "\n");
	}
	/**
	 * // Genera un número aleatorio y lo establece como resultado
	 * @param op
	 */
	private void numeroAleatorio(Operaciones op) {
		infoOperacion(op);
		this.resultado = (double)(Math.random()*100+1);
		System.out.println("El número aleatorio generado es: " + this.resultado + "\n");
		anadirHistorialAleatorio(op);
	}
	/**
	 *  //Muestra las últimas cinco operaciones realizadas
	 * //string del historial
	 * //se muestra por pantalla el historial
	 * @param op
	 */
	private void operarHistorial(Operaciones op) {
		System.out.println("*** Historial de las cinco últimas operaciones ***");
		for (String hist : historial) { 
			System.out.println(hist); 
		}
		System.out.println("\n"); //se introduce un salto de línea 
	}
	/**
	 * //Muestra información sobre la operación que se va a realizar
	 * //A traves de los get se concatena el nombre de la operación y la información de esta
	 * @param op
	 */
	private void infoOperacion(Operaciones op) { 
		System.out.println("//////////////////////////////");
		System.out.println("-> " + op.getNombre() + " - " + op.getInfo()); 
	}
	/**
	 * //método en el que se pide al usuario que introduzca un número y posteriormente se lee con el scanner
	 * //el numero 1 correspondera con el resultado de la última operación
	 */
	private void pedirUnNumero() { 
		System.out.println("Introduce el número: ");
		this.numero1 = this.resultado; 
		this.numero2 = tecladoCce.nextDouble();
	}
	/**
	 * //método en el que se pide al usuario que introduzca 2 números y posteriormente se leen con el scanner
	 */
	private void pedirDosNumeros() {
		System.out.println("Introduce el primer número: ");
		this.numero1 = tecladoCce.nextDouble();
		System.out.println("Introduce el segundo número: ");
		this.numero2 = tecladoCce.nextDouble();
	}
	/**
	 * //método para mostrar el resultado de la operación
	 * //String format que va a dar el formato en el que se va a mostrar el resultado
	 * @param op
	 */
	private void mostrarResultado(Operaciones op) { 
	    String mensaje = String.format("El resultado de la operación %s es:%n%.2f %s %.2f = %.2f%n", 
	        op.getNombre().toLowerCase(), numero1, op.getSimbolo(), numero2, resultado); 
	    System.out.println(mensaje); //se imprime por pantalla el mensaje anterior al que hemos declarado como "mensaje"
	}

	/**
	 * //método para mostrar el historial de las operaciones que llevamos
	 * //String format que va a dar el formato en el que se va a mostrar el resultado
	 * //bucle for que recorre el historial
	 * //mueve hacia arriba del string una posición 
	 * @param op
	 */
	private void anadirHistorial(Operaciones op) { 
	    String nuevaOperacion = String.format("%s -> %.2f %s %.2f = %.2f", 
	        op.getNombre(), numero1, op.getSimbolo(), numero2, resultado);
	    for (int i = this.historial.length - 1; i > 0; i--) { 
	        this.historial[i] = this.historial[i - 1]; //mueve hacia arriba del string una posición 
	    }
	    this.historial[0] = nuevaOperacion;
	}

	/**
	 * //método para mostrar el historial aleatorio de las operaciones que llevamos
	 * @param op
	 */
	public void anadirHistorialAleatorio(Operaciones op) { 
		String nuevaOperacion = op.getNombre() + " -> " 
				+ Double.toString(resultado);
		this.historial[4] = this.historial[3];
		this.historial[3] = this.historial[2];
		this.historial[2] = this.historial[1];
		this.historial[1] = this.historial[0];
		this.historial[0] = nuevaOperacion;
	}


}
