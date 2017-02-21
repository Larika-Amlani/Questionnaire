package newpro;



import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class showg extends Application{
static AnchorPane ap1=new AnchorPane();;
static Label lb,lb1,lb2;
static int flag=0;	
public static int m1;
public static Alert alert1;
public static int m2;
public static int err=0;
public static Stage stg;
@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		GridPane p=(GridPane)FXMLLoader.load(showg.class.getResource("show_graph.fxml"));
		AnchorPane ap=new AnchorPane();
		ToggleGroup group = new ToggleGroup();
		RadioButton rd=new RadioButton("Monthly Analysis");
		RadioButton rd1=new RadioButton("Yearly Analysis");
		rd1.setToggleGroup(group);
		rd.setToggleGroup(group);
		ap.getChildren().addAll(rd,rd1);
		AnchorPane.setTopAnchor(rd, 25.0);
		AnchorPane.setBottomAnchor(rd, 45.0);
		AnchorPane.setLeftAnchor(rd, 173.0);
		AnchorPane.setRightAnchor(rd, 302.0);
		AnchorPane.setTopAnchor(rd1, 55.0);
		AnchorPane.setBottomAnchor(rd1, 10.0);
		AnchorPane.setLeftAnchor(rd1, 173.0);
		AnchorPane.setRightAnchor(rd1, 302.0);
	p.add(ap,0,1);
	
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
			    {
			    @Override
			    public void changed(ObservableValue<? extends Toggle> ov, Toggle t, Toggle t1)
			        {
			        RadioButton chk = (RadioButton)t1.getToggleGroup().getSelectedToggle(); // Cast object to radio button
			        if(chk.getText().equalsIgnoreCase("Monthly Analysis"))
			        {
			        flag=0;
			        	get_anchor();
			        	MenuItem mt1=new MenuItem("January");
			        	MenuItem mt2=new MenuItem("Feburary");
			    		MenuItem mt3=new MenuItem("March");
			    		MenuItem mt4=new MenuItem("April");
			    		MenuItem mt5=new MenuItem("May");
			    		MenuItem mt6=new MenuItem("June");
			    		MenuItem mt7=new MenuItem("July");
			    		MenuItem mt8=new MenuItem("August");
			    		MenuItem mt9=new MenuItem("September");
			    		MenuItem mt10=new MenuItem("October");
			    		MenuItem mt11=new MenuItem("November");
			    		MenuItem mt12=new MenuItem("December");
			    		
			    		final SplitMenuButton mb=new SplitMenuButton(mt1,mt2,mt3,mt4,mt5,mt6,mt7,mt8,mt9,mt10,mt11,mt12);
			    		mb.setText("OPTIONS");
			    		mt1.setOnAction(event -> {
			    			mb.setText("January");
			    		   m1=1;
			    		});
			    		mt2.setOnAction(event -> {
			    			mb.setText("Feburary");
			    		   m1=2;
			    		});
			    		mt3.setOnAction(event -> {
			    			mb.setText("March");
			    			m1=3;
				    		});
			    		mt4.setOnAction(event -> {
			    			mb.setText("April");
				    		  m1=4;
				    		});
			    		mt5.setOnAction(event -> {
			    			mb.setText("May");
			    			m1=5;
				    		});
			    		mt6.setOnAction(event -> {
			    			mb.setText("June");
			    			m1=6;
				    		});
			    		mt7.setOnAction(event -> {
			    			mb.setText("July");
			    			m1=7;
				    		});
			    		mt8.setOnAction(event -> {
			    			mb.setText("August");
			    			m1=8; 
				    		});
			    		mt9.setOnAction(event -> {
			    			mb.setText("September");
			    			m1=9;
				    		});
			    		mt10.setOnAction(event -> {
			    			mb.setText("October");
			    			m1=10;
				    		});
			    		mt11.setOnAction(event -> {
			    			mb.setText("November");
			    			m1=11;
				    		});
			    		mt12.setOnAction(event -> {
			    			mb.setText("December");
			    			m1=12;
				    		});
			    		
			    		ap1.getChildren().add(mb);
			    		AnchorPane.setTopAnchor(mb,89.0);
			            AnchorPane.setRightAnchor(mb,359.0);
			        	AnchorPane.setBottomAnchor(mb,129.0);
			        	AnchorPane.setLeftAnchor(mb,107.0);
			    		
			    		
			    		
			    		MenuItem mta1=new MenuItem("January");
			        	MenuItem mta2=new MenuItem("Feburary");
			    		MenuItem mta3=new MenuItem("March");
			    		MenuItem mta4=new MenuItem("April");
			    		MenuItem mta5=new MenuItem("May");
			    		MenuItem mta6=new MenuItem("June");
			    		MenuItem mta7=new MenuItem("July");
			    		MenuItem mta8=new MenuItem("August");
			    		MenuItem mta9=new MenuItem("September");
			    		MenuItem mta10=new MenuItem("October");
			    		MenuItem mta11=new MenuItem("November");
			    		MenuItem mta12=new MenuItem("December");
			    		final SplitMenuButton mb1=new SplitMenuButton(mta1,mta2,mta3,mta4,mta5,mta6,mta7,mta8,mta9,mta10,mta11,mta12);
			    		mb1.setText("OPTIONS");
			    		mta1.setOnAction(event -> {
			    			mb1.setText("January");
			    		  m2=1;
			    		});
			    		mta2.setOnAction(event -> {
			    			mb1.setText("Feburary");
			    		   m2=2;
			    		});
			    		mta3.setOnAction(event -> {
			    			mb1.setText("March");
			    			m2=3;
				    		});
			    		mta4.setOnAction(event -> {
			    			mb1.setText("April");
				    		  m2=4;
				    		});
			    		mta5.setOnAction(event -> {
			    			mb1.setText("May");
			    			m2=5;
				    		});
			    		mta6.setOnAction(event -> {
			    			mb1.setText("June");
			    			m2=6;
				    		});
			    		mta7.setOnAction(event -> {
			    			mb1.setText("July");
			    			m2=7;
				    		});
			    		mta8.setOnAction(event -> {
			    			mb1.setText("August");
			    			m2=8; 
				    		});
			    		mta9.setOnAction(event -> {
			    			mb1.setText("September");
			    			m2=9;
				    		});
			    		mta10.setOnAction(event -> {
			    			mb1.setText("October");
			    			m2=10;
				    		});
			    		mta11.setOnAction(event -> {
			    			mb1.setText("November");
			    			m2=11;
				    		});
			    		mta12.setOnAction(event -> {
			    			mb1.setText("December");
			    			m2=12;
				    		});
			    		
			    		ap1.getChildren().add(mb1);
			    	
			    		AnchorPane.setTopAnchor(mb1,89.0);
			            AnchorPane.setRightAnchor(mb1,122.0);
			        	AnchorPane.setBottomAnchor(mb1,129.0);
			        	AnchorPane.setLeftAnchor(mb1,344.0);
			        	
			        	
			        	set_data();
			        	p.add(ap1,0,2);
			    			
			    				 
			    			
			    	        
			        }
			       
			    else if(chk.getText().equalsIgnoreCase("Yearly Analysis")){
			    	flag=1;
			    	
			    	get_anchor();
			    	int year=Calendar.getInstance().get(Calendar.YEAR);
			    	MenuItem mt1=new MenuItem(" "+year);
		        	MenuItem mt2=new MenuItem(" "+(year-1));
		    		MenuItem mt3=new MenuItem(" "+(year-2));
		    		MenuItem mt4=new MenuItem(" "+(year-3));
		    		MenuItem mt5=new MenuItem(" "+(year-4));
		    		MenuItem mt6=new MenuItem(" "+(year-5));
		    		MenuItem mt7=new MenuItem(" "+(year-6));
		    		MenuItem mt8=new MenuItem(" "+(year-7));
		    		MenuItem mt9=new MenuItem(" "+(year-8));
		    		MenuItem mt10=new MenuItem(" "+(year-9));
		    		MenuItem mt11=new MenuItem(" "+(year-10));
		    		MenuItem mt12=new MenuItem(" "+(year-11));
		    		
		    		final SplitMenuButton mb=new SplitMenuButton(mt1,mt2,mt3,mt4,mt5,mt6,mt7,mt8,mt9,mt10,mt11,mt12);
		    		mb.setText("OPTIONS");
		    		mt1.setOnAction(event -> {
		    			mb.setText(" "+year);
		    		  m1=year;
		    		});
		    		mt2.setOnAction(event -> {
		    			mb.setText(" "+(year-1));
		    		   m1=(year-1);
		    		});
		    		mt3.setOnAction(event -> {
		    			mb.setText(" "+(year-2));
		    			m1=(year-2);
			    		});
		    		mt4.setOnAction(event -> {
		    			mb.setText(" "+(year-3));
			    		   m1=(year-3);
			    		});
		    		mt5.setOnAction(event -> {
		    			mb.setText(" "+(year-4));
		    			m1=(year-4);
			    		});
		    		mt6.setOnAction(event -> {
		    			mb.setText(" "+(year-5));
		    			m1=(year-5);
			    		});
		    		mt7.setOnAction(event -> {
		    			mb.setText(" "+(year-6));
		    			m1=(year-6);
			    		});
		    		mt8.setOnAction(event -> {
		    			mb.setText(" "+(year-7));
		    			m1=(year-7); 
			    		});
		    		mt9.setOnAction(event -> {
		    			mb.setText(" "+(year-8));
		    			m1=(year-8);
			    		});
		    		mt10.setOnAction(event -> {
		    			mb.setText(" "+(year-9));
		    			m1=(year-9);
			    		});
		    		mt11.setOnAction(event -> {
		    			mb.setText(" "+(year-10));
		    			m1=(year-10);
			    		});
		    		mt12.setOnAction(event -> {
		    			mb.setText(" "+(year-11));
		    			m1=(year-11);
			    		});
		    		
		    		MenuItem mta1=new MenuItem(" "+year);
		        	MenuItem mta2=new MenuItem(" "+(year-1));
		    		MenuItem mta3=new MenuItem(" "+(year-2));
		    		MenuItem mta4=new MenuItem(" "+(year-3));
		    		MenuItem mta5=new MenuItem(" "+(year-4));
		    		MenuItem mta6=new MenuItem(" "+(year-5));
		    		MenuItem mta7=new MenuItem(" "+(year-6));
		    		MenuItem mta8=new MenuItem(" "+(year-7));
		    		MenuItem mta9=new MenuItem(" "+(year-8));
		    		MenuItem mta10=new MenuItem(" "+(year-9));
		    		MenuItem mta11=new MenuItem(" "+(year-10));
		    		MenuItem mta12=new MenuItem(" "+(year-11));
		    		
		    		final SplitMenuButton mb1=new SplitMenuButton(mta1,mta2,mta3,mta4,mta5,mta6,mta7,mta8,mta9,mta10,mta11,mta12);
		    		mb1.setText("OPTIONS");
		    		mta1.setOnAction(event -> {
		    			mb1.setText(" "+year);
		    		  m2=year;
		    		});
		    		mta2.setOnAction(event -> {
		    			mb1.setText(" "+(year-1));
		    		   m2=(year-1);
		    		});
		    		mta3.setOnAction(event -> {
		    			mb1.setText(" "+(year-2));
		    			m2=(year-2);
			    		});
		    		mta4.setOnAction(event -> {
		    			mb1.setText(" "+(year-3));
			    		  m2=(year-3);
			    		});
		    		mta5.setOnAction(event -> {
		    			mb1.setText(" "+(year-4));
		    			m2=(year-4);
			    		});
		    		mta6.setOnAction(event -> {
		    			mb1.setText(" "+(year-5));
		    			m2=(year-5);
			    		});
		    		mta7.setOnAction(event -> {
		    			mb1.setText(" "+(year-6));
		    			m2=(year-6);
			    		});
		    		mta8.setOnAction(event -> {
		    			mb1.setText(" "+(year-7));
		    			m2=(year-7); 
			    		});
		    		mta9.setOnAction(event -> {
		    			mb1.setText(" "+(year-8));
		    			m2=(year-8);
			    		});
		    		mta10.setOnAction(event -> {
		    			mb1.setText(" "+(year-9));
		    			m2=(year-9);
			    		});
		    		mta11.setOnAction(event -> {
		    			mb1.setText(" "+(year-10));
		    			m2=(year-10);
			    		});
		    		mta12.setOnAction(event -> {
		    			mb1.setText(" "+(year-11));
		    			m2=(year-11);
			    		});
		    		ap1.getChildren().addAll(mb,mb1);
		    		
		    		AnchorPane.setTopAnchor(mb,89.0);
		            AnchorPane.setRightAnchor(mb,359.0);
		        	AnchorPane.setBottomAnchor(mb,129.0);
		        	AnchorPane.setLeftAnchor(mb,107.0);
		        	AnchorPane.setTopAnchor(mb1,89.0);
		            AnchorPane.setRightAnchor(mb1,122.0);
		        	AnchorPane.setBottomAnchor(mb1,129.0);
		        	AnchorPane.setLeftAnchor(mb1,344.0);
		        	
		    		p.add(ap1,0,2);
		    	
		    		
		    			
			    	
			    }
			        }
			    
			    });
		
	 

		
			
			
			
		Scene scn=new Scene(p,600,400);
		 stg=new Stage();
		stg.setScene(scn);
		stg.show();
		
		
	}
	public static void get_anchor()
	{
		
    	 lb=new Label("From");
    	 lb1=new Label("To");
    	lb2=new Label("Choose your Input");
    	lb2.setFont(new Font("Yu Gothic ui Light",33));
    	lb.setFont(new Font("System",14));
    	lb1.setFont(new Font("System",14));
    	ap1.getChildren().addAll(lb,lb1,lb2);
    	AnchorPane.setTopAnchor(lb2,14.0);
        AnchorPane.setRightAnchor(lb2,146.0);
    	AnchorPane.setBottomAnchor(lb2,180.0);
    	AnchorPane.setLeftAnchor(lb2,164.0);
    	AnchorPane.setTopAnchor(lb,90.0);
        AnchorPane.setRightAnchor(lb,498.0);
    	AnchorPane.setBottomAnchor(lb,132.0);
    	AnchorPane.setLeftAnchor(lb,63.0);
    	AnchorPane.setTopAnchor(lb1,90.0);
        AnchorPane.setRightAnchor(lb1,263.0);
    	AnchorPane.setBottomAnchor(lb1,132.0);
    	AnchorPane.setLeftAnchor(lb1,314.0);
    	Button btn=new Button("Show Analysis");
    	ap1.getChildren().add(btn);
    	AnchorPane.setTopAnchor(btn,186.0);
        AnchorPane.setRightAnchor(btn,200.0);
    	AnchorPane.setBottomAnchor(btn,32.0);
    	AnchorPane.setLeftAnchor(btn,200.0);
    	btn.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {
    	    	if(m1==0||m2==0)
    	    	{
    	    		Alert alert1=new Alert(AlertType.INFORMATION,"Incomplete Input");
    	    		alert1.showAndWait();
    	    	}
    	    	if(m1>=m2 && flag==1)
    	    	{
    	    		Alert alert1=new Alert(AlertType.INFORMATION,"From " + "year should be Greater than"+ " To "+ "year");
    	    	alert1.show();
    	    	}
    	    	else
    	    	{
    	    		set_data();
    showg.stg.hide();
    	    		graph g1=new graph();
    	    		try {
						g1.start(new Stage());
					} catch (IOException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
    	    	}
    	    	
    	    	}
    	   
    	});
    
	}
	public static void set_data()
	{

		one.count=Math.abs(m1-m2)+1;
		one f1=new one();
	    try {
			f1.main(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    int j=1;
	    if(flag==0){
	    	 int year=Calendar.getInstance().get(Calendar.YEAR);
			  for(int i=m1;i<=m2;i++)
		        {
		        String sql="select count(*) from p1 where month(curr_date)='"+i+"' and year(curr_date)='"+year+"'"; 
			     try{ 
		        PreparedStatement st=(PreparedStatement)f1.conn.prepareStatement(sql);
		       
		        ResultSet rs=(ResultSet)st.executeQuery(sql);
		        while(rs.next())
		        {
		        	one.arr[j++]=rs.getInt(1);
		        	
		        }
			     }catch(SQLException e)
			     {
			    	 e.printStackTrace();
			     }
		        }
			
	    }
	    else if(flag==1)
	    {
	    	
	    	j=1;
	    	for(int i=m2;i>=m1;i--)
            {
            String sql="select count(*) from p1 where year(curr_date)='"+i+"' "; 
    	     try{ 
            PreparedStatement st=(PreparedStatement)f1.conn.prepareStatement(sql);
           
            ResultSet rs=(ResultSet)st.executeQuery(sql);
            while(rs.next())
            {
            	one.arr[j++]=rs.getInt(1);
            	
            }
    	     }catch(SQLException e)
    	     {
    	    	 e.printStackTrace();
    	     }
       }
		      
	    }
	   
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}

    
