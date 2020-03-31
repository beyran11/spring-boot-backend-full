package com.example.takescreenshot;


public class WebCrawler {

    private String screenshotnotifier;

    public String screenShotLocation(String url){

        return "src/main/aquiredscreenshot/"+url+".png";
    }


}
