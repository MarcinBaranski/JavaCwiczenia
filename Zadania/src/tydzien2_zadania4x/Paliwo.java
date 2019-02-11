package tydzien2_zadania4x;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Paliwo {

	private JFrame frmKosztPaliwa;
	private JTextField txtFuelAverage;
	private JTextField txtFuelPrice;
	private JTextField txtDistance;
	private JTextField txtFullCost;
	private JTextField txtCostPerPerson;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paliwo window = new Paliwo();
					window.frmKosztPaliwa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paliwo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKosztPaliwa = new JFrame();
		frmKosztPaliwa.setTitle("Koszt paliwa");
		frmKosztPaliwa.setBounds(100, 100, 282, 346);
		frmKosztPaliwa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		txtFuelAverage = new JTextField();
		txtFuelAverage.setHorizontalAlignment(SwingConstants.CENTER);
		txtFuelAverage.setText("1.0");
		txtFuelAverage.setColumns(10);

		JLabel lblNewLabel = new JLabel("Średnie spalanie:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		txtFuelPrice = new JTextField();
		txtFuelPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtFuelPrice.setText("1.0");
		txtFuelPrice.setColumns(10);

		JLabel lblKosztZaLitr = new JLabel("Koszt za litr paliwa:");
		lblKosztZaLitr.setFont(new Font("Arial", Font.BOLD, 15));
		lblKosztZaLitr.setVerticalAlignment(SwingConstants.TOP);
		lblKosztZaLitr.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblIloKilometrw = new JLabel("Ilość kilometrów:");
		lblIloKilometrw.setFont(new Font("Arial", Font.BOLD, 15));
		lblIloKilometrw.setVerticalAlignment(SwingConstants.TOP);
		lblIloKilometrw.setHorizontalAlignment(SwingConstants.CENTER);

		txtDistance = new JTextField();
		txtDistance.setHorizontalAlignment(SwingConstants.CENTER);
		txtDistance.setText("1.0");
		txtDistance.setColumns(10);

		JLabel lblIleOsb = new JLabel("Ilość osób:");
		lblIleOsb.setVerticalAlignment(SwingConstants.TOP);
		lblIleOsb.setHorizontalAlignment(SwingConstants.CENTER);
		lblIleOsb.setFont(new Font("Arial", Font.BOLD, 15));

		spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				dzialaj();
			}
		});
		spinner.setModel(new SpinnerNumberModel(1, 1, 5, 1));

		JSeparator separator = new JSeparator();

		JLabel lblCenaCakowita = new JLabel("Koszt całkowity:");
		lblCenaCakowita.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel lblKosztNaOsob = new JLabel("Koszt na osobę:");
		lblKosztNaOsob.setFont(new Font("Arial", Font.BOLD, 15));

		txtFullCost = new JTextField();
		txtFullCost.setHorizontalAlignment(SwingConstants.CENTER);
		txtFullCost.setColumns(10);

		txtCostPerPerson = new JTextField();
		txtCostPerPerson.setHorizontalAlignment(SwingConstants.CENTER);
		txtCostPerPerson.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmKosztPaliwa.getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addContainerGap().addGroup(groupLayout
								.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblKosztZaLitr, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(
										lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblKosztNaOsob, GroupLayout.PREFERRED_SIZE, 127,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
														.addComponent(lblCenaCakowita, GroupLayout.PREFERRED_SIZE, 136,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtFullCost, GroupLayout.DEFAULT_SIZE, 100,
														Short.MAX_VALUE)
												.addComponent(txtCostPerPerson, GroupLayout.DEFAULT_SIZE, 97,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(spinner, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIleOsb, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIloKilometrw, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFuelAverage, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFuelPrice, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDistance, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 240,
										GroupLayout.PREFERRED_SIZE))
						.addGap(51)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap().addComponent(lblNewLabel)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(txtFuelAverage, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblKosztZaLitr)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(txtFuelPrice, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblIloKilometrw)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(txtDistance, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblIleOsb, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout
						.createParallelGroup(Alignment.BASELINE).addComponent(lblCenaCakowita).addComponent(txtFullCost,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(13)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblKosztNaOsob).addComponent(
						txtCostPerPerson, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		frmKosztPaliwa.getContentPane().setLayout(groupLayout);

		DocumentListener dl = new DocumentListener() {
			public void removeUpdate(DocumentEvent ev) {
				dzialaj();
			}

			public void insertUpdate(DocumentEvent ev) {
				dzialaj();
			}

			public void changedUpdate(DocumentEvent ev) {
				dzialaj();
			}
		};

		txtDistance.getDocument().addDocumentListener(dl);
		txtFuelPrice.getDocument().addDocumentListener(dl);
		txtFuelAverage.getDocument().addDocumentListener(dl);

	}

	public void dzialaj() {

		double distance;
		double costPerLiter;
		double fuelConsump;
		int nrOfPersons;
		try {
			distance = Double.parseDouble(txtDistance.getText());
			costPerLiter = Double.parseDouble(txtFuelPrice.getText());
			fuelConsump = Double.parseDouble(txtFuelAverage.getText());
			nrOfPersons = (Integer) spinner.getValue();

			double totalCost = LogikaKalkulatora.fuelCost(fuelConsump, costPerLiter, distance);
			double costPerPerson = totalCost / nrOfPersons;

			txtFullCost.setText("" + totalCost);
			txtCostPerPerson.setText("" + costPerPerson);

		} catch (NumberFormatException e) {
			txtFullCost.setText("Błąd");
			txtCostPerPerson.setText("Błąd");
		}

	}
}
