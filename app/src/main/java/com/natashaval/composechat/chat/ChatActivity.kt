package com.natashaval.composechat.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.natashaval.composechat.SampleData
import com.natashaval.composechat.ui.theme.ComposeChatTheme

class ChatActivity: ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeChatTheme {
        Conversation(messages = SampleData.conversationSample)
      }
    }
  }
}