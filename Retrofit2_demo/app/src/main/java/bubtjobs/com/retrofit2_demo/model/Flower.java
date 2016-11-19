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

package bubtjobs.com.retrofit2_demo.model;

import android.graphics.Bitmap;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * @author Jalilur Rahman
 * @version 1.0.0
 * @date today
 */
public class Flower implements Serializable { // implements Serializable is not necessary

    @Expose
    private String category;
    @Expose
    private String instructions;
    @Expose
    private String photo;
    @Expose
    private String name;
    @Expose
    private int productId;
    @Expose
    private double price;
    private boolean isFromDatabase;
    private Bitmap picture;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFromDatabase() {
        return isFromDatabase;
    }

    public void setIsFromDatabase(boolean isFromDatabase) {
        this.isFromDatabase = isFromDatabase;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }
}
