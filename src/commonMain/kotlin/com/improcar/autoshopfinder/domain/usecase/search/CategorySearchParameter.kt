package com.improcar.autoshopfinder.domain.usecase.search

class CategorySearchParameter(category: String): SearchParameter {
    override val value = category
}