package com.alpes.grpcclient.service;

import com.alpes.UploadVideoRequest;
import com.alpes.Video;
import com.alpes.VideoServiceGrpc;
import com.alpes.grpcclient.dto.VideoDto;
import com.alpes.grpcclient.mapper.VideoMapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceClient {
    @GrpcClient("mediaserver")
    VideoServiceGrpc.VideoServiceBlockingStub stub;
    @Autowired
    private VideoMapper mapper;
    public VideoDto uploadVideo(UploadVideoRequest videoRequest) {
        Video video = stub.uploadVideo(videoRequest);
        VideoDto videoDto = mapper.fromVideoToVideoDto(video);
        return videoDto;
    }
}