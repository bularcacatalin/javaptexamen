package buli;

public class Casa {
 String localitate;
 int pret;
 
 public Casa(String localitate, int pret){
	 this.localitate = localitate;
	 this.pret = pret;
	 
 }

@Override
public String toString() {
	return localitate + " " +pret+" euro";
}
 
}
