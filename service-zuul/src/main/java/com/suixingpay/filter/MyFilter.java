package com.suixingpay.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/*
*
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-25 19:34
 **/

@Component
public class MyFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext= RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken==null){
            logger.warn("token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try{
                requestContext.getResponse().getWriter().write("token is empty");
            }catch (Exception e){

            }
            return null;
        }
        logger.info("ok");
        return null;
    }
}
