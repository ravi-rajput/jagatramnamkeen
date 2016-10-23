package com.example.jagatramnamkeens;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
 
public class aboutus extends Activity {
         String[] menu;
         String[] s;
         DrawerLayout dLayout;
         ListView dList;
         ArrayAdapter<String> adapter;
         Button b1a,b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
               

        menu = new String[]{"HOME","NAMKEENS","SOANPAPRI","ABOUT US"};
	     
        
            dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            
            
            dList = (ListView) findViewById(R.id.left_drawer);
            
            
            
            adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
            
            dList.setAdapter(adapter);
            dList.setSelector(android.R.color.holo_blue_light);
 
            dList.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            	  if (position == 0) {
                          
         			 Intent i= new Intent(aboutus.this,MainActivity.class);
         	            startActivity(i);
         	        }
            	  if (position == 1) {
                      
          			 Intent i= new Intent(aboutus.this,namkeens.class);
          	            startActivity(i);
          	        }
             	  if (position == 2) {
                      
          			 Intent i= new Intent(aboutus.this,soanpapri.class);
          	            startActivity(i);
          	        }
             	  if (position == 3) {
	                   
  	          		Intent intent = new Intent(aboutus.this,aboutus.class);
  	    			startActivity(intent);
  	    	 }
                        }
                        });
               
                     }


             
}
 