package com.improcar.autoshopfinder.domain.usecase.search

import com.improcar.autoshopfinder.domain.repository.AutoShopRepository

class SearchAutoShopsUseCase(private val autoShopRepository: AutoShopRepository) {

    suspend operator fun invoke(searchCriteria: SearchCriteria): SearchResult =
        autoShopRepository.getAutoShops(searchCriteria)

}