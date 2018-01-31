package oo.cc;

import java.io.Serializable;

/**
 * Created by laiis on 2017/5/31.
 */
@SuppressWarnings("serial")
public class TestModel implements Serializable {

    private String title;
    private String message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
