package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="agreement_view")
class AgreementView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name="fecha_inicio")
    var fechaInicio: Date?=null
    @Column(name="fecha_fin")
    var fechaFin: Date?=null
    var state:String?=null
    @Column(name="company_id")
    var companyId:Long?=null
    @Column(name="teacher_id")
    var teacherId:Long?=null
    @Column(name="tutor_id")
    var tutorId:Long?=null
    @Column(name="career_id")
    var careerId:Long?=null
    var empresa:String?=null
    var profesor:String?=null
    var tutor:String?=null
    var carrera:String?=null
}