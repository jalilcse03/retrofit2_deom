package bubtjobs.com.retrofit2_demo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import bubtjobs.com.retrofit2_demo.R;
import bubtjobs.com.retrofit2_demo.controller.RestManager;
import bubtjobs.com.retrofit2_demo.model.Product;
import bubtjobs.com.retrofit2_demo.model.ProductList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetActivity extends AppCompatActivity {
    private RestManager mManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);
    }

    public void getAllData(View view) {
        mManager=new RestManager();

        Call<ProductList> productList=mManager.getService().getAllProduct();

        productList.enqueue(new Callback<ProductList>() {
            @Override
            public void onResponse(Call<ProductList> call, Response<ProductList> response) {
                Log.d("murtuza","ok");
                if(response.isSuccessful())
                {
                    ProductList productList = response.body();

                    if(productList.getSuccess() == 1)
                    {
                        List<Product> product = productList.getProducts();
                        for(int i=0;i<product.size();i++)
                        {
                            Log.d("murtuza","id = "+product.get(i).getId()+" name = "+product.get(i).getName()+" get decription = "+product.get(i).getDescription());
                        }
                    }
                    else{
                        Toast.makeText(GetActivity.this, "No Product", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(GetActivity.this, "No Product", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ProductList> call, Throwable t) {
                Log.d("murtuza",""+t.toString());
                Toast.makeText(GetActivity.this, ""+t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
