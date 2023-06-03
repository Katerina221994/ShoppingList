package ru.bignerd.shoppinglist.domain

class EditingShopListUseCase (
    val shopListItemRepository: ShopListItemRepository
    ){

    fun editeShopItem(shopItem: ShopItem){
        shopListItemRepository.editeShopItem(shopItem)
    }
}