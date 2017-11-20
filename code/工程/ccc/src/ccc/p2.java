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
public class p2 extends JFrame {
	public p2() {
		setTitle("ccc");
		setLayout(null);
		setBounds(0,0,300,500);
		Container c=getContentPane();
		//������弰��ʼ��
		JButton b1=new JButton("����");
		JButton forget=new JButton("��������");
		JButton register=new JButton("��û���˺ţ�����ע��");
		JButton QQ=new JButton("QQ");
		JButton wchat=new JButton("΢��");
		JButton weibo=new JButton("΢��");
		JTextField admin=new JTextField();
		JTextField passwd=new JTextField();
		JLabel tip1=new JLabel("��λ������");
		JLabel tip2=new JLabel("��ݵ���");
		JLabel j1=new JLabel();
		//b1.setBackground(Color.gray);
		
		
		//�����λ�ü��߽�
		//c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		tip1.setBounds(80, 60, 140, 30);
		admin.setBounds(40, 110, 170, 20);
		passwd.setBounds(40, 150, 170, 20);
		forget.setBounds(180,170,60,15);
		b1.setBounds(90,260,120,30);
		register.setBounds(80, 290, 140, 15);
        QQ.setBounds(40, 400, 50, 30);
        wchat.setBounds(95,400,50,30);
        weibo.setBounds(145,400,50,30); 
        tip2.setBounds(95, 370, 100, 20);
        j1.setBounds(80,390,40,25);
        
        //����Ϊ͸��
        QQ.setContentAreaFilled(false);
        //���ͼ��
        Icon IQQ=new ImageIcon("E:\\��������/����/qq.png");
        QQ.setIcon(IQQ);
        //ȡ���߽�
        QQ.setBorder(null);
        
        wchat.setContentAreaFilled(false);
        Icon Iwchat=new ImageIcon("E:\\��������/����/qq2.png");
        wchat.setIcon(Iwchat);
        wchat.setBorder(null);
        
        weibo.setContentAreaFilled(false);
        Icon Iweibo=new ImageIcon("E:\\��������/����/qq3.png");
        weibo.setIcon(Iweibo);
        weibo.setBorder(null);
        
        register.setContentAreaFilled(false);
        register.setBorder(null);
        
        forget.setContentAreaFilled(false);
        forget.setBorder(null);
        
        Icon Ij1=new ImageIcon("E:\\��������/����/Ij1.png");
        j1.setIcon(Ij1);
        j1.setBorder(null);
        
        
        //���������������
		c.add(b1);
		c.add(forget);
		c.add(register);
		c.add(QQ);
		c.add(wchat);
		c.add(weibo);
		c.add(admin);
		c.add(passwd);
		c.add(tip1);
		c.add(tip2);
		c.add(j1);
		
		//���͸����
		admin.setOpaque(false);
        passwd.setOpaque(false);
        QQ.setOpaque(false);
        tip1.setOpaque(false);
        tip1.setBorder(null);
        tip2.setBorder(null);
        tip2.setOpaque(false);
        j1.setOpaque(false);
       // ((JComponent) c).setOpaque(false);
       // getContentPane().add(c);
        
		//�ı�����
		admin.setText("�˺�/�ֻ�����");
        passwd.setText("����");
        //tip1.setText("��λ������");
        //tip2.setText("��ݵ���");
        
		textSet(admin);
        textSet(passwd);
        //textSet(tip1);
        //textSet(tip2);
        
		setVisible(true);
		//�����¼�
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p4();
			}

			});
		
		register.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p3();
			}

			});
		
		admin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && admin.getText().equals("�˺�/����/�ֻ���") &&e.getClickCount()==1) {
                    admin.setText(null);
                    passwd.setText("����");
                }
            }
        });
		
		admin.addCaretListener(new CaretListener(){
            public void caretUpdate(CaretEvent e){

            }
        });
		
        passwd.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && passwd.getText().equals("����") &&e.getClickCount()==1) {
                    passwd.setText(null);
                    admin.setText("�˺�/����/�ֻ���");
                }
            }
        });
		}
	//�ı������÷���
	public void textSet(JTextField field) {  
        field.setBackground(new Color(255, 255, 255));  
        field.setPreferredSize(new Dimension(150, 28));  
        MatteBorder border = new MatteBorder(0, 0, 2, 0, new Color(192, 192,  
        192));  
        field.setBorder(border);  
    }  	
}