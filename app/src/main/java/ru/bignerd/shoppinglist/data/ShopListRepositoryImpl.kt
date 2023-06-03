package ru.bignerd.shoppinglist.data

import ru.bignerd.shoppinglist.domain.ShopItem
import ru.bignerd.shoppinglist.domain.ShopListRepository
import java.lang.RuntimeException

class ShopListRepositoryImpl:ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var AutoId = 0

    override fun getShopList(): List<ShopItem> {
        return shopList

    }
    override fun getShopItemId(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId } ?: throw RuntimeException("Element not found")
    }

    override fun editeShopItem(shopItem: ShopItem) {
        val oldShopIdItem = getShopItemId(shopItem.id)
        shopList.remove(oldShopIdItem)
        shopList.add(shopItem)

    }

    override fun deliteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)

    }
    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.DEFFOLD){
            shopItem.id = AutoId++
        }
        shopList.add(shopItem)

    }


}