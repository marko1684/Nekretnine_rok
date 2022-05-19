package com.example.nekretnine_rok;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PretragaOglasa extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox root = new VBox(10);

        //leva strana ez game
        stage.setResizable(false);
        stage.setTitle("Oglasi");
        HBox rootH = new HBox(10);
        VBox vbLeft = new VBox(10);
        Label lblTipNekretnine = new Label("Tip nekretnine:");
        RadioButton rb1 = new RadioButton("Stan");
        RadioButton rb2 = new RadioButton("Kuca");
        RadioButton rb3 = new RadioButton("Parking Mesto");
        vbLeft.getChildren().addAll(lblTipNekretnine, rb1, rb2, rb3);
        rootH.getChildren().addAll(vbLeft);

        // centar
        VBox vbCenter = new VBox(10);
        vbCenter.setMinWidth(200);
        TextField textFieldOpstina = new TextField("unesi opstinu");
        HBox hbCent2 = new HBox(10);
        Label lbCent1 = new Label("Cena do");
        Label lbCent2 = new Label("Kvadratura od");
        hbCent2.getChildren().addAll(lbCent1,lbCent2);
        HBox hbCent3 = new HBox(10);
        TextField textFieldCena = new TextField("Unesi cenu");
        TextField textFieldKvadratura = new TextField("Unesi kvadraturu");
        hbCent3.getChildren().addAll(textFieldCena,textFieldKvadratura);
        vbCenter.getChildren().addAll(textFieldOpstina,hbCent2,hbCent3);
        rootH.getChildren().add(vbCenter);

        //right
        VBox vbRight = new VBox(10);
        Label lbSort = new Label("Sortiranje");
        RadioButton rbR1 = new RadioButton("Cena (rastuce)");
        RadioButton rbR2 = new RadioButton("Udaljenost od centra");
        RadioButton rbR3 = new RadioButton("Isplativost nekretnine");
        vbRight.getChildren().addAll(lbSort,rbR1,rbR2,rbR3);
        rootH.getChildren().add(vbRight);

        root.getChildren().add(rootH);

        TextArea ta = new TextArea();
        ta.setMinWidth(580);
        ta.setMinHeight(100);
        root.getChildren().add(ta);

        Button btn = new Button("Pretrazi oglase");

        root.getChildren().add(btn);

        root.setPadding(new Insets(10, 10, 10, 10));
        Scene scene = new Scene(root, 600, 380);
        stage.setScene(scene);
        stage.show();
    }
}
