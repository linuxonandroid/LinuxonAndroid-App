/*
 * Copyright (C) 2012 linuxonandroid.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zpwebsites.linuxonandroid.opensource;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Install_Backtrack_4 extends DashboardActivity {

	private Button		btn_Back			= null;
	private Button		btn_Finish			= null;
	private ImageButton	btn_donationad		= null;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			setContentView (R.layout.install_backtrack_4);
		
		setTitleFromActivityLabel (R.id.title_text);

		btn_Back = (Button) findViewById(R.id.btn_Back);
		btn_Finish = (Button) findViewById(R.id.btn_Finish);
		btn_donationad		= (ImageButton) findViewById(R.id.btn_donationad);
		
		btn_Back.setOnClickListener	(btn_Back_onClick);
		btn_Finish.setOnClickListener(btn_Finish_onClick);
		btn_donationad		.setOnClickListener (btn_donationad_onClick);	
		
	    
	}
	private OnClickListener btn_donationad_onClick = new OnClickListener() {
		public void onClick(View v) {
			gotoLink(CFG.playStoreURL_donation);
		}
	};
	private OnClickListener btn_Finish_onClick = new OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent(v.getContext(), HomeActivity.class);
			v.getContext().startActivity(intent);
		}
	};

	private OnClickListener btn_Back_onClick = new OnClickListener() {
		public void onClick(View v) {
			finish();
		}
	};
	private void gotoLink(String linkAdr) {
		Intent intent = new Intent("android.intent.action.VIEW");
		intent.setData(Uri.parse(linkAdr));
		startActivity(intent);
	}

} // end class