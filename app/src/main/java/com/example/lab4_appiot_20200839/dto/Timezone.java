package com.example.lab4_appiot_20200839.dto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Timezone {
    @SerializedName("offset")
    @Expose
    private String offset;
    @SerializedName("description")
    @Expose
    private String description;

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
