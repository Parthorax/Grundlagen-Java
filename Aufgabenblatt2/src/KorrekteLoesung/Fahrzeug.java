package KorrekteLoesung;

 class Fahrzeug {

	 private int ps;
	 private int vmax;
	 private int tank;
	 private String farbe;
	 
	 Fahrzeug ( ){
		 ps = 0;
		 vmax = 0;
		 tank = 0;
		 farbe = new String ();
	 }
	 
	 Fahrzeug (int ps, int vmax, int tank, String farbe){
		 this.ps = ps;
		 this.vmax = vmax;
		 this.tank = tank;
		 this.farbe = new String (farbe);
	 }
	 
	 //Aufgabe 5
	 // set- und get- Methode
	 
	 //PS:
	 void setPs(int ps){
		 if (ps < 0 || ps > 300){
			 System.out.println( "Nicht über 300 oder Negative Zahlen");
		 } else{
			this.ps = ps; 
		 }
	 }
	 int getPs(){
		 if (ps < 0 || ps > 300){
			 System.out.println( "Nicht über 300 oder Negative Zahlen");
		 }
		 return ps;
	 }
	 //VMAX:
	 void setVmax(int vmax){
		 if (vmax < 0 || vmax > 300){
			 System.out.println( "Nicht über 300 oder Negative Zahlen");
		 } else{
			this.vmax = vmax; 
		 }
	 }
	 int getVmax(){
		 if (vmax < 0 || vmax > 300){
			 System.out.println( "Nicht über 300 oder Negative Zahlen");
		 }
		 return vmax;
	 }
	 //TANK:
	 void setTank(int tank){
		 if (tank < 0 || tank > 120){
			 System.out.println( "Nicht über 120 oder Negative Zahlen");
		 } else{
			this.tank = tank; 
		 }
	 }
	 int getTank(){
		 if (tank < 0 || tank > 120){
			 System.out.println( "Nicht über 120 oder Negative Zahlen");
		 }
		 return tank;
	 }
	 //FARBE:
	 void setFarbe(String farbe){
		 if(farbe == null || farbe.equals("")){
			 System.out.println("Irgend ne Farbe muss sein");
		 } else {
			 this.farbe = farbe;
		 }
	 }
	 String getFarbe(){
		 if(farbe == null || farbe.equals("")){
			 System.out.println("Irgend ne Farbe muss sein");
		 }
		 return farbe;
	  }
	 
	 //Aufgabe 4
	 double fahren (int km){
		 double verbrauch = 0.0;
		 verbrauch = (double) km * 9.0 / 100.0;
		 setTank (getTank() - (int) verbrauch);
		 return verbrauch;
	 }
	 //Aufgabe 6
	 void tanken (int liter){
		 setTank (getTank() + liter);
	 }
	 //Aufgabe 7
	 int psZuKw (int ps){
		 double kw = (double) ps / 1.3596;
		 return (int) kw;
	 }
	 
	 
	 
}
