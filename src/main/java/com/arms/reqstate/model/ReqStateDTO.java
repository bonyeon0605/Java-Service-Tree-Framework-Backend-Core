package com.arms.reqstate.model;

import com.egovframework.javaservice.treeframework.model.TreeBaseDTO;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Lob;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReqStateDTO extends TreeBaseDTO {


    private String c_contents;

    private String c_etc;
}
