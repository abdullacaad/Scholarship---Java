package displayScholarship;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import myJStuff.*;
import objects.Scholarship;

public class AllScholarshipsPanel extends MyPanel{
	
	private ActionListener globalLisenter;
	
	private JLabel lblTitle;
	private JButton btnBack;
	
	private int y;

	public AllScholarshipsPanel(ActionListener actionListener, ActionListener globalListener) {
		this.packageListener = actionListener;
		this.globalLisenter = globalListener;
		contentPane.setName("Scholarships Panel");
		displayNorth();
		displaySouth();
		displayCenter();
	}

	private void displayNorth(){
		lblTitle = new MyLabel("Scholarships", Size.defaultLblTitleFontSize);
		north.add(lblTitle, "cell 0 0");
	}
	
	/**
	 * shows the bottom part of the About panel.
	 */
	private void displaySouth(){
		
		// This button goes back to either the student or admin controller from the scholarships controller
		btnBack = new MyButton("Back", Size.defaultBtnFontSize);
		south.add(btnBack, "cell 0 0");
		// Global listener to switch between the controllers
		btnBack.addActionListener(globalLisenter);
		btnBack.setName("Back_AllScholarshipsPanel");

	}
	
	/**
	 * Empty method, displays center of panel.
	 */
	private void displayCenter(){
	}
	
	/**
	 * displays the scholarship.
	 * @param scholarship
	 */
	public void displayScholarship(Scholarship scholarship) {
		String name = scholarship.getName();
		String gPA = Double.toString(scholarship.getGpaRequirement());
		String toS = scholarship.getTypeOfStudy();
		ArrayList<String> labelName = new ArrayList<String>();
		labelName.add(name);
		labelName.add(gPA);
		labelName.add(toS);
		JLabel lbl;
		int i = 0;
		for(String lblNm: labelName) {
			lbl = new MyLabel(lblNm,Colors.black,Size.defaultLblFontSize);
			String cellNum = Integer.toString(i+1);
			center.add(lbl, String.format("cell "+cellNum+" %d, left",y));
			i++;
		}
		JButton btnView = new MyButton("View", Size.defaultLblFontSize);
		btnView.setActionCommand(Integer.toString(scholarship.getScholarshipId()));
		btnView.setName("ViewScholarship_AllScholarshipsPanel");
		btnView.addActionListener(packageListener);
		center.add(btnView, String.format("cell 4 %d, center",y));
		y++;
	}
}