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

package bubtjobs.com.retrofit2_demo.controller;

import bubtjobs.com.retrofit2_demo.callback.Service;
import bubtjobs.com.retrofit2_demo.helper.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Jalilur Rahman
 * @version 1.0.0
 * @date today
 */
public class RestManager {
    private Service mService;

    public Service getService(){

        if(mService==null)
        {
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(Constants.HTTP.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mService=retrofit.create(Service.class);
        }
        return mService;
    }
}
