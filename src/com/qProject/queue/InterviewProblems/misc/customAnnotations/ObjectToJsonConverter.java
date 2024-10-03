package com.qProject.queue.InterviewProblems.misc.customAnnotations;

import java.lang.reflect.InvocationTargetException;

public class ObjectToJsonConverter {
    ObjectToJsonConverter(VerifyAnnotation verifyAnnotation){
        this.verifyAnnotation = verifyAnnotation;
    }
    VerifyAnnotation verifyAnnotation;
    public String convertToJson(Object object) throws JsonSerializableException {
        try{
            verifyAnnotation.checkIfSerializable(object);
            verifyAnnotation.initializeObject(object);
            return verifyAnnotation.getJsonString(object);
        } catch (JsonSerializableException e) {
            throw new JsonSerializableException(e.getMessage());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws JsonSerializableException {
        VerifyAnnotation verifyAnnotation1 = new VerifyAnnotation();
        Person person = new Person();
        person.setFirstname("Priyanshu");
        person.setAge("Das");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter(verifyAnnotation1);
        String jsonString = serializer.convertToJson(person);
        System.out.println(jsonString);

    }
}
