package com.arjuna.Kotlin.Springboot.repository

import com.arjuna.Kotlin.Springboot.model.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : JpaRepository<Company, Int>{
}