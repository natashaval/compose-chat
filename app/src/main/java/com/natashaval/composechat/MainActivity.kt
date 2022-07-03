package com.natashaval.composechat

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.natashaval.composechat.chat.ChatActivity
import com.natashaval.composechat.ui.theme.ComposeChatTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeChatTheme {
        PageButtonList()
      }
    }
  }
}

@Composable
fun PageButtonList() {
  val context = LocalContext.current
  Column(modifier = Modifier.padding(all = 8.dp)) {
    PageButton(name = "Conversation Chat") {
      context.startActivity(Intent(context, ChatActivity::class.java))
    }
  }
}

@Composable
fun PageButton(name: String, onButtonClick: () -> Unit) {
  Button(onClick = onButtonClick) {
    Text(text = name)
  }
}