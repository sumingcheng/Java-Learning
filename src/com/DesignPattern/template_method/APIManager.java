package com.DesignPattern.template_method;

/*
 * 模板方法
 * */
abstract class APIManager {
    public void accessAPI (String apiName) {
        if (!loginAction()) {
            accessAPI(apiName);
            return;
        }
        callAPI(apiName);
    }

    protected abstract boolean loginAction ();

    protected abstract void callAPI (String apiName);
}
