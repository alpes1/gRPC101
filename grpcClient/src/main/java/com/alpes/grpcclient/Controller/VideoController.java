package com.alpes.grpcclient.Controller;

import com.alpes.Creator;
import com.alpes.UploadVideoRequest;
import com.alpes.grpcclient.dto.VideoDto;
import com.alpes.grpcclient.service.VideoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
    @Autowired
    private VideoServiceClient videoService;
    @PostMapping("addVideo")
    public VideoDto uploadVideo() {
        Creator creator = Creator.newBuilder()
                .setName("Xproce")
                .setEmail("hirchoua.badr@gmail.com")
                .setId("2")
                .build();
        UploadVideoRequest request = UploadVideoRequest.newBuilder()
                .setTitle("grpc 101")
                .setDescription("The gRPC 101 is an introductory course to master Grpc")
                .setUrl("https://github.com/badrhr/gRPC101")
                .setDurationSeconds(380)
                .setCreator(creator)
                .build();
        VideoDto videoDto = videoService.uploadVideo(request);
        System.out.println(videoDto);
        return videoDto;
    }

}