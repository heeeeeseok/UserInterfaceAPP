package com.echo.echofarm.Data.Entity;

import android.net.Uri;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Post {

    private String uid;
    private String title;
    private String contents;
    private String ownProduct;
    private List<String> ownTag;
    private String wantProduct;
    private List<String> wantTag;
    private boolean allowOther;
    private Date nowTime;

    public Post() {
        nowTime = new Date();
    }

    public Post(String uid, String title, List<Uri> imgSrc, String contents, String ownProduct, List<String> ownTag,
                String wantProduct, List<String> wantTag, boolean allowOther) {
        this.uid = uid;
        this.title = title;
        this.contents = contents;
        this.ownProduct = ownProduct;
        this.ownTag = ownTag;
        this.wantProduct = wantProduct;
        this.wantTag = wantTag;
        this.allowOther = allowOther;

        nowTime = new Date();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getOwnProduct() {
        return ownProduct;
    }

    public void setOwnProduct(String ownProduct) {
        this.ownProduct = ownProduct;
    }

    public List<String> getOwnTag() {
        return ownTag;
    }

    public void setOwnTag(List<String> ownTag) {
        this.ownTag = ownTag;
    }

    public String getWantProduct() {
        return wantProduct;
    }

    public void setWantProduct(String wantProduct) {
        this.wantProduct = wantProduct;
    }

    public List<String> getWantTag() {
        return wantTag;
    }

    public void setWantTag(List<String> wantTag) {
        this.wantTag = wantTag;
    }

    public boolean isAllowOther() {
        return allowOther;
    }

    public void setAllowOther(boolean allowOther) {
        this.allowOther = allowOther;
    }

    public Date getNowTime() {return nowTime;}

    @Override
    public String toString() {
        return "Post{" +
                "uid='" + uid + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", ownProduct='" + ownProduct + '\'' +
                ", ownTag=" + ownTag +
                ", wantProduct='" + wantProduct + '\'' +
                ", wantTag=" + wantTag +
                ", allowOther=" + allowOther +
                ", nowTime=" + nowTime +
                '}';
    }
}
