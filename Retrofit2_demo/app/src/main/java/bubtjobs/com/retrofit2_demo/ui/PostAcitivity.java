package bubtjobs.com.retrofit2_demo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import bubtjobs.com.retrofit2_demo.R;
import bubtjobs.com.retrofit2_demo.controller.RestManager;
import bubtjobs.com.retrofit2_demo.model.Flower;
import bubtjobs.com.retrofit2_demo.model.PostResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostAcitivity extends AppCompatActivity {

    private RestManager mManager;
    EditText name,price,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_acitivity);

        name = (EditText)findViewById(R.id.name);
        price = (EditText)findViewById(R.id.price);
        description = (EditText)findViewById(R.id.description);
    }

    public void insertProuduct(View view) {
        mManager=new RestManager();

        Call<PostResponse> postResponseCll = mManager.getService().postService(name.getText().toString(),price.getText().toString(),description.getText().toString());
        postResponseCll.enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {
                if(response.isSuccessful())
                {
                    PostResponse postResponse = response.body();

                    Log.d("murtuza",postResponse.getSuccess()+" "+postResponse.getMessage());

                    if(postResponse.getSuccess().equals("1"))
                    {
                        Toast.makeText(PostAcitivity.this, "Insert Successfull", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(PostAcitivity.this, "Insert Failed", Toast.LENGTH_SHORT).show();

                    }
                }
                else{
                    Log.d("murtuza","not success");

                }
            }

            @Override
            public void onFailure(Call<PostResponse> call, Throwable t) {
                Log.d("murtuza","error");
            }
        });

    }
}
