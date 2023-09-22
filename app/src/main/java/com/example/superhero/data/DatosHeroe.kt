package com.example.superhero.data

import com.example.superhero.R
import com.example.superhero.model.Hero

class DatosHeroe(){

    fun heroes(): List<Hero>{
         return listOf<Hero>(
             Hero(
                 nombreRes = R.string.hero1,
                 descripcionRes = R.string.description1,
                 imageRes = R.drawable.android_superhero1
             ),
             Hero(
                 nombreRes = R.string.hero2,
                 descripcionRes = R.string.description2,
                 imageRes = R.drawable.android_superhero2
             ),
             Hero(
                 nombreRes = R.string.hero3,
                 descripcionRes = R.string.description3,
                 imageRes = R.drawable.android_superhero3
             ),
             Hero(
                 nombreRes = R.string.hero4,
                 descripcionRes = R.string.description4,
                 imageRes = R.drawable.android_superhero4
             ),
             Hero(
                 nombreRes = R.string.hero5,
                 descripcionRes = R.string.description5,
                 imageRes = R.drawable.android_superhero5
             ),
             Hero(
                 nombreRes = R.string.hero6,
                 descripcionRes = R.string.description6,
                 imageRes = R.drawable.android_superhero6
             )

         )
    }
}
