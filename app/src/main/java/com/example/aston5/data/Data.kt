package com.example.aston5.data

import android.widget.Toast
import com.example.aston5.user.User
import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.FakerConfig
import io.github.serpro69.kfaker.fakerConfig
import kotlin.random.Random

 class Data {

     companion object Factory {
          var users: List<User>
         init{
         val faker = Faker()
         users  = listOf<User>(
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,
         User(faker.name.firstName(),faker.name.lastName(), faker.phoneNumber.phoneNumber()) ,

         )

     }


 }
}