package com.example.careeix.domain.project.dto;

import com.example.careeix.domain.project.entity.Project;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "로그인 응답 객체")
public class ProjectCreateResponse {

    private String message;

    private long project_id;
    private String title;
    private String start_date;
    private String end_date;
    private int is_proceed;
    private String classification;
    private String introduction;
    private List<ProjectDetailNote> projectDetailNotes;

    public static ProjectCreateResponse from(Project project) {
        return ProjectCreateResponse.builder()
                .build();
    }

}
