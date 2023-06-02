package com.arjuna.Kotlin.Springboot.service

import com.arjuna.Kotlin.Springboot.model.Company
import com.arjuna.Kotlin.Springboot.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CompanyService {

    @Autowired private lateinit var companyRepository: CompanyRepository

    fun getAllCompany(): MutableList<Company> {
        return companyRepository.findAll();
    }

    fun SaveCompany(company: Company): Company {
        return companyRepository.save(company)
    }

    fun DeleteCompany(company: Company) {
        return companyRepository.delete(company)
    }
}