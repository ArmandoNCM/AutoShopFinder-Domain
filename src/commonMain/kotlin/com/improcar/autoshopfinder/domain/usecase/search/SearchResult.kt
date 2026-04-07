package com.improcar.autoshopfinder.domain.usecase.search

import com.improcar.autoshopfinder.domain.model.AutoShopDomainModel

sealed class SearchResult {

    data class Success(val autoShops: List<AutoShopDomainModel>) : SearchResult()

    sealed class Failure : SearchResult() {
        data object EmptyResult : Failure()
        data class NetworkError(val message: String) : Failure()
        data class ServerError(val message: String) : Failure()
    }
}

