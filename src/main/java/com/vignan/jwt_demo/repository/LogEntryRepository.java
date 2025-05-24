package com.vignan.jwt_demo.repository;

import com.vignan.jwt_demo.model.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
}