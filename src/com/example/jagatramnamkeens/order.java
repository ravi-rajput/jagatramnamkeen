package com.example.jagatramnamkeens;







import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;  
import android.view.View;  
import android.widget.AdapterView;  
import android.widget.ArrayAdapter;  
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;  
import android.widget.TextView;  
import android.widget.Toast;  
  

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;



		
		public class order extends Fragment 
	{  
			TextView e;
			Button b1;
			EditText a,a2,a3,a4;
			long x1,x2,x3,x4;
			String z5;
			String s1;
     		String z2;
String za1,za2,za3,za4;
			 String[] menu;
		     String[] s;
		     DrawerLayout dLayout,dlayout1;
		     ListView dList,dList1;
		    public ArrayAdapter<String> adapter1,adapter11;
		     Button b1a;

		      
		     public View onCreateView(LayoutInflater inflater, ViewGroup container,
		    			Bundle savedInstanceState) {
		    		// TODO Auto-generated method stub
		    		View v= inflater.inflate(R.layout.order, container,false);
		        
		    		e=(TextView) v.findViewById(R.id.textView1);
		    		
		 		 	
		    		 result o5=new result();
		    	   z5= o5.result();
		    	   
		    	
		    	e.setText(z5);
		    	    
		    	a=(EditText) v.findViewById(R.id.editText1);
		    	a2=(EditText) v.findViewById(R.id.editText2);
		    	a3=(EditText) v.findViewById(R.id.editText3);
		    	 
		    	a4=(EditText) v.findViewById(R.id.editText5);
		     
		    	
		    	b1a=(Button)v.findViewById(R.id.button1);

		    	
				
				
				
		    	b1a.setOnClickListener(new OnClickListener() {
		    				
		    				@Override
		    				public void onClick(View arg0) {

		    					  result1 o1=new result1();
		    		    	       o1.add(a3.getText().toString());
		    		    	
		    		    	   	x2=Integer.parseInt(a4.getText().toString());	
		    		    		 result2 o2=new result2();
		    		    	       o2.add(x2);
		    		    	    	
		    		    	       
		    		    	       result3 o3=new result3();
		    		    	       o3.add(a.getText().toString());
		    		    	
		    		    	       
		    		    	       result4 o4=new result4();
		    		    	       o4.add(a2.getText().toString());
		    	 
		    		    	       
		    		    	       
		    	
		    					order1 f2= new order1();
		    					FragmentManager fm=getFragmentManager();
		    					FragmentTransaction ft=fm.beginTransaction();
		    					ft.add(R.id.india,f2);
		    					ft.addToBackStack("ff1");
		    					ft.commit();
		    					// TODO Auto-generated method stub
		    					
		    				}
		    			});
		    		
		   	 menu = new String[]{"HOME","NAMKEENS","SOANPAPRI","ABOUT US"};
		   
	         dLayout = (DrawerLayout) v.findViewById(R.id.drawer_layout);
	         
	         
	         dList = (ListView) v.findViewById(R.id.left_drawer);
	         
	         
	          ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1 , menu);
	         
	         
	         dList.setAdapter(adapter);
	         dList.setSelector(android.R.color.holo_blue_dark);
	        
	         dList.setOnItemClickListener(
	                 new AdapterView.OnItemClickListener() {
	                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
	         	  if (position == 0) {
	                       
	         		 Intent intent = new Intent(getActivity(),MainActivity.class);
	     			startActivity(intent);
	     	  }
	         	  if (position == 1) {
	                   
	         		 Intent intent = new Intent(getActivity(),namkeens.class);
	     			startActivity(intent);
	     	  }
	          	  if (position == 2) {
	                   
	          		Intent intent = new Intent(getActivity(),soanpapri.class);
	    			startActivity(intent);
	    	 }
	         	 
	          	  if (position == 3) {
	                   
		          		Intent intent = new Intent(getActivity(),aboutus.class);
		    			startActivity(intent);
		    	 }
	                     }
	                 });
			return v;

	        
	            
	                  }


	          
	

		    }  
				