package com.company;


import org.json.JSONObject;


public class UserRegistration {


    JSONObject jsonObject;


        public UserRegistration(JSONObject jsonObject){

            this.jsonObject=jsonObject;
            getUserRegistration();
        }

       public void getUserRegistration(){

          if(jsonObject.isEmpty()){

              //сообщение клиенту об ошибке запроса
          }




        CheckUserData checkUserData = new CheckUserData(jsonObject);

        if(checkUserData.errorLogs!=null){

            checkUserData.errorLogs.forEach(System.out::println);

            //отправlяем в клиент ошибки


        }


        //отправка на сервер информации, если нету ошибок


      }







    }




