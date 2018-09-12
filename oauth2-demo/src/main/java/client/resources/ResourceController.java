package client.resources;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teemper on 2018/9/12, 16:32.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
@RestController
public class ResourceController {

    @RequestMapping("/private/data")
    public String getResource() {
        Object details = SecurityContextHolder.getContext().getAuthentication().getDetails();
        System.out.println(details.getClass());
        OAuth2AuthenticationDetails oAuth2Authen = (OAuth2AuthenticationDetails) details;
        System.out.println(oAuth2Authen.getTokenType());
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
        return "Hello! This is private data.";

    }

    @RequestMapping("/api/data")
    public String getApiData() {
        System.out.println("start");
        Object details = SecurityContextHolder.getContext().getAuthentication().getDetails();
        if(details instanceof OAuth2AuthenticationDetails) {
            OAuth2AuthenticationDetails oAuth2Authen = (OAuth2AuthenticationDetails) details;
            System.out.println(oAuth2Authen.getTokenType());
            System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
            return "Hello! This is api data.";
        }
        return "error";
    }

}
