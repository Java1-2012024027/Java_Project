/*���ٽ����� ��Ÿ����
package Final;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	private JButton button;
	private JLabel label;

	public MyFrame() {
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("����!!");

		JPanel panel = new JPanel();
		button = new JButton("��ư�� ���� �Ӹ�");
		label = new JLabel("���� ���� �Ӹ�");
		button.addActionListener(e -> {
			label.setText("���� ������!!!");
		});
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}
}

public class ActionEventTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}

}
*/