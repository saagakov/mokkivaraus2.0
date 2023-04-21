package com.example.mokkivaraus2;

//package com.example.demo4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;


public class Alkunaytto extends Application {

    // laita tähän omat tiedot
    private final String DB_URL = "jdbc:mysql://localhost:3306/vn";
    private final String DB_USER = "root";
    private final String DB_PASS = "salasana";

    @Override
    public void start(Stage primaryStage) {

        Button alueidenHallintaNappi = new Button("Alueiden hallinta");
        alueidenHallintaNappi.setOnAction(event -> avaaAlueidenHallintaIkkuna());

        Button palveluidenHallintaNappi = new Button("Palveluiden hallinta");
        palveluidenHallintaNappi.setOnAction(event -> avaaPalveluidenHallintaIkkuna());

        Button mokkivaraustenHallintaNappi = new Button("Mökkivarausten Hallinta");
        mokkivaraustenHallintaNappi.setOnAction(event -> avaaMokkivaraustenHallintaIkkuna());

        Button asiakasHallintaNappi = new Button("Asiakas Hallinta");
        asiakasHallintaNappi.setOnAction(event -> avaaAsiakasHallintaIkkuna());

        Button laskujenHallintaJaSeurantaNappi = new Button("Laskujen Seuranta Ja Hallinta");
        laskujenHallintaJaSeurantaNappi.setOnAction(event -> avaaLaskujenHallintaJaSeurantaIkkuna());

        Button majoittumistenRaportointiNappi = new Button("Majoittumisten Raportointi");
        majoittumistenRaportointiNappi.setOnAction(event -> avaaMajoittumistenRaportointiIkkuna());

        Button palveluidenRaportointiNappi = new Button("Palveluiden raportointi");
        palveluidenRaportointiNappi.setOnAction(event -> avaaPalveluidenRaportointiIkkuna());


       /*
         Image tausta = new Image("C:\\Users\\User1\\Downloads\\14.jpg");
        ImageView taustaKehys = new ImageView();
         taustaKehys.setImage(tausta);
         Pane pane = new Pane();
        pane.getChildren().addAll(taustaKehys);
        */

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(alueidenHallintaNappi,
                palveluidenHallintaNappi,
                mokkivaraustenHallintaNappi,
                asiakasHallintaNappi,
                laskujenHallintaJaSeurantaNappi,
                majoittumistenRaportointiNappi,
                palveluidenRaportointiNappi);


        Scene scene = new Scene(vbox, 600, 400);
        primaryStage.setTitle("Village Newbies Tietokanta");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void avaaAlueidenHallintaIkkuna() {
        Stage alueStage = new Stage();
        alueStage.setTitle("Region Management");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));

        HBox lisaaAlueHBox = new HBox(10);
        TextField alueNimiTekstiKentta = new TextField();
        alueNimiTekstiKentta.setPromptText("Alue Nimi");
        Button addRegionButton = new Button("Lisää Alue");
        addRegionButton.setOnAction(event -> lisaaAlue(alueNimiTekstiKentta.getText()));
        lisaaAlueHBox.getChildren().addAll(alueNimiTekstiKentta, addRegionButton);

        HBox poistaAlueHBox = new HBox(10);
        TextField poistaAlueIdTekstiKentta = new TextField();
        poistaAlueIdTekstiKentta.setPromptText("Alue ID");
        Button poistaAlueNappi = new Button("Poista Alue");
        poistaAlueNappi.setOnAction(event -> poistaAlue(poistaAlueIdTekstiKentta.getText()));
        poistaAlueHBox.getChildren().addAll(poistaAlueIdTekstiKentta, poistaAlueNappi);

        vbox.getChildren().addAll(lisaaAlueHBox, poistaAlueHBox);

        Scene scene = new Scene(vbox, 400, 150);
        alueStage.setScene(scene);
        alueStage.show();
    }

    private void lisaaAlue(String alueNimi) {
        String query = "INSERT INTO regions (name) VALUES (?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, alueNimi);
            preparedStatement.executeUpdate();

            System.out.println("Alue lisätty: " + alueNimi);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void poistaAlue(String alueId) {
        String query = "DELETE FROM regions WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            int id = Integer.parseInt(alueId);
            preparedStatement.setInt(1, id);
            int deletedRows = preparedStatement.executeUpdate();

            if (deletedRows > 0) {
                System.out.println("Alue poistettu: " + alueId);
            } else {
                System.out.println("Tunnuksella varustettua aluetta ei löytynyt: " + alueId);
            }

        } catch (NumberFormatException e) {
            System.out.println("Virheellinen aluetunnus: " + alueId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private void avaaPalveluidenHallintaIkkuna() {
        // Create and show a new window for service management
        // Implement the required UI components and logic
    }

    private void avaaMokkivaraustenHallintaIkkuna() {
        // Create and show a new window for service management
        // Implement the required UI components and logic
    }

    private void avaaAsiakasHallintaIkkuna(){
    }

    private void avaaMajoittumistenRaportointiIkkuna(){

    }

    private void avaaPalveluidenRaportointiIkkuna(){

    }

    private void avaaLaskujenHallintaJaSeurantaIkkuna(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}