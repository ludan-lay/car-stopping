package ccc;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


@SuppressWarnings("serial")
public class ccc3 extends JFrame {
	public ccc3() {
		setTitle("ccc");
		//ȡ�����ֲ��þ��Բ���
		setLayout(null);
		//�����С
		setBounds(0,0,300,500);
		//
		Container c=getContentPane();
		JButton b1=new JButton("���г�λ");
		JButton b2=new JButton("��Ҫͣ��");
		//b1.setBackground(Color.gray);
		//c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		b1.setBounds(90,330,120,30);
		b2.setBounds(90,370,120,30);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		b1.addActionListener(new ActionListener(){
			//������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
			new p5();
			}

			});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p2();
			}

			});	
	}
	
	public static void main(String[] args) {
		new ccc3();
		System.out.println("down");
	}

}
