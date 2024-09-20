package trainer;

import java.util.List;

import interfaces.TrainerActions;
import pok.Pok;

public class Trainer implements TrainerActions {
	
	//**** PKFX-02 Trainer Class ****//
	
	
//	- Id (1 si es jugador 2 si es la IA)
//	- Nombre (1 es Kooler 2 es Gary)
//	- Lista de tipo Pokemon
//	- Mochila (Todavía no se van a implementar los objetos, pero se deja preparado)
//	- Se podría hacer que implemente la interfaz Accion ?¿ Las acciones serían atacar y cambiar pokemon
	
	private int id;
	
	private String name;
	
	private List<Pok> poks;
	
	private List<String> backpack;

	public Trainer (int id, String name, List<Pok> poks, List<String> backpack) {
		this.id = id;
		this.name = name;
		this.poks = poks;
		this.backpack = backpack;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pok> getPoks() {
		return poks;
	}

	public void setPoks(List<Pok> poks) {
		this.poks = poks;
	}

	public List<String> getBackpack() {
		return backpack;
	}

	public void setBackpack(List<String> backpack) {
		this.backpack = backpack;
	}
	
	public String toString() {
		String trainerData = "";
		trainerData = "Trainer ID:" + id + " with name: " + name;
		
		if(!poks.isEmpty() || !(poks == null)) {
			trainerData += " has the following poks: " + poks.toString();
		}
		
		return trainerData;
	}
	
	//TO-DO in a future
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
	//TO-DO in a future
	@Override
	public void swapPok() {
		// TODO Auto-generated method stub
		
	}
}
