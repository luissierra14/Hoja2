

public class Calculadora implements I_Calculadora {
	
	private Stack<Integer> pila;
	public Calculadora(){
		pila = new Stack<Integer>();
	}
	
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Calcular(String vector) {
		String arreglo[]=vector.split(" ");
		int m=0;
		
		for (int i =0;i<=arreglo.length;i++){
			try{
				m=Integer.parseInt(arreglo[i]);
				pila.Push(m);
				
			}
			catch(Exception T){
				int x = pila.Pop();
				int y = pila.Pop();
				int ans=0;
				if (arreglo[i].equals("+") ){
					ans = x+y;
					pila.Push(ans);
				}
				if (arreglo[i].equals("-") ){
					ans = x-y;
					pila.Push(ans);
				}
				if (arreglo[i].equals("*") ){
					ans = x*y;
					pila.Push(ans);
				}
				if (arreglo[i].equals("/") ){
					ans = x/y;
					pila.Push(ans);
				}
			}
		}
		// TODO Auto-generated method stub
		return pila.Pop();
	}

	@Override
	public String LeerArchivo(String direccion) {
		// TODO Auto-generated method stub
		return null;
	}

}
