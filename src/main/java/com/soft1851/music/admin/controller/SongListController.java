package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.dto.PageDto;
import com.soft1851.music.admin.entity.SongList;
import com.soft1851.music.admin.service.SongListService;
import com.soft1851.music.admin.service.SongService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wzw
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/songList")
public class SongListController {
    @Resource
    private SongListService songListService;
    @Resource
    private SongService songService;

    @GetMapping("/list")
    private List getByType(){
        List<Map<String,Object>> songLists = songListService.getByType();
        return songLists;
    }

    @PostMapping("/page")
    public List<SongList> getSongListByPage(@RequestBody PageDto pageDto){
        return songListService.getByPage(pageDto);
    }

    @GetMapping("/like")
    public List<SongList> getSongListByLike(@Param("keywords") String keywords){
        return songListService.blurSelect(keywords);
    }
    @GetMapping(value = "/export")
    public void export() {
        songService.exportData();
    }
}
