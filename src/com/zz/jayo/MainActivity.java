package com.zz.jayo;

 
import java.util.Date;

import com.zz.jayo.util.CacheFile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);  
		
		Button btnEnter = (Button)findViewById(R.id.btnEnter);
			
				
		    
		btnEnter.setOnClickListener(new Button.OnClickListener(){//创建监听    
            public void onClick(View v) {    
            	Intent intent =  new Intent(MainActivity.this,ItemListActivity.class);
            	intent.putExtra("skip", "我是MainActivity传过来的值！"); 
            	startActivity(intent);
            	//MainActivity.this.finish();   
            	CacheFile.Put(getApplication(), "entertime", Long.toString(new Date().getTime()/1000));
            }    
  
        }); 
	} 
	
}
    