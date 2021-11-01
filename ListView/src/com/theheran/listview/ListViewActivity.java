package com.theheran.listview;

import com.theheran.listview.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Ambil Data dan di simpan dalam bentuk Array
        String[] adobe_products = getResources().getStringArray(R.array.theHeranList);
        
        // Konversi array ke adalam listAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, adobe_products));
        
        ListView lv = getListView();

        // Fungsi klik pada list
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
        	  
        	  // Memilih item
        	  String product = ((TextView) view).getText().toString();
        	  
        	  //memanggil aktivity baru ketika salah satu list di pilih
        	  Intent i = new Intent(getApplicationContext(), SingleList.class);
        	  // mengirim data ke ke aktivity baru dengan kata kunci "kategori"
        	  i.putExtra("kategori", product);
        	  startActivity(i);
        	
          }
        });
    }
}