package bubtjobs.com.retrofit2_demo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import bubtjobs.com.retrofit2_demo.R;

public class HomeAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acitivity);
    }

    public void post(View view) {
        startActivity(new Intent(HomeAcitivity.this,PostAcitivity.class));
    }

    public void get(View view) {
        startActivity(new Intent(HomeAcitivity.this,GetActivity.class));
    }

    public void delete(View view) {
        startActivity(new Intent(HomeAcitivity.this,DeleteAcitivt.class));
    }
}
