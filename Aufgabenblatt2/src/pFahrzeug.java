
class pFahrzeug {
	private int tank;
	private int ps;
	private int vmax;
	private String farbe;
	
	pFahrzeug ( int tank){
		setTank(tank);
	}
	
	void setTank( int tank) {
		if( tank >=0 && tank < 100){
			this.tank = tank;
		} else {
			System.out.println(" Wert darf nicht negativ oder über 100 sein ");
		}
	}
	int getTank(){
		return tank;
	}
}
