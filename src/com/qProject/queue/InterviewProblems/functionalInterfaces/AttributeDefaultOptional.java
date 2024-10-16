package com.qProject.queue.InterviewProblems.functionalInterfaces;
import static java.util.Optional.ofNullable;
public class AttributeDefaultOptional {
    static class Developer {
        private String name;

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", language='" + language + '\'' +
                    '}';
        }

        private String language;
        public Developer(String name, String language){
            this.name = ofNullable(name).orElse("priyanshu")
                    .toUpperCase();
            this.language = ofNullable(name).orElse("java");

        }

    }

    public static void main(String[] args) {
        var dev = new Developer(null, null);
        System.out.println(dev.toString());

    }
}
