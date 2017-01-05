package com.example.listview4;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
//import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener {
	
	EditText txtSearch;
	ListView lv;
	ArrayList<STudent> list = new ArrayList<STudent>();
	ArrayList<STudent> source = new ArrayList<STudent>();
	MyAdapter adapter;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lv=(ListView)this.findViewById(R.id.listView1);
        adapter=new MyAdapter(this,list);
        this.lv.setAdapter(adapter);
        //
        source.add(new STudent(R.drawable.img1,"Alpha, Bravo","BSIT"));
        source.add(new STudent(R.drawable.img2,"Charlie, Hotel","BSIT"));
        source.add(new STudent(R.drawable.img3,"Mike, India","BSIT"));
        source.add(new STudent(R.drawable.img4,"November, Kilo","BSIT"));
        source.add(new STudent(R.drawable.img5,"Oscar, Quebec","BSIT"));
        source.add(new STudent(R.drawable.img6,"Zulu, Uniform","BSIT"));
        source.add(new STudent(R.drawable.img7,"Delta, Tango","BSIT"));
        source.add(new STudent(R.drawable.img8,"Juliet, Sierra","BSIT"));     
        
        this.lv.setOnItemClickListener(this);
        this.txtSearch.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}});
    }
 
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder=new AlertDialog.Builder(this);
		builder.setTitle(list.get(arg2).getStudentName());
		
		ImageView myiv=new ImageView(this);
			myiv.setImageResource(list.get(arg2).getImage());
		TextView myname=new TextView(this);
			myname.setText(list.get(arg2).getStudentName());
		TextView mycourse=new TextView(this);
			mycourse.setText(list.get(arg2).getCourse());
		
		LinearLayout mainLayout=new LinearLayout(this);	
				mainLayout.setOrientation(LinearLayout.HORIZONTAL);
				mainLayout.addView(myiv);
				
		LinearLayout subLayout=new LinearLayout(this);
			subLayout.setOrientation(LinearLayout.VERTICAL);
			subLayout.addView(myname);
			subLayout.addView(mycourse);
			
			mainLayout.addView(subLayout);
			
			builder.setView(mainLayout);
			builder.setNeutralButton("Okey", null);
			
	AlertDialog dialog=builder.create();
		dialog.show();
	}
    
}
