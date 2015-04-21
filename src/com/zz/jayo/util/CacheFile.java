package com.zz.jayo.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class CacheFile {

	
	private static String tagString = "cache.sx";
 	
	public static void Put(Context context,String k,String v){	 
			SharedPreferences sharedPreferences = context.getSharedPreferences(tagString, Context.MODE_PRIVATE);		 	 
			sharedPreferences = context.getSharedPreferences(tagString, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();			
			editor.putString(k,v);		
			editor.commit();				 
	}	
	
	public static String Get(Context context,String k){		
		SharedPreferences sharedPreferences = context.getSharedPreferences(tagString, Context.MODE_PRIVATE);		
		String v = sharedPreferences.getString(k, "");		
		if(StringUtility.isNullOrEmpty(v)){
			v = "";
		}
		return v; 		 
	}

}
