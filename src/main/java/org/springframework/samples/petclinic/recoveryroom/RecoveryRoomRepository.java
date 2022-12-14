package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecoveryRoomRepository extends CrudRepository<RecoveryRoom, Integer>{
    
	@Query("SELECT recoveryRoom FROM RecoveryRoom recoveryRoom")
	List<RecoveryRoom> findAll();
    Optional<RecoveryRoom> findById(int id);
    
    @Query("SELECT recoveryRoomType FROM RecoveryRoomType recoveryRoomType")
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    
    @Query("SELECT recoveryRoomType FROM RecoveryRoomType recoveryRoomType WHERE recoveryRoomType.name=:name")
    RecoveryRoomType getRecoveryRoomType(String name);
}
