package ordilov.randomplay.security.userinfo;

import lombok.Getter;
import lombok.ToString;
import org.springframework.security.oauth2.core.user.OAuth2User;

@Getter
@ToString
public class GoogleOAuth2UserInfo extends OAuth2UserInfo {

  public GoogleOAuth2UserInfo(OAuth2User oAuth2User) {
    this.id = oAuth2User.getAttributes().get("sub").toString();
    this.name = oAuth2User.getAttributes().get("name").toString();
    this.email = oAuth2User.getAttributes().get("email").toString();
    this.picture = oAuth2User.getAttributes().get("picture").toString();
  }
}
