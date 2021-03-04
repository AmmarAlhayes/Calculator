import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class Calc {

	private JFrame frame;
	private JTextField t;
	private String result;
	private JButton b0;
	private JButton bdiv;
	private JButton bmul;
	private JButton bminus;
	private JButton bplus;
	private boolean b = true;
	private JLabel label0;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		frame.setBounds(100, 100, 573, 427);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton b7 = new JButton("7");
		b7.setBackground(new Color(0, 0, 0));
		b7.setForeground(new Color(255, 255, 255));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b7.getText());
				} else {
					result = t.getText() + b7.getText();
					t.setText(result);
				}
			}
		});
		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b7.setBounds(10, 136, 67, 48);
		frame.getContentPane().add(b7);

		t = new JTextField("0");
		t.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t.setBackground(Color.WHITE);
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		t.setBounds(10, 13, 265, 37);
		frame.getContentPane().add(t);
		t.setColumns(10);
		t.setEditable(false);

		JButton b4 = new JButton("4");
		b4.setForeground(new Color(255, 255, 255));
		b4.setBackground(new Color(0, 0, 0));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b4.getText());
				} else {
					result = t.getText() + b4.getText();
					t.setText(result);
				}
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.setBounds(10, 184, 67, 48);
		frame.getContentPane().add(b4);

		JButton b1 = new JButton("1");
		b1.setBackground(new Color(0, 0, 0));
		b1.setForeground(new Color(255, 255, 255));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b1.getText());
				} else {
					result = t.getText() + b1.getText();
					t.setText(result);
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.setBounds(10, 232, 67, 48);
		frame.getContentPane().add(b1);

		JButton b8 = new JButton("8");
		b8.setForeground(new Color(255, 255, 255));
		b8.setBackground(new Color(0, 0, 0));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b8.getText());
				} else {
					result = t.getText() + b8.getText();
					t.setText(result);
				}

			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b8.setBounds(76, 136, 67, 48);
		frame.getContentPane().add(b8);

		JButton b5 = new JButton("5");
		b5.setBackground(new Color(0, 0, 0));
		b5.setForeground(new Color(255, 255, 255));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b5.getText());
				} else {
					result = t.getText() + b5.getText();
					t.setText(result);
				}
			}
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b5.setBounds(76, 184, 67, 48);
		frame.getContentPane().add(b5);

		JButton b2 = new JButton("2");
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(0, 0, 0));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b2.getText());
				} else {
					result = t.getText() + b2.getText();
					t.setText(result);
				}
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.setBounds(76, 232, 67, 48);
		frame.getContentPane().add(b2);

		JButton b9 = new JButton("9");
		b9.setBackground(new Color(0, 0, 0));
		b9.setForeground(new Color(255, 255, 255));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b9.getText());
				} else {
					result = t.getText() + b9.getText();
					t.setText(result);
				}

			}
		});
		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b9.setBounds(142, 136, 67, 48);
		frame.getContentPane().add(b9);

		JButton b6 = new JButton("6");
		b6.setForeground(new Color(255, 255, 255));
		b6.setBackground(new Color(0, 0, 0));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b6.getText());
				} else {
					result = t.getText() + b6.getText();
					t.setText(result);
				}

			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b6.setBounds(142, 184, 67, 48);
		frame.getContentPane().add(b6);

		JButton b3 = new JButton("3");
		b3.setForeground(new Color(255, 255, 255));
		b3.setBackground(new Color(0, 0, 0));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b3.getText());
				} else {
					result = t.getText() + b3.getText();
					t.setText(result);
				}
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setBounds(142, 232, 67, 48);
		frame.getContentPane().add(b3);

		JButton bdot = new JButton(".");
		bdot.setBackground(new Color(0, 0, 0));
		bdot.setForeground(new Color(255, 255, 255));
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot = "";
				String result = t.getText();
				String cut = String.valueOf(result.charAt(result.length() - 1));
				String point = String.valueOf(result.charAt(result.length() - 1));
				if (result.length() >= 4)
					dot = result.substring(result.length() - 2, result.length());
				// if(!(t.getText().contains(".")) && (!(cut.equals(" "))) &&
				// (!(t.getText().contains(".")) &&(!cut.equals(bmul.getText())) ) &&
				// (!(t.getText().contains(".")) &&(!cut.equals(bplus.getText())) ) &&
				// (!(t.getText().contains(".")) &&(!cut.equals(bminus.getText())) ) &&
				// (!(t.getText().contains(".")) &&(!cut.equals(bdiv.getText())) ) ) {
				if (!(point.equals(bdot.getText())) && (!(cut.equals(" "))) && (!cut.equals(bmul.getText()))
						&& (!cut.equals(bplus.getText())) && (!cut.equals(bminus.getText()))
						&& (!cut.equals(bdiv.getText())) && b == true) {
					result = t.getText() + bdot.getText();
					b = false;
					t.setText(result);
				} else if(point.equals(" "))
					t.setText(result+b0.getText()+bdot.getText());
				else
					t.setText(result);

			}
		});
		bdot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bdot.setBounds(10, 279, 67, 48);
		frame.getContentPane().add(bdot);

		b0 = new JButton("0");
		b0.setForeground(new Color(255, 255, 255));
		b0.setBackground(new Color(0, 0, 0));
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t.getText().equals(b0.getText())) {
					t.setText(b0.getText());
				} else {
					result = t.getText() + b0.getText();
					t.setText(result);
				}
			}
		});
		b0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b0.setBounds(76, 279, 67, 48);
		frame.getContentPane().add(b0);

		JButton bequal = new JButton("=");
		bequal.setForeground(new Color(255, 255, 0));
		bequal.setBackground(new Color(255, 0, 0));
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = t.getText();
				String s = "";
				String c = String.valueOf(result.charAt(result.length() - 1));
				String first = "";
				String second = "";
				String sign = "";
				String text = "";
				String concate = "";
				boolean check = true;
				double num1 = 0.0;
				double num2 = 0.0;
				boolean b = false;
				boolean d = false;
				boolean p = false;
				boolean m = false;
				
				
				
			 if (c.equals(" ") || result.length() == 1) {
				t.setText(result);
				label0.setText(b0.getText());
				//concat = result;
				//label0.setText(concat);
			}
			 else {	
				int x=0;
				for(int i=0;i<=result.length()-1;i++) {
					c = String.valueOf(result.charAt(i));
					if(i==result.length()-1) {
						first=result.substring(x, result.length());
						
						if(b==true) {
							num2=Double.parseDouble(first);
							num1 = num1*num2;
							concate=concate+num1;
							}
						else if(d==true) {
							num2=Double.parseDouble(first);
							num1 = num1/num2;
							concate=concate+num1;
							}
						else
							concate=concate+first;
					}
					
					
					
					else if(c.equals(bplus.getText())) {
						first=result.substring(x,i-1);
						
						if(b==true) {
							num2=Double.parseDouble(first);
							num1 = num1*num2;
							concate=concate+num1+" "+bplus.getText()+" ";
							b=false;
						}
						else if(d==true) {
							num2=Double.parseDouble(first);
							num1 = num1/num2;
							concate=concate+num1+" "+bplus.getText()+" ";
							d=false;
						}
						else
						concate=concate+first+" "+bplus.getText()+" ";
						x=i+2;
					}
					
					
					else if(c.equals(bminus.getText())) {
						first=result.substring(x,i-1);
						if(b==true) {
							num2=Double.parseDouble(first);
							num1 = num1*num2;
							concate=concate+num1+" "+bminus.getText()+" ";
							b=false;
						}
						else if(d==true) {
							num2=Double.parseDouble(first);
							num1 = num1/num2;
							concate=concate+num1+" "+bminus.getText()+" ";
							d=false;
						}
						else
						concate=concate+first+" "+bminus.getText()+" ";
						x=i+2;
					}
					
					
					
					else if(c.equals(bmul.getText())) {
						
						
						first=result.substring(x,i-1);
						
						//concate=concate+first+" "+"*"+" ";
						x=i+2;
						if(b==true) {
							num2=Double.parseDouble(first);
							num1 = num1*num2;
							}
		                else if(d==true) {
							
							num2=Double.parseDouble(first);
							num1 = num1/num2;
							d=false;
							}
						
						else
						num1 = Double.parseDouble(first);
						
						
						b=true;
						
					}
					
					
					else if(c.equals(bdiv.getText())) {
						first=result.substring(x,i-1);
						//concate=concate+first+" "+"/"+" ";
						x=i+2;
						
						if(d==true) {
							num2=Double.parseDouble(first);
							num1 = num1/num2;
							}
						else if(b==true) {
							
							num2=Double.parseDouble(first);
							num1 = num1*num2;
							b=false;
							}
						else
						num1 = Double.parseDouble(first);
						
						d=true;
					}
					
					
				}
				//double v = .5;
				//System.out.println(concate);
				//System.out.println(num1);
				//System.out.println(result.substring(9, result.length()));
				
				int y =0;
				 for(int i=0;i<=concate.length()-1;i++) {
					c = String.valueOf(concate.charAt(i));
					if(i==concate.length()-1) {
						first=concate.substring(y, concate.length());
						
						if(p==true) {
							num2=Double.parseDouble(first);
							num1 = num1+num2;
							//s=s+num1;
							}
						else if(m==true) {
							num2=Double.parseDouble(first);
							num1 = num1-num2;
							//s=s+num1;
							}
						//else
							//s=s+first;
					}
					
				 else if(c.equals(bplus.getText())) {
						
						
						first=concate.substring(y,i-1);
						
						//s=s+first+" "+"+"+" ";
						y=i+2;
						if(p==true) {
							num2=Double.parseDouble(first);
							num1 = num1+num2;
							}
		                else if(m==true) {
							
							num2=Double.parseDouble(first);
							num1 = num1-num2;
							m=false;
							}
						
						else
						num1 = Double.parseDouble(first);
						
						
						p=true;
						
					}
					
					
					else if(c.equals(bminus.getText())) {
						first=concate.substring(y,i-1);
						//s=s+first+" "+"-"+" ";
						y=i+2;
						
						if(m==true) {
							num2=Double.parseDouble(first);
							num1 = num1-num2;
							}
						else if(p==true) {
							
							num2=Double.parseDouble(first);
							num1 = num1+num2;
							p=false;
							}
						else
						num1 = Double.parseDouble(first);
						
						m=true;
					} 
					
				}
				 label0.setText(String.valueOf(num1));
				 String history="";
				 if(ta.getText().equals(null)) {	
					 history=t.getText()+"=\n"+String.valueOf(num1);
				     ta.setText(history);
				 }
				 else {
					 history = ta.getText();
					 ta.setText(history+"\n"+t.getText()+" =\n"+String.valueOf(num1));
				 }
				// System.out.println(num1);
				 }

				/*if (!(result.contains(bplus.getText())) || !(result.contains(bminus.getText()))) {
					t.setText(result);
					//concat = result;
					//label0.setText(concat);
				}*/

				/* if (c.equals(" ") || result.length() == 1) {
					t.setText(result);
					//concat = result;
					//label0.setText(concat);
				}*/

				/*else {
					int x = 0;

					for (int i = 0; i <= result.length() - 1; i++) {
						sign = String.valueOf(result.charAt(i));

						if (i == result.length() - 1) {
							text = result.substring(x, result.length());//
							if (b == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 * num2;
								concat = concat + num1;
							} else if (d == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 / num2;
								concat = concat + num1;
							} else
								concat = concat + text;
						}

						else if (sign.equals(bplus.getText())) {
							text = result.substring(x, i - 1);
							if (b == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 * num2;
								concat = concat + num1 + " " + bplus.getText() + " ";
								b = false;
							} else if (d == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 / num2;
								concat = concat + num1 + " " + bplus.getText() + " ";
								d = false;
							} else
								concat = concat + text + " " + bplus.getText() + " ";
							x = i + 2;
						} else if (sign.equals(bminus.getText())) {
							text = result.substring(x, i - 1);
							if (b == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 * num2;
								concat = concat + num1 + " " + bminus.getText() + " ";
								b = false;
							} else if (d == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 / num2;
								concat = concat + num1 + " " + bminus.getText() + " ";
								d = false;
							} else
								concat = concat + text + " " + bminus.getText() + " ";
							x = i + 2;
						} else if (sign.equals(bmul.getText())) {
							text = result.substring(x, i - 1);
							// concat=concat+text+" "+bmul.getText()+" ";
							x = i + 2;

							if (b == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 * num2;
							} else if (d == true) {

								num2 = Double.parseDouble(text);
								num1 = num1 / num2;
								d = false;
							}

							else
								num1 = Double.parseDouble(text);

							b = true;

						} else if (sign.equals(bdiv.getText())) {
							text = result.substring(x, i - 1);
							// concat=concat+text+" "+bdiv.getText()+" ";
							x = i + 2;

							if (d == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 / num2;
							} else if (b == true) {

								num2 = Double.parseDouble(text);
								num1 = num1 * num2;
								b = false;
							} else
								num1 = Double.parseDouble(text);

							d = true;

						}

					}

					// label0.setText(concat);

					int y = 0;
					for (int i = 0; i <= concat.length() - 1; i++) {
						sign = String.valueOf(concat.charAt(i));
						if (i == concat.length() - 1) {
							text = concat.substring(y, concat.length());

							if (p == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 + num2;
								// s=s+num1;
							} else if (m == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 - num2;
								// s=s+num1;
							}
							// else
							// s=s+first;
						}

						else if (c.equals(bplus.getText())) {

							text = concat.substring(y, i - 1);

							// s=s+first+" "+"+"+" ";
							y = i + 2;
							if (p == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 + num2;
							} else if (m == true) {

								num2 = Double.parseDouble(text);
								num1 = num1 - num2;
								m = false;
							}

							else
								num1 = Double.parseDouble(text);

							p = true;

						}

						else if (c.equals(bminus.getText())) {
							text = concat.substring(y, i - 1);
							// s=s+first+" "+"-"+" ";
							y = i + 2;

							if (m == true) {
								num2 = Double.parseDouble(text);
								num1 = num1 - num2;
							} else if (p == true) {

								num2 = Double.parseDouble(text);
								num1 = num1 + num2;
								p = false;
							} else
								num1 = Double.parseDouble(text);

							m = true;
						}

					}
					//label0.setText(String.valueOf(num1));
					System.out.println(num1);

				}*/

				/*
				 * else { int x=0; //first = String.valueOf(result.charAt(x)); for(int
				 * i=0;i<s.length();i++) { sign = String.valueOf(result.charAt(i));
				 * if(sign.equals(bminus.getText()) || sign.equals(bplus.getText()) ||
				 * i==s.length()-1) {
				 * 
				 * //second = String.valueOf(result.charAt(i-1)); //first = s.substring(x,i-1);
				 * //x=i+2;//use boolean if (check==false) {
				 * 
				 * if(i==s.length()-1) { second = s.substring(x,s.length()); text = second;
				 * concat = concat+text; check = true; //label0.setText(concat); break; } else {
				 * second = s.substring(x,i-1); x=i+2; text = second;
				 * if(sign.equals(bminus.getText())) { concat = concat
				 * +" "+bminus.getText()+" "; //label0.setText(concat); } else
				 * if(sign.equals(bplus.getText())) { concat = concat +" "+bplus.getText()+" ";
				 * //label0.setText(concat); } check = true; } } else { first =
				 * s.substring(x,i-1); x=i+2; text = first; if(sign.equals(bminus.getText())) {
				 * concat = concat+text +" "+bminus.getText()+" "; //label0.setText(concat); }
				 * else if(sign.equals(bplus.getText())) { concat = concat+text
				 * +" "+bplus.getText()+" "; //label0.setText(concat); } check=false; }
				 * 
				 * 
				 * } }
				 * 
				 * label0.setText(concat); }
				 */

			}
		});
		bequal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bequal.setBounds(142, 279, 67, 48);
		frame.getContentPane().add(bequal);

		bplus = new JButton("+");
		bplus.setForeground(new Color(255, 0, 0));
		bplus.setBackground(Color.YELLOW);
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = t.getText();
				String cut = "";
				if (result.length() >= 4)
					cut = String.valueOf(result.charAt(result.length() - 2));
				if (t.getText().equals(b0.getText())) {
					//t.setText(b0.getText());
					t.setText(b0.getText()+" "+bplus.getText()+" ");
				} else if (cut.equals(bmul.getText()) || cut.equals(bplus.getText()) || cut.equals(bminus.getText())
						|| cut.equals(bdiv.getText())) {
					t.setText(result);
				} else {
					result = t.getText() + " " + bplus.getText() + " ";
					b = true;
					t.setText(result);
				}
			}
		});
		bplus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bplus.setBounds(208, 279, 67, 48);
		frame.getContentPane().add(bplus);

		bminus = new JButton("-");
		bminus.setForeground(new Color(255, 0, 0));
		bminus.setBackground(new Color(255, 255, 0));
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = t.getText();
				String cut = "";
				if (result.length() >= 4)
					cut = String.valueOf(result.charAt(result.length() - 2));
				if (t.getText().equals(b0.getText())) {
					//t.setText(b0.getText());
					t.setText(b0.getText()+" "+bminus.getText()+" ");
				} else if (cut.equals(bmul.getText()) || cut.equals(bplus.getText()) || cut.equals(bminus.getText())
						|| cut.equals(bdiv.getText())) {
					t.setText(result);
				} else {
					result = t.getText() + " " + bminus.getText() + " ";
					b = true;
					t.setText(result);
				}
			}
		});
		bminus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bminus.setBounds(208, 232, 67, 48);
		frame.getContentPane().add(bminus);

		bmul = new JButton("\u00D7");
		bmul.setForeground(new Color(255, 0, 0));
		bmul.setBackground(new Color(255, 255, 0));
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = t.getText();
				String cut = "";
				if (result.length() >= 4)
					cut = String.valueOf(result.charAt(result.length() - 2));
				if (t.getText().equals(b0.getText())) {
					//t.setText(b0.getText());
					t.setText(b0.getText()+" "+bmul.getText()+" ");
				} else if (cut.equals(bmul.getText()) || cut.equals(bplus.getText()) || cut.equals(bminus.getText())
						|| cut.equals(bdiv.getText())) {
					t.setText(result);
				} else {
					result = t.getText() + " " + bmul.getText() + " ";
					b = true;
					t.setText(result);
				}
			}
		});
		bmul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bmul.setBounds(208, 184, 67, 48);
		frame.getContentPane().add(bmul);

		bdiv = new JButton("/");
		bdiv.setBackground(new Color(255, 255, 0));
		bdiv.setForeground(new Color(255, 0, 0));
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = t.getText();
				String cut = "";
				if (result.length() >= 4)
					cut = String.valueOf(result.charAt(result.length() - 2));
				if (t.getText().equals(b0.getText())) {
					//t.setText(b0.getText());
					t.setText(b0.getText()+" "+bdiv.getText()+" ");
				} else if (cut.equals(bmul.getText()) || cut.equals(bplus.getText()) || cut.equals(bminus.getText())
						|| cut.equals(bdiv.getText())) {
					t.setText(result);
				} else {
					result = t.getText() + " " + bdiv.getText() + " ";
					b = true;
					t.setText(result);
				}
			}
		});
		bdiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bdiv.setBounds(208, 136, 67, 48);
		frame.getContentPane().add(bdiv);

		JButton bclear = new JButton("Clear");
		bclear.setForeground(new Color(128, 0, 128));
		bclear.setBackground(new Color(245, 222, 179));
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("0");
				label0.setText(b0.getText());
				b = true;
			}
		});
		bclear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bclear.setBounds(10, 327, 177, 48);
		frame.getContentPane().add(bclear);

		JButton bdel = new JButton("Delete");
		bdel.setForeground(new Color(128, 0, 128));
		bdel.setBackground(new Color(245, 222, 179));
		bdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = t.getText();
				String cut = "";
				String space = "";
				String sign = "";

				if (result.length() >= 4) {
					cut = String.valueOf(result.charAt(result.length() - 1));
					space = String.valueOf(result.charAt(result.length() - 2));
				}
				if (result.length() >= 3) {
					// space = String.valueOf(result.charAt(result.length()-2));
					space = String.valueOf(result.charAt(result.length() - 1));
				}

				if (t.getText().equals(b0.getText()) || t.getText().length() == 1) {
					t.setText(b0.getText());
					b = true;
				} else if (cut.equals(" ")) {
					result = t.getText();
					result = result.substring(0, result.length() - 3);

					t.setText(result);
				}
				// else if(result.length()>=3 && space.equals(" ")) {
				else if (result.length() >= 3 && (space.equals(bmul.getText()) || space.equals(bdiv.getText())
						|| space.equals(bplus.getText()) || space.equals(bminus.getText()))) {
					result = t.getText();
					result = result.substring(0, result.length() - 2);

					t.setText(result);
				} else {
					result = t.getText();
					result = result.substring(0, result.length() - 1);
					b = true;
					t.setText(result);
				}

				String s;
				for (int i = result.length() - 1; i >= 0; i--) {

					sign = String.valueOf(result.charAt(i));
					if (sign.equals(bdot.getText())) {

						s = result.substring(i - 1, result.length());
						if (s.contains(bdot.getText()))
							b = false;
						break;
					}
					if (sign.equals(" ")) {
						// b=true;
						break;
					}

				}

			}
		});
		bdel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bdel.setBounds(186, 327, 89, 48);
		frame.getContentPane().add(bdel);

		JLabel label = new JLabel("History");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(325, 11, 67, 25);
		frame.getContentPane().add(label);

		label0 = new JLabel("0");
		label0.setHorizontalAlignment(SwingConstants.RIGHT);
		label0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label0.setForeground(new Color(0, 0, 255));
		label0.setBackground(new Color(255, 255, 255));
		label0.setBounds(10, 50, 258, 27);
		frame.getContentPane().add(label0);

		//////////// History Button/////////////

		JButton bh = new JButton("Hiding History");
		bh.setForeground(new Color(255, 255, 0));
		bh.setBackground(new Color(255, 0, 0));
		bh.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				bh.setBackground(Color.YELLOW);
				bh.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//bh.setBackground(UIManager.getColor("control"));
				bh.setBackground(Color.RED);
				bh.setForeground(Color.YELLOW);
			}
		});
		bh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = bh.getText();
				if(b.equals("Hiding History")) {
				    bh.setText("Show History");
				    ta.setVisible(false);
				    }
				else {
					bh.setText("Hiding History");
					ta.setVisible(true);
					ta.setForeground(new Color(0, 0, 0));
					ta.setBackground(new Color(144, 238, 144));
					}
					
			}
		});
		bh.setFont(new Font("Tahoma", Font.PLAIN, 14));

		bh.setBounds(394, 13, 153, 23);
		frame.getContentPane().add(bh);
		//////////////////////////////////////////////
		JButton button = new JButton("+/-");
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(0, 255, 127));
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(10, 88, 67, 48);
		frame.getContentPane().add(button);

		JButton btnX = new JButton("x\u00B2");
		btnX.setBackground(new Color(0, 255, 127));
		btnX.setForeground(new Color(0, 0, 0));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnX.setBounds(76, 88, 67, 48);
		frame.getContentPane().add(btnX);

		JButton btnx = new JButton("1/x");
		btnx.setForeground(new Color(0, 0, 0));
		btnx.setBackground(new Color(0, 255, 127));
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnx.setBounds(142, 88, 67, 48);
		frame.getContentPane().add(btnx);

		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.setForeground(new Color(0, 0, 0));
		btnSqrt.setBackground(new Color(0, 255, 127));
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSqrt.setBounds(208, 88, 67, 48);
		frame.getContentPane().add(btnSqrt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(325, 54, 222, 320);
		frame.getContentPane().add(scrollPane);
		
			    ta = new JTextArea();
				scrollPane.setViewportView(ta);
				ta.setFont(new Font("Monospaced", Font.PLAIN, 18));
				ta.setForeground(new Color(0, 0, 0));
				ta.setBackground(new Color(144, 238, 144));
				ta.setEditable(false);
				ta.setVisible(true);

	}
}
