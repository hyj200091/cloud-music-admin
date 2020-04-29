package com.soft1851.music.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PageDto
 * @Description TODO
 * @Author hyj
 * @Date 2020/4/25
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageDto {
    private int currentPage;
    private int pageSize;
}