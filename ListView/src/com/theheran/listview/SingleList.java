package com.theheran.listview;

import com.theheran.listview.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleList extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_view);
        
        TextView txtProduct = (TextView) findViewById(R.id.kategori_label);
        
        Intent i = getIntent();
        //Menerima data yang di kirim. 
        String product = i.getStringExtra("kategori");
        // Menampilkan data yang sudah di pilih
        txtProduct.setText(product);
        
	}
}
