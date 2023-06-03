package ru.bignerd.shoppinglist.domain

interface ShopListRepository {
    fun getShopList(): List<ShopItem>

    fun getShopItemId(shopItemId:Int):ShopItem

    fun editeShopItem(shopItem: ShopItem)

    fun deliteShopItem( shopItem:ShopItem)

    fun addShopItem(shopItem:ShopItem)
}


