package calcualdora;

import java.util.Arrays;
/**a traves de este enum se declaran as operaciones y el mensaje que va a aparecer al elegir dicha operación
*el último número ( 1 en este caso) declara el valor de la operación en el switch
*/
public enum Operaciones { 
	SUMAR("Suma","+","Suma dos números",1),
	RESTAR("Resta","-","Resta dos números",2),
	MULTIPLICAR("Multiplicación","*","Multiplica dos números",3),
	DIVIDIR("División","/","Divide dos números",4),
	SUMAR_RES("Sumar al resultado","+=","Suma un número al resultado actual",5),
	RESTAR_RES("Restar al resultado","-=","Al resultado actual le resta un número",6),
	MULTIPLICAR_RES("Multiplicar al resultado","*=","Multiplica un número al resultado actual",7),
	DIVIDIR_RES("Dividir al resultado","/=","Resultado actual dividido por un número",8),
	RESULTADO("Mostrar resultado","!","Muestra el último resultado",9),
	RANDOM("Número aleatorio","¿?","Crea un número aleatorio 1-100", 10),
	HISTORIAL("Historial","h","Muestra las cinco últimas operaciones",11);
	/**
	 * se declara como un string el nombre de la operación
	 * se declara como un string el simbolo de la operación
	 * /se declara como un string la información de la operación
	 * se declara como un entero el id de la operación
	 */
	private final String nombreOperacion; 
	private final String simboloOperacion;
	private final String infoOperacion; 
	private final int idOperacion; 
	/**
	 * nos muestra parametros 
	 * @param nombre el nombre de la operación
	 * @param simbolo el simbolo de la operacion
	 * @param info la información de la operación
	 * @param id el id de la operación
	 */
	
	Operaciones (String nombre, String simbolo, String info, int id){ //se generan los constructores de las variables declaradas
		this.nombreOperacion = nombre;
		this.simboloOperacion = simbolo;
		this.infoOperacion = info;
		this.idOperacion = id;
	}
	/**
	 * //se crean los get para establecer que va a mostrar cada variable
	 * //cuando introduzcas un getopcionMenu se va a producir una concatenación de IdOperacion y el nombreOperacion

	 * @return en cada get delvuelve los parametros anteriores
	 */
	public String getNombre() {return nombreOperacion;} 
	public String getInfo() {return infoOperacion;}
	public String getSimbolo() {return simboloOperacion;}
	public int getId() {return idOperacion;}
	public String getOpcionMenu() {return idOperacion + ".- " + nombreOperacion;} 

}
