package database;

import model.Race;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoRace {
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;

    /**
     * Récupère toutes les races présentes dans la base de données
     * @param cnx La connexion active à la base de données
     * @return ArrayList<Race> La liste de toutes les races trouvées
     */
    public static ArrayList<Race> getLesRaces(Connection cnx) {
        ArrayList<Race> lesRaces = new ArrayList<Race>();
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT id, nom FROM race ORDER BY nom"
            );
            resultatRequete = requeteSql.executeQuery();
            while (resultatRequete.next()) {
                Race race = new Race();
                race.setId(resultatRequete.getInt("id"));
                race.setNom(resultatRequete.getString("nom"));
                lesRaces.add(race);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesRaces a généré une exception SQL");
        }
        return lesRaces;
    }

    /**
     * Récupère une race spécifique par son identifiant
     * @param cnx La connexion active à la base de données
     * @param id L'identifiant de la race recherchée
     * @return Race La race trouvée ou null si non trouvée
     */
    public static Race getRaceById(Connection cnx, int id) {
        Race race = null;
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT id, nom FROM race WHERE id = ?"
            );
            requeteSql.setInt(1, id);
            resultatRequete = requeteSql.executeQuery();
            if (resultatRequete.next()) {
                race = new Race();
                race.setId(resultatRequete.getInt("id"));
                race.setNom(resultatRequete.getString("nom"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getRaceById a généré une exception SQL");
        }
        return race;
    }
}