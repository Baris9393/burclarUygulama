package com.example.burcuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tek_satir.*

class MainActivity : AppCompatActivity() {

    var burcListesi = ArrayList<Burclar>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listeyiDoldur()

        var myAdapter = BurcAdapter(burcListesi)
        recyclerView.adapter = myAdapter

        var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager

    }

    fun listeyiDoldur(){

        var tumResimler = arrayOf(R.drawable.koc1, R.drawable.boga2, R.drawable.ikizler3, R.drawable.yengec4, R.drawable.aslan5, R.drawable.basak6,
            R.drawable.terazi7, R.drawable.akrep8, R.drawable.yay9, R.drawable.oglak10, R.drawable.kova11, R.drawable.balik12)
        var burcAdi = resources.getStringArray(R.array.burclar)
        var burcTarih = resources.getStringArray(R.array.burcTarih)

        for (i in 0..burcAdi.size-1){
            var tumBurclar = Burclar(burcAdi[i], burcTarih[i], tumResimler[i])
            burcListesi.add(tumBurclar)
        }

    }

}
