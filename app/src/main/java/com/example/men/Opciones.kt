package com.example.men

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import comida.ComidaItemList
import comida.ComidaListAdapter
import kotlinx.android.synthetic.main.activity_opciones.*

class Opciones : AppCompatActivity() {


    var aux = ""
    var comidaItems:MutableList<ComidaItemList> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        aux = intent.getStringExtra("aux")
        setContentView(R.layout.activity_opciones)
        createComidaItems()
        initComidaRecycler()
        val actionBar = supportActionBar
        actionBar!!.title = "Opciones"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
    fun createComidaItems() {
        when(aux){
              "comida" ->{
                  comidaItems.add(ComidaItemList("Pizza", "Harina, salsa de tomate, pepperoni y queso.", "$150", "https://romanelo.com.mx/wp-content/uploads/2020/04/TrattoriaRomanelo_PizzaRenatta-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Spaghetti", "Pasta, salsa de tomte, albondigas.", "$80", "https://lilluna.com/wp-content/uploads/2018/05/easy-spaghetti-resize-3-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Lasagna", "Pasta, queso parmesano, carne picada, aceite de olivo. ", "$120", "https://i.pinimg.com/originals/ac/c8/ca/acc8ca50821962b9afc366092cde3ea7.jpg"))
                  comidaItems.add(ComidaItemList("Chiles en nogada", "Chile poblano, carne, frutos secos. ", "$60", "https://blog.yummmie.com/wp-content/uploads/2016/09/ChileEnNogada-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Sushi", "Pescado, arroz, algas. ", "$120", "https://restaurantezakani.com/wp-content/uploads/2020/08/Amai-roll--300x300.jpg"))

              }
              "bebida" -> {
                  comidaItems.add(ComidaItemList("Limonada", "Limones, agua y azucar", "$22", "https://i.pinimg.com/originals/11/e7/72/11e772a21aa327746b9ee87c0ad64e37.jpg"))
                  comidaItems.add(ComidaItemList("Vino", "Uvas, agua, alcohol.", "$300", "https://bodegaslopezmorenas.com/wp-content/uploads/2018/05/cosechero-vino-tinto-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Agua Mineral", "Agua, gas", "$25", "https://limpiezasamparo.com/wp-content/uploads/2019/06/blog-limpiezas-amparo-agua-mineral-valencia-agua-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Café americano", "Café, agua, azucar. ", "$38", "https://www.caffesociety.co.uk/assets/recipe-images/americano-small.jpg"))
                  comidaItems.add(ComidaItemList("Capuccino", "Café, agua, azucar, leche. ", "$50", "https://i1.wp.com/cumbrecoffee.com/wp-content/uploads/2020/03/cafe-capuccino.jpg?fit=300%2C300"))
                  comidaItems.add(ComidaItemList("Té", "Té de limón, miel, agua. ", "$45", "https://d1kxxrc2vqy8oa.cloudfront.net/wp-content/uploads/2019/07/05143913/RIG-0207-3-tedetilo-300x300.jpg"))
              }
              "postre" -> {
                  comidaItems.add(ComidaItemList("Pay de Queso", "Queso, galleta, mantequilla. ", "$35", "https://alo.co/sites/default/files/imagecache/Miniatura_300_300/receta_pie_de_queso.jpg"))
                  comidaItems.add(ComidaItemList("Pastel de chocolate", "Polvo para hornear, cocoa, mantequilla, harina, leche. ", "$30", "https://americandonuts.mx/wp-content/uploads/2020/01/Pastel-extra-chocolate-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Cupcakes", "Harina, levadura, leche. ","$15", "https://www.sarahbakesgfree.com/wp-content/uploads/2019/02/gluten-free-vegan-chocolate-covered-strawberry-cupcakes-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Hotcakes", "Harina, mantequilla, mantequilla. ", "$20", "https://eslamoda.com/wp-content/uploads/sites/2/2016/05/hot-cakes-sanos-300x300.jpg"))
                  comidaItems.add(ComidaItemList("Pastel de zanahorias", "Harina, mantequilla, rayadura de zanahoria, levadura. ", "$60", "https://www.guiadelnino.com/var/guiadelnino.com/storage/images/recetas-para-ninos-y-bebes/dulces-pasteles-y-tartas/tarta-de-zanahoria-con-queso-philadelphia/6195514-7-esl-ES/tarta-de-zanahoria-con-queso-philadelphia.jpg"))
                  comidaItems.add(ComidaItemList("Helado de chocolate", "Cacao, leche. ", "$50", "https://i.pinimg.com/474x/91/4e/a8/914ea8eeea34dfcedcf1b0f0e7928e46.jpg"))
                  comidaItems.add(ComidaItemList("Fresas con crema", "Fresas, crema, leche batida, azucar. ", "$46", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTOAPvd9SXEHD_3uxNc3GnkzzYr7_BCMROHyg&usqp=CAU"))

              }
       }
    }
    fun initComidaRecycler() {
            var adapter = ComidaListAdapter(comidaItems)
            vListaComida.layoutManager = LinearLayoutManager(this)
            vListaComida.adapter = adapter
    }


}






