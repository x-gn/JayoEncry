package com.zz.jayo.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class CacheFile {

	
	public CacheFile() {
		
	}
	
	private static void Save(Context context,String k,String v){
			
			//读取SharedPreferences中的数据：
			SharedPreferences sharedPreferences = context.getSharedPreferences("MOYODUID", Context.MODE_PRIVATE);
			//getString()第二个参数为缺省值，如果preference中不存在该key，将返回缺省值
			String v = sharedPreferences.getString(k, "");
			
			if(!StringUtility.isNullOrEmpty(v))
			{
				v = AESHelper.decrypt(uuid);
			}
			if(targetUUID!=uuid && !StringUtility.isNullOrEmpty(targetUUID))
			{ 
				sharedPreferences = context.getSharedPreferences("MOYODUID", Context.MODE_PRIVATE);		//创建数据编辑器
				Editor editor = sharedPreferences.edit();		//传递需要保存的数据			
				editor.clear();			
				editor.putString("did",com.moyougames.moyosdk.common.utils.AESHelper.encrypt(targetUUID));		//保存数据		
				editor.commit();
				}
	}
	

}
