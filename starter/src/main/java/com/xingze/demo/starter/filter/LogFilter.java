package com.xingze.demo.starter.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 * LogFilter的实现是servlet.filter.与spring没有关系
 */
@Slf4j
@Component
public class LogFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("filter enter");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        // 获取请求url地址，不拦截excludePathPatterns中的url
        String url = req.getRequestURL().toString();
        filterChain.doFilter(req, res);
        log.info("filter url = " + url);
    }

    public void destroy() {
        log.info("destroy");
    }
}
