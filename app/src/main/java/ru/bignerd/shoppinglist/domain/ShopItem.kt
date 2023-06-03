package ru.bignerd.shoppinglist.domain

data class ShopItem(
    val count:Int,
    val name:String,
    val enable:Boolean,
    var id:Int = DEFFOLD
){
    companion object{
        const val DEFFOLD  = -1
    }
}


