package com.natashaval.composechat.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.natashaval.composechat.ui.theme.BasicsCodelabTheme
import com.natashaval.composechat.ui.theme.ComposeChatTheme

class BasicsActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BasicsCodelabTheme {
        Surface(color = MaterialTheme.colors.background) {
          Greeting(name = "Android")
        }
      }
    }
  }
}

@Composable
private fun MyApp(names: List<String> = listOf("World", "Compose")) {
  Surface(color = MaterialTheme.colors.background) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
      for (name in names) {
        Greeting(name = name)
      }
    }
  }
}

@Composable
private fun Greeting(name: String) {
  Surface(
    color = MaterialTheme.colors.primary,
    modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
  ) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(24.dp)
    ) {
      Text(text = "Hello, ")
      Text(text = name)
    }
  }
}

@Preview(showBackground = true, name = "Text preview", widthDp = 320)
@Composable
fun DefaultPreview() {
  ComposeChatTheme {
    MyApp()
  }
}