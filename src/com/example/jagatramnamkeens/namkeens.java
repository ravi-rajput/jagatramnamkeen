package com.example.jagatramnamkeens;






import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
 
public class namkeens extends Activity {
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	 String[] menu;
     String[] s;
     DrawerLayout dLayout,dlayout1;
     ListView dList,dList1;
     ArrayAdapter<String> adapter,adapter1;
     Button b1a;
     String zz;
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from activity_main.xml
		setContentView(R.layout.namkeens);
		
		
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
		b7=(Button)findViewById(R.id.button7);
		b8=(Button)findViewById(R.id.button8);
		b9=(Button)findViewById(R.id.button9);
		b10=(Button)findViewById(R.id.button10);
		b11=(Button)findViewById(R.id.button11);
		b12=(Button)findViewById(R.id.button12);
		b13=(Button)findViewById(R.id.button13);

	
		
		
		
b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				 result o4=new result();
			     o4.add("chandpuri, 120/kg");
			   
				
			     FragmentManager fm = getFragmentManager();
		         FragmentTransaction ft = fm.beginTransaction();
		        order f1 = (order) fm.findFragmentByTag("tag");

		         if(f1 == null) {  // not added
		             f1 = new order();
		             ft.add(R.id.india1, f1, "tag");
		             ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

		         } else {  // already added

		             ft.remove(f1);
		             ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
		         }

		         ft.commit();}   });

b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		

		 result o4=new result();
	     o4.add("AALO BHUJIA, 140/kg");
	   
		
	     
		
		 FragmentManager fm = getFragmentManager();
         FragmentTransaction ft = fm.beginTransaction();
        order f = (order) fm.findFragmentByTag("tag");

         if(f == null) {  // not added
             f = new order();
             ft.add(R.id.india2, f, "tag");
             ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

         } else {  // already added

             ft.remove(f);
             ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
         }

         ft.commit();}   });

b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		
		 result o4=new result();
	     o4.add("PALAK MIX, 120/kg");
		
	     
		 FragmentManager fm = getFragmentManager();
         FragmentTransaction ft = fm.beginTransaction();
        order f = (order) fm.findFragmentByTag("tag");

         if(f == null) {  // not added
             f = new order();
             ft.add(R.id.india3, f, "tag");
             ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

         } else {  // already added

             ft.remove(f);
             ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
         }

         ft.commit();}   });
b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		 result o4=new result();
	     o4.add("PRIYA, 120/kg");

	     
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india4, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		
		 result o4=new result();
	     o4.add("TASTY, 140/kg");
			
	     
	    
		
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india5, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		 result o4=new result();
	     o4.add("BHUJIA, 120/kg");

	     
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india6, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {


		 result o4=new result();
	     o4.add("CHANA DAAL, 140/kg");
	     
		
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india7, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		 result o4=new result();
	     o4.add("MUNG DAAL, 160/kg");

	     
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india8, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
	
b9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		 result o4=new result();
	     o4.add("GOLD, 140/kg");

	     
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india9, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b10.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		 result o4=new result();
	     o4.add("DAAL MOTH, 100/kg");

	     
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india10, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b11.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {


		 result o4=new result();
	     o4.add("MATHRI, 120/kg");

	     
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india11, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });
b12.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		
		 result o4=new result();
	     o4.add("FOR FAST, 140/kg");

	    
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india12, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });

b13.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

		 result o4=new result();
	     o4.add("NAVRATNA, 120/kg");

	    
		FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
       order f1 = (order) fm.findFragmentByTag("tag");

        if(f1 == null) {  // not added
            f1 = new order();
            ft.add(R.id.india13, f1, "tag");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        } else {  // already added

            ft.remove(f1);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        }

        ft.commit();}   });

		
		 menu = new String[]{"HOME","NAMKEENS","SOANPAPRI","ABOUT US"};
	        
		    
         dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
         
         
         dList = (ListView) findViewById(R.id.left_drawer);
         
         
         
         adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
         
         dList.setAdapter(adapter);
         dList.setSelector(android.R.color.holo_blue_dark);
        
         dList.setOnItemClickListener(
                 new AdapterView.OnItemClickListener() {
                     @Override
                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         	  if (position == 0) {
                       
      			 Intent i= new Intent(namkeens.this,MainActivity.class);
      	            startActivity(i);
      	        }
         	  if (position == 1) {
                   
       			 Intent i= new Intent(namkeens.this,namkeens.class);
       	            startActivity(i);
       	        }
          	  if (position == 2) {
                   
       			 Intent i= new Intent(namkeens.this,soanpapri.class);
       	            startActivity(i);
       	        }
          	 if (position == 3) {
                 
       			 Intent i= new Intent(namkeens.this,aboutus.class);
       	            startActivity(i);
       	        }
         	
         	 }  });

                
            
                  }


          
}
