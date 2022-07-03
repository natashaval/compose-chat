package com.natashaval.composechat.chat

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.natashaval.composechat.Message
import com.natashaval.composechat.SampleData
import com.natashaval.composechat.ui.theme.ComposeChatTheme

@Composable
fun Conversation(messages: List<Message>) {
  LazyColumn {
    items(messages) { message ->
      MessageCard(msg = message)
    }
  }
}

@Preview
@Composable
fun PreviewConversation() {
  ComposeChatTheme {
    Conversation(messages = SampleData.conversationSample)
  }
}