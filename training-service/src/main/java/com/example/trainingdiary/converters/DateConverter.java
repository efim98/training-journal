//package com.example.trainingdiary.converters;
//
//import jakarta.persistence.Converter;
//
//import javax.persistence.AttributeConverter;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@Converter
//public class DateConverter implements AttributeConverter<Date,String> {
//    @Override
//    public String convertToDatabaseColumn(Date date) {
//        return new SimpleDateFormat("yyyyMMdd").format(date);
//    }
//
//    @Override
//    public Date convertToEntityAttribute(String s) {
//        try{
//            return new SimpleDateFormat("yyyyMMdd").parse(s);
//        }
//        catch(ParseException ex){
//            return null;
//        }
//    }
//}