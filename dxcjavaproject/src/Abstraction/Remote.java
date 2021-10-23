package Abstraction;

public class Remote  implements Tv{
	@Override
	public void Tvon() {
		System.out.println("Tv is on");
	}

	@Override
	public int TvOff() {
		System.out.println("Tv is off");
		return 28;
	}

	@Override
	public boolean Tvpower(int type) {
		System.out.println("Tv power is on");
		return false;
	}

	@Override
	public void TvAv() {
		System.out.println("Tv Av is on");

	}

}



