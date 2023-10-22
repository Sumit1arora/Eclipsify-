package com.example.eclipsify.eclipseGame

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.eclipsify.R
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun comic(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.finalkid),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(Modifier.fillMaxSize()) {

            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                title = {
                    Box(
                        Modifier.fillMaxHeight(),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "",
                            tint = Color.White, modifier = Modifier.clickable { navController.navigate("KidScreen") }
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.White.copy(0.1f)
                )
            )
            Column(
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Comic Zone",
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.akirabold)),
                    color = Color.White,
                    modifier = Modifier
                        .offset(-70.dp, 20.dp)
                        .clickable { }
                )
                Spacer(modifier = Modifier.height(40.dp))

                Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly,){
                    Card(modifier = Modifier.size(174.dp,221.dp,).clickable { navController.navigate("Comic1") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.comicicon), contentDescription ="", modifier = Modifier.size(133.dp,127.dp) )
                            Spacer(modifier = Modifier.height(12.dp))

                            Text(text = "Astronaut's", color = colorResource(id = R.color.gold), fontSize = 13.sp, fontFamily = FontFamily(
                                                Font(R.font.lesemibold)
                                            ))

                            Text(text = "Space Adventure", modifier = Modifier, color = colorResource(id = R.color.white), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))
                        }

                    }
                    Card(modifier = Modifier.size(174.dp,221.dp,).clickable { navController.navigate("Comic2") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.solarex), contentDescription ="", modifier = Modifier.size(133.dp,127.dp) )
                            Spacer(modifier = Modifier.height(12.dp))

                            Text(text = "Solar", color = colorResource(id = R.color.gold), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))

                            Text(text = "Space Adventure", modifier = Modifier, color = colorResource(id = R.color.white), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))
                        }

                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly,){
                    Card(modifier = Modifier.size(174.dp,221.dp,), colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.lunarex), contentDescription ="", modifier = Modifier.size(133.dp,127.dp) )
                            Spacer(modifier = Modifier.height(12.dp))

                            Text(text = "Lunar", color = colorResource(id = R.color.gold), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))

                            Text(text = "Space Adventure", modifier = Modifier, color = colorResource(id = R.color.white), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))
                        }

                    }
                    Card(modifier = Modifier.size(174.dp,221.dp,).clickable { navController.navigate("Comic3") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.schoolex), contentDescription ="", modifier = Modifier.size(133.dp,127.dp) )
                            Spacer(modifier = Modifier.height(12.dp))

                            Text(text = "Eclipse", color = colorResource(id = R.color.gold), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))

                            Text(text = "School Class", modifier = Modifier, color = colorResource(id = R.color.white), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))
                        }

                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly,){
                    Card(modifier = Modifier.size(174.dp,221.dp,).clickable { navController.navigate("Comic4") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.safetyex), contentDescription ="", modifier = Modifier.size(133.dp,127.dp) )
                            Spacer(modifier = Modifier.height(12.dp))

                            Text(text = "Eclipse", color = colorResource(id = R.color.gold), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))

                            Text(text = "Safety Rules", modifier = Modifier, color = colorResource(id = R.color.white), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))
                        }

                    }
                    Card(modifier = Modifier.size(174.dp,221.dp,).clickable { navController.navigate("Comic5") }, colors = CardDefaults.cardColors(
                        colorResource(id = R.color.trans))) {
                        Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.journeyex), contentDescription ="", modifier = Modifier.size(133.dp,127.dp) )
                            Spacer(modifier = Modifier.height(12.dp))

                            Text(text = "Journey To", color = colorResource(id = R.color.gold), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))

                            Text(text = "Shadow Zone", modifier = Modifier, color = colorResource(id = R.color.white), fontSize = 13.sp, fontFamily = FontFamily(
                                Font(R.font.lesemibold)
                            ))
                        }

                    }

                }


            }
        }
    }
}
