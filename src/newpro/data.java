package newpro;

import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.proteanit.sql.DbUtils;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class data extends JFrame
{ ResultSet rs;
	
	JTable table;
	
	public static void main(String args[]) throws SQLException
	{
		data d1=new data();
		d1.get_Data();
		d1.start();
	}
	public void get_Data() throws SQLException
	{
		one f1=new one();
		f1.main(null);
		String sql="select name,age,pg1,pg2,pg3,pg4,pg5,pg6,pg7 from p1";
		PreparedStatement st=(PreparedStatement)f1.conn.prepareStatement(sql);
		rs=st.executeQuery(sql);
	}
	public void start()
	{ 
			
		table=new JTable(DbUtils.resultSetToTableModel(rs));
		 
			JScrollPane	pane = new JScrollPane(table); 
		      pane.getViewport().setBackground(new Color(128,0,128,0));
			
		     
			setContentPane(pane); 
			setVisible(true); 


			setSize(600,600); 
			setLayout(new FlowLayout());
			setBackground(new Color(0,0,0));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			} }

