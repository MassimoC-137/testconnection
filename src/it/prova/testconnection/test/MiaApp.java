package it.prova.testconnection.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.prova.testconnection.model.Studenti;

public class MiaApp {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/scuola";
		String username = "root"; 
		String password = "root"; 
		
		String select = "SELECT * FROM scuola.studenti "; 
		
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stat = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(select); 
			System.out.println(pstmt);
			conn.close();
		} catch (SQLException e){
			System.out.println("Ci sono problemi...");
			e.printStackTrace();
		}
		
		try {
            Connection conn = DriverManager.getConnection(jdbcUrl,username,password);
            System.out.println("Connesso al database");
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(select);

            while(res.next()) {
                Studenti studente = new Studenti();
                studente.setIdStudente(res.getInt("id_studente"));
                studente.setNome(res.getString("nome"));
                studente.setCognome(res.getString("cognome"));
                studente.setMatricola(res.getString("matricola"));
                studente.setDataDiNascita(res.getDate("data_di_nascita"));
                studente.setIndirizzo(res.getString("indirizzo"));
                studente.setDiplomato(res.getBoolean("diplomato"));
                studente.setAnnoCorso(res.getInt("anno_corso"));
                studente.setIdAula(res.getInt("id_aula"));

                System.out.println(studente);
            }
            conn.close();

        } catch(SQLException e) {
            System.out.println("errore durante la connessione");
            e.printStackTrace();
        }
	}

}
