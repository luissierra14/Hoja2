import java.io.*;

public class Calculadora implements I_Calculadora{
	private String linea;
	private Stack<Integer> pila;
	public Calculadora(){
		pila = new Stack<Integer>();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calcular(String vector) {
		//String arreglo[]=vector.split(" ");
		int m=0;
		for (int i =0;i<=vector.length();i++){
				char caracteres=vector.charAt(i);
				String Scaracteres=String.valueOf(caracteres);
				if (Scaracteres.equals("9") || Scaracteres.equals("8") ||Scaracteres.equals("7") ||Scaracteres.equals("6") ||Scaracteres.equals("5") ||Scaracteres.equals("4") ||Scaracteres.equals("3") ||Scaracteres.equals("2") ||Scaracteres.equals("1") ||Scaracteres.equals("0"))
				{
					m=Integer.parseInt(Scaracteres);
					pila.push(m);
				}
				int x = (int)pila.pop();
				int y = (int)pila.pop();
				int ans=0;
				if (Scaracteres.equals("+") ){
					ans = x+y;
					pila.push(ans);
				}
				if (Scaracteres.equals("-") ){
					ans = x-y;
					pila.push(ans);
				}
				if (Scaracteres.equals("*") ){
					ans = x*y;
					pila.push(ans);
				}
				if (Scaracteres.equals("/") ){
					ans = x/y;
					pila.push(ans);
				}
				
			
		}
		// TODO Auto-generated method stub
		int respuesta = pila.pop();
		return respuesta;
	}

	@Override
	public String leerArchivo(String direccion) {
		// TODO Auto-generated method stub
		try{
			FileReader leer = new FileReader(direccion);
			BufferedReader cargar = new BufferedReader(leer);
			linea = cargar.readLine();
			cargar.close();
			return linea;
		}
		catch(Exception e){
			System.out.println("No se encuentra actualmente, alguna linea de operacion en el archivo .txt");
			System.exit(0);
			return null;
		}
	}
}
