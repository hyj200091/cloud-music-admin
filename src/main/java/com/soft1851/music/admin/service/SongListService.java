package com.soft1851.music.admin.service;

import com.soft1851.music.admin.dto.PageDto;
import com.soft1851.music.admin.entity.SongList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wzw
 * @since 2020-04-21
 */
public interface SongListService extends IService<SongList> {
    /**
     * 根据type字段进行分组，将每种类型的所有歌单作为改类型的子菜单
     * @return list
     */
    List<Map<String,Object>> getByType();

    /**
     * 分页查询
     * @param pageDto
     * @return list
     */
    List<SongList> getByPage(PageDto pageDto);

    /**
     * 歌单查询各种条件
     * @param field
     * @return
     */
    List<SongList>blurSelect(String field);
}
