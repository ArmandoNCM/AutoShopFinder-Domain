package com.improcar.autoshopfinder.domain.usecase.search

class PaymentMethodSearchParameter(paymentMethod: String): SearchParameter {
    override val value = paymentMethod
}