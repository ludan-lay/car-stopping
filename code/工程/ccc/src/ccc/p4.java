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
public class p4 extends JFrame {
	public p4() {
		setTitle("ccc");
		setLayout(null);
		setBounds(0,0,300,500);
		Container c=getContentPane();
		//组件定义及初始化
		JButton b0=new JButton("");
		JButton b1=new JButton("车位管理");
		JButton b2=new JButton("数据中心");
		JButton b3=new JButton("银行卡");
		JButton b4=new JButton("商家社区");
		JButton b5=new JButton("设置");
		JButton b6=new JButton("帮助中心");
		JLabel b10=new JLabel("今日成交额/元");
		JLabel b7=new JLabel("剩余车位");
		JLabel b8=new JLabel("成交订单");
		JLabel b9=new JLabel("今日数据");
		JLabel j1=new JLabel("0");
		JLabel j2=new JLabel("0");
		JLabel j3=new JLabel("0");
		
		
		JTextField tip1=new JTextField();
		JTextField tip2=new JTextField();
		//b1.setBackground(Color.gray);
		
		//各组件位置及边界
		//c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		b1.setBounds(20,260,80,30);
		b2.setBounds(110,260,80,30);
		b3.setBounds(200, 260, 80, 30);
        b4.setBounds(20, 320, 80, 25);
        b5.setBounds(110,320,80,30);
        b6.setBounds(200,320,80,30);
        b7.setBounds(120, 150, 60, 20);
        b8.setBounds(220, 150, 60, 20);
        b9.setBounds(120,90,80,30);
        b10.setBounds(20,150,80,20);
        j1.setBounds(60,120,40,20);
		j2.setBounds(140,120,40,20);
		j3.setBounds(240, 120, 40, 20);
        tip1.setBounds(95, 20, 120, 25);
        tip2.setBounds(95, 50, 120, 25);
        
        //将各组件加入容器
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(b10);
		c.add(j1);
		c.add(j2);
		c.add(j3);
		
		
		//组件透明化
		
        //b2.setOpaque(false);
        j1.setOpaque(false);
        j2.setOpaque(false);
        j3.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorder(null);
        b2.setContentAreaFilled(false);
        b2.setBorder(null);
        b3.setContentAreaFilled(false);
        b3.setBorder(null);
        b4.setContentAreaFilled(false);
        b4.setBorder(null);
        b5.setContentAreaFilled(false);
        b5.setBorder(null);
        b6.setContentAreaFilled(false);
        b6.setBorder(null);
        //tip1.setOpaque(false);
        //tip2.setOpaque(false);
       // ((JComponent) c).setOpaque(false);
       // getContentPane().add(c);
        
		//文本设置
		
        tip1.setText("车位主登入");
        tip2.setText("快捷登入");
        
		
        //textSet(tip1);
        //textSet(tip2);
        
		setVisible(true);
		//监听事件
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
			}

			});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
			}

			});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
			}

			});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
			}

			});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
			}

			});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new p5();
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
