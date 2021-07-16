
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal animal = new Animal(); // como animal es abstracta no se pueden crear objetos de esa clase
		//System.out.println(animal.comer);
		
		Perro canelo = new Perro("canelo",3);
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		System.out.println(canelo.edad);
		
		Gato pulgas = new Gato("bigotes", 2, "naranja");
		System.out.println(pulgas.comer());
	}

}
