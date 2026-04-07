package com.improcar.autoshopfinder.domain.repository

import com.improcar.autoshopfinder.domain.model.AutoShopDomainModel
import com.improcar.autoshopfinder.domain.usecase.search.SearchCriteria
import com.improcar.autoshopfinder.domain.usecase.search.SearchResult

interface AutoShopRepository {

    suspend fun getAutoShops(searchCriteria: SearchCriteria): SearchResult

}