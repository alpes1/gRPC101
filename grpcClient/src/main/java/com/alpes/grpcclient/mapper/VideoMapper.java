package com.alpes.grpcclient.mapper;

import com.alpes.Creator;
import com.alpes.Video;
import com.alpes.grpcclient.dto.CreatorDto;
import com.alpes.grpcclient.dto.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {
    private ModelMapper mapper = new ModelMapper();
    public VideoDto fromVideoToVideoDto(Video video) {
        return this.mapper.map(video, VideoDto.class);
    }
}
