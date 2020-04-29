package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft1851.music.admin.dto.TimeDto;
import com.soft1851.music.admin.entity.Song;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wzw
 * @since 2020-04-21
 */
public interface SongMapper extends BaseMapper<Song> {
    /**
     * 查询：根据state状态查询用户列表，分页显示
     * @param page 分页对象，xml中可以从里面进行取值，传递参数page 及自动分页，必须放在第一位(你可以继承page实现自己的分页对象)
     * @param state 状态
     * @return 分页对象
     */
    IPage<Song> selectSongByPage(Page<?>page,Integer state);

    /**
     * 根据时间自动分页
     * @param timeDto
     * @return list
     */
    List<Song> getSongByTimeParagraph(@Param("timeDto")TimeDto timeDto);
}
