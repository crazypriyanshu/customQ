package com.qProject.queue.InterviewProblems.designPatterns.builder;

public class Car {
    private String engine;
    private String transmission;

    // optional fields
    private boolean sunroof;
    private boolean navigationSystem;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.sunroof = builder.sunroof;
        this.navigationSystem= builder.navigationSystem;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(boolean navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    //
    public static class CarBuilder {
        // req fields
        private String engine;
        private String transmission;

        // optional fields
        private boolean sunroof;
        private boolean navigationSystem;

        // Constructor for req fields
        public CarBuilder(String engine, String transmission){
            this.engine = engine;
            this.transmission = transmission;
        }

        public CarBuilder setSunroof(boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setNavigationSystem(boolean navigationSystem){
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
