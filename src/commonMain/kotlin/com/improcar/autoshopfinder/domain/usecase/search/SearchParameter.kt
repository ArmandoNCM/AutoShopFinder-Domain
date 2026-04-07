package com.improcar.autoshopfinder.domain.usecase.search

sealed interface SearchParameter {
    val value: String
}