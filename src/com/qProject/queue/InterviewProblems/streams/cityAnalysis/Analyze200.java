package com.qProject.queue.InterviewProblems.streams.cityAnalysis;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Analyze200 {
    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>();
        List<String> countryList = new ArrayList<>();
        List<String> adminNameList = new ArrayList<>();
        List<String> populationList = new ArrayList<>();

        String csvFilePath = "C:\\Users\\Administrator\\Documents\\softwares\\customQ\\src\\com\\qProject\\queue\\InterviewProblems\\streams\\cityAnalysis\\city.csv";
        List<AnalyzeCity.City> cities = new ArrayList<>();
        File file = new File(csvFilePath);
        System.out.println("  file exists? -> "+file.exists());
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
                    cityList.add(data[0].trim());
                    countryList.add(data[4].trim());
                    adminNameList.add(data[7].trim());
                    populationList.add(data[9].trim());
                }

            }
//            analyzeCityAndCountry(cityList, countryList);
            analyzeCityAndPopulation(cityList, populationList);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void analyzeCityAndCountry(List<String> cities, List<String> countries) {
        Map<String, List<String>> cityCountryMap = new HashMap<>();
        if(cities.size() != countries.size()){
            System.out.println("Both list are diff in size "+ cities.size() + " country size "+ countries.size());
        } else {
            for(int i = 0; i < cities.size(); i++) {
                String city = cities.get(i);
                String country = countries.get(i);
                cityCountryMap.putIfAbsent(country, new ArrayList<>());
                cityCountryMap.get(country).add(city);
            }
        }
        cityCountryMap.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e1.getValue().size(), e2.getValue().size()))
                .forEach(entry -> System.out.println(entry.getKey() + "has "+ entry.getValue().size() + " number of cities"));
    }

    public static void analyzeCityAndPopulation(List<String> cities, List<String> population){
        Map<String, Integer> cityPopulation = new HashMap<>();
        Integer max_population = Integer.MIN_VALUE;
        String city;
        String max_populated_city = "";
        for (int i= 0; i< cities.size(); i++){
            city = cities.get(i);
            String tempPopulation = population.get(i);
            tempPopulation = tempPopulation.replace("\"", "");
            if (tempPopulation.matches("-?\\d+")){
                Integer cPopulation = Integer.parseInt(tempPopulation);
                if(cPopulation > 1000){
                    if (cPopulation > max_population){
                        max_population = max_population;
                        max_populated_city = city;
                    }
                    cityPopulation.putIfAbsent(city, cPopulation);
                }
            }

        }
        System.out.println("City with max population "+ max_populated_city + " -- "+max_population);
//        cityPopulation.entrySet().stream().forEach(entry -> System.out.println(" city "+ entry.getKey()+ " has population "+ entry.getValue()));


    }

}
