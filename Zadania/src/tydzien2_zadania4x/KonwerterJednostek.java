package tydzien2_zadania4x;

import java.awt.EventQueue;

//import pl.alx.kjava.kalkulator.LogikaKalkulatora;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class KonwerterJednostek {

	private JFrame frmKonwerterJednostek;
	private JTextField txtCm;
	private JTextField txtM;
	private JTextField txtKm;
	private JTextField txtKg;
	private JTextField txtStC;
	private JLabel lblCale;
	private JLabel lblStopy;
	private JLabel lblMile;
	private JLabel lblFunty;
	private JLabel lblStopnieFarenhaita;
	private JTextField txtStF;
	private JTextField txtFunty;
	private JTextField txtMile;
	private JTextField txtStopy;
	private JTextField txtCale;
	private JButton btnZamieNaSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonwerterJednostek window = new KonwerterJednostek();
					window.frmKonwerterJednostek.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KonwerterJednostek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKonwerterJednostek = new JFrame();
		frmKonwerterJednostek.setTitle("Konwerter jednostek");
		frmKonwerterJednostek.setBounds(100, 100, 450, 247);
		frmKonwerterJednostek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		txtCm = new JTextField();
		txtCm.setColumns(10);

		JLabel lblCm = new JLabel("Centymetry:");
		lblCm.setFont(new Font("Tahoma", Font.PLAIN, 13));

		txtM = new JTextField();
		txtM.setColumns(10);

		JLabel lblMetry = new JLabel("Metry:");
		lblMetry.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblKilometry = new JLabel("Kilometry:");
		lblKilometry.setFont(new Font("Tahoma", Font.PLAIN, 13));

		txtKm = new JTextField();
		txtKm.setColumns(10);

		txtKg = new JTextField();
		txtKg.setColumns(10);

		JLabel lblKilogramy = new JLabel("Kilogramy:");
		lblKilogramy.setFont(new Font("Tahoma", Font.PLAIN, 13));

		txtStC = new JTextField();
		txtStC.setColumns(10);

		JLabel lblStopnieCelcjusza = new JLabel("Stopnie Celcjusza:");
		lblStopnieCelcjusza.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lblCale = new JLabel("Cale:");
		lblCale.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lblStopy = new JLabel("Stopy:");
		lblStopy.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lblMile = new JLabel("Mile:");
		lblMile.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lblFunty = new JLabel("Funty:");
		lblFunty.setFont(new Font("Tahoma", Font.PLAIN, 13));

		lblStopnieFarenhaita = new JLabel("Stopnie \r\nFarenhaita:");
		lblStopnieFarenhaita.setFont(new Font("Tahoma", Font.PLAIN, 13));

		txtStF = new JTextField();
		txtStF.setColumns(10);

		txtFunty = new JTextField();
		txtFunty.setColumns(10);

		txtMile = new JTextField();
		txtMile.setColumns(10);

		txtStopy = new JTextField();
		txtStopy.setColumns(10);

		txtCale = new JTextField();
		txtCale.setColumns(10);

//		DocumentListener dl = new DocumentListener() {
//
//			@Override
//			public void removeUpdate(DocumentEvent e) {
//				dzialaj();
//			}
//
//			public void insertUpdate(DocumentEvent e) {
//				dzialaj();
//			}
//
//			public void changedUpdate(DocumentEvent e) {
//				dzialaj();
//			}
//		};

		JButton btnZamieJednostki = new JButton("Zamień na system brytyjski");
		btnZamieJednostki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dzialaj(0);

			}

		});
		btnZamieJednostki.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnZamieNaSystem = new JButton("Zamień na system metryczny");
		btnZamieNaSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dzialaj(1);
			}
		});
		btnZamieNaSystem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(frmKonwerterJednostek.getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout
								.createParallelGroup(
										Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblKilogramy, GroupLayout.PREFERRED_SIZE, 61,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblStopnieCelcjusza, GroupLayout.DEFAULT_SIZE, 119,
														Short.MAX_VALUE)
												.addComponent(lblCm)
												.addComponent(lblKilometry, GroupLayout.PREFERRED_SIZE, 61,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMetry, GroupLayout.PREFERRED_SIZE, 61,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtCm, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtM, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtKm, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtStC, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtKg, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE))
										.addGap(27)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup().addGap(18)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(lblMile, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(lblStopy, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(lblCale, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(lblFunty, GroupLayout.PREFERRED_SIZE, 61,
																		GroupLayout.PREFERRED_SIZE)))
												.addGroup(groupLayout.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(
																lblStopnieFarenhaita, GroupLayout.PREFERRED_SIZE, 116,
																GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtCale, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtStopy, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtMile, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtFunty, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtStF, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnZamieJednostki, GroupLayout.PREFERRED_SIZE, 195,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(btnZamieNaSystem, GroupLayout.DEFAULT_SIZE, 201,
												Short.MAX_VALUE)))
								.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(lblKilogramy).addGap(18)
										.addComponent(lblStopnieCelcjusza))
								.addGroup(groupLayout
										.createSequentialGroup()
										.addComponent(
												txtKg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(31))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCale, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCale))
										.addGap(11)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtStopy, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblStopy))
										.addGap(11)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtMile, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMile))
										.addGap(11)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtFunty, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFunty))
										.addGap(11)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtStF, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblStopnieFarenhaita)))
								.addGroup(
										groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtCm, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCm))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtM, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblMetry))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtKm, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblKilometry))
												.addGap(42).addComponent(txtStC, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnZamieJednostki)
								.addComponent(btnZamieNaSystem, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGap(52)));
		frmKonwerterJednostek.getContentPane().setLayout(groupLayout);

//		txtCm.getDocument().addDocumentListener(dl);
//		txtM.getDocument().addDocumentListener(dl);
//		txtKm.getDocument().addDocumentListener(dl);
//		txtKg.getDocument().addDocumentListener(dl);
//		txtStC.getDocument().addDocumentListener(dl);
//
//		txtCale.getDocument().addDocumentListener(dl);
//		txtStopy.getDocument().addDocumentListener(dl);
//		txtMile.getDocument().addDocumentListener(dl);
//		txtFunty.getDocument().addDocumentListener(dl);
//		txtStF.getDocument().addDocumentListener(dl);

	}

	// param kierunekKonwersji = 0 -> przeliczenie na system brytyjski
	// param kierunekKonwersji = 1 -> przeliczenie na system metryczny
	private void dzialaj(int kierunekKonwersji) {

		if (kierunekKonwersji == 0) {

			BigDecimal cm = new BigDecimal((txtCm.getText()));
			BigDecimal m = new BigDecimal((txtM.getText()));
			BigDecimal km = new BigDecimal((txtKm.getText()));
			BigDecimal kg = new BigDecimal((txtKg.getText()));
			BigDecimal stC = new BigDecimal((txtStC.getText()));

			txtCale.setText("" + LogikaKonwertera.przeliczJednostke(cm, "cm"));
			txtStopy.setText("" + LogikaKonwertera.przeliczJednostke(m, "m"));
			txtMile.setText("" + LogikaKonwertera.przeliczJednostke(km, "km"));
			txtFunty.setText("" + LogikaKonwertera.przeliczJednostke(kg, "kg"));
			txtStF.setText("" + LogikaKonwertera.przeliczJednostke(stC, "stCelcjusza"));

		} else {

			BigDecimal cale = new BigDecimal((txtCale.getText()));
			BigDecimal stopy = new BigDecimal((txtStopy.getText()));
			BigDecimal mile = new BigDecimal((txtMile.getText()));
			BigDecimal funty = new BigDecimal((txtFunty.getText()));
			BigDecimal stF = new BigDecimal((txtStF.getText()));

			txtCm.setText("" + LogikaKonwertera.przeliczJednostke(cale, "cale"));
			txtM.setText("" + LogikaKonwertera.przeliczJednostke(stopy, "stopy"));
			txtKm.setText("" + LogikaKonwertera.przeliczJednostke(mile, "mile"));
			txtKg.setText("" + LogikaKonwertera.przeliczJednostke(funty, "funty"));
			txtStC.setText("" + LogikaKonwertera.przeliczJednostke(stF, "stFarenhaita"));
		}

	}

}
