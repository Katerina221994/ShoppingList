package ru.bignerd.shoppinglist.domain

class EditingShopListUseCase (
    val shopListRepository: ShopListRepository
    ){

    fun editeShopItem(shopItem: ShopItem){
        shopListRepository.editeShopItem(shopItem)
    }
}