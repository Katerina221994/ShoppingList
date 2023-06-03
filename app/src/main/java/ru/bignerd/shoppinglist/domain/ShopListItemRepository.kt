package ru.bignerd.shoppinglist.domain

interface ShopListItemRepository {
    fun getShopList(): List<ShopItem>

    fun getShopItemId(shopItemId:Int):ShopItem

    fun editeShopItem(shopItem: ShopItem)

    fun deliteShopItem( shopItem:ShopItem)

    fun addShopItem(shopItem:ShopItem)
}


