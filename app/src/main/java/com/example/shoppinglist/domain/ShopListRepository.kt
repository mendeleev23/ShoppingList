package com.example.shoppinglist.domain

interface ShopListRepository {

    fun getShopItem(shopitemId: Int): ShopItem

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopList(): List<ShopItem>
}