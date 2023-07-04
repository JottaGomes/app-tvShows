package com.example.bretalseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.StringRequestListener
import com.google.gson.Gson
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.cell.view.*

class MainActivity : AppCompatActivity(), StringRequestListener {
    var adapter: Mainadapter = Mainadapter(arrayOf())
    var baseURL: String = "https://api.themoviedb.org/3"
    var metodURL: String = "/tv/top_rated"
    var api_key: String = "e3e6f44031896db32bfaf16c60412fd5"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview: RecyclerView = findViewById(R.id.recycler)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter


        AndroidNetworking.get(baseURL + metodURL)  // .get fazer chamada à rede
            .addQueryParameter ("api_key", api_key)
            .build()
            .getAsString(this)  // receber a resposta aqui
    }

    override fun onResponse(response: String?) {
           var gson: Gson = Gson()                  //gson é uma biblioteca
        val selectionTVshow: SelectionTVShow = gson.fromJson(response, SelectionTVShow::class.java)
        adapter.shows = selectionTVshow.results
        adapter.notifyDataSetChanged()
        Log.e("response", selectionTVshow.toString())

      /*  val cell: View = findViewById(R.id.layout)
        val tittle: TextView = cell.findViewById(R.id.cell_tittle)
        tittle.text=selectionTVshow.results.first().name
        val image: ImageView = cell.findViewById(R.id.image)*/


    }

    override fun onError(anError: ANError?) {
        Log.e("error", anError.toString())
    }
}





