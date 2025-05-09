package com.spotify.demo.track;

import org.springframework.stereotype.Service;
import com.spotify.demo.track.proto.AddTracksRequest;
import com.spotify.demo.track.proto.AddTracksResponse;
import com.spotify.demo.track.proto.GetTracksRequest;
import com.spotify.demo.track.proto.GetTracksResponse;
import com.spotify.demo.track.proto.RemoveTracksRequest;
import com.spotify.demo.track.proto.RemoveTracksResponse;
import com.spotify.demo.track.proto.TrackServiceGrpc.TrackServiceImplBase;
import io.grpc.stub.StreamObserver;

@Service
class TrackService extends TrackServiceImplBase {

  @Override
  public void getTracks(GetTracksRequest req, StreamObserver<GetTracksResponse> responseObserver) {
    var reply = GetTracksResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void addTracks(AddTracksRequest req, StreamObserver<AddTracksResponse> responseObserver) {
    var reply = AddTracksResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void removeTracks(RemoveTracksRequest req,
      StreamObserver<RemoveTracksResponse> responseObserver) {
    var reply = RemoveTracksResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

}
