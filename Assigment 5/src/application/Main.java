package application;

import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	int rowNum = 39;
	int colNum = 39;

	@Override
	public void start(Stage primaryStage) {

		Group root = new Group();

		Group fixrec = new Group();

		Rectangle topLeft = new Rectangle(0, 0, 150, 150);
		topLeft.setFill(Color.WHITE);
		Rectangle topLeftblack = new Rectangle(25, 25, 100, 100);
		topLeftblack.setFill(Color.BLACK);
		Rectangle topLefwhite = new Rectangle(50, 50, 50, 50);
		topLefwhite.setFill(Color.WHITE);

		Rectangle topRight = new Rectangle(362, 0, 150, 150);
		topRight.setFill(Color.WHITE);
		Rectangle topRightblack = new Rectangle(387, 25, 100, 100);
		topRightblack.setFill(Color.BLACK);
		Rectangle topRightwhite = new Rectangle(412, 50, 50, 50);
		topRightwhite.setFill(Color.WHITE);

		Rectangle bottomleft = new Rectangle(0, 362, 150, 150);
		bottomleft.setFill(Color.WHITE);
		Rectangle bottomLeftblack = new Rectangle(25, 387, 100, 100);
		bottomLeftblack.setFill(Color.BLACK);
		Rectangle bottomleftwhite = new Rectangle(50, 412, 50, 50);
		bottomleftwhite.setFill(Color.WHITE);

		fixrec.getChildren().add(topLeft);
		fixrec.getChildren().add(topLeftblack);
		fixrec.getChildren().add(topLefwhite);

		fixrec.getChildren().add(topRight);
		fixrec.getChildren().add(topRightblack);
		fixrec.getChildren().add(topRightwhite);

		fixrec.getChildren().add(bottomleft);
		fixrec.getChildren().add(bottomLeftblack);
		fixrec.getChildren().add(bottomleftwhite);

		GridPane grid = new GridPane();

		Random rand = new Random();
		Color[] colors = { Color.BLACK, Color.WHITE };

		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				int n = rand.nextInt(2);
				Rectangle rec = new Rectangle();
				rec.setWidth(13);
				rec.setHeight(13);
				rec.setFill(colors[n]);
				GridPane.setRowIndex(rec, row);
				GridPane.setColumnIndex(rec, col);
				grid.getChildren().add(rec);
			}
		}

		root.getChildren().addAll(grid, fixrec);

		Scene scene = new Scene(root, 512, 512);

		primaryStage.setTitle("QR Simulator");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
