/*
 *  Copyright (c) 2016 Jalilur Rahman. All Rights Reserved.
 *   <p>
 *   Save to the extent permitted by law, you may not use, copy, modify,
 *    distribute or create derivative works of this material or any part
 *    of it without the prior written consent of Jalilur Rahman.
 *    <p>
 *    The above copyright notice and this permission notice shall be included in
 *    all copies or substantial portions of the Software.
 */

package bubtjobs.com.retrofit2_demo.callback;

import java.util.List;

import bubtjobs.com.retrofit2_demo.model.DeleteResponse;
import bubtjobs.com.retrofit2_demo.model.Flower;
import bubtjobs.com.retrofit2_demo.model.PostResponse;
import bubtjobs.com.retrofit2_demo.model.ProductList;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author Jalilur Rahman
 * @version 1.0.0
 * @date today
 */
public interface Service {

    @GET("/feeds/flowers.json")
    Call<List<Flower>> getAllFlowers();

    // post service
    @FormUrlEncoded
    @POST("create_product.php")
    Call<PostResponse> postService(@Field("name") String name,@Field("price") String price,@Field("description") String description);

    // get service
    @GET("get_all_products.php")
    Call<ProductList>getAllProduct();

    // delete
    @FormUrlEncoded
    @POST("delete_product.php")
    Call<DeleteResponse>  deleteItem(@Field("id") String itemId);

}
