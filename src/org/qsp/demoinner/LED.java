package org.qsp.demoinner;

public class LED {
	public static void main(String[] args) {
		Light l = new Light() {

			@Override
			public String giveLight() {
				return "give led light";
			}
		};
		System.out.println(l.giveLight());
	}

}
