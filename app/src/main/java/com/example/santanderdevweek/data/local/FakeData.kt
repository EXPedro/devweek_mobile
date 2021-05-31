package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta {
        val cliente = Cliente("Pedro")
        val cartao = Cartao("412423232")
        return Conta( "445655-4",
                           "6552-4",
                           "R$ 102.450,80",
                           "R$ 124.120,00",
                            cliente,
                            cartao
                            )
    }

}