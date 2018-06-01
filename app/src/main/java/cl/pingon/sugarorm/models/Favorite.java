package cl.pingon.sugarorm.models;

import com.orm.SugarRecord;

public class Favorite extends SugarRecord {

    private String url;
    private boolean user;

    public Favorite() {
    }

    public Favorite(String url, boolean user) {
        this.url = url;
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }
}
