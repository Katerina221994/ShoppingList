package ru.bignerd.shoppinglist.domain

class AddShopItem(
    val shopListItemRepository: ShopListItemRepository
    ) {

    fun addShopItem(shopItem:ShopItem){
        shopListItemRepository.addShopItem(shopItem)

    }
}