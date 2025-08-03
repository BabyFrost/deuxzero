package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.model.Subscription;
import com.frost.deuxzero.repository.SanteRepository;
import com.frost.deuxzero.repository.SubscriptionRepository;

@Service
public class SubscriptionService {
	
	@Autowired
	private SubscriptionRepository subscriptionRepository;
	
	public Subscription getSubscriptionById( Long id ) throws ResourceNotFoundException {	
		return subscriptionRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such Subscription !") );
	}
	
	public List<Subscription> getAllSubscriptions() throws ResourceNotFoundException {	
		List<Subscription> subscriptions = new ArrayList<>();	
		subscriptionRepository.findAll().forEach(subscriptions::add);	
		return subscriptions;
	}
	
	public Subscription saveSubscription( Subscription subscription ) {
		return subscriptionRepository.save(subscription);
	}
	
	public Subscription createSubscription( Subscription subscription ) throws ResourceConflictException {	
		Optional<Subscription> subscriptionTmp = subscriptionRepository.findById( subscription.getId() );
		if ( subscriptionTmp.isPresent() ) { throw new ResourceConflictException("Subscription existe deja"); }	
		return saveSubscription( subscription );
	}

}
