package Szachy;

import javax.swing.JOptionPane;

public class Szachy1 {
	
	 static String dajNazweWspolrzednej(int nr) {
		 
	   	 switch (nr) {
	   	 case 1:    return "A";
	   	 case 2:    return "B";
	   	 case 3:    return "C";
	   	 case 4:    return "D";
	   	 case 5:    return "E";
	   	 case 6:    return "F";
	   	 case 7:    return "G";
	   	 case 8:    return "H";
	   	 default: throw new IllegalArgumentException();
	   	 }
	    }

	public static void main(String[] args) {
		// Program, kt�ry wy�wietla czy pola na szchownicy s� bia�e czy czarne
		
		String aTxt = JOptionPane.showInputDialog("Podaj pierwsz� wsp�rz�dn� od 1 do 8: ");
		int a = Integer.parseInt(aTxt);
		String nrTxt = JOptionPane.showInputDialog("Podaj drug� wsp�rz�dn� od 1 do 8: ");
		int nr = Integer.parseInt(nrTxt);
		
		String TxtBialy = "To pole jest bia�e.";
		String TxtCzarne = "To pole jest czarne.";
	
		JOptionPane.showMessageDialog(null, "Twoje wsp�rz�dne to: " + a + dajNazweWspolrzednej(Integer.parseInt(nrTxt)));
		JOptionPane.showMessageDialog(null, (a % 2 != 0  && nr % 2 == 0) || (a % 2 == 0 && nr % 2 !=0) ?  TxtBialy : TxtCzarne);
	
		
	}
	
}
