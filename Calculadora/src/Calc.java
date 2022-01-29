import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Calc extends JFrame {

	public Calc() throws Exception {
		super("Calculadora");// o super invoca o construtor da super classe e recebe uma string e Seta o
								// titulo da janela como sendo texto que passamos como parâmetro

		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setSize(350, 350);
		setLocation(400, 200);

		setLayout(new BorderLayout());

		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);

		JPanel digitslPanel = new JPanel();
		digitslPanel.setLayout(new BorderLayout());
		digitslPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));

		
		digitslPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));
		
		add(BorderLayout.CENTER, digitslPanel);

		setVisible(true);// Método que faz a janela aparecer
	}

	public static void main(String[] args) throws Exception {

		new Calc();
	}

}
