package zlh.test.thread;

public class MyThreadExtendsThread extends Thread {
	private int ticket = 10;

	// �߳���
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("ѭ��������" + i);
			if (this.ticket > 0) {
				System.out.println("MyThreadExtendsThread--��Ʊ��ticket:" + this.ticket--);
			}
		}
	}

}