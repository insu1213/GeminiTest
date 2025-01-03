package com.example.geminitest

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.geminitest.ui.theme.composable.InstagramTextField

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel = viewModel()
) {
    val uiState by loginViewModel.uiState.collectAsState()
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Insutagram",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 16.dp)
        ) {


            Spacer(modifier = Modifier.height(8.dp))

            InstagramTextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = { text = it },
                label = "phone number, username or email"
            )

            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = { text = it },
                label = { Text("password") }
            )

            Spacer(modifier = Modifier.height(36.dp))

            Button(
                modifier = Modifier.fillMaxWidth(),
                enabled = false,
                onClick = {},
            ) {
                Text(text = "Log in")
            }

//            Button(
//                onClick = {
//                    val bitmap = BitmapFactory.decodeResource(
//                        context.resources,
//                        images[selectedImage.intValue]
//                    )
//                    bakingViewModel.sendPrompt(bitmap, prompt)
//                },
//                enabled = prompt.isNotEmpty(),
//                modifier = Modifier
//                    .align(Alignment.CenterVertically)
//            ) {
//                Text(text = stringResource(R.string.action_go))
//            }
        }

//        if (uiState is UiState.Loading) {
//            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
//        } else {
//            var textColor = MaterialTheme.colorScheme.onSurface
//            if (uiState is UiState.Error) {
//                textColor = MaterialTheme.colorScheme.error
//                result = (uiState as UiState.Error).errorMessage
//            } else if (uiState is UiState.Success) {
//                textColor = MaterialTheme.colorScheme.onSurface
//                result = (uiState as UiState.Success).outputText
//            }
//            val scrollState = rememberScrollState()
//            Text(
//                text = result,
//                textAlign = TextAlign.Start,
//                color = textColor,
//                modifier = Modifier
//                    .align(Alignment.CenterHorizontally)
//                    .padding(16.dp)
//                    .fillMaxSize()
//                    .verticalScroll(scrollState)
//            )
//        }
    }
}