package com.qProject.queue.InterviewProblems.misc.customAnnotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class VerifyAnnotation {
    public void checkIfSerializable(Object object) throws JsonSerializableException {
        if(Objects.isNull(object)){
            throw new JsonSerializableException(" The object is not serializable");
        }

        Class<?> clasz = object.getClass();
        if(!clasz.isAnnotationPresent(JsonSerializable.class)) {
            throw new JsonSerializableException("The class "+ clasz.getSimpleName()+ " is not allowed here");
        }
    }

    public void initializeObject(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        for(Method method: clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(InitMethodLevel.class)){
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    public String getJsonString(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Map<String, String> jsonElementMap = new HashMap<>();
        for(Field field: clazz.getDeclaredFields()){
            field.setAccessible(true);
            if(field.isAnnotationPresent(JsonElement.class)){
                jsonElementMap.put((String) field.get(object), (String) field.getName());
            }
        }

        String jsonString = jsonElementMap.entrySet()
                .stream()
                .map(entry -> "\""+entry.getKey() + "\":\""+ entry.getValue()+"\"" )
                .collect(Collectors.joining(","));
        return "{"+jsonString+"}";
    }
}
