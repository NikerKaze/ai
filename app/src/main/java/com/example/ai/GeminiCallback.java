package com.example.ai;

public interface GeminiCallback {
    public void onSuccess(String result);
    public void onFailure(Throwable error);
}