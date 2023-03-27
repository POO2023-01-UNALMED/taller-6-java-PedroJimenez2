package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor(){
		ArrayList<Pais> paisFabri = new ArrayList<Pais>();
		
		for(Fabricante fabricante : Fabricante.listaFabri) {
			paisFabri.add(fabricante.getPais());
		}
		int may = 0;
		Pais paisMay = null;
		for(Pais pais : paisFabri){
			int cantPais = 0;
			for(int i = 0;i < paisFabri.size();i++) {
				if(pais == paisFabri.get(i)) {
					cantPais++;
				}
			}
			if(cantPais > may) {
				may = cantPais;
				paisMay = pais;
			}
		}
		return paisMay;
	}
}
