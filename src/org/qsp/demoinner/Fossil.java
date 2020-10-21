package org.qsp.demoinner;

public class Fossil {
	public static void main(String[] args) {
		Watch w = new Watch() {

			@Override
			public void giveWatch() {
				System.out.println("give fossil watch");
			}
		};
		w.giveWatch();
	}

}
