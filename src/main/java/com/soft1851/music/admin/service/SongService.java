package com.soft1851.music.admin.service;

import com.soft1851.music.admin.entity.Song;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wzw
 * @since 2020-04-21
 */
public interface SongService extends IService<Song> {
    /**
     * 查询所有歌曲
     * @return list
     */
    List<Song> selectAll();

    /**
     * 判断flag标志
     * @param flag
     * @return list
     */
    List<Song> getSongByDate(String flag);

    /**
     * 导出数据
     */
    void exportData();
}
