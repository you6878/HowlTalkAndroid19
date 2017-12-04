package com.bpplatform.myeongsic.howltalk.model;

/**
 * Created by myeongsic on 2017. 12. 4..
 */

public class NotificationModel {

    public String to;

    public Notification notification = new Notification();

    public static class Notification {
        public String title;
        public String text;
    }
}
