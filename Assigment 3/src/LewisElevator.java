
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LewisElevator implements ActionListener {

	private JButton openbutton;
	private JButton closebutton;
	private JLabel floorLabel;
	private JButton upButton;
	private JButton downbutton;
	private JButton upButton2;
	private JButton downbutton2;
	private int floor = 1;
	static JPanel labelPanel = new JPanel();

	public JPanel createPanel() {

		JPanel elevatorButtonPanel = new JPanel();

		openbutton = new JButton("Open");
		openbutton.addActionListener(this);
		elevatorButtonPanel.add(openbutton);

		closebutton = new JButton("Close");
		closebutton.addActionListener(this);
		elevatorButtonPanel.add(closebutton);

		upButton = new JButton("U");
		upButton.addActionListener(this);
		elevatorButtonPanel.add(upButton);

		downbutton = new JButton("D");
		downbutton.addActionListener(this);
		elevatorButtonPanel.add(downbutton);

		upButton2 = new JButton("2U");
		upButton2.addActionListener(this);
		elevatorButtonPanel.add(upButton2);

		downbutton2 = new JButton("2D");
		downbutton2.addActionListener(this);
		elevatorButtonPanel.add(downbutton2);

		floorLabel = new JLabel("This is the Basement, please press open to call Elevator", JLabel.CENTER);
		labelPanel.add(floorLabel);

		return elevatorButtonPanel;
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == openbutton)
			floorLabel.setText("The door is open, make your selection");
		if (event.getSource() == closebutton)
			floorLabel.setText("The door is close, make your selection");

		if (event.getSource() == upButton)
			if (floor <= 2) { // As long as the count reaches 3. The statement will print out
				floor++;
				floorLabel.setText("Doors closing, You are now in floor " + floor
						+ " Please press close before making your selection.");
			} else
				floorLabel.setText("You are at the top floor. You can only go down."); // anything else will say you are
																						// at the top floor

		if (event.getSource() == upButton2) {
			if (floor <= 2) {
				floor = floor + 2;
				floorLabel.setText("Doors closing, You are now in Floor " + floor
						+ " Please press close before making your selection/");
			}

			else
				floorLabel.setText("You are at the top floor. You can only go down.");

		}
		if (event.getSource() == downbutton) {
			if (floor <= 3 && floor >= 2) {

				floor--;
				floorLabel.setText("Doors closing, you are now in Floor " + floor
						+ " Please press close before making your selection.");
			} else
				floorLabel.setText("You are at Basement. You can only go up.");

		}
		if (event.getSource() == downbutton2) {
			if (floor <= 3 && floor >= 2) {
				floor = floor - 2;
				floorLabel.setText("Doors closing, you are now in Floor " + floor
						+ " Please press close before making your selection");
			} else
				floorLabel.setText("You are at Basement. You can only go up.");

		}
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Arts and Science Building");
		f.setSize(new Dimension(600, 400));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the panel to display
		LewisElevator clickMe = new LewisElevator();
		JPanel clickMePanel = clickMe.createPanel();

		// Add the panel to the center of the window
		Container contentPane = f.getContentPane();
		contentPane.add(clickMePanel, BorderLayout.CENTER);

		// Display the window.
		f.setVisible(true);
		f.add(labelPanel, BorderLayout.PAGE_END);

	}
}
