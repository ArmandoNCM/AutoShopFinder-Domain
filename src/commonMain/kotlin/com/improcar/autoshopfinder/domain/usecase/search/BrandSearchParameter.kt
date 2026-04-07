package com.improcar.autoshopfinder.domain.usecase.search

class BrandSearchParameter(brand: String): SearchParameter {
    override val value = brand
}