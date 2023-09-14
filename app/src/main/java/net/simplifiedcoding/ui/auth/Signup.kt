package net.simplifiedcoding.ui.auth

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.ui.theme.AppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(viewModel: AuthViewModel?, navController: NavController) {

    val username by remember {
        mutableStateOf("")
    }
    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(painter = painterResource(id = R.drawable.inchcapelogo),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .fillMaxWidth()

        )

        Text(text = "Welcome to Inchcape Motors Please Sign up", color = Color.DarkGray, fontSize = 18.sp)

        OutlinedTextField(
            value = username,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "username Icon") },
            onValueChange = { username },
            label = { Text(text = "Username") },
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(21.dp))

        OutlinedTextField(
            value = email,
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "email Icon") },
            onValueChange = {email},
            label = { Text(text = "email") },
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(21.dp))

        OutlinedTextField(
            value = password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "pass Icon") },
            onValueChange = { password },
            label = { Text(text = "password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(21.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "SignUp")
        }

    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun SignupScreenPreviewLight() {
    AppTheme {
        SignupScreen(null, rememberNavController())
    }
}

