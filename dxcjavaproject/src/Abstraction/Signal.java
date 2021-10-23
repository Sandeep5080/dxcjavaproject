package Abstraction;

public class Signal {
	public static void main(String[] args) {

		Tv sListener = new Remote();

		sListener.Tvon();
		sListener.TvOff();
		sListener.Tvpower(12);
		sListener.TvAv();
	}

}
