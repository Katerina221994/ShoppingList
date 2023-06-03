package ru.bignerd.shoppinglist.domain

class AddShopItem(
    val shopListRepository: ShopListRepository
    ) {

    fun addShopItem(shopItem:ShopItem){
        shopListRepository.addShopItem(shopItem)

    }
}