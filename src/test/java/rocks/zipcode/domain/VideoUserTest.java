package rocks.zipcode.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import rocks.zipcode.web.rest.TestUtil;

class VideoUserTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(VideoUser.class);
        VideoUser videoUser1 = new VideoUser();
        videoUser1.setId(1L);
        VideoUser videoUser2 = new VideoUser();
        videoUser2.setId(videoUser1.getId());
        assertThat(videoUser1).isEqualTo(videoUser2);
        videoUser2.setId(2L);
        assertThat(videoUser1).isNotEqualTo(videoUser2);
        videoUser1.setId(null);
        assertThat(videoUser1).isNotEqualTo(videoUser2);
    }
}
