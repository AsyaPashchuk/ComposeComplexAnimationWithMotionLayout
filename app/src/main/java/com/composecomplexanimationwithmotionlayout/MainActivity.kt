package com.composecomplexanimationwithmotionlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Slider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ExperimentalMotionApi
import com.composecomplexanimationwithmotionlayout.composable.ProfileHeader
import com.composecomplexanimationwithmotionlayout.ui.theme.ComposeComplexAnimationWithMotionLayoutTheme

@ExperimentalMotionApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeComplexAnimationWithMotionLayoutTheme {
                Column {

                    var progressState by remember {
                        mutableStateOf(0f)
                    }
                    
                    ProfileHeader(progress = progressState)
                    Spacer(modifier = Modifier.height(32.dp))
                    Slider(
                        value = progressState,
                        onValueChange = {progressState = it},
                        modifier = Modifier.padding(horizontal = 32.dp)
                    )
                }
            }
        }
    }
}


