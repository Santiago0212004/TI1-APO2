package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.Client;
import model.Function;

public class MediumRoomMap  implements Initializable{
	private Client client;
	private Function function;
	
	public MediumRoomMap(Client client, Function function) {
		this.client = client;
		this.function = function;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@FXML
    private Button sillaA1BTN;

    @FXML
    private Button sillaA2BTN;

    @FXML
    private Button sillaA3BTN;

    @FXML
    private Button sillaA4BTN;

    @FXML
    private Button sillaA5BTN;

    @FXML
    private Button sillaA6BTN;

    @FXML
    private Button sillaA7BTN;

    @FXML
    private Button sillaB1BTN;

    @FXML
    private Button sillaB2BTN;

    @FXML
    private Button sillaD7BTN;

    @FXML
    private Button sillaD6BTN;

    @FXML
    private Button sillaD5BTN;

    @FXML
    private Button sillaD4BTN;

    @FXML
    private Button sillaD3BTN;

    @FXML
    private Button sillaD2BTN;

    @FXML
    private Button sillaD1BTN;

    @FXML
    private Button sillaC7BTN;

    @FXML
    private Button sillaC1BTN;

    @FXML
    private Button sillaC6BTN;

    @FXML
    private Button sillaC5BTN;

    @FXML
    private Button sillaC4BTN;

    @FXML
    private Button sillaC3BTN;

    @FXML
    private Button sillaC2BTN;

    @FXML
    private Button sillaB7BTN;

    @FXML
    private Button sillaB6BTN;

    @FXML
    private Button sillaB5BTN;

    @FXML
    private Button sillaB4BTN;

    @FXML
    private Button sillaB3BTN;

    @FXML
    private Button sillaF7BTN;

    @FXML
    private Button sillaF6BTN;

    @FXML
    private Button sillaE7BTN;

    @FXML
    private Button sillaE6BTN;

    @FXML
    private Button sillaF5BTN;

    @FXML
    private Button sillaE5BTN;

    @FXML
    private Button sillaF4BTN;

    @FXML
    private Button sillaE4BTN;

    @FXML
    private Button sillaF3BTN;

    @FXML
    private Button sillaE3BTN;

    @FXML
    private Button sillaF2BTN;

    @FXML
    private Button sillaE2BTN;

    @FXML
    private Button sillaF1BTN;

    @FXML
    private Button sillaE1BTN;

    @FXML
    void addSilla(ActionEvent event) {
    	if(event.getSource()==sillaA1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 0);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA2BTN) {
    		function.room.assingClient(client, 0, 1);
    	}else if(event.getSource()==sillaA3BTN) {
    		function.room.assingClient(client, 0, 2);
    	}else if(event.getSource()==sillaA4BTN) {
    		function.room.assingClient(client, 0, 3);
    	}else if(event.getSource()==sillaA5BTN) {
    		function.room.assingClient(client, 0, 4);
    	}else if(event.getSource()==sillaA6BTN) {
    		function.room.assingClient(client, 0, 5);
    	}else if(event.getSource()==sillaA7BTN) {
    		function.room.assingClient(client, 0, 6);
    	}else if(event.getSource()==sillaB1BTN) {
    		function.room.assingClient(client, 1, 0);
    	}else if(event.getSource()==sillaB2BTN) {
    		function.room.assingClient(client, 1, 1);
    	}else if(event.getSource()==sillaB3BTN) {
    		function.room.assingClient(client, 1, 2);
    	}else if(event.getSource()==sillaB4BTN) {
    		function.room.assingClient(client, 1, 3);
    	}else if(event.getSource()==sillaB5BTN) {
    		function.room.assingClient(client, 1, 4);
    	}else if(event.getSource()==sillaB6BTN) {
    		function.room.assingClient(client, 1, 5);
    	}else if(event.getSource()==sillaB7BTN) {
    		function.room.assingClient(client, 1, 6);
    	}else if(event.getSource()==sillaC1BTN) {
    		function.room.assingClient(client, 2, 0);
    	}else if(event.getSource()==sillaC2BTN) {
    		function.room.assingClient(client, 2, 1);
    	}else if(event.getSource()==sillaC3BTN) {
    		function.room.assingClient(client, 2, 2);
    	}else if(event.getSource()==sillaC4BTN) {
    		function.room.assingClient(client, 2, 3);
    	}else if(event.getSource()==sillaC5BTN) {
    		function.room.assingClient(client, 2, 4);
    	}else if(event.getSource()==sillaC6BTN) {
    		function.room.assingClient(client, 2, 5);
    	}else if(event.getSource()==sillaC7BTN) {
    		function.room.assingClient(client, 2, 6);
    	}else if(event.getSource()==sillaD1BTN) {
    		function.room.assingClient(client, 3, 0);
    	}else if(event.getSource()==sillaD2BTN) {
    		function.room.assingClient(client, 3, 1);
    	}else if(event.getSource()==sillaD3BTN) {
    		function.room.assingClient(client, 3, 2);
    	}else if(event.getSource()==sillaD4BTN) {
    		function.room.assingClient(client, 3, 3);
    	}else if(event.getSource()==sillaD5BTN) {
    		function.room.assingClient(client, 3, 4);
    	}else if(event.getSource()==sillaD6BTN) {
    		function.room.assingClient(client, 3, 5);
    	}else if(event.getSource()==sillaD7BTN) {
    		function.room.assingClient(client, 3, 6);
    	}else if(event.getSource()==sillaE1BTN) {
    		function.room.assingClient(client, 4, 0);
    	}else if(event.getSource()==sillaE2BTN) {
    		function.room.assingClient(client, 4, 1);
    	}else if(event.getSource()==sillaE3BTN) {
    		function.room.assingClient(client, 4, 2);
    	}else if(event.getSource()==sillaE4BTN) {
    		function.room.assingClient(client, 4, 3);
    	}else if(event.getSource()==sillaE5BTN) {
    		function.room.assingClient(client, 4, 4);
    	}else if(event.getSource()==sillaE6BTN) {
    		function.room.assingClient(client, 4, 5);
    	}else if(event.getSource()==sillaE7BTN) {
    		function.room.assingClient(client, 4, 6);
    	}else if(event.getSource()==sillaF1BTN) {
    		function.room.assingClient(client, 5, 0);
    	}else if(event.getSource()==sillaF2BTN) {
    		function.room.assingClient(client, 5, 1);
    	}else if(event.getSource()==sillaF3BTN) {
    		function.room.assingClient(client, 5, 2);
    	}else if(event.getSource()==sillaF4BTN) {
    		function.room.assingClient(client, 5, 3);
    	}else if(event.getSource()==sillaF5BTN) { 
    		function.room.assingClient(client, 5, 4);
    	}else if(event.getSource()==sillaF6BTN) {
    		function.room.assingClient(client, 5, 5);
    	}else if(event.getSource()==sillaF7BTN) {
    		function.room.assingClient(client, 5, 6);
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
