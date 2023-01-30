package com.security.auth.service;

import com.security.auth.dto.AuthenticationRequest;
import com.security.auth.dto.AuthenticationResponse;
import com.security.auth.dto.RegiterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    public AuthenticationResponse register(RegiterRequest request) {
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}
