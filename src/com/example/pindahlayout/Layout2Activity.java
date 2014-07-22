package com.example.pindahlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Layout2Activity extends ActionBarActivity{
	private Button button_kembali;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout2);

		button_kembali = (Button) findViewById(R.id.button_kembali);
		button_kembali.setOnClickListener(new OnClickListener() {

		public void onClick(View v) {

			Intent intent = new Intent(v.getContext(), MainActivity.class);
			startActivityForResult(intent, 0);
		}
		});

		}
}
