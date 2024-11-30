package com.alpes.grpcserver.service;

import com.alpes.UploadVideoRequest;
import com.alpes.Video;
import com.alpes.VideoIdRequest;
import com.alpes.VideoServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class VideoService extends VideoServiceGrpc.VideoServiceImplBase{
    @Override
    public void uploadVideo(UploadVideoRequest request, StreamObserver<Video> responseObserver) {
        // Simuler une vidéo
        Video video = Video.newBuilder()
                .setId("12345")
                .setTitle("passion discorvery")
                .setDescription("")
                .setUrl("defef")
                .setDurationSeconds(1565)
                .setCreator(request.getCreator())
                .build();

        responseObserver.onNext(video);
        responseObserver.onCompleted();


    }

}

