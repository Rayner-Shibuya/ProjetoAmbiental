package reciclagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean pressionado = false;
	private JTextField txtPlacar;
	private int valorDoLixo = 0;
	private int score = 0;
	private static String jogador;
	private int total = 0;
	private JFrame inicio = new TelaInicio(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal(jogador, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public String getJogador() {
		return jogador;
	}

	/**
	 * Create the frame.
	 * @param frame 
	 * @param string 
	 */
	public Principal(String jogador, TelaInicio frame) {
		
		this.jogador = jogador;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JToggleButton tglbtnMaca = new JToggleButton("");
		tglbtnMaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnMaca.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 4;
						pressionado = true;

					} else {
						tglbtnMaca.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnMaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/ma\u00E7a.png")));
		tglbtnMaca.setBackground(new Color(34, 139, 34));
		tglbtnMaca.setBounds(28, 15, 57, 57);
		contentPane.add(tglbtnMaca);

		JToggleButton tglbtnPapelao = new JToggleButton("");
		tglbtnPapelao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPapelao.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnPapelao.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnPapelao.setBackground(new Color(34, 139, 34));
		tglbtnPapelao.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Papelao.png")));
		tglbtnPapelao.setBounds(141, 15, 57, 57);
		contentPane.add(tglbtnPapelao);

		JLabel lblPlacar = new JLabel("PLACAR : ");
		lblPlacar.setBounds(636, 415, 57, 23);
		contentPane.add(lblPlacar);

		txtPlacar = new JTextField();
		txtPlacar.setEditable(false);
		txtPlacar.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlacar.setText("0");
		txtPlacar.setBounds(698, 416, 86, 20);
		contentPane.add(txtPlacar);
		txtPlacar.setColumns(10);

		JLabel lblPlayer = new JLabel("JOGADOR :");
		lblPlayer.setBounds(624, 381, 69, 23);
		contentPane.add(lblPlayer);

		JLabel lblNomeJogador = new JLabel(jogador);
		lblNomeJogador.setBounds(698, 385, 86, 14);
		contentPane.add(lblNomeJogador);

		JToggleButton tglbtnChocolate = new JToggleButton("");
		tglbtnChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnChocolate.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnChocolate.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnChocolate.setBackground(new Color(34, 139, 34));
		tglbtnChocolate.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/chocolate.png")));
		tglbtnChocolate.setBounds(45, 98, 57, 57);
		contentPane.add(tglbtnChocolate);

		JToggleButton tglbtnOvo2 = new JToggleButton("");
		tglbtnOvo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnOvo2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 4;
						pressionado = true;
					} else {
						tglbtnOvo2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnOvo2.setBackground(new Color(34, 139, 34));
		tglbtnOvo2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Ovo.png")));
		tglbtnOvo2.setBounds(74, 170, 57, 57);
		contentPane.add(tglbtnOvo2);

		JToggleButton tglbtnSacPapel = new JToggleButton("");
		tglbtnSacPapel.setBackground(new Color(0, 128, 0));
		tglbtnSacPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/SacolaPapel.png")));
		tglbtnSacPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tglbtnSacPapel.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnSacPapel.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}

			}

		});
		tglbtnSacPapel.setBounds(28, 249, 57, 57);
		contentPane.add(tglbtnSacPapel);

		JToggleButton tglbtnEspelho = new JToggleButton("");
		tglbtnEspelho.setBackground(new Color(34, 139, 34));
		tglbtnEspelho.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/espelho.png")));
		tglbtnEspelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnEspelho.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 3;
						pressionado = true;
					} else {
						tglbtnEspelho.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnEspelho.setBounds(154, 238, 57, 57);
		contentPane.add(tglbtnEspelho);

		JToggleButton tglbtnTaca = new JToggleButton("");
		tglbtnTaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnTaca.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 3;
						pressionado = true;
					} else {
						tglbtnTaca.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnTaca.setBackground(new Color(34, 139, 34));
		tglbtnTaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/ta\u00E7a.png")));
		tglbtnTaca.setBounds(154, 98, 57, 57);
		contentPane.add(tglbtnTaca);

		JToggleButton tglbtnPet2 = new JToggleButton("");
		tglbtnPet2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPet2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnPet2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnPet2.setBackground(new Color(34, 139, 34));
		tglbtnPet2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/pet.png")));
		tglbtnPet2.setBounds(243, 15, 57, 57);
		contentPane.add(tglbtnPet2);

		JToggleButton tglbtnJornal = new JToggleButton("");
		tglbtnJornal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnJornal.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnJornal.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnJornal.setBackground(new Color(34, 139, 34));
		tglbtnJornal.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/jornal.png")));
		tglbtnJornal.setBounds(300, 83, 57, 57);
		contentPane.add(tglbtnJornal);

		JToggleButton tglbtnPapel = new JToggleButton("");
		tglbtnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPapel.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnPapel.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/papel.png")));
		tglbtnPapel.setBackground(new Color(34, 139, 34));
		tglbtnPapel.setBounds(230, 151, 57, 57);
		contentPane.add(tglbtnPapel);

		JToggleButton tglbtnRemedio = new JToggleButton("");
		tglbtnRemedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnRemedio.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnRemedio.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnRemedio.setBackground(new Color(34, 139, 34));
		tglbtnRemedio.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/remedio.png")));
		tglbtnRemedio.setBounds(275, 238, 57, 57);
		contentPane.add(tglbtnRemedio);

		JToggleButton tglbtnSacola = new JToggleButton("");
		tglbtnSacola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnSacola.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnSacola.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnSacola.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Sacola.png")));
		tglbtnSacola.setBackground(new Color(34, 139, 34));
		tglbtnSacola.setBounds(367, 15, 57, 57);
		contentPane.add(tglbtnSacola);

		JToggleButton tglbtnGarrafa = new JToggleButton("");
		tglbtnGarrafa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnGarrafa.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 3;
						pressionado = true;
					} else {
						tglbtnGarrafa.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnGarrafa.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/GarrafaVidro.png")));
		tglbtnGarrafa.setBackground(new Color(34, 139, 34));
		tglbtnGarrafa.setBounds(446, 83, 57, 57);
		contentPane.add(tglbtnGarrafa);

		JToggleButton tglbtnBanana = new JToggleButton("");
		tglbtnBanana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnBanana.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 4;
						pressionado = true;
					} else {
						tglbtnBanana.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnBanana.setBackground(new Color(34, 139, 34));
		tglbtnBanana.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Banana.png")));
		tglbtnBanana.setBounds(357, 151, 57, 57);
		contentPane.add(tglbtnBanana);

		JToggleButton tglbtnChocolate2 = new JToggleButton("");
		tglbtnChocolate2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnChocolate2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnChocolate2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnChocolate2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/chocolate.png")));
		tglbtnChocolate2.setBackground(new Color(34, 139, 34));
		tglbtnChocolate2.setBounds(404, 238, 57, 57);
		contentPane.add(tglbtnChocolate2);

		JToggleButton tglbtnPapel2 = new JToggleButton("");
		tglbtnPapel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPapel2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnPapel2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnPapel2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/papel.png")));
		tglbtnPapel2.setBackground(new Color(34, 139, 34));
		tglbtnPapel2.setBounds(519, 15, 57, 57);
		contentPane.add(tglbtnPapel2);

		JToggleButton tglbtnJornal2 = new JToggleButton("");
		tglbtnJornal2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnJornal2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnJornal2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnJornal2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/jornal.png")));
		tglbtnJornal2.setBackground(new Color(34, 139, 34));
		tglbtnJornal2.setBounds(636, 48, 57, 57);
		contentPane.add(tglbtnJornal2);

		JToggleButton tglbtnBanana2 = new JToggleButton("");
		tglbtnBanana2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnBanana2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 4;
						pressionado = true;
					} else {
						tglbtnBanana2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnBanana2.setBackground(new Color(34, 139, 34));
		tglbtnBanana2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Banana.png")));
		tglbtnBanana2.setBounds(727, 15, 57, 57);
		contentPane.add(tglbtnBanana2);

		JToggleButton tglbtnOvo = new JToggleButton("");
		tglbtnOvo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnOvo.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 4;
						pressionado = true;
					} else {
						tglbtnOvo.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnOvo.setBackground(new Color(34, 139, 34));
		tglbtnOvo.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Ovo.png")));
		tglbtnOvo.setBounds(553, 98, 57, 57);
		contentPane.add(tglbtnOvo);

		JToggleButton tglbtnMaca2 = new JToggleButton("");
		tglbtnMaca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnMaca2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 4;
						pressionado = true;
					} else {
						tglbtnMaca2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnMaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/ma\u00E7a.png")));
		tglbtnMaca2.setBackground(new Color(34, 139, 34));
		tglbtnMaca2.setBounds(541, 249, 57, 57);
		contentPane.add(tglbtnMaca2);

		JToggleButton tglbtnTaca2 = new JToggleButton("");
		tglbtnTaca2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnTaca2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 3;
						pressionado = true;
					} else {
						tglbtnTaca2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnTaca2.setBackground(new Color(34, 139, 34));
		tglbtnTaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/ta\u00E7a.png")));
		tglbtnTaca2.setBounds(705, 118, 57, 57);
		contentPane.add(tglbtnTaca2);

		JToggleButton tglbtnPapelao2 = new JToggleButton("");
		tglbtnPapelao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPapelao2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 1;
						pressionado = true;
					} else {
						tglbtnPapelao2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnPapelao2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/Papelao.png")));
		tglbtnPapelao2.setBackground(new Color(34, 139, 34));
		tglbtnPapelao2.setBounds(612, 170, 57, 57);
		contentPane.add(tglbtnPapelao2);

		JToggleButton tglbtnEspelho2 = new JToggleButton("");
		tglbtnEspelho2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnEspelho2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 3;
						pressionado = true;
					} else {
						tglbtnEspelho2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnEspelho2.setBackground(new Color(34, 139, 34));
		tglbtnEspelho2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/espelho.png")));
		tglbtnEspelho2.setBounds(727, 210, 57, 57);
		contentPane.add(tglbtnEspelho2);

		JToggleButton tglbtnPet = new JToggleButton("");
		tglbtnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPet.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnPet.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});
		tglbtnPet.setBackground(new Color(34, 139, 34));
		tglbtnPet.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/pet.png")));
		tglbtnPet.setBounds(480, 170, 57, 57);
		contentPane.add(tglbtnPet);

		JToggleButton tglbtnRemedio2 = new JToggleButton("");
		tglbtnRemedio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnRemedio2.isSelected()) {
					if (pressionado == false) {
						valorDoLixo = 2;
						pressionado = true;
					} else {
						tglbtnRemedio2.setSelected(false);

					}

				} else {
					pressionado = false;
					valorDoLixo = 0;

				}
			}
		});

		JButton btnLixoPapel = new JButton("");
		btnLixoPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/LixoPapel.png")));
		btnLixoPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pressionado == true) {
					total ++;

					if (valorDoLixo == 1) {

//						UIManager.put("OptionPane.background", Color.green);
//						UIManager.put("Panel.background", Color.green);
//
//						JOptionPane.showMessageDialog(null, "ACERTOU!!!", "SetColor", JOptionPane.INFORMATION_MESSAGE);

						score = Integer.parseInt(txtPlacar.getText());
						score = score + 1;
						txtPlacar.setText(score + "");

						if (tglbtnSacPapel.isSelected()) {
							tglbtnSacPapel.setBackground(Color.BLUE);
							tglbtnSacPapel.doClick();
							tglbtnSacPapel.setEnabled(false);
						}
						if (tglbtnPapelao.isSelected()) {
							tglbtnPapelao.setBackground(Color.BLUE);
							tglbtnPapelao.doClick();
							tglbtnPapelao.setEnabled(false);
						}
						if (tglbtnPapel.isSelected()) {
							tglbtnPapel.setBackground(Color.BLUE);
							tglbtnPapel.doClick();
							tglbtnPapel.setEnabled(false);
						}
						if (tglbtnJornal.isSelected()) {
							tglbtnJornal.setBackground(Color.BLUE);
							tglbtnJornal.doClick();
							tglbtnJornal.setEnabled(false);
						}
						if (tglbtnPapel2.isSelected()) {
							tglbtnPapel2.setBackground(Color.BLUE);
							tglbtnPapel2.doClick();
							tglbtnPapel2.setEnabled(false);
						}
						if (tglbtnJornal2.isSelected()) {
							tglbtnJornal2.setBackground(Color.BLUE);
							tglbtnJornal2.doClick();
							tglbtnJornal2.setEnabled(false);
						}
						if (tglbtnPapelao2.isSelected()) {
							tglbtnPapelao2.setBackground(Color.BLUE);
							tglbtnPapelao2.doClick();
							tglbtnPapelao2.setEnabled(false);
						}

					} else {
						valorDoLixo = 0;
						pressionado = false;

//						UIManager.put("OptionPane.background", Color.RED);
//						UIManager.put("Panel.background", Color.RED);
//
//						JOptionPane.showMessageDialog(null, "Que pena, errou!!!", "SetColor",
//								JOptionPane.INFORMATION_MESSAGE);

						if (tglbtnMaca.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnMaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnMaca.setBackground(Color.RED);
							tglbtnMaca.doClick();
							tglbtnMaca.setEnabled(false);
						}
						if (tglbtnChocolate.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnChocolate.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnChocolate.setBackground(Color.RED);
							tglbtnChocolate.doClick();
							tglbtnChocolate.setEnabled(false);
						}
						if (tglbtnOvo2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnOvo2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnOvo2.setBackground(Color.RED);
							tglbtnOvo2.doClick();
							tglbtnOvo2.setEnabled(false);
						}
						if (tglbtnTaca.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnTaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnTaca.setBackground(Color.RED);
							tglbtnTaca.doClick();
							tglbtnTaca.setEnabled(false);
						}
						if (tglbtnEspelho.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnEspelho.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnEspelho.setBackground(Color.RED);
							tglbtnEspelho.doClick();
							tglbtnEspelho.setEnabled(false);
						}
						if (tglbtnPet2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnPet2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPet2.setBackground(Color.RED);
							tglbtnPet2.doClick();
							tglbtnPet2.setEnabled(false);
						}
						if (tglbtnRemedio.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnRemedio.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnRemedio.setBackground(Color.RED);
							tglbtnRemedio.doClick();
							tglbtnRemedio.setEnabled(false);
						}
						if (tglbtnSacola.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnSacola.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnSacola.setBackground(Color.RED);
							tglbtnSacola.doClick();
							tglbtnSacola.setEnabled(false);
						}
						if (tglbtnBanana.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnBanana.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnBanana.setBackground(Color.RED);
							tglbtnBanana.doClick();
							tglbtnBanana.setEnabled(false);
						}
						if (tglbtnChocolate2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnChocolate2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnChocolate2.setBackground(Color.RED);
							tglbtnChocolate2.doClick();
							tglbtnChocolate2.setEnabled(false);
						}
						if (tglbtnGarrafa.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnGarrafa.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnGarrafa.setBackground(Color.RED);
							tglbtnGarrafa.doClick();
							tglbtnGarrafa.setEnabled(false);
						}
						if (tglbtnPet.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnPet.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPet.setBackground(Color.RED);
							tglbtnPet.doClick();
							tglbtnPet.setEnabled(false);
						}
						if (tglbtnOvo.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnOvo.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnOvo.setBackground(Color.RED);
							tglbtnOvo.doClick();
							tglbtnOvo.setEnabled(false);
						}
						if (tglbtnMaca2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnMaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnMaca2.setBackground(Color.RED);
							tglbtnMaca2.doClick();
							tglbtnMaca2.setEnabled(false);
						}
						if (tglbtnBanana2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnBanana2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnBanana2.setBackground(Color.RED);
							tglbtnBanana2.doClick();
							tglbtnBanana2.setEnabled(false);
						}
						if (tglbtnTaca2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnTaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnTaca2.setBackground(Color.RED);
							tglbtnTaca2.doClick();
							tglbtnTaca2.setEnabled(false);
						}
						if (tglbtnEspelho2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnEspelho2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnEspelho2.setBackground(Color.RED);
							tglbtnEspelho2.doClick();
							tglbtnEspelho2.setEnabled(false);
						}

					}

				}

				else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um lixo do chão!");

				}
				
				if (total == 24) {
					JOptionPane.showMessageDialog(null, "           FIM DE JOGO!! \n\n        SEU SCORE FOI: " + score);
					dispose();
					inicio.setVisible(true);
				}
			}
		});
		btnLixoPapel.setBounds(45, 362, 86, 128);
		contentPane.add(btnLixoPapel);

		JButton btnLixoPlastico = new JButton("");
		btnLixoPlastico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pressionado == true) {
					total ++;

					if (valorDoLixo == 2) {

//						UIManager.put("OptionPane.background", Color.green);
//						UIManager.put("Panel.background", Color.green);
//
//						JOptionPane.showMessageDialog(null, "ACERTOU!!!", "SetColor", JOptionPane.INFORMATION_MESSAGE);

						score = Integer.parseInt(txtPlacar.getText());
						score = score + 1;
						txtPlacar.setText(score + "");

						if (tglbtnChocolate.isSelected()) {
							tglbtnChocolate.setBackground(Color.BLUE);
							tglbtnChocolate.doClick();
							tglbtnChocolate.setEnabled(false);
						}
						if (tglbtnPet2.isSelected()) {
							tglbtnPet2.setBackground(Color.BLUE);
							tglbtnPet2.doClick();
							tglbtnPet2.setEnabled(false);
						}
						if (tglbtnRemedio.isSelected()) {
							tglbtnRemedio.setBackground(Color.BLUE);
							tglbtnRemedio.doClick();
							tglbtnRemedio.setEnabled(false);
						}
						if (tglbtnSacola.isSelected()) {
							tglbtnSacola.setBackground(Color.BLUE);
							tglbtnSacola.doClick();
							tglbtnSacola.setEnabled(false);
						}
						if (tglbtnChocolate2.isSelected()) {
							tglbtnChocolate2.setBackground(Color.BLUE);
							tglbtnChocolate2.doClick();
							tglbtnChocolate2.setEnabled(false);
						}
						if (tglbtnPet.isSelected()) {
							tglbtnPet.setBackground(Color.BLUE);
							tglbtnPet.doClick();
							tglbtnPet.setEnabled(false);
						}

					} else {
						valorDoLixo = 0;
						pressionado = false;

//						UIManager.put("OptionPane.background", Color.RED);
//						UIManager.put("Panel.background", Color.RED);
//
//						JOptionPane.showMessageDialog(null, "Que pena, errou!!!", "SetColor",
//								JOptionPane.INFORMATION_MESSAGE);

						if (tglbtnSacPapel.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnSacPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnSacPapel.setBackground(Color.RED);
							tglbtnSacPapel.doClick();
							tglbtnSacPapel.setEnabled(false);
						}
						if (tglbtnPapelao.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapelao.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapelao.setBackground(Color.RED);
							tglbtnPapelao.doClick();
							tglbtnPapelao.setEnabled(false);
						}
						if (tglbtnPapel.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapel.setBackground(Color.RED);
							tglbtnPapel.doClick();
							tglbtnPapel.setEnabled(false);
						}
						if (tglbtnJornal.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnJornal.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnJornal.setBackground(Color.RED);
							tglbtnJornal.doClick();
							tglbtnJornal.setEnabled(false);
						}
						if (tglbtnPapel2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapel2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapel2.setBackground(Color.RED);
							tglbtnPapel2.doClick();
							tglbtnPapel2.setEnabled(false);
						}
						if (tglbtnJornal2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnJornal2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnJornal2.setBackground(Color.RED);
							tglbtnJornal2.doClick();
							tglbtnJornal2.setEnabled(false);
						}
						if (tglbtnPapelao2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapelao2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapelao2.setBackground(Color.RED);
							tglbtnPapelao2.doClick();
							tglbtnPapelao2.setEnabled(false);
						}
						if (tglbtnMaca.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnMaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnMaca.setBackground(Color.RED);
							tglbtnMaca.doClick();
							tglbtnMaca.setEnabled(false);
						}
						if (tglbtnOvo2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnOvo2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnOvo2.setBackground(Color.RED);
							tglbtnOvo2.doClick();
							tglbtnOvo2.setEnabled(false);
						}
						if (tglbtnTaca.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnTaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnTaca.setBackground(Color.RED);
							tglbtnTaca.doClick();
							tglbtnTaca.setEnabled(false);
						}
						if (tglbtnEspelho.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnEspelho.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnEspelho.setBackground(Color.RED);
							tglbtnEspelho.doClick();
							tglbtnEspelho.setEnabled(false);
						}

						if (tglbtnBanana.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnBanana.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnBanana.setBackground(Color.RED);
							tglbtnBanana.doClick();
							tglbtnBanana.setEnabled(false);
						}

						if (tglbtnGarrafa.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnGarrafa.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnGarrafa.setBackground(Color.RED);
							tglbtnGarrafa.doClick();
							tglbtnGarrafa.setEnabled(false);
						}

						if (tglbtnOvo.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnOvo.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnOvo.setBackground(Color.RED);
							tglbtnOvo.doClick();
							tglbtnOvo.setEnabled(false);
						}
						if (tglbtnMaca2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnMaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnMaca2.setBackground(Color.RED);
							tglbtnMaca2.doClick();
							tglbtnMaca2.setEnabled(false);
						}
						if (tglbtnBanana2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnBanana2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnBanana2.setBackground(Color.RED);
							tglbtnBanana2.doClick();
							tglbtnBanana2.setEnabled(false);
						}
						if (tglbtnTaca2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnTaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnTaca2.setBackground(Color.RED);
							tglbtnTaca2.doClick();
							tglbtnTaca2.setEnabled(false);
						}
						if (tglbtnEspelho2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnEspelho2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnEspelho2.setBackground(Color.RED);
							tglbtnEspelho2.doClick();
							tglbtnEspelho2.setEnabled(false);
						}

					}

				} else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um lixo do chão!");

				}
				
				if (total == 24) {
					JOptionPane.showMessageDialog(null, "           FIM DE JOGO!! \n\n        SEU SCORE FOI: " + score);
					dispose();
					inicio.setVisible(true);
				}
			}
		});
		btnLixoPlastico.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/LixoPlastico.png")));
		btnLixoPlastico.setBounds(201, 362, 86, 128);
		contentPane.add(btnLixoPlastico);

		JButton btnLixoVidro = new JButton("");
		btnLixoVidro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pressionado == true) {
					total ++;

					if (valorDoLixo == 3) {

						score = Integer.parseInt(txtPlacar.getText());
						score = score + 1;
						txtPlacar.setText(score + "");

						if (tglbtnTaca.isSelected()) {
							tglbtnTaca.setBackground(Color.BLUE);
							tglbtnTaca.doClick();
							tglbtnTaca.setEnabled(false);
						}
						if (tglbtnEspelho.isSelected()) {
							tglbtnEspelho.setBackground(Color.BLUE);
							tglbtnEspelho.doClick();
							tglbtnEspelho.setEnabled(false);
						}
						if (tglbtnGarrafa.isSelected()) {
							tglbtnGarrafa.setBackground(Color.BLUE);
							tglbtnGarrafa.doClick();
							tglbtnGarrafa.setEnabled(false);
						}
						if (tglbtnTaca2.isSelected()) {
							tglbtnTaca2.setBackground(Color.BLUE);
							tglbtnTaca2.doClick();
							tglbtnTaca2.setEnabled(false);
						}
						if (tglbtnEspelho2.isSelected()) {
							tglbtnEspelho2.setBackground(Color.BLUE);
							tglbtnEspelho2.doClick();
							tglbtnEspelho2.setEnabled(false);
						}

					} else {
						valorDoLixo = 0;
						pressionado = false;

						if (tglbtnSacPapel.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnSacPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnSacPapel.setBackground(Color.RED);
							tglbtnSacPapel.doClick();
							tglbtnSacPapel.setEnabled(false);
						}
						if (tglbtnPapelao.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapelao.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapelao.setBackground(Color.RED);
							tglbtnPapelao.doClick();
							tglbtnPapelao.setEnabled(false);
						}
						if (tglbtnPapel.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapel.setBackground(Color.RED);
							tglbtnPapel.doClick();
							tglbtnPapel.setEnabled(false);
						}
						if (tglbtnJornal.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnJornal.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnJornal.setBackground(Color.RED);
							tglbtnJornal.doClick();
							tglbtnJornal.setEnabled(false);
						}
						if (tglbtnPapel2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapel2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapel2.setBackground(Color.RED);
							tglbtnPapel2.doClick();
							tglbtnPapel2.setEnabled(false);
						}
						if (tglbtnJornal2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnJornal2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnJornal2.setBackground(Color.RED);
							tglbtnJornal2.doClick();
							tglbtnJornal2.setEnabled(false);
						}
						if (tglbtnPapelao2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapelao2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapelao2.setBackground(Color.RED);
							tglbtnPapelao2.doClick();
							tglbtnPapelao2.setEnabled(false);
						}

						if (tglbtnMaca.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnMaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnMaca.setBackground(Color.RED);
							tglbtnMaca.doClick();
							tglbtnMaca.setEnabled(false);
						}
						if (tglbtnOvo2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnOvo2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnOvo2.setBackground(Color.RED);
							tglbtnOvo2.doClick();
							tglbtnOvo2.setEnabled(false);
						}
						if (tglbtnBanana.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnBanana.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnBanana.setBackground(Color.RED);
							tglbtnBanana.doClick();
							tglbtnBanana.setEnabled(false);
						}
						if (tglbtnOvo.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnOvo.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnOvo.setBackground(Color.RED);
							tglbtnOvo.doClick();
							tglbtnOvo.setEnabled(false);
						}
						if (tglbtnMaca2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnMaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnMaca2.setBackground(Color.RED);
							tglbtnMaca2.doClick();
							tglbtnMaca2.setEnabled(false);
						}
						if (tglbtnBanana2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É LIXO ORGÂNICO");
							tglbtnBanana2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnBanana2.setBackground(Color.RED);
							tglbtnBanana2.doClick();
							tglbtnBanana2.setEnabled(false);
						}
						if (tglbtnChocolate.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnChocolate.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnChocolate.setBackground(Color.RED);
							tglbtnChocolate.doClick();
							tglbtnChocolate.setEnabled(false);
						}
						if (tglbtnPet2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnPet2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPet2.setBackground(Color.RED);
							tglbtnPet2.doClick();
							tglbtnPet2.setEnabled(false);
						}
						if (tglbtnRemedio.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnRemedio.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnRemedio.setBackground(Color.RED);
							tglbtnRemedio.doClick();
							tglbtnRemedio.setEnabled(false);
						}
						if (tglbtnSacola.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnSacola.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnSacola.setBackground(Color.RED);
							tglbtnSacola.doClick();
							tglbtnSacola.setEnabled(false);
						}
						if (tglbtnChocolate2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnChocolate2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnChocolate2.setBackground(Color.RED);
							tglbtnChocolate2.doClick();
							tglbtnChocolate2.setEnabled(false);
						}
						if (tglbtnPet.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnPet.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPet.setBackground(Color.RED);
							tglbtnPet.doClick();
							tglbtnPet.setEnabled(false);
						}

					}

				} else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um lixo do chão!");

				}
				
				if (total == 24) {
					JOptionPane.showMessageDialog(null, "           FIM DE JOGO!! \n\n        SEU SCORE FOI: " + score);
					dispose();
					inicio.setVisible(true);
				}

			}
		});
		btnLixoVidro.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/LixoVidro.png")));
		btnLixoVidro.setBounds(357, 362, 86, 128);
		contentPane.add(btnLixoVidro);

		JButton btnLixoOrganico = new JButton("");
		btnLixoOrganico.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/LixoOrganico.png")));
		btnLixoOrganico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pressionado == true) {
					total ++;

					if (valorDoLixo == 4) {

						score = Integer.parseInt(txtPlacar.getText());
						score = score + 1;
						txtPlacar.setText(score + "");
						
						if (tglbtnMaca.isSelected()) {
							tglbtnMaca.setBackground(Color.BLUE);
							tglbtnMaca.doClick();
							tglbtnMaca.setEnabled(false);
						}
						if (tglbtnOvo2.isSelected()) {
							tglbtnOvo2.setBackground(Color.BLUE);
							tglbtnOvo2.doClick();
							tglbtnOvo2.setEnabled(false);
						}
						if (tglbtnBanana.isSelected()) {
							tglbtnBanana.setBackground(Color.BLUE);
							tglbtnBanana.doClick();
							tglbtnBanana.setEnabled(false);
						}
						if (tglbtnOvo.isSelected()) {
							tglbtnOvo.setBackground(Color.BLUE);
							tglbtnOvo.doClick();
							tglbtnOvo.setEnabled(false);
						}
						if (tglbtnMaca2.isSelected()) {
							tglbtnMaca2.setBackground(Color.BLUE);
							tglbtnMaca2.doClick();
							tglbtnMaca2.setEnabled(false);
						}
						if (tglbtnBanana2.isSelected()) {
							tglbtnBanana2.setBackground(Color.BLUE);
							tglbtnBanana2.doClick();
							tglbtnBanana2.setEnabled(false);
						}

					} else {
						valorDoLixo = 0;
						pressionado = false;
						
						if (tglbtnSacPapel.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnSacPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnSacPapel.setBackground(Color.RED);
							tglbtnSacPapel.doClick();
							tglbtnSacPapel.setEnabled(false);
						}
						if (tglbtnPapelao.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapelao.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapelao.setBackground(Color.RED);
							tglbtnPapelao.doClick();
							tglbtnPapelao.setEnabled(false);
						}
						if (tglbtnPapel.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapel.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapel.setBackground(Color.RED);
							tglbtnPapel.doClick();
							tglbtnPapel.setEnabled(false);
						}
						if (tglbtnJornal.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnJornal.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnJornal.setBackground(Color.RED);
							tglbtnJornal.doClick();
							tglbtnJornal.setEnabled(false);
						}
						if (tglbtnPapel2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapel2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapel2.setBackground(Color.RED);
							tglbtnPapel2.doClick();
							tglbtnPapel2.setEnabled(false);
						}
						if (tglbtnJornal2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnJornal2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnJornal2.setBackground(Color.RED);
							tglbtnJornal2.doClick();
							tglbtnJornal2.setEnabled(false);
						}
						if (tglbtnPapelao2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PAPEL");
							tglbtnPapelao2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPapelao2.setBackground(Color.RED);
							tglbtnPapelao2.doClick();
							tglbtnPapelao2.setEnabled(false);
						}
						if (tglbtnChocolate.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnChocolate.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnChocolate.setBackground(Color.RED);
							tglbtnChocolate.doClick();
							tglbtnChocolate.setEnabled(false);
						}
						if (tglbtnPet2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnPet2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPet2.setBackground(Color.RED);
							tglbtnPet2.doClick();
							tglbtnPet2.setEnabled(false);
						}
						if (tglbtnRemedio.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnRemedio.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnRemedio.setBackground(Color.RED);
							tglbtnRemedio.doClick();
							tglbtnRemedio.setEnabled(false);
						}
						if (tglbtnSacola.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnSacola.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnSacola.setBackground(Color.RED);
							tglbtnSacola.doClick();
							tglbtnSacola.setEnabled(false);
						}
						if (tglbtnChocolate2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnChocolate2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnChocolate2.setBackground(Color.RED);
							tglbtnChocolate2.doClick();
							tglbtnChocolate2.setEnabled(false);
						}
						if (tglbtnPet.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É PLASTICO");
							tglbtnPet.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnPet.setBackground(Color.RED);
							tglbtnPet.doClick();
							tglbtnPet.setEnabled(false);
						}
						if (tglbtnTaca.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnTaca.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnTaca.setBackground(Color.RED);
							tglbtnTaca.doClick();
							tglbtnTaca.setEnabled(false);
						}
						if (tglbtnEspelho.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnEspelho.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnEspelho.setBackground(Color.RED);
							tglbtnEspelho.doClick();
							tglbtnEspelho.setEnabled(false);
						}
						if (tglbtnGarrafa.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnGarrafa.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnGarrafa.setBackground(Color.RED);
							tglbtnGarrafa.doClick();
							tglbtnGarrafa.setEnabled(false);
						}
						if (tglbtnTaca2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnTaca2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnTaca2.setBackground(Color.RED);
							tglbtnTaca2.doClick();
							tglbtnTaca2.setEnabled(false);
						}
						if (tglbtnEspelho2.isSelected()) {
							JOptionPane.showMessageDialog(null, "OPS, ISSO É VIDRO");
							tglbtnEspelho2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/x.png")));
							tglbtnEspelho2.setBackground(Color.RED);
							tglbtnEspelho2.doClick();
							tglbtnEspelho2.setEnabled(false);
						}
					}

				} else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um lixo do chão!");

				}
				
				if (total == 24) {
					JOptionPane.showMessageDialog(null, "           FIM DE JOGO!! \n\n        SEU SCORE FOI: " + score);
					dispose();
					inicio.setVisible(true);
				}
			}
		});
		btnLixoOrganico.setBounds(512, 362, 86, 128);
		contentPane.add(btnLixoOrganico);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/TelaFundo.png")));
		lblNewLabel_1.setBounds(0, 0, 815, 507);
		contentPane.add(lblNewLabel_1);
		tglbtnRemedio2.setBackground(Color.WHITE);
		tglbtnRemedio2.setIcon(new ImageIcon(Principal.class.getResource("/ImageLib/remedio.png")));
		tglbtnRemedio2.setBounds(652, 249, 57, 57);
		contentPane.add(tglbtnRemedio2);
	}

}
