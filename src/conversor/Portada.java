/**
 * 
 */
package conversor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;

/**
 * @author ItKevinR
 *
 * 03:26:43 AM
 */
public class Portada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portada frame = new Portada();
					frame.setVisible(true);
					frame.setTitle("PORTADA");
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void CloseFrame() {
		super.dispose();
	}
	
	
	
	public Portada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 204));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEquipo = new JLabel("EQUIPO 7");
		lblEquipo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipo.setBounds(163, 11, 108, 29);
		contentPane.add(lblEquipo);
		
		JLabel lblIntegrante1 = new JLabel("DOROTEO RAMIREZ ANA VALERIA");
		lblIntegrante1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblIntegrante1.setBounds(10, 51, 241, 14);
		contentPane.add(lblIntegrante1);
		
		JLabel lblIntegrante2 = new JLabel("GOMEZ HERNANDEZ LAURA ALEJANDRA");
		lblIntegrante2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblIntegrante2.setBounds(10, 90, 261, 14);
		contentPane.add(lblIntegrante2);
		
		JLabel lblIntegrante3 = new JLabel("MENDIETA ARIAS LUIS ALBERTO");
		lblIntegrante3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblIntegrante3.setBounds(10, 129, 241, 14);
		contentPane.add(lblIntegrante3);
		
		JLabel lblIntegrante4 = new JLabel("REYNAGA CANO KEVIN ALBERTO");
		lblIntegrante4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblIntegrante4.setBounds(10, 165, 241, 14);
		contentPane.add(lblIntegrante4);
		
		JLabel lblIntegrante5 = new JLabel("VALLEJO RAMIREZ JOSHUA ALEJANDRO");
		lblIntegrante5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblIntegrante5.setBounds(10, 204, 241, 14);
		contentPane.add(lblIntegrante5);
		
		JButton btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(new Color(211, 211, 211));
		btnContinuar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContinuar.setForeground(Color.BLACK);
		btnContinuar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				Conversor frame = new Conversor();
				frame.setVisible(true);
				frame.setTitle("CONVERSOR");
				
				CloseFrame();
				
			}
		});
		
		btnContinuar.setBounds(273, 125, 108, 23);
		contentPane.add(btnContinuar);
	}
}

	