package com.oop;

public class User {
    private long uid;
    private String username;

    private UserClass userClass;
    private UserJob userJob;

    public User () {
    }

    public User (long uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public long getUid () {
        return uid;
    }

    public void setUid (long uid) {
        this.uid = uid;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public UserClass getUserClass () {
        return userClass;
    }

    public void setUserClass (UserClass userClass) {
        this.userClass = userClass;
    }

    public UserJob getUserJob () {
        return userJob;
    }

    public void setUserJob (UserJob userJob) {
        this.userJob = userJob;
    }

    public String getUser () {
        return "{\n"
                + "  uid:\"" + uid + "\",\n"
                + "  username:" + username + "\",\n"
                + "  userClass:{\n"
                + "    name:\"" + userClass.getName() + "\",\n"
                + "    order:\"" + userClass.getOrder() + "\"\n"
                + "  },\n"
                + "  userJob:{\n"
                + "    company:\"" + userJob.getCompany() + "\",\n"
                + "    department:\"" + userJob.getDepartment() + "\"\n"
                + "  }\n"
                + "}\n";
    }
}
