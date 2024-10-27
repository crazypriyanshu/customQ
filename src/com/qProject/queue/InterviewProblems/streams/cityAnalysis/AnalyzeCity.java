package com.qProject.queue.InterviewProblems.streams.cityAnalysis;
import com.qProject.queue.InterviewProblems.stacks.ListNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnalyzeCity {
    public static class City{
        String city;
        String country;
        City(String city, String country){
            this.city = city;
            this.country = country;
        }
        @Override
        public String toString(){
            return city;
        }
    }

    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\Administrator\\Documents\\softwares\\customQ\\src\\com\\qProject\\queue\\InterviewProblems\\streams\\cityAnalysis\\city.csv";
        List<City> cities = new ArrayList<>();
        File file = new File(csvFilePath);
        System.out.println(" If file exists "+file.exists());
        try{

            BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(",");
                if (data.length >= 5 ) {
                    String cityName = data[0].trim();
                    String countryName = data[4].trim();
                    cities.add(new City(cityName, countryName));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Map<String, List<City>> citiesByCountry = cities.stream()
                .collect(Collectors.groupingBy(city -> city.country));
        citiesByCountry.forEach((country, city) -> {
            System.out.println("Country: "+country);
            System.out.println("Cities: "+city);
            System.out.println();
        });
    }
}
