package ru.bignerd.shoppinglist.domain

class GetShopItemId(
    val shopListItemRepository: ShopListItemRepository
) {
    fun getShopItemId(shopItemId:Int):ShopItem{
      return shopListItemRepository.getShopItemId(shopItemId)
    }
}