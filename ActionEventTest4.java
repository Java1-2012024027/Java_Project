/*
package Final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible("���!!");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�.");
		label = new JLabel("���� ��ư�� ������ �ʾѽ��ϴ�.");
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (e.getSource()==button){
					label.setText("��ħ�� ��ư�� �����̱���!!");
				}
			}
		});
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}
public class ActionEventTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}

}
//����Ŭ���� ���
*/