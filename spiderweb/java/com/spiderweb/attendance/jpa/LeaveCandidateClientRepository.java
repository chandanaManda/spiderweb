package com.spiderweb.attendance.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeaveCandidateClientRepository extends JpaRepository<leaveCandidateclient,Long> {

}
