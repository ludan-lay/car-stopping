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
		//组件定义及初始化
		JButton b1=new JButton("搜索");
		JButton b2=new JButton("png1");
		JButton b3=new JButton("png2");
		JButton b4=new JButton("png3");
		JButton b5=new JButton("+");
		JTextField tip1=new JTextField();
		JComboBox jc=new JComboBox(new MyComboBox());
		JComboBox jc2=new JComboBox(new MyComboBox2());
		JLabel jl=new JLabel("智能排序");
		JLabel j2=new JLabel("筛选");
		
		b2.setContentAreaFilled(false);
        //添加图标
        Icon Ib2=new ImageIcon("E:\\个人资料/桌面/qq4.png");
        b2.setIcon(Ib2);
        b3.setContentAreaFilled(false);
        //添加图标
        Icon Ib3=new ImageIcon("E:\\个人资料/桌面/qq5.png");
        b3.setIcon(Ib3);
        b4.setContentAreaFilled(false);
        //添加图标
        Icon Ib4=new ImageIcon("E:\\个人资料/桌面/qq6.png");
        b4.setIcon(Ib4);
        b5.setContentAreaFilled(false);
        //添加图标
        Icon Ib5=new ImageIcon("E:\\个人资料/桌面/qq7.png");
        b5.setIcon(Ib5);
		
		
		//各组件位置及边界
        //c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
		b1.setBounds(220,20,60,20);
		b2.setBounds(5,100,280,80);
		b3.setBounds(5, 185, 280, 80);
        b4.setBounds(5, 270, 280, 80);
        b5.setBounds(5,350,280,80);
        tip1.setBounds(40, 20, 180, 20);
        jc.setBounds(150,80,80,20);
        jc2.setBounds(230,80,60,20);
        
        //将各组件加入容器
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
		
		
		//组件透明化
		b5.setOpaque(false);
		b3.setOpaque(false);
        b4.setOpaque(false);
        b2.setOpaque(false);
        tip1.setOpaque(false);
        
		//文本设置
        tip1.setText("");
        //textSet(tip1);
        //textSet(tip2);
        
		setVisible(true);
		//监听事件
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
	//文本框设置方法
	public void textSet(JTextField field) {  
        field.setBackground(new Color(255, 255, 255));  
        field.setPreferredSize(new Dimension(150, 28));  
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(192, 192,  
        192));  
        field.setBorder(border);  
    }  
	class MyComboBox extends AbstractListModel implements ComboBoxModel{
		
		String selecteditem="智能排序";
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
		String selecteditem="筛选";
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

