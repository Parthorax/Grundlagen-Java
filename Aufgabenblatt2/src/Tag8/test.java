package Tag8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  //Es muss haufenweise Zeug importiert werden. 

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();			//Der DB treiber wird geladen
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");		//Wo Die Verbindung aufgebaut wird
			
			con.setReadOnly(true);			//Soll in diesem Fall nur Schreiben
			
			Statement stmt = con.createStatement();			//Der Befehl um SQL Statements machen zz können
			
			ResultSet rs = stmt.executeQuery("Select * from ingo");  //Der Befehl
		
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));   //So lange es Spalten gibt spuckt er sie aus
			}
			
			rs.close();
			stmt.close(); 		// Alles Schließen
			con.close();
			
			
		}catch(Exception e){
			System.out.println("******Fehler"); //Fehlermeldung
			
		}

	}

}
