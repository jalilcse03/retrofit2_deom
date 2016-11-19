package bubtjobs.com.retrofit2_demo.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by murtuza on 11/19/2016.
 */

public class DeleteResponse implements Serializable {
    @Expose
    private String success;
    @Expose
    private String message;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
