package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="agreement")
class Agreement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "start_date")
    var startDate: Date? = null

    @Column(name = "end_date")
    var endDate: Date? = null
    @Column(name = "ag_status")
    var agStatus: Boolean? = null
    var link: String? = null

    @Column(name = "company_id")
    var companyId: Long? = null

}