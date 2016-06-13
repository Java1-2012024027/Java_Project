/*람다식으로 나타내기
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
		this.setTitle("멋져!!");

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러 임마");
		label = new JLabel("빨리 눌러 임마");
		button.addActionListener(e -> {
			label.setText("드디어 눌렀군!!!");
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