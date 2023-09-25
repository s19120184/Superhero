package com.example.superhero

import android.content.res.Resources.Theme
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superhero.data.DatosHeroe
import com.example.superhero.model.Hero
import com.example.superhero.ui.theme.Shapes
import com.example.superhero.ui.theme.Typography
import org.w3c.dom.Text

@Composable
fun HeroesSalgan(){

}

@Composable
fun HeroeCard(heroe: Hero, modifier: Modifier= Modifier){
        Card(
            modifier= Modifier.fillMaxWidth(),
            shape = Shapes.large,

        ){
            Column(
               modifier= Modifier
                   .padding(16.dp)
            ){
                Row  (modifier= Modifier.fillMaxWidth()){ //fontSize = FontWeight.Bold
                    InfoHeroe(nombre = heroe.nombreRes,
                        descripcion =heroe.descripcionRes,
                        modifier = Modifier)
                    Spacer(modifier= Modifier.width(16.dp))
                    imagenHero(
                            imagen = heroe.imageRes,
                            descripcion =heroe.descripcionRes ,
                            modifier = Modifier)
                }

            }
        }
}


@Composable
fun imagenHero(imagen: Int , descripcion: Int ,modifier: Modifier= Modifier){
    Column (modifier.height(72.dp).width(100.dp)){
        Image(
            painter = painterResource(id = imagen),
            contentDescription = stringResource(id = descripcion),
            modifier=modifier.clip(shape = Shapes.small),
        )
    }
    Spacer(modifier= Modifier.width(8.dp))
}

@Composable
fun InfoHeroe(nombre: Int, descripcion:Int ,modifier: Modifier= Modifier){
     Column(
         modifier = Modifier.height(72.dp).width(280.dp)) {
         Text(
              text = stringResource(id=nombre),
              style = Typography.displaySmall

         )
         Text(
             text = stringResource(id = descripcion),
             style= Typography.bodyLarge)
     }
}

@Preview
@Composable
fun cardHeroePreviw(){
    HeroeCard(
        heroe= Hero( nombreRes = R.string.hero1,
        descripcionRes = R.string.description1,
        imageRes = R.drawable.android_superhero1),
        modifier = Modifier)
}