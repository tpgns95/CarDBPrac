package carDBPrac.main;
import java.net.SocketTimeoutException;
import java.util.Scanner;
public class CarDBPracMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("========CarINFO=======");
		System.out.println("��ȣ�� �Է��Ͻÿ�...........");
		System.out.println("1.�ڵ���  ���� ����.........");
		System.out.println("2.�ڵ��� ���� �Է�..........");
		System.out.println("3.�ڵ��� ���� ����..........");
		System.out.println("4.�ڵ��� ���� ����..........");
		System.out.println("======================");
		int inputNum = sc.nextInt();
		
		if(inputNum ==1) { //�ڵ��� ���� ��ȸ
			System.out.println("��ȸ");
			break;
		}
		else if(inputNum ==2) {//�ڵ��� ���� �Է�
			System.out.println("�Է�");

			break;
		}
		else if(inputNum ==3) {//�ڵ�����������
			System.out.println("����");

			break;
			
		}
		else if (inputNum==4) {//�ڵ�����������
			System.out.println("����");

			break;
		}
		else {//�ٸ���ȣ �Է�������
			System.out.println("�ٽ� �Է��� �ּ���");
		}
	}
}
}