package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public String teste;
	public Font fonteDosLabels;
	public Color corDoBotao;
//	public Color corDeTextoDoBotao;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Obter a instância do painel de conteúdo(container)
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

		
		// Crias os componentes da tela e colocar no painel(container)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 10, 100, 30);
		labelImc.setFont(new Font("Calibri", Font.BOLD, 28));
		labelImc.setForeground(Color.black);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 50, 100, 30);
		labelNome.setFont(fonteDosLabels);
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 80, 300, 30);
				
		
		
		
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 110, 100, 30);
		labelPeso.setFont(fonteDosLabels);

		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 140, 300, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 170, 100, 30);
		labelAltura.setFont(fonteDosLabels);

		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 200, 300, 30);
		
		JLabel labeldataDeNascimento = new JLabel();
		labeldataDeNascimento.setText("Data de Nascimento:");
		labeldataDeNascimento.setBounds(30, 230, 200, 30);
		labeldataDeNascimento.setFont(fonteDosLabels);

		
		JTextField textFielddataDeNascimento = new JTextField();
		textFielddataDeNascimento.setBounds(30, 260, 300, 30);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Seu IMC é:");
		labelResultado.setBounds(30, 320, 300, 30);
		labelResultado.setFont(fonteDosLabels);

		
		JLabel labelStatus = new JLabel();
		labelStatus.setText("O status do seu IMC é:");
		labelStatus.setBounds(30, 370, 300, 30);
		labelStatus.setFont(fonteDosLabels);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(400, 500, 150, 30);
		buttonCalcular.setBackground(corDoBotao);
		
		
		
		
		
		// Eventos de click
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();				
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());	
				labelResultado.setText(cliente.nome + ", Seu IMC é: " + cliente.getImc());
				labelStatus.setText("Status IMC: " + cliente.getStatus());					
			}
		});
		
		textFieldNome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textFieldNome.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {

				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	
		// Adicionar componentes ao painel(container)
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labeldataDeNascimento);
		painel.add(textFielddataDeNascimento);
		painel.add(labelResultado);
		painel.add(labelStatus);
		
		tela.setVisible(true);
		
	}

}
