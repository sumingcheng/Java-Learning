package com.oop;

public class Test9 {
    public static void main (String[] args) {
        User user = CreateUer();
    }

    public static User CreateUer () {
        User user = new Urls(1, 'smc');
        UserClass userClass = new UserClass("前端", 3);
        UserJob userJob = new UserJob("Vue", '开发');

        user.setUserClass(userClass);
        user.setUserJob(userJob);

        return user;
    }
}
