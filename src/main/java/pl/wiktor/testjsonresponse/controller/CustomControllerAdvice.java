package pl.wiktor.testjsonresponse.controller;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Set;

@RestControllerAdvice
public class CustomControllerAdvice
        implements ResponseBodyAdvice<Set<String>> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        if (aClass == MappingJackson2HttpMessageConverter.class &&
                methodParameter.getMethod().getDeclaringClass().getName().equals(TestController.class.getName()) &&
                methodParameter.getMethod().getName().equals("getStringCollection111111111")
        ) {
            return true;
        }
        return false;
    }

    @Override
    public Set<String> beforeBodyWrite(
            Set<String> stringSet, MethodParameter methodParameter,
            MediaType mediaType,
            Class<? extends HttpMessageConverter<?>> aClass,
            ServerHttpRequest serverHttpRequest,
            ServerHttpResponse serverHttpResponse) {
        return stringSet;
    }
}
