package Nivell1Fase1;
/*Has de  fer la mateixa impressi� del punt  anterior  per� fent-ho mitjan�ant 
method reference. 
 */

import java.util.Arrays;
import java.util.function.Consumer;

public class Fase1Exercici6 {
	
	public static void main(String[] args) {
	//Creo array
		String[] mesos={"Gener","Febrer","Mar�","Abril",
			"Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre"} ;
	//implemento interfa� consumer per cridar al m�tode de referencia 
		Consumer<String[]>metode=Fase1Exercici6::metodeReferencia;
		metode.accept(mesos);
	}
	//creo metode  de referencia que recorre l'array i  l'imprimeix
	public static void metodeReferencia(String[]mesos) {
			Arrays.stream(mesos).forEach(System.out::println);
	}
}
	

