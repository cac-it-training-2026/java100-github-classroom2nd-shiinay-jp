package lesson09.challenge04.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//ここに適切な処理を記述
	public void takeTemperature(NurserySchoolChild child) throws IllegalStateException {

		if (38 <= child.getTemperature()) {

			throw new IllegalStateException("\n" + child.getName() + "は重体です。\n\nすぐに病院に行ってください。");

		} else {

			System.out.println("\n" + child.getName() + "の体温は" + child.getTemperature() + "度です。");
		}

	}

}
