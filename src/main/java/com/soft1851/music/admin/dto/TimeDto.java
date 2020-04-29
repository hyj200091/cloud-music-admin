package com.soft1851.music.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TimeDto
 * @Description TODO
 * @Author hyj
 * @Date 2020/4/28
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeDto {
    private String week;
    private String month;
    private String quarter;
    private String yesterday;
}