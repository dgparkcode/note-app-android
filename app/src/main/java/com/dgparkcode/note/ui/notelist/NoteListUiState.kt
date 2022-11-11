package com.dgparkcode.note.ui.notelist

import com.dgparkcode.note.ui.common.UserMessage

data class NoteListUiState(
    val isLoading: Boolean = false,
    val noteItems: List<NoteItem> = emptyList(),
    val userMessage: UserMessage? = null
)
