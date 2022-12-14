package com.example.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopitemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopitemId)
    }
}