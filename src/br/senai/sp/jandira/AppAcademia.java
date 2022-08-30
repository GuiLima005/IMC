package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {
	
	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 600;
		tela.largura = 600;
		tela.corDeFundoDaTela = new Color(44, 185, 204);
		tela.fonteDosLabels = new Font("Calibri", Font.BOLD, 15);
		tela.corDoBotao = new Color (140, 240, 250);
//		tela.corDeTextoDoBotao = new Color(0, 0, 0);
		tela.criarTela();

		
				
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
//		System.out.println(ana);
//		System.out.println(pedro);
				
		ana.nome = "Ana Maria Brega";
		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
		ana.peso = 62;
		ana.altura = 1.68;
		double xx = ana.getImc();
		String teste = ana.getStatus();
		
		System.out.println(xx);
		System.out.println(teste);
//		JOptionPane.showMessageDialog(null, teste);
		
		
		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2002, 2, 28);
//		pedro.peso = 
//		pedro.altura = 
		
	}

}
