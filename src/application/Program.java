package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Qual a quantidade de funcionarios a cadastrar ? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();			
			System.out.println("Funcionario #" + (i + 1) + " :");			
			System.out.print("Id : ");
			Integer id = sc.nextInt();
			System.out.print("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salarío : ");
			Double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);

		}
		System.out.println();
		System.out.println("Lista de funcionarios :");
		for (Funcionario obj : list) {
			System.out.println(obj);
			
		}
		
		sc.close();
	}

}
