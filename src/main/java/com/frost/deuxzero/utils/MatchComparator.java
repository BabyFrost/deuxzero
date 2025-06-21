package com.frost.deuxzero.utils;

import com.frost.deuxzero.model.MatchEquipe;

public class MatchComparator implements java.util.Comparator<MatchEquipe> {

	@Override
    public int compare(MatchEquipe a, MatchEquipe b) {
        return (int) (a.getId() - b.getId());
    }
	
}
