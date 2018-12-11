package buli;
public class Demo {

	public static void main(String[] args) {
			try {
				Manager m = new Manager();
				//m.printFile("case.txt");
				m.readFromFile("case.txt");
			   
				m.add(new Casa("Brasov",6000));
				
				m.printList();
				
			
			}catch (Exception ex) {
       System.out.println(ex);
	}
	}}
