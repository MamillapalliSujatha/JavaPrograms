package com.objectExample4;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver( );
		Player p2 = new Player ( );

		d.print (p2);
	}

	private void print(Player p2) {
		System.out.println(p2.id +"---"+ p2.name+"---"+p2.age);
	}

}
