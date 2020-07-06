package com.cb.farmerapp.activies.model;
import com.cb.farmerapp.project.Project;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@ToString
@Table(name = "activity", schema = "store")
@Entity
public class Activity {
    @Id
    @Column(name = "Id", length = 60, unique = true, nullable = false)
    private Long Id;
    @Column(name = "activity_desc", length = 60,  nullable = false)
    private String activityDesc;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "est_end_date")
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDate estEndDate;
    @Column(name = "project", length = 60,  nullable = false)
    private Project project;
    @Column(name = "activity_type", length = 60,  nullable = false)
    private String activityType;
    @Column(name = "category", length = 60,  nullable = false)
    private ActivityCategories category;
}
