package Sample_0411;

public class Television {
	int channel;
	int volume;
	boolean onOff;

	void pr() {
		System.out.println(channel + " " + volume + " " + onOff);
	}

	void volumeUP(int data) {
		if (onOff == false) {
			System.out.println("TV Die");
			return;
		}
		volume += data;
		System.out.println(channel + " " + volume + " " + onOff);
	}

	void volumeUP() {
		if (onOff == false) {
			System.out.println("TV Die");
			return;
		}
		volume += 1;
	}
}
