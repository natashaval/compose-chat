package com.natashaval.composechat.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
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
private fun Greeting(name: String) {
  Surface(color = MaterialTheme.colors.primary) {
    Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
  }
}

@Preview(showBackground = true, name = "Text preview")
@Composable
fun DefaultPreview() {
  BasicsCodelabTheme {
    Greeting(name = "Android")
  }
}