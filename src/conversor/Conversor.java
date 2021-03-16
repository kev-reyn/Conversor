/**
 * 
 */
package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author ItKevinR
 *
 * 03:37:05 AM
 */
public class Conversor extends JFrame {

	public JPanel contentPane;
	public JTextField txtOrigen;
	public JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	
	
	@SuppressWarnings("rawtypes")
	public Conversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 279);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CONVERTIDOR");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblTitulo.setBounds(223, 11, 172, 28);
		contentPane.add(lblTitulo);
		
		JComboBox cbOrigen = new JComboBox();
		cbOrigen.setBounds(150, 106, 188, 20);
		contentPane.add(cbOrigen);
		
		JComboBox cbDespues = new JComboBox();
		cbDespues.setBounds(379, 106, 188, 20);
		contentPane.add(cbDespues);
		
		JComboBox cbTipoDeUnidad = new JComboBox();
		cbTipoDeUnidad.setForeground(new Color(0, 0, 0));
		cbTipoDeUnidad.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				
				
				int index = cbTipoDeUnidad.getSelectedIndex();
				
				switch(index){
				case 0:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"No seleccionado"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"No seleccionado"}));
					
					break;
				case 1:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"kilometros","metros","centimetros","milimetros","millas","yardas","pies","pulgadas"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"millas","yardas","pies","pulgadas","kilometros","metros","centimetros","milimetros"}));
					break;
				case 2:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"km cuadrados","hectareas","metros cuadrados","millas cuadradas","acres","pies cuadrados","pulgadas cuadradas"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"km cuadrados","hectareas","metros cuadrados","millas cuadradas","acres","pies cuadrados","pulgadas cuadradas"}));
					break;
				case 3:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"metro cubico","litro","centimetro cubico","milimetro","barril","galon","pinta","onza liquida"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"metro cubico","litro","centimetro cubico","milimetro","barril","galon","pinta","onza liquida"}));
					break;
				case 4:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"tonelada","kilogramo","gramo","tonelada corta","libra","onza"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"tonelada","kilogramo","gramo","tonelada corta","libra","onza"}));
					break;
				case 5:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"km/s","m/s","km/h","milla/s","milla/h","pie/s","nudo"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"km/s","m/s","km/h","milla/s","milla/h","pie/s","nudo"}));
					break;
				case 6:
					cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"celsius","fahrenheit","kelvin"}));
					cbDespues.setModel(new DefaultComboBoxModel(new String[] {"celsius","fahrenheit","kelvin"}));
					break;
					}
				
				
			}
			
		});
		
		
		cbTipoDeUnidad.setModel(new DefaultComboBoxModel(new String[] {"", "Longitud", "Superficie", "Volumen", "Velocidad", "Peso", "Temperatura"}));
		cbTipoDeUnidad.setBounds(21, 49, 194, 20);
		contentPane.add(cbTipoDeUnidad);
		
		txtOrigen = new JTextField();
		txtOrigen.setBackground(Color.WHITE);
		txtOrigen.setForeground(Color.BLACK);
		txtOrigen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtOrigen.setBounds(21, 106, 86, 20);
		contentPane.add(txtOrigen);
		txtOrigen.setColumns(10);	
		
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setBounds(151, 81, 46, 14);
		contentPane.add(lblDe);
		
		JLabel lblA = new JLabel("A:");
		lblA.setBounds(379, 81, 46, 14);
		contentPane.add(lblA);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//or = Unidad de origen 
				//dp = Unidad de destino
				//un = Tipo de unidad
				int or = cbOrigen.getSelectedIndex();
				int dp = cbDespues.getSelectedIndex();
				int un = cbTipoDeUnidad.getSelectedIndex();
				double valor1 = Double.parseDouble(txtOrigen.getText());
				
				//***************************************************************************************************
				//***************************************************************************************************
				//---------------------------------Longitud----------------------------------------------------------
				//***************************************************************************************************
				//***************************************************************************************************
				
				//division km
				if(or==0 && dp==0 && un==1) {
					//km to milla
					txtResultado.setText(String.valueOf(valor1*0.62137));
			}else if(or==0 && dp==1 && un==1) {
					//km to yardas
					txtResultado.setText(String.valueOf(valor1*1093.6));	
				}else if(or==0 && dp==2 && un==1) {
					//km to pies
					txtResultado.setText(String.valueOf(valor1*3280.8));	
				}else if(or==0 && dp==3 && un==1) {
					//km to pulgadas
					txtResultado.setText(String.valueOf(valor1*39370));	
				}else if(or==0 && dp==4 && un==1) {
					//km to km
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==0 && dp==5 && un==1) {
					//km to metro
					txtResultado.setText(String.valueOf(valor1*1000));	
				}else if(or==0 && dp==6 && un==1) {
					//km to centimetro
					txtResultado.setText(String.valueOf(valor1*100000));	
				}else if(or==0 && dp==7 && un==1) {
					//km to milimetro
					txtResultado.setText(String.valueOf(valor1*1000000));	
				}
				
				//division metro
				
				if(or==1 && dp ==0 && un==1) {
					//metro to milla
					txtResultado.setText(String.valueOf(valor1*0.000621371));
				}else if(or==1 && dp==1 && un==1) {
					//metro to yardas
					txtResultado.setText(String.valueOf(valor1*1.0936));
				}else if(or==1 && dp==2 && un==1) {
					//metro to pies
					txtResultado.setText(String.valueOf(valor1*3.28084));	
				}else if(or==1 && dp==3 && un==1) {
					//metro to pulgadas
					txtResultado.setText(String.valueOf(valor1*39.3701));	
				}else if(or==1 && dp==4 && un==1) {
					//metro to km
					txtResultado.setText(String.valueOf(valor1*0.001));	
				}else if(or==1 && dp==5 && un==1) {
					//metro to metro
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==1 && dp==6 && un==1) {
					//metro to centimetro
					txtResultado.setText(String.valueOf(valor1*100));	
				}else if(or==1 && dp==7 && un==1) {
					//metro to milimetro
					txtResultado.setText(String.valueOf(valor1*1000));	
				}
				
				//division cm
				
				if(or==2 && dp ==0 && un==1) {
					//cm to milla
					txtResultado.setText(String.valueOf(valor1*0.0000062137));
				}else if(or==2 && dp==1 && un==1) {
					//cm to yardas
					txtResultado.setText(String.valueOf(valor1*0.0109361));
				}else if(or==2 && dp==2 && un==1) {
					//cm to pies
					txtResultado.setText(String.valueOf(valor1*0.0328084));	
				}else if(or==2 && dp==3 && un==1) {
					//cm to pulgadas
					txtResultado.setText(String.valueOf(valor1*0.393701));	
				}else if(or==2 && dp==4 && un==1) {
					//cm to km
					txtResultado.setText(String.valueOf(valor1/100000));	
				}else if(or==2 && dp==5 && un==1) {
					//cm to metro
					txtResultado.setText(String.valueOf(valor1/100));	
				}else if(or==2 && dp==6 && un==1) {
					//cm to centimetro
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==2 && dp==7 && un==1) {
					//cm to milimetro
					txtResultado.setText(String.valueOf(valor1*10));	
				}
				
				//division milimetro
				
				if(or==3 && dp ==0 && un==1) {
					//mm to milla
					txtResultado.setText(String.valueOf(valor1*0.00000062137));
				}else if(or==3 && dp==1 && un==1) {
					//mm to yardas
					txtResultado.setText(String.valueOf(valor1*0.00109361));
				}else if(or==3 && dp==2 && un==1) {
					//mm to pies
					txtResultado.setText(String.valueOf(valor1*0.00328084));	
				}else if(or==3 && dp==3 && un==1) {
					//mm to pulgadas
					txtResultado.setText(String.valueOf(valor1*0.0393701));	
				}else if(or==3 && dp==4 && un==1) {
					//mm to km
					txtResultado.setText(String.valueOf(valor1/1000000));	
				}else if(or==3 && dp==5 && un==1) {
					//mm to metro
					txtResultado.setText(String.valueOf(valor1/100));	
				}else if(or==3 && dp==6 && un==1) {
					//mm to centimetro
					txtResultado.setText(String.valueOf(valor1/10));	
				}else if(or==3 && dp==7 && un==1) {
					//mm to milimetro
					txtResultado.setText(String.valueOf(valor1));	
				}
				
				//division milla
				
				if(or==4 && dp ==0 && un==1) {
					//milla to milla
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==4 && dp==1 && un==1) {
					//milla to yardas
					txtResultado.setText(String.valueOf(valor1*1760));
				}else if(or==4 && dp==2 && un==1) {
					//milla to pies
					txtResultado.setText(String.valueOf(valor1*5280));	
				}else if(or==4 && dp==3 && un==1) {
					//milla to pulgadas
					txtResultado.setText(String.valueOf(valor1*63360));	
				}else if(or==4 && dp==4 && un==1) {
					//milla to km
					txtResultado.setText(String.valueOf(valor1*1.60934));	
				}else if(or==4 && dp==5 && un==1) {
					//milla to metro
					txtResultado.setText(String.valueOf(valor1*1609.34));	
				}else if(or==4 && dp==6 && un==1) {
					//milla to centimetro
					txtResultado.setText(String.valueOf(valor1*160934));	
				}else if(or==4 && dp==7 && un==1) {
					//milla to milimetro
					txtResultado.setText(String.valueOf(valor1*1.609e+6));
				}
				
				//division yarda
				
				if(or==5 && dp ==0 && un==1) {
					//yarda to milla
					txtResultado.setText(String.valueOf(valor1/1760));
				}else if(or==5 && dp==1 && un==1) {
					//yarda to yardas
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==5 && dp==2 && un==1) {
					//yarda to pies
					txtResultado.setText(String.valueOf(valor1*3));	
				}else if(or==5 && dp==3 && un==1) {
					//yarda to pulgadas
					txtResultado.setText(String.valueOf(valor1*36));	
				}else if(or==5 && dp==4 && un==1) {
					//yarda to km
					txtResultado.setText(String.valueOf(valor1*0.0009144));	
				}else if(or==5 && dp==5 && un==1) {
					//yarda to metro
					txtResultado.setText(String.valueOf(valor1*0.9144));	
				}else if(or==5 && dp==6 && un==1) {
					//yarda to centimetro
					txtResultado.setText(String.valueOf(valor1*91.44));	
				}else if(or==5 && dp==7 && un==1) {
					//yarda to milimetro
					txtResultado.setText(String.valueOf(valor1*914.4));
				}
				
				//division pies
				
				if(or==6 && dp ==0 && un==1) {
					//pies to milla
					txtResultado.setText(String.valueOf(valor1/5280));
				}else if(or==6 && dp==1 && un==1) {
					//pies to yardas
					txtResultado.setText(String.valueOf(valor1/3));
				}else if(or==6 && dp==2 && un==1) {
					//pies to pies
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==6 && dp==3 && un==1) {
					//pies to pulgadas
					txtResultado.setText(String.valueOf(valor1*12));	
				}else if(or==6 && dp==4 && un==1) {
					//pies to km
					txtResultado.setText(String.valueOf(valor1*0.0003048));	
				}else if(or==6 && dp==5 && un==1) {
					//pies to metro
					txtResultado.setText(String.valueOf(valor1*0.3048));	
				}else if(or==6 && dp==6 && un==1) {
					//pies to centimetro
					txtResultado.setText(String.valueOf(valor1*30.48));	
				}else if(or==6 && dp==7 && un==1) {
					//pies to milimetro
					txtResultado.setText(String.valueOf(valor1*304.8));
				}
				
				//division pulgadas
				
				if(or==7 && dp ==0 && un==1) {
					//pulgadas to milla
					txtResultado.setText(String.valueOf(valor1/63360));
				}else if(or==7 && dp==1 && un==1) {
					//pulgadas to yardas
					txtResultado.setText(String.valueOf(valor1/36));
				}else if(or==7 && dp==2 && un==1) {
					//pulgadas to pies
					txtResultado.setText(String.valueOf(valor1/12));	
				}else if(or==7 && dp==3 && un==1) {
					//pulgadas to pulgadas
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==7 && dp==4 && un==1) {
					//pulgadas to km
					txtResultado.setText(String.valueOf(valor1*2.54e-5));	
				}else if(or==7 && dp==5 && un==1) {
					//pulgadas to metro
					txtResultado.setText(String.valueOf(valor1*0.0254));	
				}else if(or==7 && dp==6 && un==1) {
					//pulgadas to centimetro
					txtResultado.setText(String.valueOf(valor1*2.54));	
				}else if(or==7 && dp==7 && un==1) {
					//pulgadas to milimetro
					txtResultado.setText(String.valueOf(valor1*25.4));
				}
				
				//***************************************************************************************************
				//***************************************************************************************************
				//-----------------------------------------Superficie----------------------------------------
				//***************************************************************************************************
				//***************************************************************************************************
				
				//km cuadrados
				
				if(or==0 && dp ==0 && un==2) {
					//km2 to km2
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==0 && dp==1 && un==2) {
					//km2 to hectarea
					txtResultado.setText(String.valueOf(valor1*100));
				}else if(or==0 && dp==2 && un==2) {
					//km2 to m2
					txtResultado.setText(String.valueOf(valor1*1000000));
				}else if(or==0 && dp==3 && un==2) {
					//km2 to milla2
					txtResultado.setText(String.valueOf(valor1*0.386102));
				}else if(or==0 && dp==4 && un==2) {
					//km2 to acre
					txtResultado.setText(String.valueOf(valor1*247.105));
				}else if(or==0 && dp==5 && un==2) {
					//km2 to pies2
					txtResultado.setText(String.valueOf(valor1*1.076e+7));
				}else if(or==0 && dp==6 && un==2) {
					//km2 to pulgada2
					txtResultado.setText(String.valueOf(valor1*1.55e+9));
				}
				
				//hectareas
				
				if(or==1 && dp ==0 && un==2) {
					//hect to km2
					txtResultado.setText(String.valueOf(valor1*0.01));
				}else if(or==1 && dp==1 && un==2) {
					//hect to hectarea
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==1 && dp==2 && un==2) {
					//hect to m2
					txtResultado.setText(String.valueOf(valor1*10000));
				}else if(or==1 && dp==3 && un==2) {
					//hect to milla2
					txtResultado.setText(String.valueOf(valor1*0.00386102));
				}else if(or==1 && dp==4 && un==2) {
					//hectarea to acre
					txtResultado.setText(String.valueOf(valor1*2.47105));
				}else if(or==1 && dp==5 && un==2) {
					//hect to pies2
					txtResultado.setText(String.valueOf(valor1*107639));
				}else if(or==1 && dp==6 && un==2) {
					//hect to pulgada2
					txtResultado.setText(String.valueOf(valor1*1.55e+7));
				}
				
				//metros cuadrados
				
				if(or==2 && dp ==0 && un==2) {
					//m2 to km2
					txtResultado.setText(String.valueOf(valor1*1e-6));
				}else if(or==2 && dp==1 && un==2) {
					//m2 to hectarea
					txtResultado.setText(String.valueOf(valor1*1e-4));
				}else if(or==2 && dp==2 && un==2) {
					//m2 to m2
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==2 && dp==3 && un==2) {
					//m2 to milla2
					txtResultado.setText(String.valueOf(valor1*3.861e-7));
				}else if(or==2 && dp==4 && un==2) {
					//m2 to acre
					txtResultado.setText(String.valueOf(valor1*0.000247105));
				}else if(or==2 && dp==5 && un==2) {
					//m2 to pies2
					txtResultado.setText(String.valueOf(valor1*10.7639));
				}else if(or==2 && dp==6 && un==2) {
					//m2 to pulgada2
					txtResultado.setText(String.valueOf(valor1*1550));
				}
				
				//millas cuadradas
				
				if(or==3 && dp ==0 && un==2) {
					//milla2 to km2
					txtResultado.setText(String.valueOf(valor1*2.58999));
				}else if(or==3 && dp==1 && un==2) {
					//milla2 to hectarea
					txtResultado.setText(String.valueOf(valor1*258.999));
				}else if(or==3 && dp==2 && un==2) {
					//milla2 to m2
					txtResultado.setText(String.valueOf(valor1*2.59e+6));
				}else if(or==3 && dp==3 && un==2) {
					//milla2 to milla2
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==4 && un==2) {
					//milla2 to acre
					txtResultado.setText(String.valueOf(valor1*640));
				}else if(or==3 && dp==5 && un==2) {
					//milla2 to pies2
					txtResultado.setText(String.valueOf(valor1*2.788e+7));
				}else if(or==3 && dp==6 && un==2) {
					//milla2 to pulgada2
					txtResultado.setText(String.valueOf(valor1*4.014e+9));
				}
				
				//acres
				
				if(or==4 && dp ==0 && un==2) {
					//acre to km2
					txtResultado.setText(String.valueOf(valor1*0.00404686));
				}else if(or==4 && dp==1 && un==2) {
					//acre to hectarea
					txtResultado.setText(String.valueOf(valor1*0.404686));
				}else if(or==4 && dp==2 && un==2) {
					//acre to m2
					txtResultado.setText(String.valueOf(valor1*4046.86));
				}else if(or==4 && dp==3 && un==2) {
					//acre to milla2
					txtResultado.setText(String.valueOf(valor1*0.0015625));
				}else if(or==4 && dp==4 && un==2) {
					//acre to acre 
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==4 && dp==5 && un==2) {
					//acre to pies2
					txtResultado.setText(String.valueOf(valor1*43560));
				}else if(or==4 && dp==6 && un==2) {
					//acre to pulgada2
					txtResultado.setText(String.valueOf(valor1*6.273e+6));
				}
				
				//pies cuadrados
				
				if(or==5 && dp ==0 && un==2) {
					//pies2 to km2
					txtResultado.setText(String.valueOf(valor1*9.2903e-8));
				}else if(or==5 && dp==1 && un==2) {
					//pies2 to hectarea
					txtResultado.setText(String.valueOf(valor1*9.2903e-6));
				}else if(or==5 && dp==2 && un==2) {
					//pies2 to m2
					txtResultado.setText(String.valueOf(valor1*0.092903));
				}else if(or==5 && dp==3 && un==2) {
					//pies2 to milla2
					txtResultado.setText(String.valueOf(valor1*3.587e-8));
				}else if(or==5 && dp==4 && un==2) {
					//pies2 to acre
					txtResultado.setText(String.valueOf(valor1*2.2957e-5));
				}else if(or==5 && dp==5 && un==2) {
					//pies2 to pies2
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==5 && dp==6 && un==2) {
					//pies2 to pulgada2
					txtResultado.setText(String.valueOf(valor1*144));
				}
				
				//pulgadas cuadradas
				
				if(or==6 && dp ==0 && un==2) {
					//pulg2 to km2
					txtResultado.setText(String.valueOf(valor1*6.4516e-10));
				}else if(or==6 && dp==1 && un==2) {
					//pulg2 to hectarea
					txtResultado.setText(String.valueOf(valor1*6.4516e-8));
				}else if(or==6 && dp==2 && un==2) {
					//pulg2 to m2
					txtResultado.setText(String.valueOf(valor1/1550));
				}else if(or==6 && dp==3 && un==2) {
					//pulg2 to milla2
					txtResultado.setText(String.valueOf(valor1*2.491e-10));
				}else if(or==6 && dp==4 && un==2) {
					//pulg2 to acre
					txtResultado.setText(String.valueOf(valor1*1.5942e-7));
				}else if(or==6 && dp==5 && un==2) {
					//pulg2 to pies2
					txtResultado.setText(String.valueOf(valor1*0.00694444));
				}else if(or==6 && dp==6 && un==2) {
					//pulg2 to pulg2
					txtResultado.setText(String.valueOf(valor1));
				}
				
				//***************************************************************************************************
				//***************************************************************************************************
				//------------------------------------------Volumen--------------------------------------------------
				//***************************************************************************************************
				//***************************************************************************************************
				
				//division m3
				if(or==0 && dp==0 && un==3) {
					//m3 to m3
					txtResultado.setText(String.valueOf(valor1));
			}else if(or==0 && dp==1 && un==3) {
					//m3 to litro
					txtResultado.setText(String.valueOf(valor1*1000));	
				}else if(or==0 && dp==2 && un==3) {
					//m3 to cm3
					txtResultado.setText(String.valueOf(valor1*1e+6));	
				}else if(or==0 && dp==3 && un==3) {
					//m3 to mililitro
					txtResultado.setText(String.valueOf(valor1*1e+6));	
				}else if(or==0 && dp==4 && un==3) {
					//m3 to barril
					txtResultado.setText(String.valueOf(valor1*8.3864));	
				}else if(or==0 && dp==5 && un==3) {
					//m3 to galon
					txtResultado.setText(String.valueOf(valor1*219.969));	
				}else if(or==0 && dp==6 && un==3) {
					//m3 to pinta
					txtResultado.setText(String.valueOf(valor1*1759.75));	
				}else if(or==0 && dp==7 && un==3) {
					//m3 to onza liquida
					txtResultado.setText(String.valueOf(valor1*33814));	
				}
				
				//division liter
				
				if(or==1 && dp ==0 && un==3) {
					//litro to m3
					txtResultado.setText(String.valueOf(valor1*0.001));
				}else if(or==1 && dp==1 && un==3) {
					//litro to litro
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==1 && dp==2 && un==3) {
					//litro to cm3
					txtResultado.setText(String.valueOf(valor1*1000));	
				}else if(or==1 && dp==3 && un==3) {
					//litro to mililitro
					txtResultado.setText(String.valueOf(valor1*1000));	
				}else if(or==1 && dp==4 && un==3) {
					//litro to barril
					txtResultado.setText(String.valueOf(valor1*0.00628981));	
				}else if(or==1 && dp==5 && un==3) {
					//litro to galon
					txtResultado.setText(String.valueOf(valor1*0.264172));	
				}else if(or==1 && dp==6 && un==3) {
					//litro to pinta
					txtResultado.setText(String.valueOf(valor1*2.11338));	
				}else if(or==1 && dp==7 && un==3) {
					//litro to onza liquida
					txtResultado.setText(String.valueOf(valor1*33.814));	
				}
				
				//division cm3
				
				if(or==2 && dp ==0 && un==3) {
					//cm3 to m3
					txtResultado.setText(String.valueOf(valor1*1e-6));
				}else if(or==2 && dp==1 && un==3) {
					//cm3 to litro
					txtResultado.setText(String.valueOf(valor1*0.001));
				}else if(or==2 && dp==2 && un==3) {
					//cm3 to cm3 
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==2 && dp==3 && un==3) {
					//cm3 to mililitro
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==2 && dp==4 && un==3) {
					//cm3 to barril
					txtResultado.setText(String.valueOf(valor1*6.28981e-6));	
				}else if(or==2 && dp==5 && un==3) {
					//cm3 to galon
					txtResultado.setText(String.valueOf(valor1*0.000264172));	
				}else if(or==2 && dp==6 && un==3) {
					//cm3 to pinta
					txtResultado.setText(String.valueOf(valor1*0.00211338));	
				}else if(or==2 && dp==7 && un==3) {
					//cm3 onza liquida
					txtResultado.setText(String.valueOf(valor1*0.033814));	
				}
				
				//division mililitro
				
				if(or==3 && dp ==0 && un==3) {
					//mililitro to m3
					txtResultado.setText(String.valueOf(valor1*1e-6));
				}else if(or==3 && dp==1 && un==3) {
					//mililitro to litro
					txtResultado.setText(String.valueOf(valor1*0.001));
				}else if(or==3 && dp==2 && un==3) {
					//mililitro to cm3
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==3 && dp==3 && un==3) {
					//mililitro to mililitro
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==3 && dp==4 && un==3) {
					//mililitro barril
					txtResultado.setText(String.valueOf(valor1*6.28981e-6));	
				}else if(or==3 && dp==5 && un==3) {
					//mililitro to galon
					txtResultado.setText(String.valueOf(valor1*0.000264172));	
				}else if(or==3 && dp==6 && un==3) {
					//mililitro to pinta
					txtResultado.setText(String.valueOf(valor1*0.00211338));	
				}else if(or==3 && dp==7 && un==3) {
					//mililitro to onza liquida
					txtResultado.setText(String.valueOf(valor1*0.033814));	
				}
				
				//division barril
				
				if(or==4 && dp ==0 && un==3) {
					//barril to m3
					txtResultado.setText(String.valueOf(valor1*0.158987));
				}else if(or==4 && dp==1 && un==3) {
					//barril to litro
					txtResultado.setText(String.valueOf(valor1*158.987));
				}else if(or==4 && dp==2 && un==3) {
					//barril to cm3
					txtResultado.setText(String.valueOf(valor1*158987));	
				}else if(or==4 && dp==3 && un==3) {
					//barril to mililitro
					txtResultado.setText(String.valueOf(valor1*158987));	
				}else if(or==4 && dp==4 && un==3) {
					//barril to barril
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==4 && dp==5 && un==3) {
					//barril to galon
					txtResultado.setText(String.valueOf(valor1*42));	
				}else if(or==4 && dp==6 && un==3) {
					//barril to pinta
					txtResultado.setText(String.valueOf(valor1*336));	
				}else if(or==4 && dp==7 && un==3) {
					//barril to onza liquida
					txtResultado.setText(String.valueOf(valor1*5376));
				}
				
				//division gallon
				
				if(or==5 && dp ==0 && un==3) {
					//galon to m3
					txtResultado.setText(String.valueOf(valor1*0.00378541));
				}else if(or==5 && dp==1 && un==3) {
					//galon to litro
					txtResultado.setText(String.valueOf(valor1*3.78541));
				}else if(or==5 && dp==2 && un==3) {
					//galon to cm3
					txtResultado.setText(String.valueOf(valor1*3785.41));	
				}else if(or==5 && dp==3 && un==3) {
					//galon to mililitro
					txtResultado.setText(String.valueOf(valor1*3785.41));	
				}else if(or==5 && dp==4 && un==3) {
					//galon to barril
					txtResultado.setText(String.valueOf(valor1*0.023810));	
				}else if(or==5 && dp==5 && un==3) {
					//galon to galon
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==5 && dp==6 && un==3) {
					//galon to pinta
					txtResultado.setText(String.valueOf(valor1*8));	
				}else if(or==5 && dp==7 && un==3) {
					//galon to onza liquida
					txtResultado.setText(String.valueOf(valor1*128));
				}
				
				//division pinta
				
				if(or==6 && dp ==0 && un==3) {
					//pinta to m3
					txtResultado.setText(String.valueOf(valor1*0.000473176));
				}else if(or==6 && dp==1 && un==3) {
					//pinta to litro
					txtResultado.setText(String.valueOf(valor1*0.473176));
				}else if(or==6 && dp==2 && un==3) {
					//pinta to cm3
					txtResultado.setText(String.valueOf(valor1*473.176));	
				}else if(or==6 && dp==3 && un==3) {
					//pinta to mililitro
					txtResultado.setText(String.valueOf(valor1*473.176));	
				}else if(or==6 && dp==4 && un==3) {
					//pinta to barril
					txtResultado.setText(String.valueOf(valor1*0.0029761905));	
				}else if(or==6 && dp==5 && un==3) {
					//pinta to galon
					txtResultado.setText(String.valueOf(valor1*0.125));	
				}else if(or==6 && dp==6 && un==3) {
					//pinta to pinta
					txtResultado.setText(String.valueOf(valor1));	
				}else if(or==6 && dp==7 && un==3) {
					//pinta to onza liquida
					txtResultado.setText(String.valueOf(valor1*16));
				}
				
				//division onza liquida
				
				if(or==7 && dp ==0 && un==3) {
					//onza l to m3
					txtResultado.setText(String.valueOf(valor1*2.95735e-5));
				}else if(or==7 && dp==1 && un==3) {
					//onza L to litro
					txtResultado.setText(String.valueOf(valor1*0.0295735));
				}else if(or==7 && dp==2 && un==3) {
					//onza L to cm3
					txtResultado.setText(String.valueOf(valor1*29.5735));	
				}else if(or==7 && dp==3 && un==3) {
					//onza L to mililitro
					txtResultado.setText(String.valueOf(valor1*29.5735));	
				}else if(or==7 && dp==4 && un==3) {
					//onza L to barril
					txtResultado.setText(String.valueOf(valor1/5376.000092));	
				}else if(or==7 && dp==5 && un==3) {
					//onza L to galon
					txtResultado.setText(String.valueOf(valor1*0.0078125));	
				}else if(or==7 && dp==6 && un==3) {
					//onza L to pinta
					txtResultado.setText(String.valueOf(valor1*0.0625));	
				}else if(or==7 && dp==7 && un==3) {
					//onza L to onza liquida
					txtResultado.setText(String.valueOf(valor1));
				}
				
				//***************************************************************************************************
				//***************************************************************************************************
				//------------------------------------------Peso-----------------------------------------------------
				//***************************************************************************************************
				//***************************************************************************************************
				
				//Tonelada
				if(or==0 && dp==0 && un==4) {
					//tone to tone
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==0 && dp==1 && un==4) {
					//tone to kg
					txtResultado.setText(String.valueOf(valor1*1000));
				}else if(or==0 && dp==2 && un==4) {
					//tone to gr
					txtResultado.setText(String.valueOf(valor1*1e+6));
				}else if(or==0 && dp==3 && un==4) {
					//tone to tone corta
					txtResultado.setText(String.valueOf(valor1*1.10231));
				}else if(or==0 && dp==4 && un==4) {
					//tone to libra
					txtResultado.setText(String.valueOf(valor1*2204.62));
				}else if(or==0 && dp==5 && un==4) {
					//tone to onza
					txtResultado.setText(String.valueOf(valor1*35274));
				}
				
				//Kilogramo
				if(or==1 && dp==0 && un==4) {
					//kg to tone
					txtResultado.setText(String.valueOf(valor1*0.001));
				}else if(or==1 && dp==1 && un==4) {
					//kg to kg
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==1 && dp==2 && un==4) {
					//kg to gr
					txtResultado.setText(String.valueOf(valor1*1000));
				}else if(or==1 && dp==3 && un==4) {
					//kg to tone corta
					txtResultado.setText(String.valueOf(valor1*0.00110231));
				}else if(or==1 && dp==4 && un==4) {
					//kg to libra
					txtResultado.setText(String.valueOf(valor1*2.20462));
				}else if(or==1 && dp==5 && un==4) {
					//kg to onza
					txtResultado.setText(String.valueOf(valor1*35.274));
				}
				
				//Gramo
				if(or==2 && dp==0 && un==4) {
					//gr to tone
					txtResultado.setText(String.valueOf(valor1*1e-6));
				}else if(or==2 && dp==1 && un==4) {
					//gr to kg
					txtResultado.setText(String.valueOf(valor1*0.001));
				}else if(or==2 && dp==2 && un==4) {
					//gr to gr
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==2 && dp==3 && un==4) {
					//gr to tone corta
					txtResultado.setText(String.valueOf(valor1*1.1023e-6));
				}else if(or==2 && dp==4 && un==4) {
					//gr to libra
					txtResultado.setText(String.valueOf(valor1*0.00220462));
				}else if(or==2 && dp==5 && un==4) {
					//gr to onza
					txtResultado.setText(String.valueOf(valor1*0.035274));
				}
				
				//Tonelada corta
				if(or==3 && dp==0 && un==4) {
					//tone c to tone
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==1 && un==4) {
					//tone c to kg
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==2 && un==4) {
					//tone c to gr
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==3 && un==4) {
					//tonce c to tone corta
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==4 && un==4) {
					//tone c to libra
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==5 && un==4) {
					//tone c to onza
					txtResultado.setText(String.valueOf(valor1));
				}
				
				//libra
				if(or==4 && dp==0 && un==4) {
					//libra to tone
					txtResultado.setText(String.valueOf(valor1*0.000453592));
				}else if(or==4 && dp==1 && un==4) {
					//libra to kg
					txtResultado.setText(String.valueOf(valor1*0.453592));
				}else if(or==4 && dp==2 && un==4) {
					//libra to gr
					txtResultado.setText(String.valueOf(valor1*453.592));
				}else if(or==4 && dp==3 && un==4) {
					//libra to tonce c
					txtResultado.setText(String.valueOf(valor1*0.0005));
				}else if(or==4 && dp==4 && un==4) {
					//libra to libra
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==4 && dp==5 && un==4) {
					//libra tu onza
					txtResultado.setText(String.valueOf(valor1*16));
				}
				
				//Onza
				if(or==5 && dp==0 && un==4) {
					//onza tu tone 
					txtResultado.setText(String.valueOf(valor1*2.835e-5));
				}else if(or==5 && dp==1 && un==4) {
					//onza to kg
					txtResultado.setText(String.valueOf(valor1*0.0283495));
				}else if(or==5 && dp==2 && un==4) {
					//onza to gr 
					txtResultado.setText(String.valueOf(valor1*28.3495));
				}else if(or==5 && dp==3 && un==4) {
					//onza to tone c
					txtResultado.setText(String.valueOf(valor1*3.125e-5));
				}else if(or==5 && dp==4 && un==4) {
					//onza to libra
					txtResultado.setText(String.valueOf(valor1*0.0625));
				}else if(or==5 && dp==5 && un==4) {
					//onza to onza 
					txtResultado.setText(String.valueOf(valor1));
				}
				
				//***************************************************************************************************
				//***************************************************************************************************
				//------------------------------------------Velocidad------------------------------------------------
				//***************************************************************************************************
				//***************************************************************************************************
				
				//km/s
				
				if(or==0 && dp ==0 && un==5) {
					//km/s to km/s
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==0 && dp==1 && un==5) {
					//km/s to m/s
					txtResultado.setText(String.valueOf(valor1*1000));
				}else if(or==0 && dp==2 && un==5) {
					//km/s to km/hr
					txtResultado.setText(String.valueOf(valor1*3600));
				}else if(or==0 && dp==3 && un==5) {
					//km/s to milla/s
					txtResultado.setText(String.valueOf(valor1*0.621371));
				}else if(or==0 && dp==4 && un==5) {
					//km/s to milla/hr
					txtResultado.setText(String.valueOf(valor1*2236.94));
				}else if(or==0 && dp==5 && un==5) {
					//km/s to pie/s
					txtResultado.setText(String.valueOf(valor1*3280.84));
				}else if(or==0 && dp==6 && un==5) {
					//km/s to nudo
					txtResultado.setText(String.valueOf(valor1*1943.84));
				}
				
				//m/s
				
				if(or==1 && dp ==0 && un==5) {
					//m/s to km/s
					txtResultado.setText(String.valueOf(valor1*0.001));
				}else if(or==1 && dp==1 && un==5) {
					//m/s to m/s
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==1 && dp==2 && un==5) {
					//m/s to km/h
					txtResultado.setText(String.valueOf(valor1*3.6));
				}else if(or==1 && dp==3 && un==5) {
					//m/s to milla/s
					txtResultado.setText(String.valueOf(valor1*0.000621371));
				}else if(or==1 && dp==4 && un==5) {
					//m/s to milla/hr
					txtResultado.setText(String.valueOf(valor1*2.23694));
				}else if(or==1 && dp==5 && un==5) {
					//m/s to pie/s
					txtResultado.setText(String.valueOf(valor1*3.28084));
				}else if(or==1 && dp==6 && un==5) {
					//m/s to nudo
					txtResultado.setText(String.valueOf(valor1*1.94384));
				}
				
				//km/hr
				
				if(or==2 && dp ==0 && un==5) {
					//km/hr to km/s
					txtResultado.setText(String.valueOf(valor1*0.000277778));
				}else if(or==2 && dp==1 && un==5) {
					//km/hr to m/s
					txtResultado.setText(String.valueOf(valor1*0.277778));
				}else if(or==2 && dp==2 && un==5) {
					//km/hr to km/hr
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==2 && dp==3 && un==5) {
					//km/hr to milla/s
					txtResultado.setText(String.valueOf(valor1*0.000172603));
				}else if(or==2 && dp==4 && un==5) {
					//km/hr to milla/hr
					txtResultado.setText(String.valueOf(valor1*0.621371));
				}else if(or==2 && dp==5 && un==5) {
					//km/hr to pie/s
					txtResultado.setText(String.valueOf(valor1*0.911344));
				}else if(or==2 && dp==6 && un==5) {
					//km/hr to nudo
					txtResultado.setText(String.valueOf(valor1*0.539957));
				}
				
				//milla/s
				
				if(or==3 && dp ==0 && un==5) {
					//milla/s to km/s
					txtResultado.setText(String.valueOf(valor1*1.60934));
				}else if(or==3 && dp==1 && un==5) {
					//milla/s to m/s
					txtResultado.setText(String.valueOf(valor1*1609.34));
				}else if(or==3 && dp==2 && un==5) {
					//milla/s to km/hr
					txtResultado.setText(String.valueOf(valor1*5793.64));
				}else if(or==3 && dp==3 && un==5) {
					//milla/s to milla/s
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==3 && dp==4 && un==5) {
					//milla/s to milla/hr
					txtResultado.setText(String.valueOf(valor1*3600));
				}else if(or==3 && dp==5 && un==5) {
					//milla/s to pie/s
					txtResultado.setText(String.valueOf(valor1*5280));
				}else if(or==3 && dp==6 && un==5) {
					//milla/s to nudo
					txtResultado.setText(String.valueOf(valor1*3128.31));
				}
				
				//milla/hr
				
				if(or==4 && dp ==0 && un==5) {
					//milla/hr to km/s
					txtResultado.setText(String.valueOf(valor1*0.00044704));
				}else if(or==4 && dp==1 && un==5) {
					//milla/hr to m/s
					txtResultado.setText(String.valueOf(valor1*0.44704));
				}else if(or==4 && dp==2 && un==5) {
					//milla/hr to km/hr
					txtResultado.setText(String.valueOf(valor1*1.60934));
				}else if(or==4 && dp==3 && un==5) {
					//milla/hr to milla/s
					txtResultado.setText(String.valueOf(valor1*0.000277778));
				}else if(or==4 && dp==4 && un==5) {
					//milla/hr to milla/hr
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==4 && dp==5 && un==5) {
					//milla/hr to pie/s
					txtResultado.setText(String.valueOf(valor1*1.46667));
				}else if(or==4 && dp==6 && un==5) {
					//milla/hr to nudo
					txtResultado.setText(String.valueOf(valor1*0.868976));
				}
				
				//pies/s
				
				if(or==5 && dp ==0 && un==5) {
					//pie/s to km/s
					txtResultado.setText(String.valueOf(valor1*0.0003048));
				}else if(or==5 && dp==1 && un==5) {
					//pie/s to m/s
					txtResultado.setText(String.valueOf(valor1*0.3048));
				}else if(or==5 && dp==2 && un==5) {
					//pie/s to km/hr
					txtResultado.setText(String.valueOf(valor1*1.09728));
				}else if(or==5 && dp==3 && un==5) {
					//pie/s to milla/s
					txtResultado.setText(String.valueOf(valor1*0.000189394));
				}else if(or==5 && dp==4 && un==5) {
					//pie/s to milla/hr
					txtResultado.setText(String.valueOf(valor1*0.681818));
				}else if(or==5 && dp==5 && un==5) {
					//pie/s to pie/s
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==5 && dp==6 && un==5) {
					//pie/s to nudo
					txtResultado.setText(String.valueOf(valor1*0.592484));
				}
				
				//nudo
				
				if(or==6 && dp ==0 && un==5) {
					//nudo to km/s
					txtResultado.setText(String.valueOf(valor1*0.000514444));
				}else if(or==6 && dp==1 && un==5) {
					//nudo to m/s
					txtResultado.setText(String.valueOf(valor1*0.514444));
				}else if(or==6 && dp==2 && un==5) {
					//nudo to km/hr
					txtResultado.setText(String.valueOf(valor1*1.852));
				}else if(or==6 && dp==3 && un==5) {
					//nudo to milla/s
					txtResultado.setText(String.valueOf(valor1*0.000319661));
				}else if(or==6 && dp==4 && un==5) {
					//nudo to milla/hr
					txtResultado.setText(String.valueOf(valor1*1.15078));
				}else if(or==6 && dp==5 && un==5) {
					//nudo to pie/s
					txtResultado.setText(String.valueOf(valor1*1.68781));
				}else if(or==6 && dp==6 && un==5) {
					//nudo to nudo
					txtResultado.setText(String.valueOf(valor1));
				}
				
				//***************************************************************************************************
				//***************************************************************************************************
				//------------------------------------------Temperatura------------------------------------------------
				//***************************************************************************************************
				//***************************************************************************************************
				
				//celsius
				
				if(or==0 && dp==0 && un==6) {
					//celsius to celsius
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==0 && dp==1 && un==6) {
					//celsius to fahrenheit
					txtResultado.setText(String.valueOf((valor1*9/5)+32));
				}else if(or==0 && dp==2 && un==6) {
					//celsius to kelvin
					txtResultado.setText(String.valueOf(valor1+273.15));
				}
				
				//fahrenheit
				
				if(or==1 && dp==0 && un==6) {
					//fahrenheit to celsius
					txtResultado.setText(String.valueOf((valor1-32)*5/9));
				}else if(or==1 && dp==1 && un==6) {
					//fahrenheit to fahrenheit 
					txtResultado.setText(String.valueOf(valor1));
				}else if(or==1 && dp==2 && un==6) {
					//fahrenheit to kelvin
					txtResultado.setText(String.valueOf((valor1-32)*5/9+273.15));
				}
				
				//kelvin
				
				if(or==2 && dp==0 && un==6) {
					//kelvin to celsius
					txtResultado.setText(String.valueOf(valor1-273.15));
				}else if(or==2 && dp==1 && un==6) {
					//kelvin to fahrenheit
					txtResultado.setText(String.valueOf((valor1-273.15)*9/5+32));
				}else if(or==2 && dp==2 && un==6) {
					//kelvin to kelvin
					txtResultado.setText(String.valueOf(valor1));
				}
				
			}
		});
		
		
		
		
		btnConvertir.setBounds(21, 171, 89, 23);
		contentPane.add(btnConvertir);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(319, 172, 248, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(DO_NOTHING_ON_CLOSE);
			}
		});
		btnTerminar.setBounds(151, 171, 89, 23);
		contentPane.add(btnTerminar);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(319, 150, 76, 14);
		contentPane.add(lblResultado);
		
		JLabel lblFromUnidad = new JLabel("Ingresa el valor");
		lblFromUnidad.setBounds(21, 80, 86, 14);
		contentPane.add(lblFromUnidad);
		
		JLabel lblFromUnidad2 = new JLabel("a convertir:");
		lblFromUnidad2.setBounds(21, 92, 76, 14);
		contentPane.add(lblFromUnidad2);
		
		
	}
}
	
