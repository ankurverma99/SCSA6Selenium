package org.qsp.demoinner;

public class TubeLight implements Light {

	@Override
	public String giveLight() {
		return "give tubelight";
	}

	public static void main(String[] args) {
		TubeLight t = new TubeLight();
		String li = t.giveLight();
		System.out.println(li);
	}

}
