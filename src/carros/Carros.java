/**
 * Atividade Carros
 */
package carros;

import java.util.Random;

/**
 * @author Gustavo Rene
 * Classe respons�vel pela cria��o dos objetos
 */
public class Carros {

	public Carros() {
		super();
		System.out.println("-----------------------");
	}
		//vari�veis
		int ano;
		String cor;
		String modelo;
		Double envergadura;
		Random chassi = new Random();

		// Voids
		void ligar() {
			System.out.println("Ve�culo Ligando");
		}

		void desligar() {
			System.out.println("Ve�culo Desligando");
		}

		void acelerar() {
			System.out.println("Ve�culo acelerando");
		}
		void frear() {
			System.out.println("Ve�culo Freando");
		}

	}

