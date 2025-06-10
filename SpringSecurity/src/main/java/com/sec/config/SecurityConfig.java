package com.sec.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration//by this spring will check configuration here
@EnableWebSecurity//by this spring knows I have follow this flow mention here
public class SecurityConfig {

    //this function is for default spring security
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        /*
        //by this it will disable default csrf token
        httpSecurity.csrf(customizer -> Customizer.withDefaults());

        //by this it will disable all request without permission/authenticated
        httpSecurity.authorizeHttpRequests(request -> request.anyRequest().authenticated());

        //by this it will enable form login because there should be credential to access application-> for web
//        httpSecurity.formLogin(Customizer.withDefaults());

        //by this it will enable form login because there should be credential to access application-> for rest api(POSTMAN)
        httpSecurity.httpBasic(Customizer.withDefaults());

        //this is for to make our http stateless
        // (do not have to worry about sessionId),
        // this is for postman,
        // if you want continue with browser comment httpFormLogin
        httpSecurity.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return httpSecurity.build();

         */

        return  httpSecurity
                .csrf(customizer -> Customizer.withDefaults())
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
//                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }





    //this bean is for customize credentials
    //for that spring applies UsernamePasswordAuthenticationFilter
    //and behind the scene there is UseDetailsService works for authentication
    //this bean is for static data
//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails user1 = User
//                .withDefaultPasswordEncoder()
//                .username("java")
//                .password("java123")
//                .roles("USER")
//                .build();
//
//        UserDetails user2 = User
//                .withDefaultPasswordEncoder()
//                .username("dart")
//                .password("dart123")
//                .roles("ADMIN")
//                .build();
//
//        //InMemoryUserDetailsManager(); -> this clas internally implements UserDetailsService
//        return new InMemoryUserDetailsManager(user1,user2);
//    }









    //by this we will provide our own userDetailService
    //for that create new Class
    @Autowired
    private UserDetailsService userDetailsService;

    //Now instead of static data like in above function, data actually should come from database
    //we will validate from database
    //AuthenticationProvider is interface
    // so we will create object of DaoAuthenticationProvider which implements AuthenticationProvider
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        //this is for no password encoder is enable in our app
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setUserDetailsService();
        return provider;
    }
}
