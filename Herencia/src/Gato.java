
public class Gato extends Animal{

	int num_bigotes;
	String color;
	int Vidas_disponibles= 9;
	
	public Gato(String nombre, int edad, String color) {
		super(nombre,edad);
		this.color = color;
		
	}
	@Override
	public String comer() {
		return "Comiendo Atun";
	}
	

}
