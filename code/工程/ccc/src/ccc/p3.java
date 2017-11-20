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
		//组件定义及初始化
		JButton get=new JButton("获取验证码");
		JButton register=new JButton("注册");
		JTextField nicname=new JTextField();
		JTextField passwd=new JTextField();
		JTextField phone=new JTextField();
		JTextField permit=new JTextField();
		JLabel tip1=new JLabel("车位主登入");
		JButton tip2=new JButton("还没有账号，马上注册");
		//b1.setBackground(Color.gray);
		
		//各组件位置及边界
		//c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		get.setBounds(180,260,100,20);
		register.setBounds(90, 380, 120, 25);
        phone.setBounds(70, 180, 135, 25);
        permit.setBounds(70,260,135,30);
		nicname.setBounds(70, 220, 135, 25);
        passwd.setBounds(70, 300, 135, 25);
        tip1.setBounds(95, 80, 120, 25);
        tip2.setBounds(80, 400, 140, 25);
        
        //将各组件加入容器
		c.add(get);
		c.add(register);
		c.add(phone);
		c.add(permit);
		c.add(nicname);
		c.add(passwd);
		c.add(tip1);
		c.add(tip2);
		
		//组件透明化
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
        
		//文本设置
		nicname.setText("昵称");
		permit.setText("验证码");
		phone.setText("手机号");
        passwd.setText("密码");
        
		textSet(nicname);
		textSet(permit);
		textSet(phone);
        textSet(passwd);
       
        
		setVisible(true);
		//监听事件
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
                if(c == MouseEvent.BUTTON1 && nicname.getText().equals("昵称") &&e.getClickCount()==1) {
                    nicname.setText(null);
                    passwd.setText("密码");
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
                if(c == MouseEvent.BUTTON1 && passwd.getText().equals("密码") &&e.getClickCount()==1) {
                    passwd.setText(null);
                    nicname.setText("昵称");
                }
            }
        });
        
        phone.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                int c = e.getButton();
                if(c == MouseEvent.BUTTON1 && phone.getText().equals("手机号") &&e.getClickCount()==1) {
                    phone.setText(null);
                    permit.setText("验证码");
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
                if(c == MouseEvent.BUTTON1 && permit.getText().equals("验证码") &&e.getClickCount()==1) {
                    permit.setText(null);
                    phone.setText("手机号");
                }
            }
        });
		}
	//文本框设置方法
	public void textSet(JTextField field) {  
        field.setBackground(new Color(255, 255, 255));  
        field.setPreferredSize(new Dimension(150, 28));  
        MatteBorder border = new MatteBorder(0, 0, 2, 0, new Color(192, 192,  
        192));  
        field.setBorder(border);  
    }  	
}
