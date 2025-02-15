package springCore.spring1;

public class Car {
 private Engin engin;



public void setEngin(Engin engin) {
	this.engin = engin;
}

 public void drive() {
	 int Status=engin.start();
	 if(Status==1) {
		 System.out.println("HAppy journey...");
	 }
	 else
		 System.out.println("Engine trubble...");
	 
 }
 
}
