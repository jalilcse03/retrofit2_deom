package bubtjobs.com.retrofit2_demo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.squareup.picasso.Downloader;

import bubtjobs.com.retrofit2_demo.R;
import bubtjobs.com.retrofit2_demo.controller.RestManager;
import bubtjobs.com.retrofit2_demo.model.DeleteResponse;
import bubtjobs.com.retrofit2_demo.model.PostResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeleteAcitivt extends AppCompatActivity {
    private RestManager mManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_acitivt);

        final Button dele = (Button)findViewById(R.id.dele);

        dele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mManager=new RestManager();

                Call<DeleteResponse>  deleteItem = mManager.getService().deleteItem("1");

                deleteItem.enqueue(new Callback<DeleteResponse>() {
                    @Override
                    public void onResponse(Call<DeleteResponse> call, Response<DeleteResponse> response) {
                        if(response.isSuccessful())
                        {
                            DeleteResponse postResponse = response.body();

                            Log.d("murtuza",postResponse.getSuccess()+" "+postResponse.getMessage());

                            if(postResponse.getSuccess().equals("1"))
                            {
                                Toast.makeText(DeleteAcitivt.this, "Delete Successfull", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(DeleteAcitivt.this, "Delete Failed", Toast.LENGTH_SHORT).show();

                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<DeleteResponse> call, Throwable t) {
                        Toast.makeText(DeleteAcitivt.this, ""+t.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }}




