package com.natashaval.composechat

import android.app.Activity
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
import com.natashaval.composechat.basics.BasicsActivity
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
  Column(modifier = Modifier.padding(all = 8.dp)) {
    PageButton(name = "Conversation Chat", clazz = ChatActivity::class.java)
    PageButton(name = "Basics Codelab", clazz = BasicsActivity::class.java)
  }
}

@Composable
fun PageButton(name: String, clazz: Class<*>?) {
  val context = LocalContext.current
  Button(onClick = { context.startActivity(Intent(context, clazz)) }) {
    Text(text = name)
  }
}