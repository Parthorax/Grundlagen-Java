
public class Sortieren {

	public static void main(String[] args) {
		int [] iListe = {5, 8, 4, 25, 56, 16, 2, 99, 1, 15};
		int iGrenze = iListe.length-1;
		int i, j, iHilf;
		boolean bSchalter = true;
		while(bSchalter){
			bSchalter = false;
			for(i=0;i<iGrenze;i++){
				j=i+1;
				if(iListe[j]<iListe[i]){
					iHilf = iListe[j];
					iListe[j] = iListe[i];
					iListe[i] = iHilf;
					bSchalter = true;
				}
			}
			iGrenze = iGrenze - 1;
		}
		for(int b = 0; b < 10; b++) {
			System.out.println(iListe[b]);
		}

	}

}
