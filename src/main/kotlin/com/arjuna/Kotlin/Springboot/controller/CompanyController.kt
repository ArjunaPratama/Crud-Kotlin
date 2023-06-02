package com.arjuna.Kotlin.Springboot.controller

import com.arjuna.Kotlin.Springboot.model.Company
import com.arjuna.Kotlin.Springboot.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/company")
class CompanyController {

    @Autowired private lateinit var companyService: CompanyService

    @PostMapping("/get_company")
    fun getAllCompany(): MutableList<Company> {
        return companyService.getAllCompany();
    }

    @PostMapping("/save_company")
    fun saveCompany(@RequestBody company: Company): Company {
        return companyService.SaveCompany(company)
    }

    @PostMapping("/delete_company")
    fun deleteCompany(@RequestBody company: Company){
        return companyService.DeleteCompany(company)
    }
}