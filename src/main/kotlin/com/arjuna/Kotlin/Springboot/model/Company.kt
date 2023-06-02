package com.arjuna.Kotlin.Springboot.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.sql.Timestamp

@Entity
data class Company(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    var company_name: String,
    var company_type: String,
    var company_desc: String,
//    var created_date: Timestamp?

)
