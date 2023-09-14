package net.simplifiedcoding.ui.auth

import android.os.Bundle

import android.os.Parcel
import android.os.Parcelable
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import net.simplifiedcoding.R
import androidx.compose.material3.Text as Text1

class LoginActivity : ComponentActivity(), Parcelable {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Loginpage()
        }


    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LoginActivity> {
        override fun createFromParcel(parcel: Parcel): LoginActivity {
            return LoginActivity()
        }

        override fun newArray(size: Int): Array<LoginActivity?> {
            return arrayOfNulls(size)
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview(showBackground = true)
    @Composable
    fun Loginpage() {

        val username by remember {
            mutableStateOf("")
        }
        val password by remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize() ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {

            Image(painter = painterResource(id = R.drawable.inchcapelogo),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp)
                    .fillMaxWidth()

            )
            Text1(text = "Welcome to Inchcape Motors", color = Color.Black, fontSize = 30.sp)
            OutlinedTextField(
                value = username,
                leadingIcon = { Icon(Icons.Default.Person, contentDescription ="Username Icon" )},
                onValueChange = { username },
                label = { Text1(text = "Username") },
                modifier = Modifier.fillMaxWidth()

            )

            Spacer(modifier = Modifier.height(21.dp))

            OutlinedTextField(
                value = password,
                leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="passIcon" )},
                onValueChange = { password },
                label = { Text1(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()

            )
            Spacer(modifier = Modifier.height(21.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.height(21.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "SignUp")
            }


        }
    }
}

