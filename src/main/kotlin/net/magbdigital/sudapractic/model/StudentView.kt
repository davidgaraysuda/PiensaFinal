package net.magbdigital.sudapractic.model

import javax.persistence.*

@Entity
@Table(name="student_view ")
class StudentView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nui:String? = null
    var name:String? = null
    var lastname:String? = null
    var email:String? = null
    var phone:String? = null
    @Column(name="s_state")
    var sState: String? = null
    @Column(name="career_id")
    var careerId: Long? = null
    var career:String?=null



}