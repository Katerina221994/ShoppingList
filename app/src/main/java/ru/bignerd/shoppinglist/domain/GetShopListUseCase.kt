package ru.bignerd.shoppinglist.domain

class GetShopListUseCase(
    val shopListItemRepository: ShopListItemRepository
) {
    fun getShopList():List<ShopItem>{
       return shopListItemRepository.getShopList()
    }
}