package com.improcar.autoshopfinder.domain.model

data class AutoShopDomainModel(
    val name: String,
    val imageUrl: String,
    val brands: List<BrandDomainModel>,
    val paymentMethods: List<PaymentMethodDomainModel>,
    val categories: List<CategoryDomainModel>,
    val coordinates: CoordinatesDomainModel,
    val rating: Float,
    val priceTier: Int
)
