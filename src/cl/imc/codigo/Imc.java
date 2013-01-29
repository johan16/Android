package cl.imc.codigo;

public class Imc {
	public static double calcularImc(double peso, double altura){
		double imc = peso / (Math.pow(altura, 2));
		return imc;	
	}
}
