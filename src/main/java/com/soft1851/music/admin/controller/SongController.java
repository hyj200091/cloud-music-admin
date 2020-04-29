package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.entity.Song;
import com.soft1851.music.admin.service.SongService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hyj
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/song")
public class SongController {
    @Resource
    private SongService songService;

    @GetMapping("/all")
    public List<Song> selectAll(){
        return songService.selectAll();
    }

    @GetMapping("/paragraph")
    public List<Song>getSongByTime(@Param("flag") String flag) {
        return songService.getSongByDate(flag);
    }
    @GetMapping(value = "/export")
    public void exportData() {
        songService.exportData();
    }
}