package com.qProject.queue.InterviewProblems.interviewImportantProblems.UrlRelatedProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SpankApi {
    public static void main(String[] args) throws IOException {
        String urlString = "https://coderbyte.com/api/challenges/json/age-counting";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while((line = reader.readLine())!= null){
            response.append(line);

        }
        reader.close();


        String jsonData = response.toString();
        System.out.println(jsonData);
        int startIndex = jsonData.indexOf("\"data\":\"")+8;
        int endIndex = jsonData.lastIndexOf("\"");
        String data = jsonData.substring(startIndex, endIndex);
        System.out.println(data);
        String[] items = data.split(",");
        int count = 0;
        for (String each: items){
            if(each.startsWith(" age=")){
                Integer age = Integer.parseInt(each.split("=")[1]);
//                System.out.println(age);
                if(age >= 50){
                    count++;
                }
            }
        }
        System.out.println(" count : "+ count);

    }
}
