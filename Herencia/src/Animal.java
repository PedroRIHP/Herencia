
public abstract class Animal { // hicimos clase abstracta

	String nombre = "";
	int edad = 0;
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public abstract String comer();
	
	public String dormir() {
		return "durmiendo";
	}
}
