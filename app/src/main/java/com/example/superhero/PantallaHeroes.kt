package com.example.superhero

import android.content.res.Resources.Theme
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superhero.data.DatosHeroe
import com.example.superhero.model.Hero
import com.example.superhero.ui.theme.Shapes

@Composable
fun HeroesSalgan(){

}

@Composable
fun HeroeCard(heroe: Hero, modifier: Modifier= Modifier){
        Card(
            modifier= Modifier
                .fillMaxWidth()
                .padding(16.dp),

        ){
            Row(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ){
                imagenHero(
                    imagen = heroe.imageRes,
                    descripcion =heroe.descripcionRes ,
                    modifier = Modifier)
                Column (modifier= Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center){

                }
            }
        }
}
@Composable
fun imagenHero(imagen: Int , descripcion: Int ,modifier: Modifier){
    Image(
        painter = painterResource(id = imagen),
        contentDescription = stringResource(id = descripcion) )
    Spacer(modifier= Modifier.width(8.dp))
}
@Preview
@Composable
fun cardHeroePreviw(){
    HeroeCard(
        heroe= Hero( nombreRes = R.string.hero1,
        descripcionRes = R.string.description1,
        imageRes = R.drawable.android_superhero1), modifier = Modifier)
}