package com.makgyber.hanap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        setSupportActionBar(findViewById(R.id.search_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
