package com.nyr.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger logger = LoggerFactory.getLogger( LoggingAspect.class );
	
	private final String execTarget1 = "execution(* com.nyr..*Service*.*(..))";
	
	@Before(execTarget1)
	public void loggingBefore( JoinPoint joinPoint ) {
		String classAndMethodName = joinPoint.getSignature().toString();
		logger.debug("START:: " + classAndMethodName);
	}
}
