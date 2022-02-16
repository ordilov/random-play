package ordilov.randomplay.track.infrastructure;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ordilov.randomplay.track.domain.Track;
import ordilov.randomplay.track.domain.TrackReader;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TrackReaderImpl implements TrackReader {

  private final TrackRepository trackRepository;

  @Override
  public Track getTrackBy(Long id) {
    return null;
  }
}
