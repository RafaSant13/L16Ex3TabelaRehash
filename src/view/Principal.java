package view;

import controller.RehashControle;

public class Principal {

	public static void main(String[] args) {
		RehashControle r = new RehashControle();
		try {
			r.rehash();
			r.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
