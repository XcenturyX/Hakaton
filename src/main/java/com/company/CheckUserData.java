package com.company;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

public class CheckUserData {

     JSONObject jsonObject;

     public ArrayList<String> errorLogs=new ArrayList<>();



     public  CheckUserData(JSONObject jsonObject){

         this.jsonObject=jsonObject;

         EnumSet.allOf(LocaleFields.class).forEach(field->{

             checkNotNullField(String.valueOf(field));

         });


     }



     public void checkNotNullField(String key){

        try{
            jsonObject.get(key);

        } catch (JSONException e){

            errorLogs.add(  "Ошибка в поле: "+LocaleFields.valueOf(key).ruLocale+ " - поле пустое");


        }


    }



     public void checkUniquenessOfTheCompanyName (JSONObject jsonObject){




    }





}
