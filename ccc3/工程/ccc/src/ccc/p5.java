package ccc;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;


@SuppressWarnings("serial")
public class p5 extends JFrame {
	public p5() {
		setTitle("ccc");
		setLayout(null);
		setBounds(0,0,300,500);
		Container c=getContentPane();
		//������弰��ʼ��
		JButton b1=new JButton("����");
		JButton b2=new JButton("png1");
		JButton b3=new JButton("png2");
		JButton b4=new JButton("png3");
		JButton b5=new JButton("+");
		JTextField tip1=new JTextField();
		JComboBox jc=new JComboBox(new MyComboBox());
		JComboBox jc2=new JComboBox(new MyComboBox2());
		JLabel jl=new JLabel("��������");
		JLabel j2=new JLabel("ɸѡ");
		
		b2.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib2=new ImageIcon("E:\\��������/����/qq4.png");
        b2.setIcon(Ib2);
        b3.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib3=new ImageIcon("E:\\��������/����/qq5.png");
        b3.setIcon(Ib3);
        b4.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib4=new ImageIcon("E:\\��������/����/qq6.png");
        b4.setIcon(Ib4);
        b5.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib5=new ImageIcon("E:\\��������/����/qq7.png");
        b5.setIcon(Ib5);
		
		
		//�����λ�ü��߽�
        //c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		b1.setBounds(220,20,60,20);
		b2.setBounds(5,100,280,80);
		b3.setBounds(5, 185, 280, 80);
        b4.setBounds(5, 270, 280, 80);
        b5.setBounds(5,350,280,80);
        tip1.setBounds(40, 20, 180, 20);
        jc.setBounds(150,80,80,20);
        jc2.setBounds(230,80,60,20);
        
        //���������������
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(tip1);
		c.add(jl);
		c.add(jc);
		c.add(j2);
		c.add(jc2);
		
		
		//���͸����
		b5.setOpaque(false);
		b3.setOpaque(false);
        b4.setOpaque(false);
        b2.setOpaque(false);
        tip1.setOpaque(false);
        
		//�ı�����
        tip1.setText("");
        //textSet(tip1);
        //textSet(tip2);
        
		setVisible(true);
		//�����¼�
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p3();
			}

			});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p3();
			}

			});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p3();
			}

			});
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p3();
			}

			});
		
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p6();
			}

			});
		
		
		tip1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            	tip1.getText();
                }
            
        });
		
		}
	//�ı������÷���
	public void textSet(JTextField field) {  
        field.setBackground(new Color(255, 255, 255));  
        field.setPreferredSize(new Dimension(150, 28));  
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(192, 192,  
        192));  
        field.setBorder(border);  
    }  
	class MyComboBox extends AbstractListModel implements ComboBoxModel{
		
		String selecteditem="��������";
		String[] test= {"xx","yy"};
		public Object getElementAt(int index) {
			return test[index];
		}
		public int getSize() {
			return test.length;
		}
		public void setSelectedItem(Object item) {
			selecteditem=(String)item;
		}
		public Object getSelectedItem() {
			return selecteditem;
		}
	}
	
	class MyComboBox2 extends AbstractListModel implements ComboBoxModel{
		String selecteditem="ɸѡ";
		String[] test= {"aaa","bbb"};
		public Object getElementAt(int index) {
			return test[index];
		}
		public int getSize() {
			return test.length;
		}
		public void setSelectedItem(Object item) {
			selecteditem=(String)item;
		}
		public Object getSelectedItem() {
			return selecteditem;
		}
	}
}

