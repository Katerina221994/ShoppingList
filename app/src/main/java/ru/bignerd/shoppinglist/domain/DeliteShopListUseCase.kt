package ru.bignerd.shoppinglist.domain

class DeliteShopListUseCase(
    val shopListRepository: ShopListRepository
) {
    fun deliteShopItem( shopItem:ShopItem){
        shopListRepository.deliteShopItem(shopItem)


    }
}