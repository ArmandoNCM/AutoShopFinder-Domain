package com.improcar.autoshopfinder.domain.usecase.search

class NameSearchParameter(name: String): SearchParameter {
    override val value = name
}