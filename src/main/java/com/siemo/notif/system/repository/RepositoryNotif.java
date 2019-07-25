package com.siemo.notif.system.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.siemo.notif.system.model.MasterData;

@Repository
public interface RepositoryNotif extends CrudRepository<MasterData, String>{
	List<MasterData> findByUserId(String userId);
	List<MasterData> findMasterDataIdByUserId(String userId);
	ArrayList<MasterData> findTokensAndStatusByUserId(String userId);
	ArrayList<MasterData> findTokensByGroupId(int groupId);
	List<MasterData> findMasterDataIdByGroupId(int groupId);
	MasterData findAllById(String masterDataId);
}
