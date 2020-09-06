package pl.wiktor.testjsonresponse.custom.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import pl.wiktor.testjsonresponse.model.Model;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@WebServlet(name = "CustomServlet", urlPatterns = {"/custom/*"})
public class CustomServlet extends HttpServlet {

    private final Model testSingleChannel = new Model(1L, "MyChannelName");

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("CustomServlet INIT METHOD CALLED!");
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("CustomServlet extends HttpServlet: doGet");

        resp.getWriter().print(
                new ObjectMapper()
                        .writeValueAsString(
                                Stream.of(testSingleChannel)
                                        .map(Model::getBody)
                                        .collect(Collectors.toSet()))
        );

        resp.addHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

        //        super.doGet(req, resp);
    }


}
