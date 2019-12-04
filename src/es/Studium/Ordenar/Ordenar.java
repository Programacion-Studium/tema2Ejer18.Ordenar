package es.Studium.Ordenar;

import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el primer número");
		n1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		n2 = teclado.nextInt();
		System.out.println("Introduzca el tercer número");
		n3 = teclado.nextInt();
		teclado.close();
		if((n1<=n2)&&(n2<=n3))
		{
			System.out.println("El mayor es "+n3);
			System.out.println("El mediano es "+n2);
			System.out.println("El menor es "+n1);
		}
		else
		{
			if ((n1<=n3)&&(n1<=n2))
			{
				System.out.println("El mayor es "+n2);
				System.out.println("El mediano es "+n3);
				System.out.println("El menor es "+n1);
			}
			if ((n2<=n1)&&(n1<=n3))
			{
				System.out.println("El mayor es "+n3);
				System.out.println("El mediano es "+n1);
				System.out.println("El menor es "+n2);
			}
			if ((n2<=n3)&&(n3<=n1))
			{
				System.out.println("El mayor es "+n1);
				System.out.println("El mediano es "+n3);
				System.out.println("El menor es "+n2);
			}
			if ((n3<=n1)&&(n1<=n2))
			{
				System.out.println("El mayor es "+n2);
				System.out.println("El mediano es "+n1);
				System.out.println("El menor es "+n3);
			}
			if ((n3<=n2)&&(n2<=n1))
			{
				System.out.println("El mayor es "+n1);
				System.out.println("El mediano es "+n2);
				System.out.println("El menor es "+n3);
			}
		}
	}

}
