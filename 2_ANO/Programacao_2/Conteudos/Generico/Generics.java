/* Classes Genericas
 * 
 *  Usamos <> para especificar o tipo de parâmetro*/


public class Generics<G> {
	
	//Declarando objeto do tipo "G"
	G obj;
	Generics(G obj) {
		this.obj = obj;
	}
	
	public G getObject() {
		return this.obj;
	}
	
}

class GenericsTest<G, T>{
	G obj1;
	T obj2;
	
	GenericsTest(G obj1, T obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

class TestFunc{
	
	// exemplo de metodo generico
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}
	
	
}

// Classe de teste
class Main{
	public static void Main(String[] args) {
		
		// Instanciando um tipo Inteiro
		Generics<Integer> iObj = new Generics<Integer>(15);
		System.out.println(iObj.getObject());
		
		// Instanciando um tipo String
		Generics<String> sObj = new Generics<String>("Ozeias");
		System.out.println(sObj.getObject());
		
		Generics<Double> dObj = new Generics<Double>(16.5);
		System.out.println(dObj.getObject());
		
		
		GenericsTest <String, Integer> obj = new GenericsTest<String, Integer>("Ozeias", 10);
		obj.print();
		
		//chamando metodo generico com argumento int
		genericDisplay(11);
		//chamando metodo generico com argumento String
		genericDisplay("Ozeias");
		//chamando metodo generico com argumento double
		genericDisplay(10.2);
	}
}
