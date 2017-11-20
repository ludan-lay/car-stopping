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
public class p3 extends JFrame {
	public p3() {
		setTitle("ccc");
		setLayout(null);
		setBounds(0,0,300,500);
		Container c=getContentPane();
		//������弰��ʼ��
		JButton get=new JButton("��ȡ��֤��");
		JButton register=new JButton("ע��");
		JTextField nicname=new JTextField();
		JTextField passwd=new JTextField();
		JTextField phone=new JTextField();
		JTextField permit=new JTextField();
		JLabel tip1=new JLabel("��λ������");
		JButton tip2=new JButton("��û���˺ţ�����ע��");
		//b1.setBackground(Color.gray);
		
		//�����λ�ü��߽�
		//c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		get.setBounds(180,260,100,20);
		register.setBounds(90, 380, 120, 25);
        phone.setBounds(70, 180, 135, 25);
        permit.setBounds(70,260,135,30);
		nicname.setBounds(70, 220, 135, 25);
        passwd.setBounds(70, 300, 135, 25);
        tip1.setBounds(95, 80, 120, 25);
        tip2.setBounds(80, 400, 140, 25);
        
        //���������������
		c.add(get);
		c.add(register);
		c.add(phone);
		c.add(permit);
		c.add(nicname);
		c.add(passwd);
		c.add(tip1);
		c.add(tip2);
		
		//���͸����
		nicname.setOpaque(false);
        passwd.setOpaque(false);
        phone.setOpaque(false);
        permit.setOpaque(false);
        get.setContentAreaFilled(false);
        //get.setBorder(null);
        tip2.setContentAreaFilled(false);
        tip2.setBorder(null);
       // ((JComponent) c).setOpaque(false);
       // getContentPane().add(c);
        
		//�ı�����
		nicname.setText("�ǳ�");
		permit.setText("��֤��");
		phone.setText("�ֻ���");
        passwd.setText("����");
        
		textSet(nicname);
		textSet(permit);
		textSet(phone);
        textSet(passwd);
       
        
		setVisible(true);
		//�����¼�
		get.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
			}

			});
		
		register.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p2();
			}

			});
		
		
		nicname.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && nicname.getText().equals("�ǳ�") &&e.getClickCount()==1) {
                    nicname.setText(null);
                    passwd.setText("����");
                }
            }
        });
		
		nicname.addCaretListener(new CaretListener(){
            public void caretUpdate(CaretEvent e){

            }
        });
		
        passwd.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && passwd.getText().equals("����") &&e.getClickCount()==1) {
                    passwd.setText(null);
                    nicname.setText("�ǳ�");
                }
            }
        });
        
        phone.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && phone.getText().equals("�ֻ���") &&e.getClickCount()==1) {
                    phone.setText(null);
                    permit.setText("��֤��");
                }
            }
        });
		
		phone.addCaretListener(new CaretListener(){
            public void caretUpdate(CaretEvent e){

            }
        });
		
        permit.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && permit.getText().equals("��֤��") &&e.getClickCount()==1) {
                    permit.setText(null);
                    phone.setText("�ֻ���");
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
