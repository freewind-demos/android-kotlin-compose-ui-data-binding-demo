package demos

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello()
        }
    }

    @Composable
    fun Hello() {
        Column {
            var name by remember { mutableStateOf("change me") }
            TextField(value = name, onValueChange = { name = it })
            Text(name)
        }

    }

}
