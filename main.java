
public class main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		// TODO Auto-generated method stub
		System.out.println("*********BIENVENIDO A LA CALCULADORA POSFIX**********");
		String operacion = calc.leerArchivo("C:\\Users\\brand_000.Hernandez-G\\Desktop\\UVG\\2016\\Semestre 2\\ADT\\Laboratorio2\\datos.txt");
		System.out.println(operacion + "  es la operacion que se encuentra en el archivo datos.txt ");
		System.out.println(calc.calcular(operacion) + " es el resultado");
	}
}
