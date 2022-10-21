package com.shaifsalehin.photoreel;

public class Photo {
    private String id;
    private String pname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Photo() {

    }

    public Photo(String id, String pname) {
        this.id = id;
        this.pname = pname;
    }
}
