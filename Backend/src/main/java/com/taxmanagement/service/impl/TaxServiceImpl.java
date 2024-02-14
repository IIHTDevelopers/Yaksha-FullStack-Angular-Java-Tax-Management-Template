package com.taxmanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taxmanagement.dto.TaxDTO;
import com.taxmanagement.service.TaxService;

@Service
public class TaxServiceImpl implements TaxService {

	@Override
	public TaxDTO createTax(TaxDTO taxDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteTaxById(Long id) {
		// write your logic here
		return false;
	}

	@Override
	public List<TaxDTO> getAllTaxes() {
		// write your logic here
		return null;
	}

	@Override
	public TaxDTO getTaxById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public TaxDTO updateTax(TaxDTO taxDTO) {
		// write your logic here
		return null;
	}
}
