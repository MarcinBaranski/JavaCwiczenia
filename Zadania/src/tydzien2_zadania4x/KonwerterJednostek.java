package tydzien2_zadania4x;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class KonwerterJednostek {

	private JFrame frame;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonwerterJednostek window = new KonwerterJednostek();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		lblStopnieFarenhaita = new JLabel("Stopnie Farenhaita:");
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblKilogramy, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblStopnieCelcjusza, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblCm)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblKilometry, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addPreferredGap(ComponentPlacement.RELATED, 8, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblMetry, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCm, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtM, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtKm, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStC, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtKg, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCale, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStopy, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMile, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFunty, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStopnieFarenhaita, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCale, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStopy, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMile, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFunty, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStF, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblKilogramy)
							.addGap(18)
							.addComponent(lblStopnieCelcjusza))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCale)
							.addGap(14)
							.addComponent(lblStopy)
							.addGap(15)
							.addComponent(lblMile)
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFunty)
								.addComponent(txtKg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addComponent(lblStopnieFarenhaita))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtCale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtStopy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtMile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtFunty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtStF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCm))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetry))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtKm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblKilometry))
							.addGap(42)
							.addComponent(txtStC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
