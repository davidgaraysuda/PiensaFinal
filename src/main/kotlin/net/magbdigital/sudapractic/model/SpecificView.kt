package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="specific_view")
class SpecificView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var status:Boolean?=null
    @Column(name="company_id")
    var companyId:Long?=null
    @Column(name="career_id")
    var careerId:Long?=null
    var carrera:String?=null
}