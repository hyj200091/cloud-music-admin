package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.entity.SongList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wzw
 * @since 2020-04-21
 */
public interface SongListMapper extends BaseMapper<SongList> {
    /**
     * 根据type字段进行分组，讲每种类型的所有歌曲作为改类型的子菜单
     * @return list
     */
    List<Map<String,Object>> getByType();
}
