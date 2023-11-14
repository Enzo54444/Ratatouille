package modele;

import com.example.ratatouille.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;


public class GestionVue {

    private static Scene accueil;
    private static Scene tableauBord;
    private static Scene commandes;
    private static Scene produits;

    public GestionVue() throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("page-accueil.fxml"));
        accueil = new Scene(fxmlLoader1.load(), 1093, 754);

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("tableau-de-bord.fxml"));
        tableauBord = new Scene(fxmlLoader2.load(), 1093, 754);

        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("page-commandes.fxml"));
        commandes = new Scene(fxmlLoader3.load(), 1093, 754);

        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("pages-produits.fxml"));
        produits = new Scene(fxmlLoader4.load(), 1093, 754);

    }

    public static Scene getTableauBord() {
        return tableauBord;
    }

    public static void setTableauBord(Scene tableauBord) {
        GestionVue.tableauBord = tableauBord;
    }

    public static Scene getCommandes() {
        return commandes;
    }

    public static void setCommandes(Scene commandes) {
        GestionVue.commandes = commandes;
    }

    public static Scene getProduits() {
        return produits;
    }

    public static void setProduits(Scene produits) {
        GestionVue.produits = produits;
    }

    public static Scene getAccueil() {
        return accueil;
    }

    public static void setAccueil(Scene accueil) {
        GestionVue.accueil = accueil;
    }


}