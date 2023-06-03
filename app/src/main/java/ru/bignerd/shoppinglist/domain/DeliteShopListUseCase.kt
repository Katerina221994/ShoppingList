package ru.bignerd.shoppinglist.domain

class DeliteShopListUseCase(
    val shopListItemRepository: ShopListItemRepository
) {
    fun deliteShopItem( shopItem:ShopItem){
        shopListItemRepository.deliteShopItem(shopItem)


    }
}