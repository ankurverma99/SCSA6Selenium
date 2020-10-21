package org.qsp.demoinner;

public class Fastrack extends Watch {

	@Override
	public void giveWatch() {
		System.out.println("Give fastrack watch");
	}

	public static void main(String[] args) {
		Fastrack f = new Fastrack();
		f.giveWatch();
	}

}
