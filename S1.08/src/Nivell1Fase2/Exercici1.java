package Nivell1Fase2;
/*Crea una Functional Interface que continga  un m�tode abstracte getPiValue (), 
 * que retorn a un valor double; en una  altra classe, instancie la  interf�cie i 
 * assigneu-li  mitjan�ant una lambda el valor 3.1415. Invoca  el  m�tode getPiValue 
 * de la  inst�ncia d'interf�cie i  imprimeix el resultat . 
 */
public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instancio la interf�cie i li assigno valor
		FunctionalInterfacePi calcula=()->3.1415;
		//crido al m�tode i imprimeixo
		System.out.println(calcula.getValue());
	}

}
