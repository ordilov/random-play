package ordilov.randomplay.like.infrastructure;

import lombok.RequiredArgsConstructor;
import ordilov.randomplay.like.domain.LikeStore;
import ordilov.randomplay.like.domain.LikedPlaylist;
import ordilov.randomplay.like.domain.LikedTrack;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LikeStoreImpl implements LikeStore {

  private final LikedTrackRepository likedTrackRepository;
  private final LikedPlaylistRepository likedPlaylistRepository;

  @Override
  public LikedTrack store(LikedTrack likedTrack) {
    return likedTrackRepository.save(likedTrack);
  }

  @Override
  public LikedPlaylist store(LikedPlaylist likedPlaylist) {
    return likedPlaylistRepository.save(likedPlaylist);
  }

  @Override
  public void delete(LikedTrack likedTrack) {
    likedTrack.getTrack().removeLikeCount();
    likedTrackRepository.delete(likedTrack);
  }

  @Override
  public void delete(LikedPlaylist likedPlaylist) {
    likedPlaylist.getPlaylist().removeLikeCount();
    likedPlaylistRepository.delete(likedPlaylist);
  }
}
