package com.cap.capgeminibatch2.capgeminibatch2.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.cap.capgeminibatch2.capgeminibatch2.entities.Program;
import com.cap.capgeminibatch2.exception.AlreadyExistsException;
import com.cap.capgeminibatch2.exception.ProgramNotFoundException;

@Component
public interface IProgramService {
	
	public Program addProgram(Program program) throws AlreadyExistsException;
	
	public ArrayList<Program> viewAllProgramDetails() throws ProgramNotFoundException;
	
	public ArrayList<Program> getApplicationDetailsByCollegeName(String collegeName);
	
	public ArrayList<Program> getProgramDetailsByName(String programName);
	
	public ArrayList<Program> getProgramDetailsByEligibility(String eligibility);
	
	public int deleteProgramById(int programId);
	
	public int deleteProgramByName(String programName);
	
	public Program getProgramById(int programId);
	
	public int updateProgramStatus(Program program);
	

}
