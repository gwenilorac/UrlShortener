package com.gwenilorac.urlshortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gwenilorac.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}