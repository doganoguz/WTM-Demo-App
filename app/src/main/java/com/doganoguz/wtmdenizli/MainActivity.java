/* DOGAN OGUZ - GDG Cloud Izmir - GDG Izmir 2020*/

package com.doganoguz.wtmdenizli;

import android.os.Bundle;

import com.doganoguz.wtmdenizli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtSayi1=(EditText)findViewById(R.id.sayi1);
        final EditText txtSayi2=(EditText)findViewById(R.id.sayi2);
        final TextView txtSonuc=(TextView)findViewById(R.id.sonuc);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText txtSayi1=(EditText)findViewById(R.id.sayi1);
                txtSayi1.setText("");
                final EditText txtSayi2=(EditText)findViewById(R.id.sayi2);
                txtSayi2.setText("");
                final TextView tvSonuc=(TextView)findViewById(R.id.sonuc);
                txtSonuc.setText("");

            }
        });


        Button btnHesapla=(Button)findViewById(R.id.hesapla);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                float sayi1f=Float.parseFloat(txtSayi1.getText().toString());
                float sayi2f=Float.parseFloat(txtSayi2.getText().toString());

                txtSonuc.setText(String.valueOf(sayi1f+sayi2f));
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
