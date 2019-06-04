package com.bcopstein.ExercicioRefatoracaoBanco;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TelaEstatisticas {
    private Stage mainStage;
    private Scene cenaOperacoes;
    private Scene cenaEstatisticas;
    private TextField saldoMedio;
	private TextField qtdDebitos;
	private List<Operacao> operacoes;
	private Conta conta;
	
	private TextField tfContaCorrente;
	private TextField cta;

	public TelaEstatisticas(Stage anStage, Scene cenaOp, List<Operacao> operacoes, Conta conta) {
		mainStage = anStage;
		this.cenaOperacoes = cenaOp;
		this.operacoes = operacoes;
		this.conta = conta;
	}

	

	public Scene getTelaEstatisticas() {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text("Estatísticas da Conta");
		scenetitle.setId("welcome-text");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);        
		
		
        
		
	//cta = new TextField();
	//   cta.setDisable(false);
      //cta.setText(""+conta.saldoMedio(operacoes));
      //  HBox cc = new HBox(20);        
        //cc.setAlignment(Pos.BOTTOM_LEFT);
        //cc.getChildren().add(new Label("Saldo Médio no mês "));
        //cc.getChildren().add(cta);
        //grid.add(cc, 0, 5);

        //saldoMedio.setText(""+conta.getSaldo());
        //HBox valSaldo = new HBox(20);        
        //valSaldo.setAlignment(Pos.BOTTOM_LEFT);
        //valSaldo.getChildren().add(new Label("Saldo"));
        //valSaldo.getChildren().add(tfSaldo);
        //grid.add(valSaldo, 0, 5);    
		
		Button btnMes = new Button("Selecione outro Mês:");
		Button btnVoltar = new Button("Voltar");
		HBox hbBtn = new HBox(30);
		hbBtn.setAlignment(Pos.BOTTOM_CENTER);
		hbBtn.getChildren().add(btnMes);
		hbBtn.getChildren().add(btnVoltar);
		grid.add(hbBtn, 1, 4);

		// Botao voltar
		btnVoltar.setOnAction(e->{
        	mainStage.setScene(cenaOperacoes);
		});

		// Botao entrar
		btnMes.setOnAction(e -> {
			
		});

		cenaEstatisticas = new Scene(grid);
		return cenaEstatisticas;
	}
}
