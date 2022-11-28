package com.example.fragmentdemonstration
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView

class DetailFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.detailsText)
        val imageBreed = view?.findViewById<ImageView>(R.id.imageBreed)
        //textView?.text = selectedItem
        when(selectedItem){
            "Карликовый баранчик" -> {
                textView?.text = getString(R.string.karlick_baran)
                imageBreed?.setImageResource(R.drawable.karlik_baranchick)
            }
            "Арлекин" -> {
                textView?.text = getString(R.string.arlekin)
                imageBreed?.setImageResource(R.drawable.arlikin_rabbit)
            }
            "Гималайский" -> {
                textView?.text = getString(R.string.gimalaiski)
                imageBreed?.setImageResource(R.drawable.gimalaiski_rabbit)
            }
            "Кролик шиншилла" -> {
                textView?.text = getString(R.string.shinshila)
                imageBreed?.setImageResource(R.drawable.shinshila_rabbit)
            }
        }
    }
}
