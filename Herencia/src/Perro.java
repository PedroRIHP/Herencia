
public class Perro extends Animal implements Mascota, Cuidados {
	String raza = "";
	String color = "";
	float peso = 0;
	
	public Perro (String nombre, int edad) {
		super(nombre,edad);
	}
	
	public String ladrar () {
		return "Guaf";
	}
	@Override
	public String comer() {
		return "comiendo croquetas";
	}

	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Trucos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return null;
	}
}
