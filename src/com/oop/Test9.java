package com.oop;

public class Test9 {
    public static void main (String[] args) {
        User user = CreateUer();
        user.setUsername("smc2");
        System.out.println(user.getUser());
    }

    public static User CreateUer () {
        User user = new User(1, "smc");
        UserClass userClass = new UserClass("前端", 3);
        UserJob userJob = new UserJob("Vue", "开发");

        user.setUserClass(userClass);
        user.setUserJob(userJob);

        return user;
    }
}
