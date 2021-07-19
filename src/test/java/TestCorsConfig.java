import configure.CorsConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.web.filter.CorsFilter;

public class TestCorsConfig {

    @Test
    public void GetSettings() {
        CorsConfig corsConfig = new CorsConfig();
        Assert.assertNotNull(corsConfig);

        CorsFilter filter = corsConfig.corsFilter();
        Assert.assertNotNull(filter);
    }
}
