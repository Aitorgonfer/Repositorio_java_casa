package pruebaDeExamen2ev;

import java.util.ArrayList;

public class Muestra {

	private String nombre;
	private ArrayList<Integer> arrayMuestras;
	
	public Muestra(String nombre) {
		this.nombre = nombre;
		this.arrayMuestras = new ArrayList<>();
	}
	
	public Muestra(String nombre, ArrayList<Integer> arrayMuestras) {
		this.nombre = nombre;
		this.arrayMuestras = arrayMuestras;
	}

	public Muestra(String nombre, int[] arrayMuestras) {
		this.nombre = nombre;
		this.arrayMuestras = new ArrayList<>();
		for (int i = 0; i < arrayMuestras.length; i++) {
			this.arrayMuestras.add(arrayMuestras[i]);
		}
	}

    public void agregarValor(int valor) {
        this.arrayMuestras.add(valor);
    }
    
    public ArrayList<Integer> getMuestras() {
        return arrayMuestras;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return nombre + ": " + arrayMuestras;
    }
}
