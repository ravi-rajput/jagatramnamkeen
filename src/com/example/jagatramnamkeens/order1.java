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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;  
import android.widget.TextView;  
import android.widget.Toast;  
  

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;



		
		public class order1 extends Fragment 
	{  
			TextView a,e,a3,a4,a2;
		
			long x1;

			int x2,x3,x4;
			String z5;
			String s1;
     		String z2;
String za1,za2,za3,za4;
			 String[] menu;
		     String[] s;
		     DrawerLayout dLayout,dlayout1;
		     ListView dList,dList1;
		    public ArrayAdapter<String> adapter,adapter1;
		    
		      
		     public View onCreateView(LayoutInflater inflater, ViewGroup container,
		    			Bundle savedInstanceState) {
		    		// TODO Auto-generated method stub
		    		View v= inflater.inflate(R.layout.order1, container,false);
		        
		    		e=(TextView) v.findViewById(R.id.textView1);
		    	    
			    	a=(TextView) v.findViewById(R.id.editText1);
			    	a3=(TextView) v.findViewById(R.id.editText3);
			    	a2=(TextView) v.findViewById(R.id.editText2);
			    	
			    	a4=(TextView) v.findViewById(R.id.editText5);
			    
			   	 result o5=new result();
		    	   z5= o5.result();
		    	    	e.setText(z5);
		    	
			    	
			    	result1 o1=new result1();
			    	   s1= o1.result();
			    	  
			    	a3.setText(s1);
			    	    
			    	result2 o2=new result2();
			    	   x1= o2.result();
			    	   za2=x1+"";
			    	
			    	a4.setText(za2);
			    	    
				    
			    	result3 o6=new result3();
			    	   za3= o6.result();
			    	    	a.setText(za3);
			    	
			    	
		    	
			    	    	result4 o4=new result4();
					    	   za4= o4.result();
					    	    	a2.setText(za4);
					    
				
				
				
		    	
		    		
		   	 menu = new String[]{"HOME","NAMKEENS","SOANPAPRI"};
		   
	         dLayout = (DrawerLayout) v.findViewById(R.id.drawer_layout);
	         
	         
	         dList = (ListView) v.findViewById(R.id.left_drawer);
	         
	         
	          ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1 , menu);
	         
	         
	         dList.setAdapter(adapter);
	         dList.setSelector(android.R.color.holo_blue_dark);
	        
	         dList.setOnItemClickListener(
	                 new AdapterView.OnItemClickListener() {
	                     @Override
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
				