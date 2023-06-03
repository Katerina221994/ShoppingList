package ru.bignerd.shoppinglist.domain

class GetShopItemId(
    val shopListRepository: ShopListRepository
) {
    fun getShopItemId(shopItemId:Int):ShopItem{
      return shopListRepository.getShopItemId(shopItemId)
    }
}