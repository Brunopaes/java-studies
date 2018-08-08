package paes.javaThread;

public class Thread1 implements Runnable {

    private Acumulador total;

    public Thread1 (Acumulador total) {
        this.total = total;
    }

    @Override
	public void run() {
	    int t = 0;

		for (int i = 0; i <= 1; i++) {
			if (i % 2 == 0) total.totalPares += 1;
		}
	    this.total.totalPares = t;
	}
}
