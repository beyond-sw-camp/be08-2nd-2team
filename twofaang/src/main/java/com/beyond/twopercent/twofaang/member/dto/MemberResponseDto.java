package com.beyond.twopercent.twofaang.member.dto;

import com.beyond.twopercent.twofaang.member.entity.enums.GradeName;
import com.beyond.twopercent.twofaang.member.entity.enums.Role;
import com.beyond.twopercent.twofaang.member.entity.enums.Status;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberResponseDto {

    private String email;    // 이메일 (ID로 사용)
    private String name;     // 이름
    private String mobile;   // 전화번호
    private GradeName gradeName;     // 등급
    private Date joinDate;   // 가입일
    private Role role;
    private Status status;
    private int point = 0; // 포인트
    private String zipcode;
    private String addr;
    private String addrDetail;
}
