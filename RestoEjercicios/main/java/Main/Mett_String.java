
package Main;

import javax.swing.JOptionPane;

public class Mett_String {
	public static void main(String[] args) {
		
		String texto = " Universidad Tecnologica de Honduras";
		String texto2= " Segundo segmento";
		
		// Length()         devuelve la longitud de la cadena.
		// substring(n1,n2) devuelve la sub cadena comprendida del rango dado entre variables n1,n2)
		// toUpperCase()    devuelve la cadena convirtiendola a mayusculas.
		// toLowerCase()    devuelve la cadena convertiendola a minusculas.
		// concat           puedes concatenar cadenas de texto incluso dentro de los () puede adicionar texto puntual
		
		JOptionPane.showMessageDialog(null,texto);
		JOptionPane.showMessageDialog(null,texto.length());
		JOptionPane.showMessageDialog(null,texto.substring(8, 10));
		JOptionPane.showMessageDialog(null,texto.toUpperCase());
		JOptionPane.showMessageDialog(null,texto.equals(" Universidad Tecnologica")); /* Posterior a equals dentro de los parentesis va el texto que necesitamos que se compare con el original. */
		JOptionPane.showMessageDialog(null,texto.concat(" -"+ texto2));
		
		
		
		
		
		
	}
	
}
