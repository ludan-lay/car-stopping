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
public class p6 extends JFrame {
	public p6() {
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
		JLabel b6=new JLabel("λ����Ϣ");
		JLabel b7=new JLabel("�շѱ�׼");
		JLabel b8=new JLabel("��λ״̬");
		JLabel b9=new JLabel("���״̬");
		JTextField tip1=new JTextField();
		JComboBox jc1=new JComboBox(new MyComboBox());
		JComboBox jc2=new JComboBox(new MyComboBox2());
		JComboBox jc3=new JComboBox(new MyComboBox3());
		JComboBox jc4=new JComboBox(new MyComboBox4());
		JLabel j1=new JLabel("������λ");
		JLabel j2=new JLabel("Ԫ/Сʱ");
		
		b2.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib2=new ImageIcon("E:\\��������/����/qq8.png");
        b2.setIcon(Ib2);
        b3.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib3=new ImageIcon("E:\\��������/����/qq9.png");
        b3.setIcon(Ib3);
        b4.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib4=new ImageIcon("E:\\��������/����/qq10.png");
        b4.setIcon(Ib4);
        b5.setContentAreaFilled(false);
        //���ͼ��
        Icon Ib5=new ImageIcon("E:\\��������/����/qq11.png");
        b5.setIcon(Ib5);
		
		
		//�����λ�ü��߽�
       // c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		b1.setBounds(230,10,60,20);
		b2.setBounds(15,70,100,80);
		b3.setBounds(175, 70, 100, 80);
        b4.setBounds(15, 160, 100, 80);
        b5.setBounds(175,160,100,80);
        b6.setBounds(5,250,70,30);
		b7.setBounds(5, 290, 70, 30);
        b8.setBounds(5, 330, 70, 30);
        b9.setBounds(5,370,70,30);
        tip1.setBounds(80, 250, 150, 20);
        jc1.setBounds(80,290,150,20);
        jc2.setBounds(80,330,150,20);
        jc3.setBounds(80,370,150,20);
        j1.setBounds(140,10,80,20);
        j2.setBounds(235,290,60,30);
        
        //���������������
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(tip1);
		c.add(j1);
		c.add(jc1);
		c.add(j2);
		c.add(jc2);
		c.add(jc3);
		
		
		//���͸����
		b5.setOpaque(false);
		b3.setOpaque(false);
        b4.setOpaque(false);
        b2.setOpaque(false);
        tip1.setOpaque(false);
        j1.setOpaque(false);
        j1.setBorder(null);
        j2.setOpaque(false);
        j2.setBorder(null);
		//�ı�����
        tip1.setText("");
        
		textSet(tip1);
        //textSet(tip1);
        //textSet(tip2);
        
		setVisible(true);
		//�����¼�
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
			}

			});
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}

			});
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}

			});
		
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			}

			});
		
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
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
		String selecteditem=null;
		String[] test= {"1","2","3"};
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
		String selecteditem="����";
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
	
	class MyComboBox3 extends AbstractListModel implements ComboBoxModel{
		String selecteditem="�����";
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
	
	class MyComboBox4 extends AbstractListModel implements ComboBoxModel{
		String selecteditem=null;
		String[] test= {"ɸѡ","aaa","bbb"};
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


