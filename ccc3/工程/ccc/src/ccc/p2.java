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
		//组件定义及初始化
		JButton b1=new JButton("登入");
		JButton forget=new JButton("忘记密码");
		JButton register=new JButton("还没有账号，马上注册");
		JButton QQ=new JButton("QQ");
		JButton wchat=new JButton("微信");
		JButton weibo=new JButton("微博");
		JTextField admin=new JTextField();
		JTextField passwd=new JTextField();
		JLabel tip1=new JLabel("车位主登入");
		JLabel tip2=new JLabel("快捷登入");
		JLabel j1=new JLabel();
		//b1.setBackground(Color.gray);
		
		
		//各组件位置及边界
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
        
        //设置为透明
        QQ.setContentAreaFilled(false);
        //添加图标
        Icon IQQ=new ImageIcon("E:\\个人资料/桌面/qq.png");
        QQ.setIcon(IQQ);
        //取消边界
        QQ.setBorder(null);
        
        wchat.setContentAreaFilled(false);
        Icon Iwchat=new ImageIcon("E:\\个人资料/桌面/qq2.png");
        wchat.setIcon(Iwchat);
        wchat.setBorder(null);
        
        weibo.setContentAreaFilled(false);
        Icon Iweibo=new ImageIcon("E:\\个人资料/桌面/qq3.png");
        weibo.setIcon(Iweibo);
        weibo.setBorder(null);
        
        register.setContentAreaFilled(false);
        register.setBorder(null);
        
        forget.setContentAreaFilled(false);
        forget.setBorder(null);
        
        Icon Ij1=new ImageIcon("E:\\个人资料/桌面/Ij1.png");
        j1.setIcon(Ij1);
        j1.setBorder(null);
        
        
        //将各组件加入容器
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
		
		//组件透明化
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
        
		//文本设置
		admin.setText("账号/手机号码");
        passwd.setText("密码");
        //tip1.setText("车位主登入");
        //tip2.setText("快捷登入");
        
		textSet(admin);
        textSet(passwd);
        //textSet(tip1);
        //textSet(tip2);
        
		setVisible(true);
		//监听事件
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
                if(c == MouseEvent.BUTTON1 && admin.getText().equals("账号/邮箱/手机号") &&e.getClickCount()==1) {
                    admin.setText(null);
                    passwd.setText("密码");
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
                if(c == MouseEvent.BUTTON1 && passwd.getText().equals("密码") &&e.getClickCount()==1) {
                    passwd.setText(null);
                    admin.setText("账号/邮箱/手机号");
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