package com.example.burcuygulamasi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tek_satir.view.*

class BurcAdapter(burclar : ArrayList<Burclar>) : RecyclerView.Adapter<BurcAdapter.BurcViewHolder>() {

    var burcBilgileri = burclar

    override fun getItemCount(): Int {
        return burcBilgileri.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurcViewHolder {

        var inflater = LayoutInflater.from(parent.context)
        var tekSatirBurc = inflater.inflate(R.layout.tek_satir, parent, false)

        return BurcViewHolder(tekSatirBurc)
    }

    override fun onBindViewHolder(holder: BurcViewHolder, position: Int) {

        holder.tekBurcAdi.text = burcBilgileri.get(position).burcAdi
        holder.tekBurcTarih.text = burcBilgileri.get(position).burcTarihi
        holder.tekBurcResim.setImageResource(burcBilgileri.get(position).burcResmi)

    }

    class BurcViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tekSatirBurc = itemView

        var tekBurcAdi = tekSatirBurc.tvBurcAdi
        var tekBurcTarih = tekSatirBurc.tvBurcTarihi
        var tekBurcResim = tekSatirBurc.imgBurc

    }


}