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
		//组件定义及初始化
		JButton b1=new JButton("保存");
		JButton b2=new JButton("png1");
		JButton b3=new JButton("png2");
		JButton b4=new JButton("png3");
		JButton b5=new JButton("+");
		JLabel b6=new JLabel("位置信息");
		JLabel b7=new JLabel("收费标准");
		JLabel b8=new JLabel("车位状态");
		JLabel b9=new JLabel("审核状态");
		JTextField tip1=new JTextField();
		JComboBox jc1=new JComboBox(new MyComboBox());
		JComboBox jc2=new JComboBox(new MyComboBox2());
		JComboBox jc3=new JComboBox(new MyComboBox3());
		JComboBox jc4=new JComboBox(new MyComboBox4());
		JLabel j1=new JLabel("发布车位");
		JLabel j2=new JLabel("元/小时");
		
		b2.setContentAreaFilled(false);
        //添加图标
        Icon Ib2=new ImageIcon("E:\\个人资料/桌面/qq8.png");
        b2.setIcon(Ib2);
        b3.setContentAreaFilled(false);
        //添加图标
        Icon Ib3=new ImageIcon("E:\\个人资料/桌面/qq9.png");
        b3.setIcon(Ib3);
        b4.setContentAreaFilled(false);
        //添加图标
        Icon Ib4=new ImageIcon("E:\\个人资料/桌面/qq10.png");
        b4.setIcon(Ib4);
        b5.setContentAreaFilled(false);
        //添加图标
        Icon Ib5=new ImageIcon("E:\\个人资料/桌面/qq11.png");
        b5.setIcon(Ib5);
		
		
		//各组件位置及边界
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
		c.add(tip1);
		c.add(j1);
		c.add(jc1);
		c.add(j2);
		c.add(jc2);
		c.add(jc3);
		
		
		//组件透明化
		b5.setOpaque(false);
		b3.setOpaque(false);
        b4.setOpaque(false);
        b2.setOpaque(false);
        tip1.setOpaque(false);
        j1.setOpaque(false);
        j1.setBorder(null);
        j2.setOpaque(false);
        j2.setBorder(null);
		//文本设置
        tip1.setText("");
        
		textSet(tip1);
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
	//文本框设置方法
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
		String selecteditem="空闲";
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
		String selecteditem="审核中";
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
		String[] test= {"筛选","aaa","bbb"};
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


