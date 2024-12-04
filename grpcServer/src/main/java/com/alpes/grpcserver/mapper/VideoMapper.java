package com.alpes.grpcserver.mapper;


import com.alpes.UploadVideoRequest;
import com.alpes.Video;
import org.modelmapper.ModelMapper;

public class VideoMapper {
        private ModelMapper mapper = new ModelMapper();

        public Video fromVideo(UploadVideoRequest videoRequest) {
            return this.mapper.map(videoRequest, Video.class);
        }
    }

