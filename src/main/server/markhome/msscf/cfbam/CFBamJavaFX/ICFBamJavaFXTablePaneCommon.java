// Description: Java 11 JavaFX Pane Common Interface for Table.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	ICFBamJavaFXTablePaneCommon JavaFX Interface
 *	for Table.
 */
public interface ICFBamJavaFXTablePaneCommon
	extends ICFPaneCommon
{
	public ICFFormManager getCFFormManager();
	public ICFBamJavaFXSchema getJavaFXSchema();
	public ICFBamTableObj getJavaFXFocusAsTable();
	public void setJavaFXFocusAsTable( ICFBamTableObj value );
}
