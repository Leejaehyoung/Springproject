package study.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggerInterceptor extends HandlerInterceptorAdapter {
	private static final Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("#################### Start");
		}
		
		/* 세션 존재 유무 확인 */
		HttpSession httpSession = request.getSession();
		log.debug("#################### httpSession : " + httpSession);
		if(httpSession == null || httpSession.getAttribute("key") == null) {
			String redirectUrl = request.getRequestURI(); // http:www.study.net/contextPath/xxx.sps (/contextPaht/xxx.sps)
			if(request.getQueryString() != null) {
				redirectUrl += "?" + request.getQueryString();
			}
			response.sendRedirect("/login.sps?url=" + redirectUrl);
			
			return false;
		}

		return true;
	}

	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("#################### End");
		}
	}

}
