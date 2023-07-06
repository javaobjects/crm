package com.wanshu.config;

import com.wanshu.sys.filter.TokenLoginFilter;
import com.wanshu.sys.filter.TokenVerifyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * SpringSecurity的配置类
 */
@Configuration
public class MySpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService) // 绑定自定义的认证Service
                .passwordEncoder(new BCryptPasswordEncoder()); // 绑定密码处理器
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/doc.html", "/doc.html/**", "/webjars/**", "/v2/**", "/swagger-resources",
                        "/swagger-resources/**", "/swagger-ui.html", "/swagger-ui.html/**").permitAll()
                .anyRequest().authenticated()
                .and()
                // 设置跨域的处理
                .cors().configurationSource(corsConfigurationSource())
                .and()
                .addFilter(new TokenLoginFilter(super.authenticationManager())) // 绑定认证的接口
                .addFilter(new TokenVerifyFilter(super.authenticationManager())) // 绑定校验的接口
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    public static void main(String[] args) {
        String password = "123456";
        System.out.println(new BCryptPasswordEncoder().encode(password).toString());
        System.out.println(new BCryptPasswordEncoder().encode(password).toString());
        System.out.println(new BCryptPasswordEncoder().encode(password).toString());
    }

    /**
     * 设置跨域的信息
     * @return
     */
    CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration config = new CorsConfiguration();
        // 配置跨域拦截的相关信息
        config.setAllowedHeaders(Arrays.asList("*"));
        config.setAllowedMethods(Arrays.asList("*"));
        config.setAllowedOrigins(Arrays.asList("*"));
        config.setMaxAge(3600l);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",config);
        return source;
    }

}
