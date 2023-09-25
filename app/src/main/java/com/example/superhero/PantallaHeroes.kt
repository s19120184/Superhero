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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superhero.data.DatosHeroe
import com.example.superhero.model.Hero
import com.example.superhero.ui.theme.Shapes
import com.example.superhero.ui.theme.Typography
import org.w3c.dom.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroesSalganApp(){
    Scaffold (topBar= {
                  Barra()
                   }
             ){ it->

            LazyColumn(contentPadding = it) {
                items(DatosHeroe().heroes()) {
                    HeroeCard(heroe = it,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
                }
            }
        }
        }

@Composable
fun HeroeCard(heroe: Hero, modifier: Modifier= Modifier){
        Card(
            elevation=CardDefaults.cardElevation(defaultElevation = 2.dp),
            modifier= modifier.fillMaxWidth(),
            shape = Shapes.large,

        ){
                Row  (
                    modifier= Modifier
                             .fillMaxWidth()
                             .padding(16.dp)
                             .size(72.dp)){ //fontSize = FontWeight.Bold
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Barra(modifier: Modifier= Modifier){
       CenterAlignedTopAppBar(
           title = {
               Row{
                   Text(text = stringResource(id = R.string.superheores),
                       textAlign = TextAlign.Center,
                         style = Typography.displayLarge,
                        )

               }
           },
           modifier= modifier
       )


}

@Composable
fun imagenHero(imagen: Int , descripcion: Int ,modifier: Modifier= Modifier){
     Box(
        modifier
            .size(72.dp)
            .clip(Shapes.small)){
        Image(
            painter = painterResource(id = imagen),
            contentDescription = stringResource(id = descripcion),
            alignment=Alignment.TopCenter,
            contentScale=ContentScale.FillWidth,
            modifier=modifier.clip(shape = Shapes.small),
        )
    }

}

@Composable
fun InfoHeroe(nombre: Int, descripcion:Int ,modifier: Modifier= Modifier){
     Column(
         modifier = Modifier.width(250.dp),
     )
     {
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

    HeroesSalganApp()

}