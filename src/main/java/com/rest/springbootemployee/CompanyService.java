package com.rest.springbootemployee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public List<Company> findAll() {
        return companyRepository.findAll();
    }
}