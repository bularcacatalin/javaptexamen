package buli;

import java.io.*;
import java.util.*;


public class Manager{
   ArrayList<Casa> casele = new ArrayList<>();
 
  public Manager(){
	  File casa;
	   casa=new File("casa.txt");
  }

	   public Manager(String numefisier) {
          File casa = new File(numefisier);
	   }
	   
	    public void readFromFile(String path) { //afiseaza dar si retine fisierul
	        try {
	            System.out.println("\nSe citeste fisierul: '" + path + "':");
	            BufferedReader br = new BufferedReader(new FileReader(path));
	            String line = null;
	            line = br.readLine();
	            while ((line = br.readLine()) != null) {
	                
	                String[] splitline = line.split(",");
	                Casa casa = new Casa(splitline[0].trim(),Integer.parseInt(splitline[1].trim()));
	                casele.add(casa);  
	                
	                
	            }
	            System.out.println();
	        } catch (IOException ex) {
	            System.out.println("Eroare la accesarea fisierlui!");
	        }
	    }
	    
	    public void printList()
	    {
	    	for(Casa c : casele){
	    		System.out.println(c);
	    	}
	    }
	    
	    public void add(Casa c){
	    	casele.add(c);
	    }
	        
	        public void printFile(String path) { //afiseaza dar si retine fisierul
		        try {
		            System.out.println("\nSe citeste fisierul: '" + path + "':");
		            BufferedReader br = new BufferedReader(new FileReader(path));
		            String line = null;
		            line = br.readLine();
		            while ((line = br.readLine()) != null) {
		                
		                System.out.println("  " + line) ;
		                                
		            }
		            System.out.println();
		        } catch (IOException ex) {
		            System.out.println("Eroare la accesarea fisierlui!");
		        }

	    }
   }
