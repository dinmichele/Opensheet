/*******************************************************************************
 * Copyright (c) 2012 Dmitry Tikhomirov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Dmitry Tikhomirov - initial API and implementation
 ******************************************************************************/
package org.opensheet.client.services;

import java.util.List;

import org.opensheet.client.dto.BranchDTO;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BranchServiceAsync {

	public void getBranchById(Integer id,AsyncCallback<BranchDTO> branchDTO);
	public void getBranchList(Boolean status,AsyncCallback<List<BranchDTO>> branchDTOs );
	public void getBranchListForCombo(Boolean status,Boolean all,AsyncCallback<List<BranchDTO>> branchDTOs );
	public void setBranch(BranchDTO branchDTO,AsyncCallback<Void> callback);
	public void addBranchDTO(BranchDTO branchDTO,AsyncCallback<Void> callback);
	
}
