package com.example.noncommonapiissue.android

import android.app.Activity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import com.example.noncommonapiissue.Greeting

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = Greeting().greet()
        addContentView(textView, ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        ))
    }
}
