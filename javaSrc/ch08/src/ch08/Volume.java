package ch08;

public interface Volume {
	void volumeUp(int level);
	void volumeDown(int level);
}

class Radio implements Volume {
	public void volumeUp(int level) {
		System.out.println("라디오 볼륨을 " + level + "로 올립니다.");
	}
	public void volumeDown(int level) {
		System.out.println("라디오 볼륨을 " + level + "로 내립니다.");
	}
}

class TV implements Volume {
	public void volumeUp(int level) {
		System.out.println("TV 볼륨을 " + level + "로 올립니다.");
	}
	public void volumeDown(int level) {
		System.out.println("TV 볼륨을 " + level + "로 내립니다.");
	}
}

class Speaker implements Volume {
	public void volumeUp(int level) {
		System.out.println("스피커 볼륨을 " + level + "로 올립니다.");
	}
	public void volumeDown(int level) {
		System.out.println("스피커 볼륨을 " + level + "로 내립니다.");
	}
}