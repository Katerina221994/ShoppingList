package ru.bignerd.shoppinglist.domain

class GetShopListUseCase(
    val shopListRepository: ShopListRepository
) {
    fun getShopList():List<ShopItem>{
       return shopListRepository.getShopList()
    }
}